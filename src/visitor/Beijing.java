package visitor;

public class Beijing extends City {

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}
	public void showPlace(){
		System.out.println("greate wall, xiangshan...");
	}
	public void showSchool(){
		System.out.println("beiyou beiwai");
	}
}
