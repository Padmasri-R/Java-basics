package dtfry;
import java.util.Scanner;
public class Even_or_odd {
	public static void main(String[] args) { 
	int number;
	Scanner sn=new Scanner (System.in);
	number=sn.nextInt();
	switch (number%2)
	{
	case 0:
	{
		System.out.println("number is even");
	}
	break;
	case 1:
	case -1:
	{
		System.out.println("odd");
	}
	break;
	default: 
	{
		System.out.println("invalid");
	}
	
	}
	}
	}
