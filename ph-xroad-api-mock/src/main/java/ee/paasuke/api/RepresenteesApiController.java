package ee.paasuke.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ee.paasuke.FileUtil;
import ee.paasuke.MandateTripletFillerUtil;
import io.swagger.api.RepresenteesApi;
import io.swagger.model.MandateTriplet;
import io.swagger.model.MandatesToAdd;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-07T14:54:24.274Z[GMT]")
@RestController
public class RepresenteesApiController implements RepresenteesApi {

    private static final Logger log = LoggerFactory.getLogger(RepresenteesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final String mocksDir;

    @org.springframework.beans.factory.annotation.Autowired
    public RepresenteesApiController(ObjectMapper objectMapper, HttpServletRequest request, @Value("${mocks.dir}") String mocksDir) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.mocksDir = mocksDir;
    }

    public ResponseEntity<Void> addMandatesToDelegate(@Parameter(in = ParameterIn.PATH, description = "Person code or company code of the representee", required=true, schema=@Schema()) @PathVariable("representee") String representee,@Parameter(in = ParameterIn.PATH, description = "Person code or company code of the delegate", required=true, schema=@Schema()) @PathVariable("delegate") String delegate,@Parameter(in = ParameterIn.DEFAULT, description = "Enter details of the mandate(s)", schema=@Schema()) @Valid @RequestBody MandatesToAdd body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MandateTriplet> getRepresenteeDelegateWithMandates(@Parameter(in = ParameterIn.PATH, description = "Person code or company code of the representee", required=true, schema=@Schema()) @PathVariable("representee") String representee, @Parameter(in = ParameterIn.PATH, description = "Person code or company code of the delegate", required=true, schema=@Schema()) @PathVariable("delegate") String delegate, @Parameter(in = ParameterIn.HEADER, description = "Filter by namespace (comma separated)" ,schema=@Schema()) @RequestHeader(value="namespace", required=false) String namespace, @Parameter(in = ParameterIn.HEADER, description = "Filter by role (comma separated)" ,schema=@Schema()) @RequestHeader(value="roles", required=false) String roles) {
        String accept = request.getHeader("Accept");
        if (accept != null && (accept.contains("application/json") || accept.contains("*/*"))) {
            try {

                String json = FileUtil.getFileContent(mocksDir, "getRepresenteeDelegateWithMandates.json");
                MandateTriplet mandateTriplet = objectMapper.readValue(json, new TypeReference<MandateTriplet>() {});

                // make sure links have actual values
                MandateTripletFillerUtil.fillMandateLinks(mandateTriplet);


                if (namespace != null && (namespace.contains("STAT") || namespace.contains("EMTA"))) {

                    log.info("Removing links from person as namespace=" + namespace);

                 }

                return new ResponseEntity<MandateTriplet>(mandateTriplet, HttpStatus.OK);

            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<MandateTriplet>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<MandateTriplet>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<MandateTriplet>> getRepresenteeDelegatesWithMandates(@Parameter(in = ParameterIn.PATH, description = "Person code or company code of the representee", required=true, schema=@Schema()) @PathVariable("representee") String representee,@Parameter(in = ParameterIn.HEADER, description = "Filter by namespace (comma separated)" ,schema=@Schema()) @RequestHeader(value="namespace", required=false) String namespace,@Parameter(in = ParameterIn.HEADER, description = "Filter by subdelegator (edasivolitaja) code" ,schema=@Schema()) @RequestHeader(value="subDelegatedBy", required=false) String subDelegatedBy,@Parameter(in = ParameterIn.HEADER, description = "Filter out delegates who don't have any of the roles in the list. This parameter is only used if the service is provided by Pääsuke and must be ignored by others." ,schema=@Schema()) @RequestHeader(value="hasRoleIn", required=false) String hasRoleIn,@Parameter(in = ParameterIn.HEADER, description = "Skip this number of records for pagination" ,schema=@Schema(allowableValues={  }
    )) @RequestHeader(value="skip", required=false) Integer skip,@Parameter(in = ParameterIn.HEADER, description = "Maximum number of records to return" ,schema=@Schema(allowableValues={  }, maximum="500"
    )) @RequestHeader(value="limit", required=false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && (accept.contains("application/json") || accept.contains("*/*"))) {
            try {

                List<MandateTriplet> mandateTripletList = new ArrayList<>();

                String emtaJSON = FileUtil.getFileContent(mocksDir, "getRepresenteeDelegatesWithMandates_emta.json");
                mandateTripletList.addAll(objectMapper.readValue(emtaJSON, new TypeReference<List<MandateTriplet>>() {}));

                String estatJSON = FileUtil.getFileContent(mocksDir, "getRepresenteeDelegatesWithMandates_estat.json");
                mandateTripletList.addAll(objectMapper.readValue(estatJSON, new TypeReference<List<MandateTriplet>>() {}));

                // make sure links have actual values
                MandateTripletFillerUtil.fillMandateLinks(mandateTripletList);

                return new ResponseEntity<List<MandateTriplet>>(mandateTripletList, HttpStatus.OK);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<MandateTriplet>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<MandateTriplet>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> removeMandateFromDelegate(@Parameter(in = ParameterIn.PATH, description = "Person code or company code of the representee", required=true, schema=@Schema()) @PathVariable("representee") String representee,@Parameter(in = ParameterIn.PATH, description = "Person code or company code of the delegate", required=true, schema=@Schema()) @PathVariable("delegate") String delegate,@Parameter(in = ParameterIn.HEADER, description = "Namespace of the role" ,required=true,schema=@Schema()) @RequestHeader(value="namespace", required=true) String namespace,@Parameter(in = ParameterIn.PATH, description = "Role to delete", required=true, schema=@Schema()) @PathVariable("role") String role) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
