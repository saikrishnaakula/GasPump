package strategy.cancelmsg;

import gaspump.datastore.Data;

public class CancelMsg1 implements CancelMsg {
	public void cancelMessage(Data data) {
		System.out.println("Transaction Cancelled for GasPump1");
	}
}
