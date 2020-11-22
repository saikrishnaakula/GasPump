package strategy.gaspumpedmsg;

import gaspump.datastore.Data;

public class GasPumpedMsg2 implements GasPumpedMsg {
	public void gasPumpedMsg(Data data) {
		System.out.println(data.getUnits() + ": " + data.getL() + " || Total:: $" + data.getTotal());
	}
}
