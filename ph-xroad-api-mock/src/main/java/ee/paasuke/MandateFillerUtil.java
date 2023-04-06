package ee.paasuke;

import io.swagger.model.Mandate;
import io.swagger.model.MandateTriplet;

public class MandateFillerUtil {

    public static void replacePlaceholdersInLinks(Mandate mandate, MandateTriplet triplet) {

        if (mandate.getLinks() != null) {
            mandate.getLinks().setDelete(performReplacements(mandate.getLinks().getDelete(), mandate, triplet));
            mandate.getLinks().setAddSubDelegate(performReplacements(mandate.getLinks().getAddSubDelegate(), mandate, triplet));
        }

    }

    private static String performReplacements(String href, Mandate mandate, MandateTriplet triplet) {
        if (href == null) {
            return null;
        }

        String ns = "";
        String roleWithoutNamespace = mandate.getRole();
        if (mandate.getRole() != null) {
            String[] nsAndRole = mandate.getRole().split(":", 2);
            ns = nsAndRole[0];
            if (nsAndRole.length > 1) {
                roleWithoutNamespace = nsAndRole[1];
            }
        }


        return href
                .replaceAll("\\{ns}", ns)
                .replaceAll("\\{representeeId}", "imp1-" + triplet.getRepresentee().getIdentifier())
                .replaceAll("\\{delegateId}",  "imp2-" + triplet.getDelegate().getIdentifier())
                .replaceAll("\\{mandateId}", "imp3-" + roleWithoutNamespace);
    }


    public static void removeMandateLinks(Mandate mandate) {
        mandate.setLinks(null);
    }

    public static void removeValidFrom(Mandate mandate) {
        mandate.getValidityPeriod().setFrom(null);
    }



}
