package strategy.stopmsg;

import gaspump.datastore.Data;

public class StopMsg2 implements StopMsg {
	public void stopMsg(Data data) {
		System.out.println("Gaspump2 - Stopping Gas Pump.");
	}
}
