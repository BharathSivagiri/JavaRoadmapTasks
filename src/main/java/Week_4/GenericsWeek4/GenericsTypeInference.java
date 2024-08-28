package Week_4.GenericsWeek4;

public class GenericsTypeInference
{
    public static void main(String[] args)
    {
        //type inference
        Box2<Integer> integerBox = new Box2<>();
        //unchecked conversion warning
        Box2<String> stringBox = new Box2<String>();

        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));

        System.out.printf("Integer Value :%d\n", integerBox.get());
        System.out.printf("String Value :%s\n", stringBox.get());
    }
}

class Box2<T>
{
    private T t;

    public void add(T t)
    {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
