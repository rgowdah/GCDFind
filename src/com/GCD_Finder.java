package com;

public class GCD_Finder {
	public int gcd(int m, int n){
		if(n==0) return m;
		return gcd(n,m%n);		
	}	
	public static void main(String[] args) {
		System.out.println(new GCD_Finder().gcd(21,5));		
	}
}
