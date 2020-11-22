package strategy.paymsg;

import gaspump.datastore.Data;
import strategy.paymsg.*;

@SuppressWarnings("unused")
public class PayMsg1 implements PayMsg {
	public void payMessage(Data data) {
		System.out.println("GasPump1 - Payment type - Credit card or Cash");
	}
}
