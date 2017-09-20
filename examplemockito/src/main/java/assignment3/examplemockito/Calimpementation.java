package assignment3.examplemockito;

public class Calimpementation {
	calInterface  intObj;
	
	public int addTwoNums(int a, int b) {
		return intObj.add(a,b);
		
	}
	
	public int subtract( int a, int b) {
		return intObj.subtract(a , b);
		
	}
	
	public int multiply(int a, int b) {
		return intObj.subtract(a, b);
		
	}
	
	public double divide(int a, int b) {
		return intObj.divide(a, b );
		
	}
	
	
	
	

	public void setIntObj(calInterface intObj) {
		this.intObj = intObj;
	}
}
