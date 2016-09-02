package mediator;


public  class Mediator {
	private Buyer mBuyer;
	private Seller mSeller;
	private static Mediator mMediator=new Mediator();
	private Mediator(){
		
	}
	public static Mediator getInstance(){
		return mMediator;
	}
	public void setBuyer(Buyer mBuyer) {
		this.mBuyer = mBuyer;
	}
	public void setSeller(Seller mSeller) {
		this.mSeller = mSeller;
	}
	public void business(){
		mBuyer.pay(200);
		mSeller.receiver(180);
	}
	
}
