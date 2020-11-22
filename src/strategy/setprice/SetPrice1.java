package strategy.setprice;

import gaspump.datastore.Data;

public class SetPrice1 implements SetPrice {
	public void setPrice(Data data, int g) {
		data.setSelPrice(g);
		System.out.println("price set :" + g);
	}
}
