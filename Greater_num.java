package day2;
import java.util.Scanner;
public class Greater_num {

	public static void main(String[] args)
	{
	int a;
	int b;
	int c;
	Scanner s=new Scanner (System.in);
	System.out.println("enter three numbers");
	a=s.nextInt();
	b=s.nextInt();
	c=s.nextInt();
	if (a>b&&a>c)
		System.out.println("A is greatest number");
	else if (b>a&&b>c)
		System.out.println("B is greatest number");
	else
		System.out.println("c is greatest number");

	}

}
