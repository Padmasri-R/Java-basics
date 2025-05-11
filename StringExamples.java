package day3;

public class StringExamples {
	public static void main(String[] args) {
		float a=(float)(Math.random()*200);
		System.out.println(a);
	String name="Padmasri";
	String lastName="Balaji";
	System.out.println("length of the string is:"+ name.length());
	System.out.println(name.toLowerCase());
	System.out.println(name.toUpperCase());
	System.out.println(name.indexOf("a"));
	//String concatenation
	System.out.println(name.concat(" "+lastName));
	//Special characters
	String word="When 5\\6";
	System.out.println(word);
	System.out.println("hello");
	//Math numbers
	System.out.println(Math.min(3,4));
	System.out.println(Math.max(8,9));
	System.out.println(Math.random());
	System.out.println(Math.sqrt(a));
	}

}
