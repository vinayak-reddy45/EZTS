import java.util.Scanner;
class Pattern7
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Value of n :");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
for(int j=0;j<n-i;j++)
{
System.out.print(" ");
}
for(int k=0;k<=i;k++)
{
System.out.print("* ");
}
System.out.println();
}
sc.close();
}
}