package Week_4.GenericsWeek4;

public class GenericsRawTypes
{
    public static void main(String[] args)
    {
        Box5<Integer> box = new Box5<Integer>();

        box.set(Integer.valueOf(10));
        System.out.printf("Integer Value :%d\n", box.getData());


        Box5 rawBox = new Box5();

        //No warning
        rawBox = box;
        System.out.printf("Integer Value :%d\n", rawBox.getData());

        //Warning for unchecked invocation to set(T)
        rawBox.set(Integer.valueOf(10));
        System.out.printf("Integer Value :%d\n", rawBox.getData());

        //Warning for unchecked conversion
        box = rawBox;
        System.out.printf("Integer Value :%d\n", box.getData());
    }
}

class Box5<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T getData() {
        return t;
    }
}
