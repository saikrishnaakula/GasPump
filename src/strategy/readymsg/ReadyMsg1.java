package strategy.readymsg;

import gaspump.datastore.Data;

public class ReadyMsg1 implements ReadyMsg {
	public void readyMsg(Data data) {
		System.out.println("Ready for pumping GasPump1");
	}
}
