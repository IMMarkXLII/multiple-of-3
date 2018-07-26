# multiple-of-3
  
  ## for any multiple of 3, the difference of number of odd on(1) bits and even on(1) bits is also divisible by 3.

```
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

```
