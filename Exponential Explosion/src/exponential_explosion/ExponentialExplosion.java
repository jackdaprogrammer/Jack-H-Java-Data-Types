//Jack Hosier, Java Data Structures 
package exponential_explosion;

public class ExponentialExplosion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double value = 3805;
		System.out.println("e to the power value: " + Math.exp(value));
		
		//32 as an exponent is 7.896296018268069E13. 
		//420 gives us 2.5332753623607178E182
		//3805 gives us Infinity. I'm not joking, the output says "e to the power value: Infinity".
	}

}
