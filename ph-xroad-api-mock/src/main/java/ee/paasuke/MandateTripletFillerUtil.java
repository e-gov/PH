package ee.paasuke;

import java.util.List;

import io.swagger.model.MandateTriplet;

public class MandateTripletFillerUtil {

    public static void fillMandateLinks(List<MandateTriplet> list) {
        list.stream().forEach(MandateTripletFillerUtil::fillMandateLinks);
    }

    public static void fillMandateLinks(MandateTriplet mandateTriplet) {
        mandateTriplet.getMandates().forEach(mandate -> MandateFillerUtil.replacePlaceholdersInLinks(mandate, mandateTriplet));
    }

    public static void removeMandateLinks(List<MandateTriplet> list) {
        list.stream().forEach(MandateTripletFillerUtil::removeMandateLinks);
    }

    public static void removeMandateValidFrom(List<MandateTriplet> list) {
        list.stream().forEach(MandateTripletFillerUtil::removeMandateValidFrom);
    }

    public static void removeMandateLinks(MandateTriplet mandateTriplet) {
        mandateTriplet.getMandates().forEach(MandateFillerUtil::removeMandateLinks);
    }

    public static void removeMandateValidFrom(MandateTriplet mandateTriplet) {
        mandateTriplet.getMandates().forEach(MandateFillerUtil::removeValidFrom);
    }





}
