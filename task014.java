

package StringHandling;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java Strings "; // string Literal
		String str2 = new String(str1); // obj of the string - new keyword
		String str3 = new String("are easy to learn ");
		char ch[] = {'S', 't', 'r' ,'i', 'n', 'g'}; 
		String str4 = new String(ch);
		System.out.println(str1 + "\n" + str2 + "\n" +str3 + "\n" +str4);
		
	}

}
