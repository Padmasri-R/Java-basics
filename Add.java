package addition;

import java.util.Scanner;

public class Add {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter the value of inputs:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("addition of a="+a+"b="+b+"is"+c);
	}

}
