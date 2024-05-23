  package hospital;
public class Nurse extends Person {
    private int roomNo,floor;
    public Nurse(String a,String c,int b,int f,int g ) {
    	super(a,b,c);
    
    roomNo=f;
     floor=g;
     
    }
    public void NDisplay() {
        System.out.println(roomNo);
        System.out.println(floor);
    }
}
