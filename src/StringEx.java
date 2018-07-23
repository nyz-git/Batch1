
public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "JAVA"; //String Literals
		String s = new String("JAVA");
		System.out.println(str1==s);//checking equality of 2 Strings
		String replace = str1.replaceAll("A","O");
		String str2 = new String("C++"); //new keywords	
		String str3 = "BaTch";
		String str4 ="  PYTHON  ";
		int num = 45;
		String str5 = String.valueOf(num);//converting into string
		System.out.println(str4.trim());// chop off white spaces
		System.out.println(str1.charAt(2));//returns elements at index position
		System.out.println(str2.length());//calculate the total lenght
		System.out.println(str3.toLowerCase());
		System.out.println(str3.toUpperCase());
		System.out.println(str1.startsWith("JA"));
		System.out.println(str5.length());
		System.out.println(replace);
		
		
	}

}
