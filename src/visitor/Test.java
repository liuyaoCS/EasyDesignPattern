package visitor;

public class Test {
	/**
	 * 访问者模式 （很少使用）
	 * 核心：被访问对象对不同的访问类有不同的处理方式。（避免了instance of 和强制类型转化）
	 * 角色：1 抽象visitor 2 具体visitor 3 抽象被访问对象 4 具体被访问对象
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VisitorA va=new VisitorA();
		Beijing bj=new Beijing();
		bj.accept(va);
		Nanjing nj=new Nanjing();
		nj.accept(va);
	}

}
