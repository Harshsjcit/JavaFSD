public class StringConversion {

    public static void main(String[] args) {
        // Creating a string
        String myString = "Hello, Java!";

        // Converting string to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(myString);

        // Converting string to StringBuilder
        StringBuilder stringBuilder = new StringBuilder(myString);

        // Displaying the converted StringBuffer and StringBuilder
        System.out.println("Original String: " + myString);
        System.out.println("Converted to StringBuffer: " + stringBuffer);
        System.out.println("Converted to StringBuilder: " + stringBuilder);
    }
}
