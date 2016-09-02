package proxy.staticmode;

public class Test {

	/**
	 * 静态代理
	 * 角色：1 具体类 2 代理类
	 * 		不一定有抽象类或接口 
	 * 说明：静态代理不依赖接口
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealSubject realSubject=new RealSubject();
		ProxySubject proxySubject=new ProxySubject();
		proxySubject.setRealSubject(realSubject);
		
		proxySubject.method();
	}

}
