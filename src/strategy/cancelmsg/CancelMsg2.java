package strategy.cancelmsg;

import gaspump.datastore.Data;

public class CancelMsg2 implements CancelMsg {
	public void cancelMessage(Data data) {
		System.out.println("Transaction Cancelled for GasPump1");
	}
}
