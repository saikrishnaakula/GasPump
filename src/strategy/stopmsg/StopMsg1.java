package strategy.stopmsg;

import gaspump.datastore.Data;

public class StopMsg1 implements StopMsg {
	public void stopMsg(Data data) {
		System.out.println("Gaspump1 - Stopping Gas Pump.");
	}
}
