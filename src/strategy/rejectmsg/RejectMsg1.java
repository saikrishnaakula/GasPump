package strategy.rejectmsg;

import gaspump.datastore.Data;

public class RejectMsg1 implements RejectMsg {
	public void rejectMessage(Data data) {
		System.out.println("Credit card payment not approved Gaspump1.");
	}
}
