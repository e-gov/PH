package ee.paasuke;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import io.swagger.model.Link;
import io.swagger.model.Mandate;
import io.swagger.model.MandateTriplet;

public class MandateFillerUtil {

    public static final String DEL_LINK = "/v1/representees/{representee}/delegates/{delegate}/mandates/{role}";


    public static void fillMandateLinks(Mandate mandate, MandateTriplet triplet) {
        List<Link> xroadDeleteLinks = mandate.getLinks().stream().filter(link -> link.getRel().equals("xroadDelete")).collect(Collectors.toList());

        String delLinkHref = DEL_LINK
             .replaceAll("\\{representee}", String.valueOf(triplet.getRepresentee().getId()))
             .replaceAll("\\{delegate}",  String.valueOf(triplet.getDelegate().getId()))
             .replaceAll("\\{role}", String.valueOf(mandate.getId()));

        xroadDeleteLinks.stream().forEach(link -> link.setHref(delLinkHref));
    }


    public static void removeMandateLinks(Mandate mandate) {
        mandate.setLinks(new ArrayList<>());
    }

    public static void removeId(Mandate mandate) {
        mandate.setId(null);
    }

    public static void removeValidFrom(Mandate mandate) {
        mandate.setValidFrom(null);
    }



}
