package proxy.dynamicmode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler{
	Object mSubject;
	public DynamicProxyHandler(Object subject) {
		// TODO Auto-generated constructor stub
		mSubject=subject;
	}
	
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("invoke real subject mothod");
		Object ret= method.invoke(mSubject, args);
		return ret;
	}

}
