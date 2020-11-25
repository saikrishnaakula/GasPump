package driver;

import java.io.*;
import java.util.*;
import gaspump.list.*;

/**
 * Test driver class for GasPumps.
 * 
 * @author SAI KRISHNA AKULA
 *
 */
@SuppressWarnings("unused")
public class TestDriver {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// clear the screen
	public static void clearScreen() {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	}

	public static void main(String[] args) {
		System.out.println("\n\n\n\n\n\n\n\n								CS  586							");
		System.out.println("								PROJECT							");
		System.out.println("							 	  DEMO							");

		int input = 3;
		do {
			try {
				System.out.println("\n**************");
				System.out.println("Select Gaspump");
				System.out.println("1. Gaspump1");
				System.out.println("2. Gaspump2");
				System.out.println("3. Exit");

				// Select the Gaspump as displayed above
				System.out.printf("\nPlease enter your choice :: ");
				input = Integer.parseInt(br.readLine());

				switch (input) {
				case 1:
					testGasPump1();
					break;
				case 2:
					testGasPump2();
					break;
				case 3:
					System.exit(0);
					break;
				default:
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid input.");
			} catch (IOException e) {
				System.out.println("Invalid input.");
			}

		} while (input != 3);

	}

	private static void testGasPump1() {
		int option = -1;
		GasPump1 gaspump = new GasPump1();
		System.out.println("Driver for GasPump Class");
		do {
			// Display Actions
			System.out.println("\nPlease select the option");
			System.out.println("------------------------");
			System.out.println("1.  Activate (int a)");
			System.out.println("2.  Start()");
			System.out.println("3.  PayCredit()");
			System.out.println("4.  Reject()");
			System.out.println("5.  Cancel()");
			System.out.println("6.  Approved()");
			System.out.println("7.  PayCash(int)");
			System.out.println("8.  StartPump()");
			System.out.println("9.  PumpLiter()");
			System.out.println("10. StopPump()");
			System.out.println("------------------------");
			System.out.println("11. Quit GasPump1");
			System.out.println("------------------------");

			// Select the option as displayed above
			System.out.printf("\nPlease enter your choice :: ");

			try {
				option = Integer.parseInt(br.readLine());

				switch (option) {
				case 1:
					System.out.println("\nMethod: Activate(int a)");
					// Get the input values for Activate method
					System.out.printf("Enter the value of parameter a : ");
					int a = Integer.parseInt(br.readLine());
					// call Activate Method
					gaspump.activate(a);
					break;

				case 2:
					System.out.println("\nMethod: Start()");
					// call Start() Method
					gaspump.start();
					break;

				case 3:
					System.out.println("\nMethod: PayCredit()");
					// call PayCredit() Method
					gaspump.payCredit();
					break;

				case 4:
					System.out.println("\nMethod: Reject()");
					// call Reject() Method
					gaspump.reject();
					break;

				case 5:
					System.out.println("\nMethod: Cancel()");
					// call Cancel() Method
					gaspump.cancel();
					break;

				case 6:
					System.out.println("\nMethod: Approved()");
					// Get Approved() method
					gaspump.approved();
					break;
				case 7:
					System.out.println("\nMethod: PayCash(int c)");
					// Get Approved() method
					System.out.printf("Enter the value of parameter c : ");
					int c = Integer.parseInt(br.readLine());
					gaspump.PayCash(c);
					break;

				case 8:
					System.out.println("\nMethod: StartPump()");
					// call StartPump() Method
					gaspump.startPump();
					break;

				case 9:
					System.out.println("\nMethod: PumpLiter()");
					// call PumpGallon() Method
					gaspump.pumpLiter();
					break;

				case 10:
					System.out.println("\nMethod: StopPump()");
					// call StopPump() Method
					gaspump.stopPump();
					break;

				case 11:
					System.out.println("\nQuit from GasPump Driver.");
					// Quit GasPump TestDriver
					break;
				default:
					System.out.println("Invalid option selected.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid input.");
			} catch (IOException e) {
				System.out.println("Invalid input.");
			}
		} while (option != 11);
	}

	private static void testGasPump2() {
		int option = -1;
		// Create GasPump object
		GasPump2 gaspump = new GasPump2();
		System.out.println("Driver for GasPump Class");
		do {
			// Display Menu
			System.out.println("\nPlease select the option");
			System.out.println("------------------------");
			System.out.println("1.  Activate (float a, float b, float c)");
			System.out.println("2.  Start()");
			System.out.println("3.  PayCredit()");
			System.out.println("4.  PayDebit(string p)");
			System.out.println("5.  Pin(string x)");
			System.out.println("6.  Cancel()");
			System.out.println("7.  Approved() ");
			System.out.println("8.  Diesel()");
			System.out.println("9.  Regular()");
			System.out.println("10. Super()");
			System.out.println("11. StartPump()");
			System.out.println("12. PumpGallon()");
			System.out.println("13. StopPump()");
			System.out.println("14. FullTank()");
			System.out.println("------------------------");
			System.out.println("15. Quit GasPump2");
			System.out.println("------------------------");

			// Select the option as displayed above
			System.out.printf("\nPlease enter your choice : ");

			try {
				option = Integer.parseInt(br.readLine());

				switch (option) {
				case 1:
					System.out.println("\nMethod: Activate (int a, int b, int c)");
					// Get the input integer values for activate method of
					// Gaspump2
					System.out.printf("Enter the value of parameter a : ");
					float a = Float.parseFloat(br.readLine());
					System.out.printf("Enter the value of parameter b : ");
					float b = Float.parseFloat(br.readLine());
					System.out.printf("Enter the value of parameter c : ");
					float c = Float.parseFloat(br.readLine());
					// call GasPump's Activate Method
					gaspump.activate(a, b, c);
					break;

				case 2:
					System.out.println("\nMethod: Start()");
					// call Start() Method
					gaspump.start();
					break;

				case 3:
					System.out.println("\nMethod: PayCredit");
					gaspump.payCredit();
					break;

				case 4:
					System.out.println("\nMethod: PayDebit(string p)");
					System.out.printf("Enter the value of parameter p : ");
					String p = br.readLine();
					gaspump.PayDebit(p);
					break;
					
				case 5:
					System.out.println("\nMethod: Pin(string x)");
					// call Pin(string x) Method
					System.out.printf("Enter the value of parameter x : ");
					String x = br.readLine();
					gaspump.pin(x);
					break;

				case 6:
					System.out.println("\nMethod: Cancel()");
					// call Cancel() Method
					gaspump.cancel();
					break;

				case 7:
					System.out.println("\nMethod: Approved()");
					// call Approved() method
					gaspump.approved();
					break;

				case 8:
					System.out.println("\nMethod: Diesel()");
					// call Gasoline Regular() Method
					gaspump.diesel();
					break;

				case 9:
					System.out.println("\nMethod: Regular()");
					// call Gasoline Super() Method
					gaspump.regular();
					break;

				case 10:
					System.out.println("\nMethod: Super()");
					// call Receipt() Method
					gaspump.Super();
					break;

				case 11:
					System.out.println("\nMethod: StartPump()");
					// StartPump() Method
					gaspump.startPump();
					break;

				case 12:
					System.out.println("\nMethod: PumpGallon()");
					// PumpLiter() Method
					gaspump.PumpGallon();
					break;

				case 13:
					System.out.println("\nMethod: Stop()");
					// call Stop() Method
					gaspump.stop();
					break;
				case 14:
					System.out.println("\nMethod: FullTank()");
					// call FullTank() Method
					gaspump.stop();
					break;	
				case 15:
					System.out.println("\nQuit from GasPump Driver.");
					// Quit GasPump TestDriver
					break;
				default:
					System.out.println("Invalid option selected.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid input.");
			} catch (IOException e) {
				System.out.println("Invalid input.");
			}
		} while (option != 15);
	}

}
