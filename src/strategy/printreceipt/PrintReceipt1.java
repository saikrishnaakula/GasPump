package strategy.printreceipt;

import gaspump.datastore.Data;

public class PrintReceipt1 implements PrintReceipt {
	public void printReceipt(Data data) {
		System.out.println("Receipt: Total Price $" + data.getTotal() + " for " + data.getL() + " " + data.getUnits() + " of gas");
	}
}
