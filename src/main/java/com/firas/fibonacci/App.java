package com.firas.fibonacci;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Fibbonacci fibo=new Fibbonacci();
        ArrayList<Integer> list_fibo=new ArrayList<Integer>();
        list_fibo.add(1);
        list_fibo.add(1);
        list_fibo=fibo.fibbonacci(20, 2, 1, 1, list_fibo);
        double average=fibo.fibo_average(list_fibo);
        System.out.println("The average is"+average);
    }
}
