package observer;


public class Test {
	/**
	 * 观察者模式 (android:listview的adapter;broadcastreceiver)
	 * 核心：发布-订阅模式
	 * 角色：1 抽象主题    java已经实现Observable
	 *      2 抽象观察者 java已经实现Observer
	 * 	    3 具体主题 
	 *      4 具体观察者
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Publisher pub=new Publisher();
		subscriber sub=new subscriber();
		pub.addObserver(sub);
	
		pub.publish("update...");
	}

}
