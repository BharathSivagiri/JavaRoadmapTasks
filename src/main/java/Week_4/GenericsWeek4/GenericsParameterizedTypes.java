package Week_4.GenericsWeek4;

import java.util.ArrayList;
import java.util.List;


public class GenericsParameterizedTypes
{
    public static void main(String[] args) {
        Box4<Integer, List<String>> box = new Box4<>();

        List<String> messages = new ArrayList<>();

        messages.add("Hi");
        messages.add("Hello");
        messages.add("Bye");

        box.add(Integer.valueOf(10),messages);
        System.out.printf("Integer Value :%d\n", box.getFirst());
        System.out.printf("String Value :%s\n", box.getSecond());


    }
}

class Box4<T, S> {
    private T t;
    private S s;

    public void add(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public T getFirst() {
        return t;
    }

    public S getSecond() {
        return s;
    }
}
