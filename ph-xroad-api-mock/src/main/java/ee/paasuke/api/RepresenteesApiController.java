package ee.paasuke.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ee.paasuke.FileUtil;
import ee.paasuke.MandateTripletFillerUtil;
import ee.paasuke.service.RoleService;
import io.swagger.api.RepresenteesApi;
import io.swagger.model.*;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static ee.paasuke.api.HeaderUtil.logHeaders;
import static java.util.Arrays.asList;

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

    public ResponseEntity<MandateTriplet> getRepresenteeDelegateWithMandates(@Pattern(regexp="(^[A-Z]{2}|^email:|^internal:).+") @Parameter(in = ParameterIn.PATH, description = "Identifier of the of the representee.", required=true, schema=@Schema()) @PathVariable("representee") String representee, @Pattern(regexp="(^[A-Z]{2}|^email:|^internal:).+") @Parameter(in = ParameterIn.PATH, description = "Identifier of the delegate who'se mandate is being sub-delegated.", required=true, schema=@Schema()) @PathVariable("delegate") String delegate, @Parameter(in = ParameterIn.QUERY, description = "Filter by namespace (comma separated)" ,schema=@Schema()) @Valid @RequestParam(value = "namespace", required = false) String namespace, @Parameter(in = ParameterIn.QUERY, description = "Filter out representees where delegate doesn't have any mandates with any of the roles in the list. Roles must be prefixed with namespace and colon. To match all roles in namespace use * like this: 'MYNS:*'." ,schema=@Schema()) @Valid @RequestParam(value = "hasRoleIn", required = false) List<String> hasRoleIn, @Parameter(in = ParameterIn.HEADER, description = "User identifier whose action initiated the request." ,schema=@Schema()) @RequestHeader(value="X-Road-User-Id", required=false) String xRoadUserId, @Parameter(in = ParameterIn.HEADER, description = "When service client represents third party while issuing a query then it must be filled with identifier of that third party. When service client represents itself then this header is omitted." ,schema=@Schema()) @RequestHeader(value="X-Road-Represented-Party", required=false) String xRoadRepresentedParty, @Parameter(in = ParameterIn.HEADER, description = "Unique identifier (UUID) for this message." ,schema=@Schema()) @RequestHeader(value="X-Road-Id", required=false) String xRoadId) {
        logHeaders(request);
        String accept = request.getHeader("Accept");
        if (accept != null && (accept.contains("application/json") || accept.contains("*/*"))) {
            try {


                Person majAruandjaTy = Person.builder().type(Person.TypeEnum.LEGAL_PERSON).legalName("MAJ Aruandja TÜ").identifier("EE77543210").build();
                Person mariMaasikas = Person.builder().type(Person.TypeEnum.NATURAL_PERSON).firstName("Mari").surname("Maasikas").identifier("EE49028099999").build();

                String mandateId = "44444";

               String namespaceCode = "TODO";


                MandateLinks links = MandateLinks.builder()
                        .delete("/v1/nss/" + namespaceCode + "/representees/internal-id-for-" + majAruandjaTy.getIdentifier()+"/delegates/interal-id-for-" + mariMaasikas.getIdentifier() + "/mandates/"+mandateId).build();

                Mandate mandate = Mandate.builder().role(RoleService.MANDATE_DEFINER.getCode()).links(links).build();
                MandateTriplet man = MandateTriplet.builder().mandates(asList(mandate)).build();

                return new ResponseEntity<MandateTriplet>(man, HttpStatus.OK);



            }
            finally {

            }

        }

        return new ResponseEntity<MandateTriplet>(HttpStatus.NOT_IMPLEMENTED);
    }

    @Override
    public ResponseEntity<Void> addMandate(String representee, String delegate, String xRoadUserId, String xRoadRepresentedParty, String xRoadId, AddMandateTriplet body) {
        return null;
    }

    public ResponseEntity<List<MandateTriplet>> getRepresenteeDelegatesWithMandates(@Parameter(in = ParameterIn.PATH, description = "<b>Identifier of the representee (volitaja).</b> Can be one of the follwing&colon; <p>a)  'EE' followed by 8-digit legal entity code from Estonian Business Registry</p> <p>b) 'EE' followed by 11-digit national identity number</p> <p>c) Two-letter country code followed by eIDAS identification (1...254 symbols) - Pääsuke uses the value that was returned by Tara when the person logged into eesti.ee portal.</p>", required=true, schema=@Schema()) @PathVariable("representee") String representee, @Parameter(in = ParameterIn.QUERY, description = "<p><b>To add a filter to results so that only mandates that were sub-delegated by this person (edasivolitaja) would be returned.</b></p> <p>This is to cover the following use case. Let's say LittleCompany has given BookkeepingCompany some role together with the right for BookkeepingCompany to further sub-delegate the role to its employees.</p> <p>BookkeepingCompany can use this query to get the list of its employees who have received this role from BookkeepingCompany through sub-delegation.</p> <p>To display this list Pääsuke makes a query  where representee={LittleCompanyIdentifier} and subDelegatedBy={BookkeepingCompanyIdentifier}.</p>" ,schema=@Schema()) @Valid @RequestParam(value = "subDelegatedBy", required = false) String subDelegatedBy, @Parameter(in = ParameterIn.HEADER, description = "User identifier whose action initiated the request. NB! This can be employee of RIA." ,schema=@Schema()) @RequestHeader(value="X-Road-User-Id", required=false) String xRoadUserId, @Parameter(in = ParameterIn.HEADER, description = "When service client represents third party while issuing a query then it must be filled with identifier of that third party. When service client represents itself then this header is omitted." ,schema=@Schema()) @RequestHeader(value="X-Road-Represented-Party", required=false) String xRoadRepresentedParty, @Parameter(in = ParameterIn.HEADER, description = "Unique identifier (UUID) for this message." ,schema=@Schema()) @RequestHeader(value="X-Road-Id", required=false) String xRoadId) {
        logHeaders(request);
        String accept = request.getHeader("Accept");
        if (accept != null && (accept.contains("application/json") || accept.contains("*/*"))) {
            try {

                List<MandateTriplet> mandateTripletList = new ArrayList<>();

                // STAT
                if (xRoadId != null && xRoadId.toUpperCase().startsWith("STAT")) {

                    String json = FileUtil.getFileContent(mocksDir, "getDelegateRepresenteesWithMandates_STAT.json"); // TODO tagurpidi!
                    mandateTripletList.addAll(objectMapper.readValue(json, new TypeReference<List<MandateTriplet>>() {}));
                }
                else if (xRoadId != null && xRoadId.toUpperCase().startsWith("PRIA")) {

                    String json = FileUtil.getFileContent(mocksDir, "getRepresenteeDelegatesWithMandates_PRIA.json");
                    Collection<MandateTriplet> triplets = objectMapper.readValue(json, new TypeReference<List<MandateTriplet>>() {});

                    if (subDelegatedBy != null && subDelegatedBy.length() > 0) {
                        mandateTripletList.addAll(triplets.stream()
                                .filter(triplet -> triplet.getMandates().stream().anyMatch(m -> subDelegatedBy.equalsIgnoreCase(m.getSubDelegatorIdentifier())))
                                .collect(Collectors.toList()));
                    }
                    else {
                        mandateTripletList.addAll(triplets);
                    }

                }
                else if ("EE11065244".equals(subDelegatedBy)) {

                    String emtaJSON = FileUtil.getFileContent(mocksDir, "getRepresenteeDelegatesWithMandates_emta_subDelegatedBy_EE11065244.json");
                    mandateTripletList.addAll(objectMapper.readValue(emtaJSON, new TypeReference<List<MandateTriplet>>() {}));
                }
                else {
                    String emtaJSON = FileUtil.getFileContent(mocksDir, "getRepresenteeDelegatesWithMandates_emta.json");
                    mandateTripletList.addAll(objectMapper.readValue(emtaJSON, new TypeReference<List<MandateTriplet>>() {}));
                }



/*
                String estatJSON = FileUtil.getFileContent(mocksDir, "getRepresenteeDelegatesWithMandates_estat.json");
                mandateTripletList.addAll(objectMapper.readValue(estatJSON, new TypeReference<List<MandateTriplet>>() {}));
*/
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
