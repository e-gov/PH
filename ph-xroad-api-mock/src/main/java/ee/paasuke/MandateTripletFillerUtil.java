package ee.paasuke;

import java.util.List;

import io.swagger.model.MandateTriplet;
import io.swagger.model.Person;

public class MandateTripletFillerUtil {

    public static void fillMandateLinks(List<MandateTriplet> list) {
        list.stream().forEach(MandateTripletFillerUtil::fillMandateLinks);
    }

    public static void fillMandateLinks(MandateTriplet mandateTriplet) {
        mandateTriplet.getMandates().forEach(mandate -> MandateFillerUtil.fillMandateLinks(mandate, mandateTriplet));
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

    public static void removeIds(MandateTriplet mandateTriplet) {
        mandateTriplet.setId(null);
        mandateTriplet.getRepresentee().setId(null);
        mandateTriplet.getDelegate().setId(null);

        mandateTriplet.getMandates().forEach(MandateFillerUtil::removeId);
    }

    public static void setPersonIdentityCode(Person representeeOrDelegate, String inputParam) {

        String country = "EE";
        String code = inputParam;

        if (inputParam.matches("[a-zA-Z][a-zA-Z].+")) {
            country = inputParam.substring(0, 2).toUpperCase();
            code = inputParam.substring(2);
        }
        representeeOrDelegate.setIdentityCodeCountry(country);
        representeeOrDelegate.setIdentityCode(code);
    }



}
