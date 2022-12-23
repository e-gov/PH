package ee.paasuke.api;

import static ee.paasuke.api.HeaderUtil.logHeaders;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ee.paasuke.FileUtil;
import ee.paasuke.MandateTripletFillerUtil;
import ee.paasuke.PersonFillerUtil;
import io.swagger.api.DelegatesApi;
import io.swagger.model.MandateTriplet;
import io.swagger.model.Person;
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
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-23T08:01:40.233Z[GMT]")
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

    public ResponseEntity<List<Person>> getDelegateRepresentees(@Pattern(regexp="^[A-Z]{2}.+") @Parameter(in = ParameterIn.PATH, description = "Person code or company code of the delegate. Starts with country code (ISO 3166-1 alpha-2).", required=true, schema=@Schema()) @PathVariable("delegate") String delegate,@Parameter(in = ParameterIn.QUERY, description = "Filter by representee types. SELF means that the person has the right to represent oneself." ,schema=@Schema(allowableValues={ "SELF", "LEGAL_PERSON", "NATURAL_PERSON" }
    )) @Valid @RequestParam(value = "representeeType", required = false) List<String> representeeType,@Parameter(in = ParameterIn.QUERY, description = "Filter out representees where delegate doesn't have any mandates with any of the roles in the list. Roles must be prefixed with namespace and colon. To match all roles in namespace use * like this: 'MYNS:*'. This parameter is only used if the service is provided by Pääsuke and must be ignored by others." ,schema=@Schema()) @Valid @RequestParam(value = "hasRoleIn", required = false) List<String> hasRoleIn,@Min(0)@Parameter(in = ParameterIn.QUERY, description = "Skip this number of records for pagination" ,schema=@Schema(allowableValues={  }
    )) @Valid @RequestParam(value = "skip", required = false) Integer skip,@Min(0) @Max(500) @Parameter(in = ParameterIn.QUERY, description = "Maximum number of records to return" ,schema=@Schema(allowableValues={  }, maximum="500"
    )) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        logHeaders(request);

        String accept = request.getHeader("Accept");

        if (accept != null && (accept.contains("application/json") || accept.contains("*/*")) ) {
            try {

                String json = FileUtil.getFileContent(mocksDir, "getDelegateRepresentees.json");
                List<Person> personList = objectMapper.readValue(json, new TypeReference<List<Person>>() {
                });

                PersonFillerUtil.replaceInLinks(personList, "{delegate}", delegate);


                return new ResponseEntity<List<Person>>(personList, HttpStatus.OK);

            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Person>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Person>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<MandateTriplet>> getDelegateRepresenteesWithMandates(@Pattern(regexp="^[A-Z]{2}.+") @Parameter(in = ParameterIn.PATH, description = "Person code or company code of the delegate. Starts with country code (ISO 3166-1 alpha-2).", required=true, schema=@Schema()) @PathVariable("delegate") String delegate,@Parameter(in = ParameterIn.QUERY, description = "Filter out representees where delegate doesn't have any mandates with any of the roles in the list. Roles must be prefixed with namespace and colon. To match all roles in namespace use * like this: 'MYNS:*'. This parameter is only used if the service is provided by Pääsuke and must be ignored by others." ,schema=@Schema()) @Valid @RequestParam(value = "hasRoleIn", required = false) List<String> hasRoleIn,@Min(0)@Parameter(in = ParameterIn.QUERY, description = "Skip this number of records for pagination" ,schema=@Schema(allowableValues={  }
    )) @Valid @RequestParam(value = "skip", required = false) Integer skip,@Min(0) @Max(500) @Parameter(in = ParameterIn.QUERY, description = "Maximum number of records to return" ,schema=@Schema(allowableValues={  }, maximum="500"
    )) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        logHeaders(request);
        try {

            String json = FileUtil.getFileContent(mocksDir, "getDelegateRepresenteesWithMandates.json");
            List<MandateTriplet> mandateTripletList = objectMapper.readValue(json, new TypeReference<List<MandateTriplet>>() {});

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


