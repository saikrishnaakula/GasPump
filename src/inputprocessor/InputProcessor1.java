package inputprocessor;

import gaspump.datastore.Data;
import mdaefsm.GaspumpMdaEfsm;

public class InputProcessor1 {

	GaspumpMdaEfsm m;
	Data d;

	public InputProcessor1(GaspumpMdaEfsm m, Data d) {
		this.m = m;
		this.d =  d;
	}

	public void activate(int a) {
		if (a > 0) {
			d.setTemp_a1(a);
			m.activate();
		}
	}

	public void start() {
		m.start();
	}

	public void payCredit() {
		m.payCredit();
	}

	public void reject() {
		m.reject();
	}

	public void cancel() {
		m.cancel();
	}

	public void approved() {
		m.approved();
	}

	public void startPump() {
		m.startPump();
	}

	public void pumpLiter() {
		float cash =  d.getCash();
		int w = d.getW();
		int l = d.getL();
		float price = d.getPrice();
		if(w == 1  && cash > (l + 1) * price) {
			m.pump();
		}else if (w == 1 && cash < (l + 1) * price)
			m.stopPump();
		else
			m.pump();
	}

	public void payCash(int c) {
		if (c > 0) {
			d.setTemp_c1(c);
			m.payCash();
		}
	}
	
	public void stopPump() {
		m.stopPump();
	}

}
