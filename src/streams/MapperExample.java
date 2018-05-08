package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by bipin on 4/12/18.
 */
public class MapperExample {
    public static void main(String[] args) {
        List<User> names= Arrays.asList(
                new User("Mohendra",23),
                new User("Bablu", 12),
                new User("Charles", 20),
                new User("Meryl", 22)
        );
        names.stream()
                .filter(name -> !name.equals("Bablu"))
                .map(new  Function<User, String>() {
                    @Override
                    public String apply(User user) {
                        String concat = "name:"+user.getName()+" and age:"+ user.getAge();
                        return concat;
                    }
                })
                .forEach(System.out::println);
        names.stream()
                .filter(name -> !name.getName().equals("Bablu"))
                .map(user -> "name:"+user.getName()+" and age:"+ user.getAge())
                .forEach(System.out::println);


    }
}
class User{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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
}