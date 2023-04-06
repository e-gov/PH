package ee.paasuke.service;


import io.swagger.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class MockDataService {


    public static List<MandateTriplet> getTriplets(int count) {
        List<MandateTriplet> triplets = new ArrayList<>();

        for(int i=0; i<count; i++) {
            triplets.add(getTriplet(i, 10_000_000 + i, 48001010001L+i));
        }
        return triplets;
    }
    public static MandateTriplet getTriplet(int tripletNr, long representeeIndex, long delegateId) {



        Person representee = Person.builder()
                .legalName("Company " + representeeIndex)
                .identifier("EE" + representeeIndex)
                .type(Person.TypeEnum.LEGAL_PERSON)
                .build();

        Person delegate = Person.builder()
                .firstName("Triplet " + tripletNr)
                .surname(delegateId + " Perenimi")
                .identifier("EE" + delegateId)
                .type(Person.TypeEnum.NATURAL_PERSON)
                .build();


        List<Mandate> mandates = new ArrayList<>();

        MandateLinks links = MandateLinks.builder()
                .delete("/v1/nss/EMTA/representees/imp1-EE10391131/delegates/imp2-EE11065244/mandates/imp3-ADEK_CLIENT")
                .addSubDelegate("/v1/nss/EMTA/representees/imp1-EE10391131/delegates/imp2-EE11065244/mandates/imp3-ADEK_CLIENT/subdelegates")
                .origin("https://server.ee/system/system2/submenu?configurationKey1=3334455&amp;configurationKey2=4444")
                .build();

        Mandate mandate = Mandate.builder()
                .role("LONG_NAMESPACE_NAME:THAT_IS_EVEN_LONGER_THAN_USUAL_ROLE_CODE_1")
                .links(links)
                .build();

        Mandate mandate2 = Mandate.builder()
                .role("SECOND_NAMESPACE_NAME:THAT_IS_EVEN_LONGER_THAN_USUAL_ROLE_CODE_2")
                .links(links)
                .build();

        mandates.add(mandate);
        mandates.add(mandate2);


        return MandateTriplet.builder().representee(representee)
                .delegate(delegate)
                .mandates(mandates)
                .build();

    }

}
