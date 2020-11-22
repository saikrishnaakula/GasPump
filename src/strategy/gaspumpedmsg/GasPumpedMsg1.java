package strategy.gaspumpedmsg;

import gaspump.datastore.Data;

public class GasPumpedMsg1 implements GasPumpedMsg {
	public void gasPumpedMsg(Data data) {
		System.out.println(data.getUnits() + ": " + data.getL() + " || Total:: $" + (Float) data.getTotal());
	}
}
