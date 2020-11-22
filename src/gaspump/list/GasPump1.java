package gaspump.list;

import gaspump.abstractfactory.AbstractGasPumpFactory;
import gaspump.abstractfactory.GasPump1Factory;
import gaspump.datastore.Data1;
import inputprocessor.InputProcessor1;
import mdaefsm.GaspumpMdaEfsm;
import outputprocessor.*;

public class GasPump1 {

	InputProcessor1 ip;
	OutputProcessor op;
	GaspumpMdaEfsm m;
	Data1 d;
	AbstractGasPumpFactory gpf;

	public GasPump1() {
		d = new Data1();
		gpf = new GasPump1Factory();
		op = new OutputProcessor(gpf, d);
		m = new GaspumpMdaEfsm(op);
		ip = new InputProcessor1(m, d);
	}

	public void activate(int a) {
		ip.activate(a);
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

	public void cancel() {
		ip.cancel();
	}

	public void approved() {
		ip.approved();
	}

	public void PayCash(int c) {
		ip.payCash(c);
	}

	public void startPump() {
		ip.startPump();
	}

	public void pumpLiter() {
		ip.pumpLiter();
	}

	public void stopPump() {
		ip.stopPump();
	}

}
