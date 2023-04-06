package ee.paasuke.api;

import io.swagger.api.NssApi;
import io.swagger.model.AddMandateTriplet;
import io.swagger.model.MandateToSubDelegate;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-23T08:01:40.233Z[GMT]")
@RestController
public class NssApiController implements NssApi {

    private static final Logger log = LoggerFactory.getLogger(NssApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final String mocksDir;


    @org.springframework.beans.factory.annotation.Autowired
    public NssApiController(ObjectMapper objectMapper, HttpServletRequest request, @Value("${mocks.dir}") String mocksDir) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.mocksDir = mocksDir;
    }

    @Override
    public ResponseEntity<Void> addSubDelegate(@Parameter(in = ParameterIn.PATH, description = "Namespace", required=true, schema=@Schema()) @PathVariable("ns") String ns, @Parameter(in = ParameterIn.PATH, description = "Representee identifier. The format of the identifier is not restricted.", required=true, schema=@Schema()) @PathVariable("representeeId") String representeeId, @Parameter(in = ParameterIn.PATH, description = "Delegate identifier. The format of the identifier is not restricted.", required=true, schema=@Schema()) @PathVariable("delegateId") String delegateId, @Parameter(in = ParameterIn.PATH, description = "Identifier of the mandate to sub-delegate", required=true, schema=@Schema()) @PathVariable("mandateId") String mandateId, @Parameter(in = ParameterIn.HEADER, description = "User identifier whose action initiated the request." ,schema=@Schema()) @RequestHeader(value="X-Road-User-Id", required=false) String xRoadUserId, @Parameter(in = ParameterIn.HEADER, description = "When service client represents third party while issuing a query then it must be filled with identifier of that third party. When service client represents itself then this header is omitted." ,schema=@Schema()) @RequestHeader(value="X-Road-Represented-Party", required=false) String xRoadRepresentedParty, @Parameter(in = ParameterIn.HEADER, description = "Unique identifier (UUID) for this message." ,schema=@Schema()) @RequestHeader(value="X-Road-Id", required=false) String xRoadId, @Parameter(in = ParameterIn.DEFAULT, description = "Enter details of the subdelegate mandate", schema=@Schema()) @Valid @RequestBody MandateToSubDelegate body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }


    public ResponseEntity<Void> addMandateToDelegate(@Parameter(in = ParameterIn.PATH, description = "Namespace", required=true, schema=@Schema()) @PathVariable("ns") String ns,@Parameter(in = ParameterIn.DEFAULT, description = "Enter details of mandate to add", schema=@Schema()) @Valid @RequestBody AddMandateTriplet body) {
        String accept = request.getHeader("Accept");

        System.out.println(body);

        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<Void> deleteMandate(@Parameter(in = ParameterIn.PATH, description = "Namespace", required=true, schema=@Schema()) @PathVariable("ns") String ns, @Parameter(in = ParameterIn.PATH, description = "Person code or company code of the representee. Implementator can use any form of identifier (like internal person id)", required=true, schema=@Schema()) @PathVariable("representeeId") String representeeId, @Parameter(in = ParameterIn.PATH, description = "Person code or company code of the delegate. Implementator can use any form of identifier (like internal person id).", required=true, schema=@Schema()) @PathVariable("delegateId") String delegateId, @Parameter(in = ParameterIn.PATH, description = "Role to delete. Implementator can use any form of identifier (like internal mandate id).", required=true, schema=@Schema()) @PathVariable("mandateId") String mandateId, @Parameter(in = ParameterIn.HEADER, description = "User identifier whose action initiated the request." ,schema=@Schema()) @RequestHeader(value="X-Road-User-Id", required=false) String xRoadUserId, @Parameter(in = ParameterIn.HEADER, description = "When service client represents third party while issuing a query then it must be filled with identifier of that third party. When service client represents itself then this header is omitted." ,schema=@Schema()) @RequestHeader(value="X-Road-Represented-Party", required=false) String xRoadRepresentedParty, @Parameter(in = ParameterIn.HEADER, description = "Unique identifier (UUID) for this message." ,schema=@Schema()) @RequestHeader(value="X-Road-Id", required=false) String xRoadId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

}
