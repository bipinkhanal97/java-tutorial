package optional;

import java.util.Optional;
import java.util.function.Consumer;

/**
 * Created by bipin on 4/6/16.
 */

/*
    Optional.isPresent() returns true if the given Optional object is non-empty. Otherwise it returns false.

    Optional.ifPresent() performs given action if the given Optional object is non-empty. Otherwise it returns false.
 */
public class OptionalIfPresentExample {

    public static void main(String[] args) {

        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();

        if (gender.isPresent()) {
            System.out.println(gender.get());
        } else {
            System.out.println("Value not available");
        }

        gender.ifPresent(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        emptyGender.ifPresent(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }

}
