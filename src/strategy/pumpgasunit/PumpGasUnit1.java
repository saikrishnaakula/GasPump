package strategy.pumpgasunit;

import gaspump.datastore.Data;

public class PumpGasUnit1 implements PumpGasUnit {
	public void pumpGasUnit(Data data) {
		int units = data.getL();
		Float price = data.getPrice();
		units++;
		Float total = price * units;
		data.setL(units);
		data.setTotal(total);
	}
}
