package Hari03;

import java.util.Scanner;

import common.DeretAngka;
import common.PrintArray;



public class Tugas2Nomor2 {
	static Scanner scn;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scn=new Scanner (System.in);
		System.out.println("Input nilai N: "); int n = scn.nextInt();
		System.out.println("Input nilai M: "); int m = scn.nextInt();
		System.out.println("Input nilai O: "); int o = scn.nextInt();
		
		//1. buat array deret
		int[] deret = DeretAngka.deret01(n*3, m, o);
		//System.out.print(" ");
		//System.out.println("\n");
		String[][] array = new String[n][n];
		
		int index=0;
		
		for(int i=0; i<n; i++) {
			
				array[n-1-i][i]=deret[index]+"";
				//i=i-1;
				
				index++;
		}
		
		for(int i=1; i<n;i++){
			array[i][6]=deret[index]+"";
			index++;
		}
		
		//mulai dari kolom 5 dengan i nya lebih gede dari 0
		for(int i=n-2; i>0; i--) {
			array[n-1][i]=deret[index]+"";
			index++;
			
		}
		
		PrintArray.array2D(array);//panggil metode di PrintArray.java
			
		
	}
	
}