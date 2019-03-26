package Hari03;

import java.util.Scanner;

import common.PrintArray;




public class Tugas3Batch191 {
	static Scanner scn;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scn=new Scanner (System.in);
		System.out.println("Input nilai N: "); int n = scn.nextInt();
		System.out.println("Input nilai M: "); int m = scn.nextInt();
		System.out.println("Input nilai O: "); int o = scn.nextInt();
		
		//1. buat array deret
		int[] deret = new int [n*4];
		int angka = o;
		for (int i=0; i<deret.length;i++) {
			
			
			if(i%4==3) {
				deret[i]=m;
			}else {
				deret[i]=angka;
				angka = angka+3;
			}System.out.print(deret[i]+"\t");
		}System.out.println(" ");
		
		//langka 2 buat array 2D
		String[][] array=new String[n][n];
		// langkah 4 buat index
		int index=0;
		//langkah 3 isi baris ke 0, 
		for (int i=0; i<n;i++) {
			array[0][i]=deret[index]+"";
			index++;
			
		}
		for(int i=1; i<n;i++){
			array[i][6]=deret[index]+"";
			index++;
		}
		
		//mulai dari kolom 5 dengan i nya lebih gede dari 0
		for(int i=n-2; i>=0; i--) {
			array[n-1][i]=deret[index]+"";
			index++;
			
		}
		
		for (int i=n-2; i>0; i--) {
			array[i][0]=deret[index]+"";
			index++;
		}
		
		
		//ngeprint 2D array ingetin aja!!
		PrintArray.array2D(array);
		
}

}