package ee.paasuke;

import java.util.Collection;
import java.util.List;

import io.swagger.model.Person;

public class PersonFillerUtil {

    public static void replaceInLinks(List<Person> list, String searchString, String replacementString) {
        list.stream()
             .filter(p -> p.getLinks() != null)
             .filter(p -> !p.getLinks().isEmpty())
             .map(Person::getLinks)
             .flatMap(Collection::stream)
             .forEach(x -> x.setHref(x.getHref()
                  .replace(searchString, replacementString)));
    }

    public static void setIdsToNull(List<Person> list) {
        list.stream().forEach(p -> p.setId(null));
    }


}
