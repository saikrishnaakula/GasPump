package strategy.rejectmsg;

import gaspump.datastore.Data;

public class RejectMsg2 implements RejectMsg {
	public void rejectMessage(Data data) {
		System.out.println("Credit card payment not approved Gaspump2.");
	}
}
