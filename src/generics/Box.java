package generics;

/* Generic class*/
public class Box<T> {
    private T t;

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));

        System.out.printf("Integer Value :%d\n\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());

       /* Output
        Integer Value :10
        String Value :Hello World*/
    }

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}