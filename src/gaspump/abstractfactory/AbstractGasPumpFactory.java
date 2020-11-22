package gaspump.abstractfactory;

import strategy.cancelmsg.CancelMsg;
import strategy.displaymenu.DisplayMenu;
import strategy.ejectCard.EjectCard;
import strategy.enterpinmsg.EnterPinMsg;
import strategy.gaspumpedmsg.GasPumpedMsg;
import strategy.initializedata.InitializeData;
import strategy.paymsg.PayMsg;
import strategy.printreceipt.PrintReceipt;
import strategy.pumpgasunit.PumpGasUnit;
import strategy.readymsg.ReadyMsg;
import strategy.rejectmsg.RejectMsg;
import strategy.returncash.ReturnCash;
import strategy.setinitialvalues.SetInitialValues;
import strategy.setprice.SetPrice;
import strategy.setw.SetW;
import strategy.stopmsg.StopMsg;
import strategy.storecash.StoreCash;
import strategy.storedata.StoreData;
import strategy.storepin.StorePin;
import strategy.storeprices.StorePrices;
import strategy.wrongpinmsg.WrongPinMsg;

public interface AbstractGasPumpFactory {

	public StoreData getStoreData();

	public PayMsg getPayMsg();

	public StoreCash getStoreCash();

	public DisplayMenu getDisplayMenu();

	public RejectMsg getRejectMsg();

	public SetPrice getSetPrice();

	public ReadyMsg getReadyMsg();

	public SetInitialValues getSetInitialValues();

	public PumpGasUnit getPumpGasUnit();

	public GasPumpedMsg getGasPumpedMsg();

	public StopMsg getStopMsg();

	public CancelMsg getCancelMsg();

	public ReturnCash getReturnCash();
	
	public WrongPinMsg getWrongPinMsg();

	public EjectCard getEjectCard();

	public StorePrices getStorePrices();

	public PrintReceipt getPrintReceipt();

	public EnterPinMsg getEnterPinMsg();

	public InitializeData getInitializeData();

	public SetW getSetW();

	public StorePin getStorePin();

}
