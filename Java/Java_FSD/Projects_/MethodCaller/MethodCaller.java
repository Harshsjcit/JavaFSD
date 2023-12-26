public class MethodCaller {

    // Method with no return type and no arguments
    public void methodWithNoReturnTypeOrArguments() {
        System.out.println("Method with no return type and no arguments called.");
    }

    // Method with a return type and arguments
    public int add(int a, int b) {
        return a + b;
    }

    // Method with a return type but no arguments
    public String greet() {
        return "Hello, there!";
    }

    public static void main(String[] args) {
        MethodCaller caller = new MethodCaller();

        // Calling a method with no return type and no arguments
        caller.methodWithNoReturnTypeOrArguments();

        // Calling a method with a return type and arguments
        int result = caller.add(5, 3);
        System.out.println("Result of addition: " + result);

        // Calling a method with a return type but no arguments
        String greeting = caller.greet();
        System.out.println(greeting);
    }
}
