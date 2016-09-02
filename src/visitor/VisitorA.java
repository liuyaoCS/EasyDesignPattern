package visitor;

public class VisitorA implements Visitor{

	@Override
	public void visit(Beijing bj) {
		// TODO Auto-generated method stub
		bj.showPlace();
	}

	@Override
	public void visit(Nanjing nj) {
		// TODO Auto-generated method stub
		nj.showSchool();
	}

}
