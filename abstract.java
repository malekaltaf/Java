abstract class bike{
	abstract void run();
}
class honda extends bike{
	void run(){
		System.out.println("Running Safely");
	}
	public static void main(String []args){
		bike obj = new honda();
		obj.run();
	}
}