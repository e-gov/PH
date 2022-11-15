package ee.paasuke.api;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ee.paasuke.FileUtil;
import ee.paasuke.MandateTripletFillerUtil;
import io.swagger.api.DelegatesApi;
import io.swagger.model.MandateTriplet;
import io.swagger.model.Person;
import io.swagger.model.Problem;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-07T14:54:24.274Z[GMT]")
@RestController
public class DelegatesApiController implements DelegatesApi {

    private static final Logger log = LoggerFactory.getLogger(DelegatesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final String mocksDir;

    @org.springframework.beans.factory.annotation.Autowired
    public DelegatesApiController(ObjectMapper objectMapper, HttpServletRequest request, @Value("${mocks.dir}") String mocksDir) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.mocksDir = mocksDir;
    }

    public ResponseEntity<List<Person>> getDelegateRepresentees(@Parameter(in = ParameterIn.PATH, description = "Person code or company code of the delegate", required=true, schema=@Schema()) @PathVariable("delegate") String delegate, @Parameter(in = ParameterIn.HEADER, description = "Filter by namespace (comma separated)" ,schema=@Schema()) @RequestHeader(value="namespace", required=false) String namespace, @Parameter(in = ParameterIn.HEADER, description = "Filter by representee type" ,schema=@Schema(allowableValues={ "ANY", "INDIVIDUAL", "LEGAL_ENTITY" }
    )) @RequestHeader(value="representeeType", required=false) String representeeType, @Parameter(in = ParameterIn.HEADER, description = "Skip this number of records for pagination" ,schema=@Schema(allowableValues={  }
    )) @RequestHeader(value="skip", required=false) Integer skip, @Parameter(in = ParameterIn.HEADER, description = "Maximum number of records to return" ,schema=@Schema(allowableValues={  }, maximum="500"
    )) @RequestHeader(value="limit", required=false) Integer limit) {
        String accept = request.getHeader("Accept");

        if (namespace == null) {
            throw new IllegalArgumentException("namespace is required");
        }


        if (accept != null && (accept.contains("application/json") || accept.contains("*/*")) ) {
            try {

                String json = FileUtil.getFileContent(mocksDir, "getDelegateRepresentees.json");
                List<Person> list = objectMapper.readValue(json, new TypeReference<List<Person>>() {
                });

                list.stream()
                     .filter(p -> p.getLinks() != null)
                     .filter(p -> !p.getLinks().isEmpty())
                     .map(Person::getLinks)
                     .flatMap(l -> l.stream())
                     .forEach(x -> x.setHref(x.getHref()
                          .replace("{namespace}", namespace)
                          .replace("{delegate}", delegate)));

                return new ResponseEntity<List<Person>>(list, HttpStatus.OK);

            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Person>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Person>>(HttpStatus.NOT_IMPLEMENTED);
    }


    public ResponseEntity<List<MandateTriplet>> getDelegateRepresenteesWithMandates(@Parameter(in = ParameterIn.PATH, description = "Person code or company code of the delegate", required=true, schema=@Schema()) @PathVariable("delegate") String delegate,@Parameter(in = ParameterIn.HEADER, description = "Namespace (or comma separated namespaces) for filtering mandates" ,schema=@Schema()) @RequestHeader(value="namespace", required=false) String namespace,@Parameter(in = ParameterIn.HEADER, description = "Search string for person name or code" ,schema=@Schema()) @RequestHeader(value="search", required=false) String search,@Min(0)@Parameter(in = ParameterIn.QUERY, description = "Skip this number of records for pagination" ,schema=@Schema(allowableValues={  }
    )) @Valid @RequestParam(value = "skip", required = false) Integer skip,@Parameter(in = ParameterIn.HEADER, description = "Maximum number of records to return" ,schema=@Schema(allowableValues={  }, maximum="500"
    )) @RequestHeader(value="limit", required=false) Integer limit) {
        try {

            String json = FileUtil.getFileContent(mocksDir, "getDelegateRepresenteesWithMandates.json");
            List<MandateTriplet> mandateTripletList = objectMapper.readValue(json, new TypeReference<List<MandateTriplet>>() {});

            MandateTripletFillerUtil.fillMandateLinks(mandateTripletList);

            if (namespace != null && (namespace.contains("STAT") || namespace.contains("EMTA"))) {

                log.info("Removing links as namespace=" + namespace);

                mandateTripletList.stream()
                     .map(MandateTriplet::getMandates)
                     .flatMap(l -> l.stream())
                     .filter(m -> m.getLinks() != null)
                     .filter(m -> !m.getLinks().isEmpty())
                     .forEach(m -> m.setLinks(null));
            }

            return new ResponseEntity<List<MandateTriplet>>(mandateTripletList, HttpStatus.OK);

        } catch (IOException e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<MandateTriplet>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        //return new ResponseEntity<List<MandateTriplet>>(HttpStatus.NOT_IMPLEMENTED);
    }

}


