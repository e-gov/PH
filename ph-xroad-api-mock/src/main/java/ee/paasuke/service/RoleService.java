package ee.paasuke.service;

import io.swagger.model.RoleDefinition;
import org.springframework.stereotype.Service;

import java.util.List;

import static ee.paasuke.service.TranslationService.translation;
import static ee.paasuke.service.TranslationService.translationEt;
import static java.util.Arrays.asList;

@Service
public class RoleService {

    public static RoleDefinition MANDATE_DEFINER = RoleDefinition.builder()
            .code("MANDATE_DEFINER")
            //.namespace(NamespaceService.ANNUAL_REPORT_PORTAL.getNamespace()).title(translation("Volituste haldaja", "Mandate definer"))
            .description(translationEt("Omab õigust lisada ja eemaldada ettevõtja majandusaasta aruannte sisestajaid"))
            .build();

    public static RoleDefinition INSERT_AND_SUBMIT = RoleDefinition.builder()
            .code("INSERT_AND_SUBMIT")
            //.namespace(NamespaceService.ANNUAL_REPORT_PORTAL.getNamespace()).title(translation("Sisestaja-esitaja", "Inserter-submitter"))
            .description(translationEt("Omab õigust ettevõtja majandusaasta aruandeid sisestada ja esitada"))
            .build();

    public static RoleDefinition INSERT = RoleDefinition.builder()
            .code("INSERT")
         //   .namespace(NamespaceService.ANNUAL_REPORT_PORTAL.getNamespace()).title(translation("Sisestaja", "Inserter"))
            .description(translationEt("Omab õigust ettevõtja majandusaasta aruandeid sisestada. Roll ei anna õigust majandusaasta aruandeid esitada."))
            .build();



    public static RoleDefinition GLOBAL1_ANNUAL_REPORT_PORTAL_MANDATE_DEFINER = RoleDefinition.builder()
            .code("MANDATE_DEFINER")
         //   .namespace(NamespaceService.GLOBAL1_ANNUAL_REPORT_PORTAL.getNamespace())
            .description(translationEt("Majandusaasta aruannete portaalis sisestajate ja esitajate määramine"))
            .build();


    public static RoleDefinition GLOBAL1_ANNUAL_REPORT_PORTAL_ACCOUNTANT = RoleDefinition.builder()
            .code("ACCOUNTANT")
       //     .namespace(NamespaceService.GLOBAL1_ANNUAL_REPORT_PORTAL.getNamespace())
            .description(translationEt("Majandusaasta aruannete sisestamine"))
            .build();


    public List<RoleDefinition> getRoles() {

        return asList(MANDATE_DEFINER, INSERT_AND_SUBMIT, INSERT, GLOBAL1_ANNUAL_REPORT_PORTAL_MANDATE_DEFINER, GLOBAL1_ANNUAL_REPORT_PORTAL_ACCOUNTANT);

    }


}
