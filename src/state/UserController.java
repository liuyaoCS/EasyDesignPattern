package state;

public class UserController implements UserState{
	UserState mUserState;
	public void setUserState(UserState userState){
		mUserState=userState;
	}
	public void comment(String articleId, String content) {
		// TODO Auto-generated method stub
		mUserState.comment(articleId, content);
	}
	public void resend(String articleId) {
		// TODO Auto-generated method stub
		mUserState.resend(articleId);
	}
}
