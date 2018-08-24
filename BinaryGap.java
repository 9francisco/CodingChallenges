/* 	Find longest sequence of zeros in binary representation of an integer. 
	For example, given N = 1041 the function should return 5, because N has 
	binary representation 10000010001 and so its longest binary gap is of 
	length 5. Given N = 32 the function should return 0, because N has binary 
	representation '100000' and thus no binary gaps. */

import java.util.Scanner;

public class BinaryGap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int result = getResult(input);
		System.out.println(result);
	}
	
	public static int getResult(int num) {
		int binaryGap = 0;
		
		while (num%2 == 0) {
			num /=2;
		}
		
		for (int i=0; num > 0; num/=2) {
			if (num%2 == 0) {
				i++;
			} else {
				if (i > binaryGap) {
					binaryGap = i;
				}
					
				i = 0;
			}
		}
		
		return binaryGap;
    }

}
