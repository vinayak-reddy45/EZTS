import java.util.Scanner;
class Area
{int length,breadth;
public void setDim(int l,int b)
{
	length=l;
	breadth=b;

}
public int getArea()
{
return length*breadth;
}
}
public class AreaOfRectangle
{
	public static void main(String[] args)
	{int length,breadth;
	Scanner sc=new Scanner(System.in);
		System.out.print("Enter length and Breadth: ");
		length=sc.nextInt();
		breadth=sc.nextInt();
	Area obj=new Area();
	obj.setDim(length, breadth);
	int Area=obj.getArea();
	System.out.println("Area of rectangle is :"+Area);
	}
}