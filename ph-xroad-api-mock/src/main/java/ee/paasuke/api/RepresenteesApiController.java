package ee.paasuke.api;

import static ee.paasuke.api.HeaderUtil.logHeaders;

import java.io.IOException;
import java.util.ArrayList;
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
import io.swagger.api.RepresenteesApi;
import io.swagger.model.MandateToAdd;
import io.swagger.model.MandateTriplet;
import io.swagger.model.MandatesToAddMisp;
import io.swagger.model.Problem;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-23T08:01:40.233Z[GMT]")
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

    @Override
    public ResponseEntity<Void> addMandatesToDelegateFromMisp(@Pattern(regexp="^[A-Z]{2}.+") @Parameter(in = ParameterIn.PATH, description = "Person code or company code of the representee. Starts with country code (ISO 3166-1 alpha-2).", required=true, schema=@Schema()) @PathVariable("representee") String representee,@Pattern(regexp="^[A-Z]{2}.+") @Parameter(in = ParameterIn.PATH, description = "Person code or company code of the delegate. Starts with country code (ISO 3166-1 alpha-2).", required=true, schema=@Schema()) @PathVariable("delegate") String delegate,@Parameter(in = ParameterIn.DEFAULT, description = "Enter details of the mandate(s)", schema=@Schema()) @Valid @RequestBody MandatesToAddMisp body) {
        return null;
    }

    public ResponseEntity<MandateTriplet> getRepresenteeDelegateWithMandates(@Pattern(regexp="^[A-Z]{2}.+") @Parameter(in = ParameterIn.PATH, description = "Person code or company code of the representee. Starts with country code (ISO 3166-1 alpha-2).", required=true, schema=@Schema()) @PathVariable("representee") String representee,@Pattern(regexp="^[A-Z]{2}.+") @Parameter(in = ParameterIn.PATH, description = "Person code or company code of the delegate. Starts with country code (ISO 3166-1 alpha-2).", required=true, schema=@Schema()) @PathVariable("delegate") String delegate,@Parameter(in = ParameterIn.QUERY, description = "Filter by namespace (comma separated)" ,schema=@Schema()) @Valid @RequestParam(value = "namespace", required = false) String namespace,@Parameter(in = ParameterIn.QUERY, description = "Filter by role (comma separated)" ,schema=@Schema()) @Valid @RequestParam(value = "roles", required = false) String roles) {
        logHeaders(request);
        String accept = request.getHeader("Accept");
        if (accept != null && (accept.contains("application/json") || accept.contains("*/*"))) {
            try {

                String json = FileUtil.getFileContent(mocksDir, "getRepresenteeDelegateWithMandates.json");
                MandateTriplet mandateTriplet = objectMapper.readValue(json, new TypeReference<MandateTriplet>() {});

                //
                if (namespace != null && namespace.toUpperCase().contains("AGENCYX")) {
                    MandateTripletFillerUtil.removeMandateLinks(mandateTriplet);
                    MandateTripletFillerUtil.removeIds(mandateTriplet);
                    MandateTripletFillerUtil.removeMandateValidFrom(mandateTriplet);
                }
                else {
                    // make sure links have actual values
                    MandateTripletFillerUtil.fillMandateLinks(mandateTriplet);
                }

                MandateTripletFillerUtil.setPersonIdentityCode(mandateTriplet.getRepresentee(), representee);
                MandateTripletFillerUtil.setPersonIdentityCode(mandateTriplet.getDelegate(), delegate);





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

    public ResponseEntity<List<MandateTriplet>> getRepresenteeDelegatesWithMandates(@Pattern(regexp="^[A-Z]{2}.+") @Parameter(in = ParameterIn.PATH, description = "Person code or company code of the representee. Starts with country code (ISO 3166-1 alpha-2).", required=true, schema=@Schema()) @PathVariable("representee") String representee,@Parameter(in = ParameterIn.QUERY, description = "Filter by namespace(s)" ,schema=@Schema()) @Valid @RequestParam(value = "namespace", required = false) List<String> namespace,@Parameter(in = ParameterIn.QUERY, description = "Filter by subdelegator (edasivolitaja) code" ,schema=@Schema()) @Valid @RequestParam(value = "subDelegatedBy", required = false) String subDelegatedBy,@Parameter(in = ParameterIn.QUERY, description = "Filter out representees where delegate doesn't have any mandates with any of the roles in the list. Roles must be prefixed with namespace and colon. To match all roles in namespace use * like this: 'MYNS:*'. This parameter is only used if the service is provided by Pääsuke and must be ignored by others." ,schema=@Schema()) @Valid @RequestParam(value = "hasRoleIn", required = false) List<String> hasRoleIn,@Min(0)@Parameter(in = ParameterIn.QUERY, description = "Skip this number of records for pagination" ,schema=@Schema(allowableValues={  }
    )) @Valid @RequestParam(value = "skip", required = false) Integer skip,@Min(0) @Max(500) @Parameter(in = ParameterIn.QUERY, description = "Maximum number of records to return" ,schema=@Schema(allowableValues={  }, maximum="500"
    )) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        logHeaders(request);
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

}
