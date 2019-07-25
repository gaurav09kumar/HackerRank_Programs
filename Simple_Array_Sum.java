package programs;

import java.io.*;
import java.util.*;

public class Simple_Array_Sum {
	static int simpleArraySum(int[] ar) {
        int sum=0;
        
        for(int i=(ar.length-1);i>=0;i--){
            sum=sum+ar[i];
        }
        return sum;
    }

	public static void main(String[] args) throws IOException {
		int[] ar = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
		System.out.println("The sum of the array items is: "+simpleArraySum(ar));
	}
}
