//Lab7Ex8
//Corey Dennison T00185828  
/*This program uses a while loop to measure the powers of 2 exceedingly an once the power
 *of two reaches an amount over 5000, the lowest power whose value exceeded 5000 will be displayed*/

public class Lab7Ex8 {
    public static void main(String args[]) {
        
		int powerOfTwo=1, power=0;
		
		//Could no determine how to get this to work with Math.pow, so used 'powerOfTwo'
		//which was multiplyed by 2 with eact iteration of the loop and achieved the desired results
		while(powerOfTwo < 5000){
			System.out.println("2^" + power + " is " + powerOfTwo);
			powerOfTwo = powerOfTwo*2;
			power++;
		}
		System.out.println("\nThe lowest whole power of 2 that exceeds 5000 is 2^" + power);
		
        
    }
}
