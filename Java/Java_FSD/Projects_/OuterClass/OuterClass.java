// Outer class
public class OuterClass {

    private int outerVar = 10;

    // Inner class
    class InnerClass {
        void display() {
            System.out.println("Inner class method. Outer variable: " + outerVar);
        }
    }

    // Static inner class
    static class StaticInnerClass {
        void display() {
            System.out.println("Static inner class method.");
        }
    }

    public static void main(String[] args) {
        // Creating instances of inner classes
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        OuterClass.StaticInnerClass staticInnerObj = new OuterClass.StaticInnerClass();

        // Invoking methods of inner classes
        innerObj.display();
        staticInnerObj.display();
    }
}
