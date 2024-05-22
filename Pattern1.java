import java.util.Scanner;
class Pattern10
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter The value of n:");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
for(int j=0;j<i;j++)
{
System.out.print(" ");
}
for(int k=i;k<n;k++)
{
System.out.print("* ");
}
System.out.println();
}
sc.close();
}
}
