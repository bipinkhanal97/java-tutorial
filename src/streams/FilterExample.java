package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by bipin on 4/12/18.
 */
public class FilterExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mohendra","bipin","Mundre","Rajendra","Mausami","Ganesh");

        list.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return !s.equals("bipin");
                    }
                })
                .forEach(new Consumer<String>() {
                    @Override
                    public void accept(String s) {
                        System.out.println(s);
                    }
                });
        System.out.println("--------------------------------------------------------------------");
        list.stream()
                .filter(name->!name.equals("Mundre"))
                .forEach(name-> System.out.println(name));
        System.out.println("--------------------------------------------------------------------");

        list.stream()
                .filter(FilterExample::isNotMohendra)
                .forEach(System.out::println);
    }
    public static boolean isNotMohendra(String name){
        return !name.equals("Mohendra");
    }

}
