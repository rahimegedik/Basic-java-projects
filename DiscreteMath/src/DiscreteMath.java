
public class DiscreteMath {

	public static void main(String[] args) {
		String str1 = "01010011";
		String str2 = "11100010";
		String and = "";
		String or = "";
		String xor = "";

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				and += "0";
			} else {
				and += str1.charAt(i);
			}
		}
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				or += "1";
			} else {
				or += str1.charAt(i);
			}
		}
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				xor += "1";
			} else {
				xor += "0";
			}
		}
		System.out.println("string 1 = " + str1);
		System.out.println("string 2 = " + str2);

		System.out.println("and " + and);
		System.out.println("or " + or);
		System.out.println("xor " + xor);

	}

}
