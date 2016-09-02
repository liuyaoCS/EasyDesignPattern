package state;


public interface UserState {
	public  void comment(String articleId,String content);
	public  void resend(String articleId);
}
