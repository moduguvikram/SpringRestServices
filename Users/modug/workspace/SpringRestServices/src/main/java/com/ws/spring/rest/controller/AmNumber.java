/**
 * 
 */
package com.ws.spring.rest.controller;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * @author modug
 *
 */
public class AmNumber {

	/**
	 * 
	 */
	public AmNumber() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//		int number = Integer.parseInt(args[0]);

		int count = 0;
		for(int i=1; i < 1000; i++)
		{
			int sum =0;
			int nextInt = 0;
			int loop = i;
			String prime = Integer.toString(i);
			int length = prime.trim().length();
			for(int j =0; j < length; j++)
			{
				int value = Integer.parseInt(prime.charAt(j)+"");
				sum = sum+(value*value*value);
			}
				if(sum == i)
				{
					count++;
					System.out.println("Given Number is AmNumber"+i);
				}
	

		}

	}

}
