package optional;

import java.util.Optional;

/**
 * Created by bipin on 4/6/16.
 */
public class OptionalFilterExample {
    public static void main(String[] args) {
        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();

        System.out.println(gender.filter(g -> g.equals("male")));
        System.out.println(gender.filter(g -> g.equalsIgnoreCase("male")));
        System.out.println(emptyGender.filter(g -> g.equalsIgnoreCase("male")));
    }
}
