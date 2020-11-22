package gaspump.abstractfactory;

import gaspump.datastore.Data;
import gaspump.datastore.Data1;
import strategy.cancelmsg.CancelMsg;
import strategy.cancelmsg.CancelMsg1;
import strategy.displaymenu.DisplayMenu;
import strategy.displaymenu.DisplayMenu1;
import strategy.ejectCard.EjectCard;
import strategy.ejectCard.EjectCard1;
import strategy.enterpinmsg.EnterPinMsg;
import strategy.enterpinmsg.EnterPinMsg1;
import strategy.gaspumpedmsg.GasPumpedMsg;
import strategy.gaspumpedmsg.GasPumpedMsg1;
import strategy.initializedata.InitializeData;
import strategy.initializedata.InitializeData1;
import strategy.paymsg.PayMsg;
import strategy.paymsg.PayMsg1;
import strategy.printreceipt.PrintReceipt;
import strategy.printreceipt.PrintReceipt1;
import strategy.pumpgasunit.PumpGasUnit;
import strategy.pumpgasunit.PumpGasUnit1;
import strategy.readymsg.ReadyMsg;
import strategy.readymsg.ReadyMsg1;
import strategy.rejectmsg.RejectMsg;
import strategy.rejectmsg.RejectMsg1;
import strategy.returncash.ReturnCash;
import strategy.returncash.ReturnCash1;
import strategy.setinitialvalues.SetInitialValues;
import strategy.setinitialvalues.SetInitialValues1;
import strategy.setprice.SetPrice;
import strategy.setprice.SetPrice1;
import strategy.setw.SetW;
import strategy.setw.SetW1;
import strategy.stopmsg.StopMsg;
import strategy.stopmsg.StopMsg1;
import strategy.storecash.StoreCash;
import strategy.storecash.StoreCash1;
import strategy.storedata.StoreData;
import strategy.storedata.StoreData1;
import strategy.storepin.StorePin;
import strategy.storepin.StorePin1;
import strategy.storeprices.StorePrices;
import strategy.storeprices.StorePrices1;
import strategy.wrongpinmsg.WrongPinMsg;
import strategy.wrongpinmsg.WrongPinMsg1;

public class GasPump1Factory implements AbstractGasPumpFactory {

	public GasPump1Factory() {
	}

	public Data getData() {
		// TODO Auto-generated method stub
		return new Data1();
	}

	public StoreData getStoreData() {
		// TODO Auto-generated method stub
		return new StoreData1();
	}

	public PayMsg getPayMsg() {
		// TODO Auto-generated method stub
		return new PayMsg1();
	}

	public StoreCash getStoreCash() {
		// TODO Auto-generated method stub
		return new StoreCash1();
	}

	public DisplayMenu getDisplayMenu() {
		// TODO Auto-generated method stub
		return new DisplayMenu1();
	}

	public RejectMsg getRejectMsg() {
		// TODO Auto-generated method stub
		return new RejectMsg1();
	}

	public SetPrice getSetPrice() {
		// TODO Auto-generated method stub
		return new SetPrice1();
	}

	public ReadyMsg getReadyMsg() {
		// TODO Auto-generated method stub
		return new ReadyMsg1();
	}

	public SetInitialValues getSetInitialValues() {
		// TODO Auto-generated method stub
		return new SetInitialValues1();
	}

	public PumpGasUnit getPumpGasUnit() {
		// TODO Auto-generated method stub
		return new PumpGasUnit1();
	}

	public GasPumpedMsg getGasPumpedMsg() {
		// TODO Auto-generated method stub
		return new GasPumpedMsg1();
	}

	public StopMsg getStopMsg() {
		// TODO Auto-generated method stub
		return new StopMsg1();
	}

	public WrongPinMsg getWrongPinMsg() {
		// TODO Auto-generated method stub
		return new WrongPinMsg1();
	}

	public CancelMsg getCancelMsg() {
		// TODO Auto-generated method stub
		return new CancelMsg1();
	}

	public ReturnCash getReturnCash() {
		// TODO Auto-generated method stub
		return new ReturnCash1();
	}

	public EjectCard getEjectCard() {
		// TODO Auto-generated method stub
		return new EjectCard1();
	}

	public StorePrices getStorePrices() {
		// TODO Auto-generated method stub
		return new StorePrices1();
	}

	public PrintReceipt getPrintReceipt() {
		// TODO Auto-generated method stub
		return new PrintReceipt1();
	}

	public EnterPinMsg getEnterPinMsg() {
		// TODO Auto-generated method stub
		return new EnterPinMsg1();
	}

	public InitializeData getInitializeData() {
		// TODO Auto-generated method stub
		return new InitializeData1();
	}

	public SetW getSetW() {
		// TODO Auto-generated method stub
		return new SetW1();
	}

	@Override
	public StorePin getStorePin() {
		// TODO Auto-generated method stub
		return new StorePin1();
	}

}
