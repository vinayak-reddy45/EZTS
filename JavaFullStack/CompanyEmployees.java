class Employee
{String name;
int age;
public void setDetails(String name,int age)
{
	name=name;
	age=age;
	
}
public void getDetails()
{
	System.out.println("Name of the employee"+name);
	System.out.println("Name of the employee"+age);
	
}
}
class FullTimeEmployee extends Employee
{
int Salary;
public void setSalary(int salary)
{
	salary=salary;
}
public void getSalary()
{
	System.out.println("The Salary of the Employee is:"+salary);
}
}