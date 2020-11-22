package states;

import mdaefsm.GaspumpMdaEfsm;
import outputprocessor.*;

public class InitialState extends State {

	public InitialState(GaspumpMdaEfsm mda, OutputProcessor op) {
		super(mda, op, 0);
		// TODO Auto-generated constructor stub
	}

	public void activate() {
		op.storeData();
		op.storePrices();
		mda.changeState(1);
	}

}
