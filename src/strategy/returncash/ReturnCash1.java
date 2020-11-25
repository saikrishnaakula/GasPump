package strategy.returncash;

import gaspump.datastore.Data;
import strategy.returncash.*;

@SuppressWarnings("unused")
public class ReturnCash1 implements ReturnCash {
	public void returnCash(Data data) {
		if(data.getW() ==1) {
			float balance =  data.getCash() -  data.getTotal();
			if(balance < 0 ) balance =0;
			System.out.println("Balance Return : $" + balance);
		}
	}
}
