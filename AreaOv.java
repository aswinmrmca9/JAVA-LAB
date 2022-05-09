import java.util.Scanner;
class farea{
	void area(int l)
	{
		float a;
		a=l*l;
		System.out.println("Area of Square is:"+a);
	}
	void area(int l,int b)
	{
		float a;
		a=l*b;
		System.out.println("Area of Rectangle is:"+a);
	}
	void area(double r)
	{
		double a;
		a=3.14*r*r;
		System.out.println("Area of Circle is:"+a);
	}
	void area(double a,double b)
	{
		double ar;
		ar=(a+b)/2.0;
		System.out.println("Area of Triangle is:"+ar);
	}

}
class AreaOv{
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		farea fa=new farea();
		fa.area(5);
		fa.area(5,6);
		fa.area(6.0);
		fa.area(5.0,7.0);
	}
}
