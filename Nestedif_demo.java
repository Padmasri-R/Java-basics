
public class Nestedif_demo {
	public static void main(String[] args) {
		int a=20,b=30,c=40;
		if(a>b && a>c) {
			System.out.println("a is bigger");
		}
		else
			if(b>c) {
				System.out.println("b is bigger");
			}
			else
			{
				System.out.println("c is bigger");
			}
		
	}

}
