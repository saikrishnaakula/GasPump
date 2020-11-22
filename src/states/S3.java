package states;

import mdaefsm.GaspumpMdaEfsm;
import outputprocessor.*;

public class S3 extends State {

	public S3(GaspumpMdaEfsm m, OutputProcessor op) {
		super(m, op, 4);
		// TODO Auto-generated constructor stub
	}
	//Payment type cancelled
	public void cancel() {
		op.cancelMsg();
		op.returnCash();
		mda.changeState(1);
	}
	//selects which type of Gas
	public void selectGas(int g) {
		op.setPrice(g);
		mda.changeState(4);
	}
	
	public void startPump() {
		op.setInitialValues();
		op.readyMsg();
		mda.changeState(6);
	}

}
