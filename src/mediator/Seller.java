package mediator;

public class Seller  {
	private Mediator mMediator=Mediator.getInstance();
	public void receiver(double money){
		System.out.println("receiver "+money+" wan from "+mMediator.toString());
	}
}
