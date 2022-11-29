package ee.paasuke.api;

import com.fasterxml.jackson.core.type.TypeReference;
import ee.paasuke.FileUtil;
import io.swagger.api.NamespacesApi;
import io.swagger.model.NamespaceDefinition;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.model.Person;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-24T11:06:12.199Z[GMT]")
@RestController
public class NamespacesApiController implements NamespacesApi {

    private static final Logger log = LoggerFactory.getLogger(NamespacesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final String mocksDir;

    @org.springframework.beans.factory.annotation.Autowired
    public NamespacesApiController(ObjectMapper objectMapper, HttpServletRequest request, @Value("${mocks.dir}") String mocksDir) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.mocksDir = mocksDir;
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

}
