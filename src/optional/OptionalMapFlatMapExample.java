package optional;

import java.util.Optional;

/**
 * Created by bipin on 4/12/18.
 */
//Use map if the function returns the object you need or flatMap if the function returns an Optional.
public class OptionalMapFlatMapExample {
    public static void main(String[] args) {
        Optional<String> nonEmptyGender = Optional.of("male");
        Optional<String> emptyGender = Optional.empty();

        System.out.println("Non-Empty Optional:" + nonEmptyGender.map(String::toUpperCase));
        System.out.println("Empty Optional:" + emptyGender.map(String::toUpperCase));

        Optional<Optional<String>> nonEmptyOptionalGender = Optional.of(Optional.of("male"));
        System.out.println("Optional value:" + nonEmptyOptionalGender);
        System.out.println("Optional.map:" + nonEmptyOptionalGender.map(g -> g.map(String::toUpperCase)));
        System.out.println("Optional.flatMap:" + nonEmptyOptionalGender.flatMap(g -> g.map(String::toUpperCase)));

    }
}
