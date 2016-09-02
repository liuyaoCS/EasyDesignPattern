package singleton;


public class Test {

	/**
	 * 单例模式 （android系统服务）
	 * 核心：将构造函数私有化，通过静态方法返回一个唯一的实例。
	 * 说明：获取的过程要保证线程安全。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySingleton mySingleton=MySingleton.getInstance();
	}

}
