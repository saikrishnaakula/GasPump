package states;

import mdaefsm.GaspumpMdaEfsm;
import outputprocessor.*;

public class S5 extends State {

	public S5(GaspumpMdaEfsm mda, OutputProcessor op) {
		super(mda, op, 6);
		// TODO Auto-generated constructor stub
	}

	public void pump() {
		op.pumpGasUnit();
		op.gasPumpedMsg();
		mda.changeState(6);
	}

	public void stopPump() {
		op.stopMsg();
		op.printReceipt();
		op.returnCash();
		mda.changeState(1);
	}

}
