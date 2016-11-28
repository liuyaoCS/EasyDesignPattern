package state;

public class LoginState implements UserState {

	public void comment(String articleId, String content) {
		// TODO Auto-generated method stub
		System.out.println("you say "+content+" to article "+articleId);
	}

	public void resend(String articleId) {
		// TODO Auto-generated method stub
		System.out.println("you resend article "+articleId);
	}

}
