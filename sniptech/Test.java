package com.progarmming.test;
import java.util.*;

public class Test 
{
	// Generates all primes upto n
	// and prints their squares
	static void numbersWith3Divisors(int a, int b)
	{
		boolean[] prime = new boolean[b+1];
		Arrays.fill(prime, true);
		prime[0] = prime[1] = false;

		for (int p = 2; p*p <= b; p++)
		{

			// If prime[p] is not changed,
			// then it is a prime
			if (prime[p] == true)
			{
				// Update all multiples of p
				for (int i=p*2; i<=b; i += p)
					prime[i] = false;
			}
		}

		// print squares of primes upto n
		System.out.println("Numbers with 3 divisors : ");
		for (int i=0; i*i <= b ; i++)
		{ 	 
			if (prime[i])
				if((i*i)>a)
					System.out.print(i*i + " ");		
		}
	}

	// Driver program
	public static void main (String[] args)
	{
		int a = 49;
		int b = 150;
		numbersWith3Divisors(a, b);
	}
}

