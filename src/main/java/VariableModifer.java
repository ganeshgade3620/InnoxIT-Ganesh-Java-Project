public class VariableModifer {

    public String name;             // Accessible everywhere
    private int age;                // Only inside this class
    protected String department;    // Package + subclasses
    int salary;                     // Default access (package-private)

    static int count = 0;           // Class-level variable
    final String company = "TCS";   // Cannot change
    static final int MAX = 100;     // Constant
}
