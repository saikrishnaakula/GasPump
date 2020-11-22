package strategy.displaymenu;

import gaspump.datastore.Data;

public class DisplayMenu2 implements DisplayMenu {
	public void displayMenu(Data data) {
		System.out.println("GasPump2 Menu \nSelect Gasoline Type:");
		System.out.println("A)	Regular");
		System.out.println("B)	Super");
		System.out.println("C)	Diesel");
		//System.out.println(data.getMenu());
	}
}
