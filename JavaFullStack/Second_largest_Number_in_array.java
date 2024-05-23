import java.util.Scanner;
public class Second_largest_Number_in_array{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the size of the array: ");
int size = sc.nextInt();
if(size<2){
 System.out.println("MinimumSizeOfArray is 2");
return;
}
int[] array = new int[size];
System.out.println("Enter the elements of the array:");
for (int i = 0; i < size; i++) {
 array[i]=sc.nextInt();
}
int result=second(array);
if (result!=Integer.MIN_VALUE) {
System.out.println("The second largest element is "+result);
} else {
System.out.println("There is no second largest element.");
}
sc.close();
}
public static int second(int[] array) {
int fL=Integer.MIN_VALUE;
int sL=Integer.MIN_VALUE;
for (int num:array) {
if (num > fL) {
sL=fL;
fL=num;
} else if(num >sL&&num!=fL) {
sL=num;
}
}
return sL;
}
}
