package strategy.readymsg;

import gaspump.datastore.Data;

public class ReadyMsg2 implements ReadyMsg {
	public void readyMsg(Data data) {
		System.out.println("Ready for pumping GasPump 2");
	}
}
