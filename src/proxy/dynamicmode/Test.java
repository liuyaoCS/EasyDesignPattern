package proxy.dynamicmode;

import java.lang.reflect.Proxy;



public class Test {
	/**
	 * 动态代理
	 * 角色：1 接口 2 具体类 3 代理类
	 * 说明：动态代理依赖接口（只能代理实现了接口的类：类是根据接口动态生成的）
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISubject subject=new RealSubject();
		DynamicProxyHandler handler=new DynamicProxyHandler(subject);
		
		ISubject proxy=(ISubject) Proxy.newProxyInstance(subject.getClass().getClassLoader(),new Class[]{ISubject.class},handler);
		proxy.method();
	}

}
