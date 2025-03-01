public class DefaultValues {
    // Declare instance variables for each primitive type
    byte defaultByte;
    short defaultShort;
    int defaultInt;
    long defaultLong;
    float defaultFloat;
    double defaultDouble;
    char defaultChar;
    boolean defaultBoolean;

    public static void main(String[] args) {
        // Create an object of the class to access instance variables
        DefaultValues obj = new DefaultValues();

        // Display default values
        System.out.println("Default values of primitive data types in Java:");
        System.out.println("byte: " + obj.defaultByte);
        System.out.println("short: " + obj.defaultShort);
        System.out.println("int: " + obj.defaultInt);
        System.out.println("long: " + obj.defaultLong);
        System.out.println("float: " + obj.defaultFloat);
        System.out.println("double: " + obj.defaultDouble);
        System.out.println("char: [" + obj.defaultChar + "]"); // Char may display as empty
        System.out.println("boolean: " + obj.defaultBoolean);
    }
}

OUTPUT:
Default values of primitive data types in Java:
byte: 0
short: 0
int: 0
long: 0
float: 0.0
double: 0.0
char: [.]
boolean: false