
package gaspump.datastore;

public class Data1 implements Data {
	
	
	float tempCash;//contains the value of cash deposited
	float cash;
	Integer w;// cash flag (cash: w=0; otherwise: w=1)
	Integer l;// cash flag (cash: w=0; otherwise: w=1)
	Integer temp_c1;
	Integer temp_a1;
	Integer a;
	float price;// contains the price of the selected gas 
	float total;//cash paid
	String units = "Liter(s)";

//	Float[] tempGasPrices; // gas price
//	Float[] gasPrices;
//	int count;//contains the number of liters already pumped
	
//	cash: contains the value of cash deposited
//	price: contains the price of the selected gas 
	//L: contains the number of liters already pumped
//	w: cash flag (cash: w=0; otherwise: w=1)
//	cash,
//	L, price, w are in the data store
//	m: is a pointer to the MDA-EFSM object 
//  d: is a pointer to the Data Store object 

	public Data1() {
		// TODO Auto-generated constructor stub
	}
	
	public void setGasPrices() {
		this.price = this.temp_a1;
	}

	public float getCash() {
		return cash;
	}
	
	public void setCash() {
		this.cash = this.temp_c1;
	}

	public void setCash(float cash) {
		this.tempCash = cash;
	}

	public Integer getW() {
		return w;
	}

	public void setW(Integer w) {
		this.w = w;
	}

	public Integer getL() {
		return l;
	}

	public void setL(Integer l) {
		this.l = l;
	}

	public Integer getTemp_c1() {
		return temp_c1;
	}

	public void setTemp_c1(Integer temp_c1) {
		this.temp_c1 = temp_c1;
	}

	public Integer getTemp_a1() {
		return temp_a1;
	}

	public void setTemp_a1(Integer temp_a1) {
		this.temp_a1 = temp_a1;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getUnits() {
		return units;
	}

	public void setUnits(String units) {
		this.units = units;
	}

	@Override
	public String getMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMenu(String menu) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getTemp_a() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTemp_a(float temp_a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getTemp_b() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTemp_b(float temp_b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getTemp_c() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTemp_c(float temp_c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTemp_p() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTemp_p(String temp_p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getPin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float getRprice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setRprice(float rprice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getDprice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDprice(float dprice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float getSprice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSprice(float sprice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSelPrice(int g) {
		// TODO Auto-generated method stub
		this.price = this.temp_a1;
	}

	@Override
	public void setPin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTempPin(String t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void storePrices() {
		 this.a = this.temp_a1;
		
	}

	
	
}
