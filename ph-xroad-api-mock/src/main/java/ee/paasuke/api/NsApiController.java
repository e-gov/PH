package ee.paasuke.api;

import com.fasterxml.jackson.core.type.TypeReference;
import ee.paasuke.FileUtil;
import io.swagger.api.NsApi;
import io.swagger.model.AddMandateTriplet;
import io.swagger.model.MandateToSubDelegate;
import io.swagger.model.NamespaceDefinition;
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
public class NsApiController implements NsApi {

    private static final Logger log = LoggerFactory.getLogger(NsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final String mocksDir;

    @org.springframework.beans.factory.annotation.Autowired
    public NsApiController(ObjectMapper objectMapper, HttpServletRequest request, @Value("${mocks.dir}") String mocksDir) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.mocksDir = mocksDir;
    }

    public ResponseEntity<Void> addMandateSubDelegate(@Parameter(in = ParameterIn.PATH, description = "Namespace", required=true, schema=@Schema()) @PathVariable("ns") String ns,@Pattern(regexp="^[A-Z]{2}.+") @Parameter(in = ParameterIn.PATH, description = "Person code or company code of the representee. Starts with country code (ISO 3166-1 alpha-2).", required=true, schema=@Schema()) @PathVariable("representee") String representee,@Pattern(regexp="^[A-Z]{2}.+") @Parameter(in = ParameterIn.PATH, description = "Person code or company code of the delegate. Starts with country code (ISO 3166-1 alpha-2).", required=true, schema=@Schema()) @PathVariable("delegate") String delegate,@Parameter(in = ParameterIn.PATH, description = "Mandate to sub-delegate", required=true, schema=@Schema()) @PathVariable("mandateIdentifier") String mandateIdentifier,@Parameter(in = ParameterIn.DEFAULT, description = "Enter details of the subdelegate mandate", schema=@Schema()) @Valid @RequestBody MandateToSubDelegate body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> addMandateToDelegate(@Parameter(in = ParameterIn.PATH, description = "Namespace", required=true, schema=@Schema()) @PathVariable("ns") String ns,@Parameter(in = ParameterIn.DEFAULT, description = "Enter details of mandate to add", schema=@Schema()) @Valid @RequestBody AddMandateTriplet body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<NamespaceDefinition>> getNamespaces(@Parameter(in = ParameterIn.QUERY, description = "Filter by owner registry code" ,schema=@Schema()) @Valid @RequestParam(value = "ownerCode", required = false) String ownerCode) {
        String accept = request.getHeader("Accept");
        if (accept != null && (accept.contains("application/json") || accept.contains("*/*"))) {
            try {

                String json = FileUtil.getFileContent(mocksDir, "getNamespaces.json");
                List<NamespaceDefinition> list = objectMapper.readValue(json, new TypeReference<List<NamespaceDefinition>>() {
                });

                return new ResponseEntity<List<NamespaceDefinition>>(list, HttpStatus.OK);



            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<NamespaceDefinition>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<NamespaceDefinition>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> removeAllMandatesFromDelegate(@Parameter(in = ParameterIn.PATH, description = "Namespace", required=true, schema=@Schema()) @PathVariable("ns") String ns,@Pattern(regexp="^[A-Z]{2}.+") @Parameter(in = ParameterIn.PATH, description = "Person code or company code of the representee. Starts with country code (ISO 3166-1 alpha-2).", required=true, schema=@Schema()) @PathVariable("representee") String representee,@Pattern(regexp="^[A-Z]{2}.+") @Parameter(in = ParameterIn.PATH, description = "Person code or company code of the delegate. Starts with country code (ISO 3166-1 alpha-2).", required=true, schema=@Schema()) @PathVariable("delegate") String delegate,@NotNull @Parameter(in = ParameterIn.QUERY, description = "Namespace of the mandate" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "namespace", required = true) String namespace,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "startDate", required = false) String startDate,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "endDate", required = false) String endDate) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> removeMandateFromDelegate(@Parameter(in = ParameterIn.PATH, description = "Namespace", required=true, schema=@Schema()) @PathVariable("ns") String ns,@Parameter(in = ParameterIn.PATH, description = "Person code or company code of the representee. Implementator can use any form of identifier (like internal person id)", required=true, schema=@Schema()) @PathVariable("representeeIdentifier") String representeeIdentifier,@Parameter(in = ParameterIn.PATH, description = "Person code or company code of the delegate. Implementator can use any form of identifier (like internal person id).", required=true, schema=@Schema()) @PathVariable("delegateIdentifier") String delegateIdentifier,@Parameter(in = ParameterIn.PATH, description = "Role to delete. Implementator can use any form of identifier (like internal mandate id).", required=true, schema=@Schema()) @PathVariable("mandateIdentifier") String mandateIdentifier) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> setRepresenteeDelegatesDefinedExternally(@Parameter(in = ParameterIn.PATH, description = "Namespace", required=true, schema=@Schema()) @PathVariable("ns") String ns,@Pattern(regexp="^[A-Z]{2}.+") @Parameter(in = ParameterIn.PATH, description = "Person code or company code of the representee. Starts with country code (ISO 3166-1 alpha-2).", required=true, schema=@Schema()) @PathVariable("representee") String representee,@Parameter(in = ParameterIn.DEFAULT, description = "Enter details of mandate to add", schema=@Schema()) @Valid @RequestBody List<AddMandateTriplet> body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
