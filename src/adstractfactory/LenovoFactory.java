package adstractfactory;

public class LenovoFactory extends ComputerFactory {

	@Override
	public Cpu createCpu() {
		// TODO Auto-generated method stub
		return new IntelCpu();
		
	}

	@Override
	public Memory createMemory() {
		// TODO Auto-generated method stub
		return new SumsingMemory();
	}

}
