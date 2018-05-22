	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

public class Binary {
	
	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        int[] a=new int[19];
	        int i = 0;
	        //creates the binary value for the given number
	        while(n > 0){
	            int reminder = BinaryValue(n);
	            if(i < 2000){
	                a[i] = reminder;
	                i++;
	            }
	            n = n/2;
	        }
	        if(i==1){
	        	System.out.println("0");
	        } else{
		        //checks if there are 2 consecutive 1's
		        int count = 0;
		        for(int j=0; j <= i ; j++){
		            if(a[j] == 1 && a[j+1]==1){
		                count++;
		            }
		        }
		        System.out.println(count);
		        }
	        
	        scanner.close();
	    }
	    
	    public static int BinaryValue(int n){
	            if( n <= 1){
	                if(n == 0) return 10;
	                if(n == 1) return 1;
	            }
	            else {
	                return n%2;
	            }
	            return 0;
	}
	}

