// A class with different access modifiers
public class AccessModifiersExample {

    // Public method accessible from anywhere
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Private method accessible only within this class
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Protected method accessible within the same package or subclasses
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // Default (no modifier) method accessible within the same package
    void defaultMethod() {
        System.out.println("This is a default method.");
    }
}
