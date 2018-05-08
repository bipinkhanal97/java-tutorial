package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Created by bipin on 4/12/18.
 */
public class FlatMapExample {
    public static void main(String[] args) {
        List<User1> names= Arrays.asList(
                new User1("Mohendra",23,Arrays.asList("1","2")),
                new User1("Bablu", 12,Arrays.asList("3","4","5")),
                new User1("Charles", 20,Arrays.asList("7","8")),
                new User1("Meryl", 22 ,Arrays.asList("6","9"))
        );
  names.stream()
                .map(user1 -> user1.getPhoneNumbers())
                .flatMap(new Function<List<String>, Stream<?>>() {
                    @Override
                    public Stream<?> apply(List<String> stringStream) {
                        return stringStream.stream();
                    }
                })
                .forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------");
        names.stream()
                .map(user1 -> user1.getPhoneNumbers())
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }

}
class User1{
    private String name;
    private int age;
    List<String> phoneNumbers;

    public User1(String name, int age, List<String> phoneNumbers) {
        this.name = name;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}