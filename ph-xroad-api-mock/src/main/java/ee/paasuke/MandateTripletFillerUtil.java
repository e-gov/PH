package ee.paasuke;

import java.util.List;

import io.swagger.model.MandateTriplet;

public class MandateTripletFillerUtil {


    public static void fillMandateLinks(MandateTriplet mandateTriplet) {

        mandateTriplet.getMandates().forEach(mandate -> MandateFillerUtil.fillMandateLinks(mandate, mandateTriplet));




    }


    public static void fillMandateLinks(List<MandateTriplet> list) {
        list.stream().forEach(mandateTriplet -> fillMandateLinks(mandateTriplet));
    }
}
