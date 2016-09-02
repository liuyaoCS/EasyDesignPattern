package factory;


public class Test {

	/**
	 * 工厂模式 （线程池 国搜客户端FragmentHome）
	 * 核心：工厂类统一管理对象的创建
	 * 角色：1 抽象工厂 2 具体工厂 3 抽象产品 4 具体产品。
	 * 	    工厂类或者产品类都不一定要先创建抽象类或者接口再实现，
 	 *    因为工厂类就是一个管理类，统一管理产品的创建，只要是这个含义，无论实现形式什么样，都是工厂类。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
        // 
        // 
        Car audiCar= CarFactory.createCar(AudiCar.class);
        audiCar.drive();
	}

}
