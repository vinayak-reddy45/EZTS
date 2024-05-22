class Pattern2
{
public static void main(String [] args)
{
int n=4;
for(int i=1;i<=n;i++)
{
for(int j=0;j<n-i;j++)
{
System.out.print("  ");
}
int count=i;
for(int k=0;k<i;k++)
{
System.out.print(count+" ");
count++;
}
count=count-2;
for(int m=1;m<i;m++)
{
System.out.print(count+" ");
count--;
}

System.out.println();
}}}