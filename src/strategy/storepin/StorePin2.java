package strategy.storepin;

import gaspump.datastore.Data;

public class StorePin2 implements StorePin {

	@Override
	public void storePin(Data d) {
		// TODO Auto-generated method stub
		System.out.println("Store pin");
		d.setPin();
	}

}
