package state;

public class LogoutState implements UserState {

	@Override
	public void comment(String articleId, String content) {
		// TODO Auto-generated method stub
		System.out.println("you need login first");
	}

	@Override
	public void resend(String articleId) {
		// TODO Auto-generated method stub
		System.out.println("you need login first");
	}

}
