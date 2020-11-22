package states;

import mdaefsm.GaspumpMdaEfsm;
import outputprocessor.*;

public abstract class State {

	GaspumpMdaEfsm mda;
	OutputProcessor op;
	private int stateId;

	public int getStateId() {
		return stateId;
	}

	public State(GaspumpMdaEfsm mda, OutputProcessor op, int stateId) {
		this.mda = mda;
		this.op = op;
	}

	public void activate() {	//activate() method

	}

	public void start() {	//start() method

	}

	public void payType(int t) { // credit: t=1; cash: t=2, debit: t=3 (EFSM)

	}

	public void reject() { 	//reject() method

	}

	public void cancel() {	//cancel() method

	}

	public void approved() {	

	}

	public void startPump() {

	}

	public void pump() {

	}

	public void stopPump() {

	}

	public void selectGas(int g) {

	}
	
	public void IncorrectPin(int max) {
		
	}
	
	public void CorrectPin() {
		
	}

	public void payDebit() {
		
	}

	public void payCash() {
		
	}

	public void payCredit() {
		
	}
	
	
	

}
