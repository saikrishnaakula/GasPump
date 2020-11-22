package gaspump.list;

import gaspump.abstractfactory.AbstractGasPumpFactory;
import gaspump.abstractfactory.*;
import inputprocessor.*;
import gaspump.datastore.*;
import mdaefsm.*;
import outputprocessor.*;

public class GasPump2 {
	InputProcessor2 ip;
	OutputProcessor op;
	GaspumpMdaEfsm m;
	Data2 d;
	AbstractGasPumpFactory gpf;

	public GasPump2() {
		d = new Data2();
		gpf = new GasPump2Factory();
		op = new OutputProcessor(gpf, d);
		m = new GaspumpMdaEfsm(op);
		ip = new InputProcessor2(m, d);
	}

	public void activate(float a, float b, float c) {
		ip.activate(a, b, c);
	}

	public void start() {
		ip.start();
	}
	
	public void payCredit() {
		ip.payCredit();
	}
	
	public void reject() {
		ip.reject();
	}

	public void PayDebit(String p) {
		ip.payDebit(p);
	}
	
	public void approved() {
		ip.approved();
	}


	public void cancel() {
		ip.cancel();
	}

	public void diesel() {
		ip.diesel();
	}

	public void Super() {
		ip.Super();
	}

	public void regular() {
		ip.regular();
	}

	public void startPump() {
		ip.startPump();
	}

	public void PumpGallon() {
		ip.pumpGallon();
	}

	public void stop() {
		ip.stop();
	}
	
	public void pin(String x) {
		ip.pin(x);
	}

}
