package ee.paasuke.api;

import static ee.paasuke.api.HeaderUtil.logHeaders;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ee.paasuke.FileUtil;
import io.swagger.api.RolesApi;
import io.swagger.model.RoleDefinition;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.threeten.bp.OffsetDateTime;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-07T14:54:24.274Z[GMT]")
@RestController
public class RolesApiController implements RolesApi {

    private static final Logger log = LoggerFactory.getLogger(RolesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final String mocksDir;

    @org.springframework.beans.factory.annotation.Autowired
    public RolesApiController(ObjectMapper objectMapper, HttpServletRequest request, @Value("${mocks.dir}") String mocksDir) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.mocksDir = mocksDir;
    }

    public ResponseEntity<List<RoleDefinition>> getRoles(@Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="If-Modified-Since", required=false) OffsetDateTime ifModifiedSince,@Parameter(in = ParameterIn.QUERY, description = "Filter by namespace(s)" ,schema=@Schema()) @Valid @RequestParam(value = "namespace", required = false) List<String> namespace) {
        logHeaders(request);

        if (ifModifiedSince != null && ifModifiedSince.isAfter(OffsetDateTime.parse("2022-11-01T15:20:30+02:00"))) {
            log.info("'If-Modified-Since header' was sent - returning 304 ");
            return new ResponseEntity<List<RoleDefinition>>(HttpStatus.NOT_MODIFIED);
        }

        String accept = request.getHeader("Accept");
        if (accept != null && (accept.contains("application/json") || accept.contains("*/*"))) {
            try {
                List<RoleDefinition> roles = new ArrayList<>();
                roles.addAll(getRolesList("getRoles_stat.json"));
                roles.addAll(getRolesList("getRoles_emta_packages.json"));
                roles.addAll(getRolesList("getRoles_emta_others.json"));

                // if EMTA or STAT then filter
                if (namespace != null && (namespace.contains("STAT") || namespace.contains("EMTA"))) {
                    roles = roles.stream()
                         .filter(rd -> namespace.contains(rd.getNamespace()))
                         .collect(Collectors.toList());
                }

                return new ResponseEntity<List<RoleDefinition>>(roles, HttpStatus.OK);


            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<RoleDefinition>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<RoleDefinition>>(HttpStatus.NOT_IMPLEMENTED);
    }

    private List<RoleDefinition> getRolesList(String filename) throws IOException {
        String json = FileUtil.getFileContent(mocksDir, filename);
        List<RoleDefinition> list = objectMapper.readValue(json, new TypeReference<List<RoleDefinition>>() {});
        return list;
    }

}
