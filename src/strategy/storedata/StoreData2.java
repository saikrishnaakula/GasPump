package strategy.storedata;

import gaspump.datastore.Data;

public class StoreData2 implements StoreData {
	public void storeData(Data data) {
		data.setGasPrices();
	}
}
