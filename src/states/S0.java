package states;

import mdaefsm.GaspumpMdaEfsm;
import outputprocessor.*;

public class S0 extends State {

	public S0(GaspumpMdaEfsm mda, OutputProcessor op) {
		super(mda, op, 1);
		// TODO Auto-generated constructor stub
	}

	public void start() {
		op.payMsg();
		op.initializeData();
		mda.changeState(2);
	}

}
