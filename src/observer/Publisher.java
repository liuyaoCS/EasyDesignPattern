package observer;

import java.util.Observable;

public class Publisher extends Observable{
	public void publish(String content){
		//这个函数是protected，对于包内类和子类有效。在Test中是没法通过Publisher访问的。
		setChanged();
		notifyObservers(content);
	}
}
