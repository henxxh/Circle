package circle;

import java.util.Scanner;

public class Circle1 {

	public static void main(String[] args) {
		int a=10,b=50;
		swap(a,b);
		System.out.printf("%d %d",a,b);
//		Scanner input =new Scanner(System.in);
//		System.out.println("«Î ‰»Î∞Îæ∂£∫");
//		double rediuss=input.nextDouble();
//		Circle circle=new Circle();
//		circle.setRedius(rediuss);
//		System.out.println(circle.getPermeter());
//		System.out.println(circle.getArea());

	}
	public static void swap(int a,int b)
	{
		int temp;
		temp=a;
		a=b;
		b=temp;
	}

}
