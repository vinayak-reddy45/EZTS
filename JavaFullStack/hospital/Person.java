package hospital;
public class Person {
	private int age;
	private String name,gender;
public Person(String a,int b,String c)
{
name=a;
gender=c;
age=b;
}
void pDisplay() {
	System.out.println(name);
	System.out.println(age);
	System.out.println(gender);
	
}

}
