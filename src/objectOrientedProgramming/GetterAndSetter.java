package objectOrientedProgramming;

public class GetterAndSetter {
	
	
	private String mobileName;
	private String mobileBrand;
	private double mobilePrice;
	
	
	
	//to use private variable from another class, we need getter and setter.
	
	public String getMobilename() {
		return mobileName;
	}
	
	public void setMobilename(String newMobileName) {
		this.mobileName = newMobileName;
	}
	
	public String getMobileBrand() {
		return mobileBrand;
	}
	
	public void setMobileBrand(String newMobileBrand) {
		this.mobileBrand = newMobileBrand;
	}
	
	public double getMobilePrice() {
		return mobilePrice;
	}
	
	public void setMobilePrice(double newMobilePrice) {
		this.mobilePrice = newMobilePrice;
	}
	
	//after this class we moved  to intellij to do the rest of OOP.
	//
	//
	
	
	
	
	
	
	
	
}
