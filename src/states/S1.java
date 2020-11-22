package states;

import mdaefsm.GaspumpMdaEfsm;
import outputprocessor.*;

public class S1 extends State {

	public S1(GaspumpMdaEfsm mda, OutputProcessor op) {
		super(mda, op, 2);
		// TODO Auto-generated constructor stub
	}
	
	public void payCredit() {
		op.setW(0);
		mda.changeState(3);
	}
	
	public void payCash() {
		op.storeCash();
		op.setW(1);
		op.displayMenu();
		mda.changeState(4);
	}
	
	public void payDebit() {
		op.enterPinMsg();
		op.setW(0);
		op.storePin();
		mda.changeState(7);
	} 

}
