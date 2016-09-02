package proxy.staticmode;

public class ProxySubject extends Subject {
	RealSubject mRealSubject;
	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("proxy call remote real subject");
		mRealSubject.method();
	}
	public void setRealSubject(RealSubject realSubject){
		mRealSubject=realSubject;
	}
}
