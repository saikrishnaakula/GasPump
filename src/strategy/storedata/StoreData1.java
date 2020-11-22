package strategy.storedata;

import gaspump.datastore.Data;

public class StoreData1 implements StoreData {
	public void storeData(Data data) {
		data.setGasPrices();
	}
}
