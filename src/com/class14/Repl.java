package com.class14;

public class Repl {
	public static void main(String[] args) {
		
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
			
			    int sum[] =new int [a.length];
	        
	        for (int r=0; r<a.length; r++){
	            int row=0;
	          for (int c=0; c<a[row].length; c++){
	            row = row+ a[r][c];
	          }
	          sum[r] = row;
	        }
	        
	        
	        
	        for(int total:sum) {
	          System.out.println(total);
	        	}
	        
	        
	        int sum[] =new int [a.length];
	        
	        for (int row=0; row<a.length; row++){
	            int rowSum=0;
	          for (int col=0; col<a[row].length; col++){
	            rowSum += a[row][col];
	          }
	          sum[row] = rowSum;
	        }
	        
	        
	        
	        for(int sum1:sum) {
	          System.out.println(sum1);
	        }
	        
	        
	}
}
