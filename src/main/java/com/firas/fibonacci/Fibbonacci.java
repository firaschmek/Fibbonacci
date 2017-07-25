package com.firas.fibonacci;

import java.util.ArrayList;

public class Fibbonacci {
	
	public ArrayList<Integer> fibbonacci(int n,int i,int F1,int F2, ArrayList<Integer> list_fibo)
	{
		
		if (i<n)
		{   
			
			int var_tmp=F1+F2;
			F1=F2;
			F2=var_tmp;
			list_fibo.add(F2);
			i++;
			fibbonacci(n, i, F1, F2, list_fibo);
			
		}
		
		return list_fibo;
	}
	
	public double fibo_average(ArrayList<Integer> list_fibo)
	
	{   Integer sum=0;
		for (Integer integer : list_fibo) {
			sum+=integer;
			System.out.print(integer+" ");
		}
		System.out.println("");
		return(sum.doubleValue()/list_fibo.size());
	}

}
