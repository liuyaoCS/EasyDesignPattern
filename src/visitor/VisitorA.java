package visitor;

public class VisitorA implements Visitor{

	public void visit(Beijing bj) {
		// TODO Auto-generated method stub
		bj.showPlace();
	}

	public void visit(Nanjing nj) {
		// TODO Auto-generated method stub
		nj.showSchool();
	}

}
