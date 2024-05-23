 package hospital;
public class Patient extends Person {
	private int bedNo;
	private String disease;
public Patient(String a,int b,String c,int d,String e)
{super(a,b,c);
disease=e;
bedNo=d;
}
void patDisplay() {
	super.pDisplay();
	System.out.println(bedNo);
	System.out.println(disease);
	
}

}
