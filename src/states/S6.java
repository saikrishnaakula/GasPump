package states;

import mdaefsm.GaspumpMdaEfsm;
import outputprocessor.*;

public class S6 extends State {

	public S6(GaspumpMdaEfsm mda, OutputProcessor op) {
		super(mda, op, 7);

	}

	public void CorrectPin() {
		op.displayMenu();
		op.ejectCard();
		mda.changeState(4);
	}

	public void IncorrectPin(int max) {
		if(mda.k >=max ) {
			op.ejectCard();
			op.wrongPinMsg();
			mda.changeState(1);
		} else {
			op.wrongPinMsg();
			mda.k+=1;
		}
	}

}
