package ee.paasuke.service;

import io.swagger.model.Translation;

public class TranslationService {
    public static Translation translationEt(String et) {
        return translation(et, null, null);
    }

    public static Translation translation(String et, String en) {
        return translation(et, en, null);
    }

    public static Translation translation(String et, String en, String ru) {
        Translation translation = new Translation();
        translation.setEt(et);
        translation.setEn(en);
        translation.setRu(ru);
        return translation;
    }
}
