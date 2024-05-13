package new_java;

public class Strings2 {

	public static void main(String[] args) {
		String s="vivek";
		s=s.concat("shetty");
				System.out.println(s);
			String s1="suman";
			String s2="suman";
			System.out.println(s1);
			System.out.println(s2);
String s3=new String("suman");
String s4="kiran";
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equals(s4));
System.out.println(s1==s3);
System.out.println(s1.compareTo(s2));
	}

}
