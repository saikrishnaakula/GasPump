package inputprocessor;


import gaspump.datastore.Data;
import mdaefsm.GaspumpMdaEfsm;

public class InputProcessor2 {

	GaspumpMdaEfsm m;
	Data d;

	public InputProcessor2(GaspumpMdaEfsm m, Data d) {
		this.m = m;
		this.d = d;
	}

	public void activate(float a, float b, float c) {
		if ((a > 0) && (b > 0) && (c > 0)) {
			d.setTemp_a(a);
			d.setTemp_b(b);
			d.setTemp_c(c);
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

	public void payDebit(String p) {
		d.setTemp_p(p);
		m.payDebit();
	}

	public void approved() {
		m.approved();
	}

	public void pin(String x) {
		if (d.getPin().equals(x)) {
			m.correctPin();
		} else {
			m.inCorrectPin(2);
		}
	}

	public void cancel() {
		m.cancel();
	}

	public void Super() {
		m.selectGas(2);
	}

	public void diesel() {
		m.selectGas(3);
	}

	public void regular() {
		m.selectGas(1);
	}

	public void startPump() {
		m.startPump();
	}

	public void pumpGallon() {
		m.pump();
	}

	public void stop() {
		m.stopPump();
	}

	public void fullTank() {
		m.stopPump();
	}

}
