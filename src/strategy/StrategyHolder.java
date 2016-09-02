package strategy;

public class StrategyHolder {
	private TrafficStrategy mTrafficStrategy;
	public void setStrategy(TrafficStrategy strategy){
		mTrafficStrategy=strategy;
	}
	public int caculate(int km){
		int price=mTrafficStrategy.caculate(km);
		System.out.println("you need pay "+price+" yuan");
		return price;
	}
}
