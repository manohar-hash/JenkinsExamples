import java.util.*;
class arith2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st number:");

		int a=sc.nextInt();
		System.out.println("enter 2nd number:");
		int b=sc.nextInt();
		int r1=a+b;
                int r2=a-b;
                int r3=a*b;
                float r4=a/b;
                int r5=a%b;
                System.out.println("addition="+r1);
                System.out.println("subtraction="+r2);
                System.out.println("multiplication="+r3);
                System.out.println("division="+r4);
                System.out.println("modulus="+r5);
	}
}
