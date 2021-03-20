package demo.JavaPractice.collections;

public class ByteArrayToString {

	public static void main(String[] args) {

		byte[] byteArray = {'K','R','A','N','T','H','I'};
		
//To convert byte Array to String we need to pass the byte array variable into Sting Constructor
		
		String result = new String(byteArray);
		System.out.println(result);
		
	}

}
