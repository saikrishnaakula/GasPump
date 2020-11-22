package gaspump.abstractfactory;

import gaspump.datastore.Data;
import gaspump.datastore.Data1;
import strategy.cancelmsg.CancelMsg;
import strategy.cancelmsg.CancelMsg2;
import strategy.displaymenu.DisplayMenu;
import strategy.displaymenu.DisplayMenu2;
import strategy.ejectCard.EjectCard;
import strategy.ejectCard.EjectCard2;
import strategy.enterpinmsg.EnterPinMsg;
import strategy.enterpinmsg.EnterPinMsg2;
import strategy.gaspumpedmsg.GasPumpedMsg;
import strategy.gaspumpedmsg.GasPumpedMsg2;
import strategy.initializedata.InitializeData;
import strategy.initializedata.InitializeData2;
import strategy.paymsg.PayMsg;
import strategy.paymsg.PayMsg2;
import strategy.printreceipt.PrintReceipt;
import strategy.printreceipt.PrintReceipt2;
import strategy.pumpgasunit.PumpGasUnit;
import strategy.pumpgasunit.PumpGasUnit2;
import strategy.readymsg.ReadyMsg;
import strategy.readymsg.ReadyMsg2;
import strategy.rejectmsg.RejectMsg;
import strategy.rejectmsg.RejectMsg2;
import strategy.returncash.ReturnCash;
import strategy.returncash.ReturnCash2;
import strategy.setinitialvalues.SetInitialValues;
import strategy.setinitialvalues.SetInitialValues2;
import strategy.setprice.SetPrice;
import strategy.setprice.SetPrice2;
import strategy.setw.SetW;
import strategy.setw.SetW2;
import strategy.stopmsg.StopMsg;
import strategy.stopmsg.StopMsg2;
import strategy.storecash.StoreCash;
import strategy.storecash.StoreCash2;
import strategy.storedata.StoreData;
import strategy.storedata.StoreData2;
import strategy.storepin.StorePin;
import strategy.storepin.StorePin2;
import strategy.storeprices.StorePrices;
import strategy.storeprices.StorePrices2;
import strategy.wrongpinmsg.WrongPinMsg;
import strategy.wrongpinmsg.WrongPinMsg2;

@SuppressWarnings("unused")
public class GasPump2Factory implements AbstractGasPumpFactory {

	public GasPump2Factory() {
		// TODO Auto-generated constructor stub
	}
	
	public Data getData() {
		// TODO Auto-generated method stub
		return new Data1();
	}

	public StoreData getStoreData() {
		// TODO Auto-generated method stub
		return new StoreData2();
	}

	public PayMsg getPayMsg() {
		// TODO Auto-generated method stub
		return new PayMsg2();
	}

	public StoreCash getStoreCash() {
		// TODO Auto-generated method stub
		return new StoreCash2();
	}

	public DisplayMenu getDisplayMenu() {
		// TODO Auto-generated method stub
		return new DisplayMenu2();
	}

	public RejectMsg getRejectMsg() {
		// TODO Auto-generated method stub
		return new RejectMsg2();
	}

	public SetPrice getSetPrice() {
		// TODO Auto-generated method stub
		return new SetPrice2();
	}

	public ReadyMsg getReadyMsg() {
		// TODO Auto-generated method stub
		return new ReadyMsg2();
	}

	public SetInitialValues getSetInitialValues() {
		// TODO Auto-generated method stub
		return new SetInitialValues2();
	}

	public PumpGasUnit getPumpGasUnit() {
		// TODO Auto-generated method stub
		return new PumpGasUnit2();
	}

	public GasPumpedMsg getGasPumpedMsg() {
		// TODO Auto-generated method stub
		return new GasPumpedMsg2();
	}

	public StopMsg getStopMsg() {
		// TODO Auto-generated method stub
		return new StopMsg2();
	}

	public WrongPinMsg getWrongPinMsg() {
		// TODO Auto-generated method stub
		return new WrongPinMsg2();
	}

	public CancelMsg getCancelMsg() {
		// TODO Auto-generated method stub
		return new CancelMsg2();
	}

	public ReturnCash getReturnCash() {
		// TODO Auto-generated method stub
		return new ReturnCash2();
	}

	public EjectCard getEjectCard() {
		// TODO Auto-generated method stub
		return new EjectCard2();
	}

	public StorePrices getStorePrices() {
		// TODO Auto-generated method stub
		return new StorePrices2();
	}

	public PrintReceipt getPrintReceipt() {
		// TODO Auto-generated method stub
		return new PrintReceipt2();
	}

	public EnterPinMsg getEnterPinMsg() {
		// TODO Auto-generated method stub
		return new EnterPinMsg2();
	}

	public InitializeData getInitializeData() {
		// TODO Auto-generated method stub
		return new InitializeData2();
	}

	public SetW getSetW() {
		// TODO Auto-generated method stub
		return new SetW2();
	}

	@Override
	public StorePin getStorePin() {
		// TODO Auto-generated method stub
		return new StorePin2();
	}

}
