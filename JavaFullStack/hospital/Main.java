package hospital;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
String n,g;
int ag;
boolean flag=true;
while(flag==true)
{
	
        System.out.println("Enter 1 to enter doctor details 2 for nurse and 3 for patient:");
        int a=sc.nextInt();
        if(a==1)
        {
        	System.out.println("Enter your name");
        	n=sc.next();
        	System.out.println("Enter your age");
        	ag=sc.nextInt();
        	System.out.println("Enter your gender");
        	g=sc.next();
        	System.out.println("Enter doctor speciality");
        	String sp=sc.next();
        	Doctor d=new Doctor(n,g,ag,sp);
        	d.dDisplay();	
        	
        }
       

        sc.close();
    }
}}
