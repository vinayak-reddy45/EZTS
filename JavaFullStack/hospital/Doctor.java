 package hospital;
public class Doctor extends Person {
    private String speciality;
    public Doctor(String a, String c,int b,String sp)
    {
    	super(a,b,c);
    	speciality=sp;
    }
    public void dDisplay() {
    	super.pDisplay();
        System.out.println("Specialty of the Doctor: " +speciality);
    }
}
