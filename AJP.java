package coom.staticExam;

public class AJP {
	int id;
	String name;
	
	static String p_name="Ajp";
	
	AJP(int id, String name){
		this.id=id;
		this.name=name;
	}
	// static method
	static void print() {
		System.out.println("print........");
		
	}
	
	//static blocks
	static {
		System.out.println("I am static block");
	}
	
	void display() {
		System.out.println(id +" " +name+" "+p_name);
		
	}
	public static void main (String[] args) {
		AJP a1=new AJP(1, "Neeraj");
		AJP a2=new AJP(2, "Ram");
		AJP a3=new AJP(3, "Rohit");
		a1.display();
		a2.display();
		a3.display();
		AJP.print();// static method can be called without object
		
	}
	

}
