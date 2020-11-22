package outputprocessor;

import gaspump.abstractfactory.AbstractGasPumpFactory;
import gaspump.datastore.Data;

public class OutputProcessor {

	AbstractGasPumpFactory gpf;
	Data d;

	public OutputProcessor(AbstractGasPumpFactory gpf, Data d) {
		this.gpf = gpf;
		this.d = d;
	}

	public void storeData() {// stores price(s) for the gas from the temp data store
		gpf.getStoreData().storeData(d);
	}

	public void payMsg() { // display the payment type
		gpf.getPayMsg().payMessage(d);
	}

	public void storeCash() { // stores the cash from the temporary data store
		gpf.getStoreCash().storeCash(d);
	}

	public void displayMenu() { // display a menu with a list of selections
		gpf.getDisplayMenu().displayMenu(d);
	}

	public void rejectMsg() {// displays the credit card not approved 
		gpf.getRejectMsg().rejectMessage(d);
	}

	public void setPrice(int g) {// set the price for the gas identified by "g"
		gpf.getSetPrice().setPrice(d, g);
	}

	public void readyMsg() { // displays the pumping message as ready 
		gpf.getReadyMsg().readyMsg(d);
	}

	public void setInitialValues() { // set G (or L) and total to 0
		gpf.getSetInitialValues().setInitialValues(d);
	}

	public void pumpGasUnit() { // disposes unit of gas and counts # of units

		gpf.getPumpGasUnit().pumpGasUnit(d);
	}

	public void gasPumpedMsg() { // displays the amount of disposed gas
		gpf.getGasPumpedMsg().gasPumpedMsg(d);
	}

	public void stopMsg() { // stop pump message and receipt msg as optional
		gpf.getStopMsg().stopMsg(d);
	}

	public void cancelMsg() { // displays the cancellation message
		gpf.getCancelMsg().cancelMessage(d);
	}

	public void returnCash() { // returns the remaining cash
		gpf.getReturnCash().returnCash(d);
	}

	public void wrongPinMsg() { // returns the remaining cash
		gpf.getWrongPinMsg().wrongPinMsg();
	}

	public void ejectCard() {
		gpf.getEjectCard().ejectCard();
	}

	public void storePrices(){
		gpf.getStorePrices().storePrices(d);
	}

	public void printReceipt(){
		gpf.getPrintReceipt().printReceipt(d);
	}

	public void storePin(){
		gpf.getStorePin().storePin(d);
	}

	public void enterPinMsg(){
		gpf.getEnterPinMsg().enterPinMsg(d);
	}

	public void initializeData(){
		gpf.getInitializeData().initializeData(d);
	}

	public void setW(int w){
		gpf.getSetW().setW(d, w);
	}
}
