import java.util.Scanner;
class Pattern8
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n:");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
for(int k=i;k<n;k++)
{
System.out.print("* ");
}
System.out.println();
}
sc.close();
}
}
