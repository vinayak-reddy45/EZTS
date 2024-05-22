import java.util.Scanner;
class Average
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number of integers:");
int n=sc.nextInt();
int sum=0;
System.out.println("Enter integers:");
for(int i=0;i<n;i++)
{
int num=sc.nextInt();
sum +=num;
}
double avg=(sum/n);
System.out.println("Average is :"+avg);
sc.close();
}
}


