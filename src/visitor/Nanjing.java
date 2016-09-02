package visitor;

public class Nanjing extends City {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	public void showPlace(){
		System.out.println("fuzimiao, xuanwuhu...");
	}
	public void showSchool(){
		System.out.println("dongnan heihai");
	}
}
