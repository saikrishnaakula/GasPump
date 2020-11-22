package gaspump.datastore;

public interface Data {
	
	
	public void storePrices();
	
	public Integer getW();
	
	public void setW(Integer w);
	
	public Integer getL();
	
	public void setL(Integer l);
	
	public Integer getTemp_c1();
	
	public void setTemp_c1(Integer temp_c1);
	
	public Integer getTemp_a1();
	
	public void setTemp_a1(Integer temp_a1);
	
	public String getUnits();
	
	public void setUnits(String units);
	
	public String getMenu();
	
	public void setMenu(String menu);
	
	public float getTemp_a();
	
	public void setTemp_a(float temp_a);
	
	public float getTemp_b();
	
	public void setTemp_b(float temp_b);
	
	public float getTemp_c();
	
	public void setTemp_c(float temp_c);
	
	public String getTemp_p();
	
	public void setTemp_p(String temp_p);
	
	public String getPin();
	
	public void setPin();
	
	void setTempPin(String t);
	
	public float getTotal();
	
	public void setTotal(float total);
	
	public float getCash();
	
	public void setCash(float cash);
	
	public float getPrice();
	
	public void setPrice(float price);
	
	public float getRprice();
	
	public void setRprice(float rprice);
	
	public float getDprice();
	
	public void setDprice(float dprice);
	
	public float getSprice();
	
	public void setSprice(float sprice);
	
	 public void setCash();
	 
	 public void setGasPrices();

	public void setSelPrice(int g);

}
