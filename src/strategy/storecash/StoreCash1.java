package strategy.storecash;

import gaspump.datastore.Data;

public class StoreCash1 implements StoreCash {
	public void storeCash(Data data) {
		data.setCash();
	}
}
