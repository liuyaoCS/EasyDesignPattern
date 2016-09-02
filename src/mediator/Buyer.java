package mediator;

public class Buyer {
	private Mediator mMediator=Mediator.getInstance();
	public void pay(double money){
		System.out.println("give "+mMediator.toString()+" "+money+" wan");
	}
}
