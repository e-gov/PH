package ee.paasuke.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ee.paasuke.FileUtil;
import ee.paasuke.MandateTripletFillerUtil;
import ee.paasuke.PersonFillerUtil;
import ee.paasuke.service.MockDataService;
import io.swagger.api.DelegatesApi;
import io.swagger.model.MandateTriplet;
import io.swagger.model.Person;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static ee.paasuke.api.HeaderUtil.logHeaders;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-23T08:01:40.233Z[GMT]")
@RestController
public class DelegatesApiController implements DelegatesApi {

    private static final Logger log = LoggerFactory.getLogger(DelegatesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final String mocksDir;

    private final MockDataService mockDataService;

    @org.springframework.beans.factory.annotation.Autowired
    public DelegatesApiController(ObjectMapper objectMapper, HttpServletRequest request, @Value("${mocks.dir}") String mocksDir, MockDataService mockDataService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.mocksDir = mocksDir;
        this.mockDataService = mockDataService;
    }

    @RequestMapping(value = "/delegates/{delegate}/representees/mandates",
            produces = { "application/json" },
            method = RequestMethod.GET)
    public ResponseEntity<List<MandateTriplet>> getDelegateRepresenteesWithMandates(@Parameter(in = ParameterIn.PATH, description = "<b>Identifier of the delegate (volituste saaja).</b> Can be one of the follwing&colon; <p>a)  'EE' followed by 8-digit legal entity code from Estonian Business Registry</p> <p>b) 'EE' followed by 11-digit national identity number</p> <p>c) Two-letter country code followed by eIDAS identification (1...254 symbols) - Pääsuke uses the value that was returned by Tara when the person logged into eesti.ee portal.</p>", required=true, schema=@Schema()) @PathVariable("delegate") String delegate, @Parameter(in = ParameterIn.HEADER, description = "User identifier whose action initiated the request. NB! This can be employee of RIA." ,schema=@Schema()) @RequestHeader(value="X-Road-User-Id", required=false) String xRoadUserId, @Parameter(in = ParameterIn.HEADER, description = "When service client represents third party while issuing a query then it must be filled with identifier of that third party. When service client represents itself then this header is omitted." ,schema=@Schema()) @RequestHeader(value="X-Road-Represented-Party", required=false) String xRoadRepresentedParty, @Parameter(in = ParameterIn.HEADER, description = "Unique identifier (UUID) for this message." ,schema=@Schema()) @RequestHeader(value="X-Road-Id", required=false) String xRoadId) {
        logHeaders(request);
        try {
            List<MandateTriplet> mandateTripletList = new ArrayList<>();

            if ("FULL".equalsIgnoreCase(delegate)) {
                mandateTripletList = mockDataService.getTriplets(100);
                return new ResponseEntity<List<MandateTriplet>>(mandateTripletList, HttpStatus.OK);
            }
            else if (xRoadId != null && xRoadId.toUpperCase().startsWith("STAT")) {
                String json = FileUtil.getFileContent(mocksDir, "getDelegateRepresenteesWithMandates_STAT.json");
                mandateTripletList.addAll(objectMapper.readValue(json, new TypeReference<List<MandateTriplet>>() {}));
            }
            else if (xRoadId != null && xRoadId.toUpperCase().startsWith("PRIA")) {
                String json = FileUtil.getFileContent(mocksDir, "getRepresenteeDelegatesWithMandates_PRIA.json");
                Collection<MandateTriplet> allMandates = objectMapper.readValue(json, new TypeReference<List<MandateTriplet>>() {});

                allMandates.stream()
                        .filter(mandateTriplet -> mandateTriplet.getDelegate().getIdentifier().equals(delegate))
                                .forEach(mandateTripletList::add);
            }
            else {
                String json = FileUtil.getFileContent(mocksDir, "getDelegateRepresenteesWithMandates.json");
                mandateTripletList.addAll(objectMapper.readValue(json, new TypeReference<List<MandateTriplet>>() {}));

            }

            MandateTripletFillerUtil.fillMandateLinks(mandateTripletList);

//            if (namespace != null && (namespace.contains("STAT") || namespace.contains("EMTA"))) {
//
//                log.info("Removing links as namespace=" + namespace);
//
//                mandateTripletList.stream()
//                     .map(MandateTriplet::getMandates)
//                     .flatMap(l -> l.stream())
//                     .filter(m -> m.getLinks() != null)
//                     .filter(m -> !m.getLinks().isEmpty())
//                     .forEach(m -> m.setLinks(null));
//            }

            return new ResponseEntity<List<MandateTriplet>>(mandateTripletList, HttpStatus.OK);

        } catch (IOException e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<MandateTriplet>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        //return new ResponseEntity<List<MandateTriplet>>(HttpStatus.NOT_IMPLEMENTED);
    }

}


