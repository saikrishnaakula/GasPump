package states;

import mdaefsm.GaspumpMdaEfsm;
import outputprocessor.*;

public class S2 extends State {

	public S2(GaspumpMdaEfsm mda, OutputProcessor op) {
		super(mda, op, 3);
		// TODO Auto-generated constructor stub
	}

	public void approved() {
		op.displayMenu();
		op.ejectCard();
		mda.changeState(4);
	}

	public void reject() {
		op.rejectMsg();
		op.ejectCard();
		mda.changeState(1);
	}

}
