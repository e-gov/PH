package ee.paasuke.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ee.paasuke.FileUtil;
import ee.paasuke.service.RoleService;
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
import org.springframework.web.bind.annotation.RestController;
import org.threeten.bp.OffsetDateTime;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static ee.paasuke.api.HeaderUtil.logHeaders;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-11-07T14:54:24.274Z[GMT]")
@RestController
public class RolesApiController implements RolesApi {

    private static final Logger log = LoggerFactory.getLogger(RolesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    private final String mocksDir;

    private final RoleService roleService;

    @org.springframework.beans.factory.annotation.Autowired
    public RolesApiController(ObjectMapper objectMapper, HttpServletRequest request, RoleService roleService, @Value("${mocks.dir}") String mocksDir) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.roleService = roleService;
        this.mocksDir = mocksDir;
    }


    public ResponseEntity<List<RoleDefinition>> getRoles(@Parameter(in = ParameterIn.HEADER, description = "" ,schema=@Schema()) @RequestHeader(value="If-Modified-Since", required=false) OffsetDateTime ifModifiedSince, @Parameter(in = ParameterIn.HEADER, description = "Unique identifier (UUID) for this message." ,schema=@Schema()) @RequestHeader(value="X-Road-Id", required=false) String xRoadId) {
        logHeaders(request);

        if (ifModifiedSince != null && ifModifiedSince.isAfter(OffsetDateTime.parse("2022-11-01T15:20:30+02:00"))) {
            log.info("'If-Modified-Since header' was sent - returning 304 ");
            return new ResponseEntity<List<RoleDefinition>>(HttpStatus.NOT_MODIFIED);
        }

        String accept = request.getHeader("Accept");
        if (accept != null && (accept.contains("application/json") || accept.contains("*/*"))) {
            try {

               // return new ResponseEntity<List<RoleDefinition>>(roleService.getRoles(), HttpStatus.OK);


                List<RoleDefinition> roles = new ArrayList<>();


                if (xRoadId != null && xRoadId.toUpperCase().startsWith("STAT")) {
                    roles.addAll(getRolesList("getRoles_stat.json"));
                }
                else if (xRoadId != null && xRoadId.toUpperCase().startsWith("PRIA")) {
                    roles.addAll(getRolesList("getRoles_PRIA.json"));
                }
                else {
                    roles.addAll(getRolesList("getRoles_emta_selection.json"));
                }



                return new ResponseEntity<List<RoleDefinition>>(roles, HttpStatus.OK);

            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {

            }
/*
            catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<RoleDefinition>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

 */
        }

        return new ResponseEntity<List<RoleDefinition>>(HttpStatus.NOT_IMPLEMENTED);
    }

    private List<RoleDefinition> getRolesList(String filename) throws IOException {
        String json = FileUtil.getFileContent(mocksDir, filename);
        List<RoleDefinition> list = objectMapper.readValue(json, new TypeReference<List<RoleDefinition>>() {});
        return list;
    }

}
