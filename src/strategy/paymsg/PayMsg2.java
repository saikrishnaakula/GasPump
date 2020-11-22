package strategy.paymsg;

import gaspump.datastore.Data;
import strategy.paymsg.*;

@SuppressWarnings("unused")
public class PayMsg2 implements PayMsg {
	public void payMessage(Data data) {
		System.out.println("GasPump2 - Payment type - Credit card or Debit card");
	}
}
