package state;

public class Test {

	/**
	 * 状态模式 （用户登录 ； android wifi管理）
	 * 核心：把所有状态相关的行为封装到状态类中。
	 * 角色：1 抽象状态 2 具体状态 3 状态行为控制类
	 * 说明：策略模式不同的策略是独立的，状态模式不同的状态靠状态机来保持彼此的关联
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserController usc=new UserController();
		usc.setUserState(new LogoutState());
		usc.comment("2133", "very good");
		
		usc.setUserState(new LoginState());
		usc.comment("2133", "very good");
	}

}
