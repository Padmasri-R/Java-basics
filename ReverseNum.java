import java.util.Scanner;
public class ReverseNum {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the value of num:");
		int num=sn.nextInt();
		int reversedNum=0;
		while(num>0) 
		{
		int lastDigit=num%10;
		reversedNum=reversedNum*10+lastDigit;
		num=num/10;
		}
		System.out.println(reversedNum);
		
	}

}
