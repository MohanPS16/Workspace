package a4_polyTest;

public class B2_ChildOverRide extends B1_ParentOverRide {

	public static void main(String[] args) {
		B2_ChildOverRide a=new B2_ChildOverRide();
		a.car();
		a.bike();
	
	}
	public static void drivingskill(){
		System.out.println("child driving skill...");
	}
	public static void driftingskill(){
		System.out.println("Child Can drift");
	}
	public void car(){
		super.drivingskill();//parent class called through super keyword
		drivingskill();//child current class
		this.drivingskill();//child current class
	}
	public void bike(){
		driftingskill();
		
	}
}
