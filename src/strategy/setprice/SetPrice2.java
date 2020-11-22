package strategy.setprice;

import gaspump.datastore.Data;

public class SetPrice2 implements SetPrice {
	public void setPrice(Data data, int g) {
		data.setSelPrice(g);
		System.out.println("Selecting Gasoline type :" + g);
	}
}
