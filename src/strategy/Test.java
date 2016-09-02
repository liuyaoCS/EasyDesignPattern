package strategy;

public class Test {

	/**
	 * 策略模式 （android属性动画-插值器）
	 * 核心：实现一个功能有多种策略
	 * 角色：1 抽象策略 2 策略 3 策略调度者
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrategyHolder holder=new StrategyHolder();
		holder.setStrategy(new BusStategy());
		holder.caculate(2);
		
		holder.setStrategy(new SubwayStategy());
		holder.caculate(2);
	}

}
