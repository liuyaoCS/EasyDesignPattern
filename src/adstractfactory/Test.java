package adstractfactory;


public class Test {

	/**
	 * 抽象工厂模式 （起源于不同操作系统的button textview等ui表现，用例较少）
	 * 核心：工厂模式如果一个工厂生成多种产品，就叫抽象工厂模式。
	 * 说明：因为都是面向接口编程，客户得到的cpu并不知道到底是什么品牌的cpu。这就是抽象工厂模式。
	 * 		而如果是工厂模式 得到的cpu是唯一确定的，比如用LenovoFactory生产，得到的就是LenovoCpu。
	 * 		一般情况下，工厂类也可以不写抽象，只写实现。但是按规范的编程流程，它和工厂模式的角色是一样的：
	 * 		1 抽象产品 2 具体产品 3 抽象工厂 4 具体工厂 只不过抽象工厂模式的产品是多个，仅此而已。	
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ComputerFactory factory=new LenovoFactory();
		Cpu cpu=factory.createCpu();
		Memory memory=factory.createMemory();
		cpu.compute();
		memory.storage();
	}

}
