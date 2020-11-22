package gaspump.datastore;

public class Data2 implements Data {

	float temp_a;
	float temp_b;
	float temp_c;
	float a;
	float b;
	float c;
	String temp_p;
	String temp_pin;
	String pin;
	Integer l;
	float total;
	float cash;
	float price;
	float Rprice;
	float Dprice;
	float Sprice;
	
//	Integer[] tempGasPrices;
//	Integer[] gasPrices;
//	Integer tempCash;
//	int count;
	String menu = "1. Regular\n2. Super\n3. Diesel";
	String units = "Gallon(s)";
	
//	pin: contains the pin in the data store 
//	m: is a pointer to the MDA-EFSM object 
//	d: is a pointer to the Data Store object
//	SelectGas(g): Regular: g=1; Super: g=2; Diesel: g=3

	public Data2() {
		// TODO Auto-generated constructor stub
	}
	
	public void pin() {
	}
	
	public void storePrices() {
		this.a= this.temp_a;
		this.b=this.temp_b;
		this.c=this.temp_c;
	}

	public float getTemp_a() {
		return temp_a;
	}

	public void setTemp_a(float temp_a) {
		this.temp_a = temp_a;
	}

	public float getTemp_b() {
		return temp_b;
	}

	public void setTemp_b(float temp_b) {
		this.temp_b = temp_b;
	}

	public float getTemp_c() {
		return temp_c;
	}

	public void setTemp_c(float temp_c) {
		this.temp_c = temp_c;
	}

	public String getTemp_p() {
		return temp_p;
	}

	public void setTemp_p(String temp_p) {
		this.temp_p = temp_p;
	}

	public String getPin() {
		return pin;
	}

	public void setTempPin(String t) {
		this.temp_pin = t;
	}
	
	public void setPin() {
		this.pin = this.temp_p;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public float getCash() {
		return cash;
	}

	public void setCash(float cash) {
		this.cash = cash;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getRprice() {
		return Rprice;
	}

	public void setRprice(float rprice) {
		Rprice = rprice;
	}

	public float getDprice() {
		return Dprice;
	}

	public void setDprice(float dprice) {
		Dprice = dprice;
	}

	public float getSprice() {
		return Sprice;
	}

	public void setSprice(float sprice) {
		Sprice = sprice;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	@Override
	public Integer getW() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setW(Integer w) {
		// TODO Auto-generated method stub
		
	}

	public Integer getL() {
		return l;
	}

	public void setL(Integer l) {
		this.l = l;
	}

	@Override
	public Integer getTemp_c1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTemp_c1(Integer temp_c1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getTemp_a1() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTemp_a1(Integer temp_a1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCash() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSelPrice(int g) {
		// TODO Auto-generated method stub
		switch(g) {
		case 1:
			this.price = this.temp_a; 
			break;
		case 2:
			this.price = this.temp_b; 
			break;
		case 3:
			this.price = this.temp_c; 
			break;
		}
	}

	@Override
	public void setGasPrices() {
		// TODO Auto-generated method stub
		
	}



}
