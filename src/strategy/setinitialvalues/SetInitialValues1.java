package strategy.setinitialvalues;

import gaspump.datastore.Data;

public class SetInitialValues1 implements SetInitialValues {
	public void setInitialValues(Data data) {
		data.setL(0);
		data.setTotal(0);
	}
}
