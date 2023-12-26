package casting;

public class TypeCasting {

	public static void main(String[] args) {
		short shortnumber = 4;
		int intnumber = 5;
		long longnumber = 123456;
		float floatnumber = 5.5F;
		double doublenumber = 5.6D;
		String Stringnumber = "5";
		
		
		//Implicit Type casting (Widening Conversion)
		
		System.out.println("Implicit Typecasting (Widening Conversion):");
		System.out.println("casting short value to integer "+(int)shortnumber);
		System.out.println("Casting int value to long "+(long)intnumber);
		System.out.println("Casting long value to float value "+(float)longnumber);
		System.out.println("Casting float value to long value "+(double)floatnumber);
		
		System.out.println();
		//Explicit Type casting (Narrowing Conversion:
		System.out.println("Explicit Type casting (Narrowing Conversion");
		System.out.println("Casting to double value to long "+(long)doublenumber);
		System.out.println("Casting to float to integer value "+(int)floatnumber);
		System.out.println("Casting to int to short value "+(short)intnumber);
		
		//converting String to integer
		System.out.println();
		System.out.println("Converting to String to integer"+Integer.valueOf(Stringnumber));
		System.out.println("Converting integer to string "+String.valueOf(intnumber));
	}

}
