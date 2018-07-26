/**
 * @author ashish.adhikari
 */
package algos;

/**
 * @author ashish.adhikari
 *
 */
public class MultipleOf3 {
	public static void main(String[] args) {
		int num = 23;

		for(;num<31;num++) {
			if (isMultipleOf3(num) != 0)
				System.out.println(num + " is multiple of 3");
			else
				System.out.println(num + " is not a multiple of 3");
		}
	}

	/**
	 * @param num
	 * @return
	 */
	private static int isMultipleOf3(int num) {
		
		int odd=0, even=0;
		int number = Math.abs(num);
		
		if(number == 0) return 1;
		if(number == 1) return 0;
		
		while(number!=0) {
			if((number & 1) != 0) {
				odd++;
				
			}
			number >>= 1;
			if((number & 1) != 0) {
				even++;
				
			}
			number >>=1;
		}
		return isMultipleOf3(Math.abs(odd-even));
	}
}
