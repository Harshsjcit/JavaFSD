public class ConstructorTypes {

     Default constructor
    public ConstructorTypes() {
        System.out.println(Default Constructor);
    }

     Parameterized constructor
    public ConstructorTypes(String message) {
        System.out.println(Parameterized Constructor  + message);
    }

     Chaining constructors
    public ConstructorTypes(int value) {
        this(Chaining Constructor);
        System.out.println(Chaining Constructor  + value);
    }

    public static void main(String[] args) {
         Creating objects using different constructors
        ConstructorTypes obj1 = new ConstructorTypes();  Default constructor
        ConstructorTypes obj2 = new ConstructorTypes(Hello!);  Parameterized constructor
        ConstructorTypes obj3 = new ConstructorTypes(42);  Chaining constructors
    }
}
