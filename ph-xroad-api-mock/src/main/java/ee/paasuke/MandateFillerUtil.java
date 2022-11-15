package ee.paasuke;

import java.util.List;
import java.util.stream.Collectors;

import io.swagger.model.Link;
import io.swagger.model.Mandate;
import io.swagger.model.MandateTriplet;

public class MandateFillerUtil {

    public static final String DEL_LINK = "/r1/ee-dev/GOV/70006317/volitused-mock/volitused-emta/v1/representees/{representee}/delegates/{delegate}/mandates/{role}/namespaces/{namespace}";


    public static void fillMandateLinks(Mandate mandate, MandateTriplet triplet) {

        List<Link> xroadDeleteLinks = mandate.getLinks().stream().filter(link -> link.getRel().equals("xroadDelete")).collect(Collectors.toList());

        String delLinkHref = DEL_LINK
             .replaceAll("\\{representee}", String.valueOf(triplet.getRepresentee().getId()))
             .replaceAll("\\{delegate}",  String.valueOf(triplet.getDelegate().getId()))
             .replaceAll("\\{role}", String.valueOf(mandate.getId()))
             .replaceAll("\\{namespace}", String.valueOf(mandate.getNamespace()));

        xroadDeleteLinks.stream().forEach(link -> link.setHref(delLinkHref));



    }


}
