package Week_2;

public class modifiersWeek2
{
    private static final int CONSTANT = 10;

    //Access modifiers
    public String publicVariable = "Public";//public variable
    protected String protectedVariable = "Protected";//protected
    String defaultVariable = "Default"; // Package-private
    private String privateVariable = "Private";//private

    // Non-access modifiers
    final String FINAL_STRING = "Final";//final
    transient String TRANSIENT_STRING = "Transient";//transient
    volatile String VOLATILE_STRING = "Volatile";//volatile

    private static synchronized void synchronizedMethod()
    {
        // Thread-safe method
    }

    strictfp float strictFPCalculation(float x)
    {
        return x * x;
    }

    public static void main(String[] args)
    {
        //Create a new object
        modifiersWeek2 example = new modifiersWeek2();

        //Access modifiers
        System.out.println(example.publicVariable);
        System.out.println(example.protectedVariable);
        System.out.println(example.defaultVariable);
        System.out.println(example.privateVariable);
        System.out.println(CONSTANT);

        //Non-access modifiers
        System.out.println(example.FINAL_STRING);
        System.out.println(example.TRANSIENT_STRING);
        System.out.println(example.VOLATILE_STRING);
        synchronizedMethod();
        System.out.println(example.strictFPCalculation(2.0f));
    }
}