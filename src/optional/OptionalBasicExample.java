package optional;

import java.util.Optional;

/**
 * Created by bipin on 4/12/18.
 */

/**
 * Optional.ofNullable() method returns a non empty optional if
 * there is value present in the given object, otherwise it returns
 * empty optional.
 */
public class OptionalBasicExample {
    public static void main(String[] args) {
        Optional<String> gender = Optional.of("MALE");
        String answer1 = "Yes";
        String answer2 = null;
        Optional<Integer> value = Optional.of(1);

        System.out.println("Non-empty Optional:" + gender);
        System.out.println("Non-Empty Optional: Gender value:" + gender.get());
        System.out.println("Empty Optional:" + Optional.empty());
        System.out.println("Empty Optional Value:" + value);

        System.out.println("ofNullable of a object that has a value:" + Optional.ofNullable(gender));
        System.out.println("ofNullable of a object that has a value:" + Optional.ofNullable(answer1));
        System.out.println("ofNullable of a object that has empty value:" + Optional.ofNullable(answer2));

        System.out.println(Optional.of(answer2));
        System.out.println(Optional.of(Optional.empty()));


    }
}
