package mdaefsm;

import outputprocessor.OutputProcessor;
import states.InitialState;
import states.*;

public class GaspumpMdaEfsm {

	private State currentState;
	private State stateList[];
	public int k;

	public GaspumpMdaEfsm(OutputProcessor op) {
		stateList = new State[8];
		stateList[0] = new InitialState(this, op);
		stateList[1] = new S0(this, op);
		stateList[2] = new S1(this, op);
		stateList[3] = new S2(this, op);
		stateList[4] = new S3(this, op);
		stateList[6] = new S5(this, op);
		stateList[7] = new S6(this, op);

		currentState = stateList[0];

	}

	public void changeState(int i) {
		currentState = stateList[i];
		System.out.println("The Current State : S" + (i-1)+ " State.");
	}

	public void activate() {
		currentState.activate();
	}

	public void start() {
		currentState.start();
	}
	
	public void payCredit() {
		currentState.payCredit();
	}
	
	public void payCash() {
		currentState.payCash();
	}
	
	public void payDebit() {
		k=0;
		currentState.payDebit();
	} 

	public void reject() {
		currentState.reject();
	}

	public void cancel() {
		currentState.cancel();
	}

	public void approved() {
		currentState.approved();
	}

	public void startPump() {
		currentState.startPump();
	}

	public void pump() {
		currentState.pump();
	}

	public void stopPump() {
		currentState.stopPump();
	}

	public void selectGas(int g) {
		currentState.selectGas(g);
	}
	
	public void correctPin() {
		currentState.CorrectPin();
	}

	public void inCorrectPin(int max) {
		currentState.IncorrectPin(max);
	}

}
