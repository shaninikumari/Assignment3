
public class Implementation implements Add, Sub{

	public long subtract(long... ls) {
		long result = ls[0];
		
		for(int a = 1; a < ls.length; a++) {
			result -= ls[a];
		}
		
		return result;
	}

	public long add( long... ls) {
		long result = 0;
		
		for (long temp: ls) {
			result += temp;
		}
		return result;
	}

	public long divide(long...ls) {
		long result = ls[0];
		for(int i = 1; i < ls.length ; i++) {
			result /= ls[i];
		}
		return result;
	}

	public long product(long...ls) {
		long result = ls[0];
		for(int a = 1; a < ls.length; a++) {
			result *= ls[a];
		}	
		return result;
	}

	public long exponent(long...ls) {
		long result = ls[0];
		
		for (int i = 1; i < ls.length; i++) {
			long base = result;
			long exp = ls[i];
			if(exp < 0) {
				throw new IllegalArgumentException ("This operation requires positive exponent");
			}
			
			long ans = 1;
			for(long a = 0; a < exp; a++) {
				ans *= base;
			}
			result = ans;
		}
		return result;
	}
	
	

}
