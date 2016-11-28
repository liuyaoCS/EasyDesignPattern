package observer;

import java.util.Observable;
import java.util.Observer;

public class subscriber implements Observer{

	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println(arg.toString());
	}

}
