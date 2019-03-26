package Hari02;

import java.util.Scanner;

public class Tugas2NomorLimaPengulangan {
	static Scanner scn;
	public static void main(String[] args) {
		// TODO Auto-geneated method stub
		scn=new Scanner (System.in);
		System.out.println("input nomor 1-7 : ");
		int pilih = scn.nextInt();
		
		if(pilih == 1) {
			ulangan1();
		}else if (pilih==2){
			ulangan2();
		}else if (pilih == 4) {
			ulangan4();
		}
	}
	
	public static void ulangan1() {
		scn = new Scanner (System.in);
		System.out.println("Ulangan 1\nInput String = ");
		String Kalimat = scn.nextLine();
		
		String[] array=Kalimat.split(" ");
		for(int i = 0; i<array.length; i++) {
			String[] kata = array[i].split("");
			for(int j=0; j<kata.length; j++) {
				if(j>0 && j<kata.length-1) {
					System.out.print("*");
				}
				else {
					System.out.print(kata[j]);
				}
			}System.out.print(" ");
		}
	}

	public static void ulangan2() {
		scn=new Scanner(System.in);
		System.out.println("Ulangan 2\nKalimat : ");
		String kalimat = scn.nextLine();
		System.out.println(kalimat);
		
		String[] array = kalimat.split(" ");
		for (int i=0; i<array.length;i++) {
			//System.out.println(array[i]);
			
			String[] item = array[i].split("");
			for(int j=0; j<item.length;j++ ) {
				//System.out.println(item[j]);
				
				if(j>0 && j<item.length - 1) {
					System.out.print("*");
				}
				else {
					System.out.print(item[j]);
				}
			}System.out.print(" ");
		}
		
	}
	
	public static void ulangan3() {
		scn = new Scanner(System.in);
		System.out.println("ulangan3\nInput kalimat = ");
		String kalimat = scn.nextLine(); System.out.println(kalimat);
		
		String[] array = kalimat.split(" ");
		for(int i=0; i<array.length; i++) {
			String[] item = array[i].split("");
			for(int j=0; j<item.length;j++) {
				if(j>0 && j<item.length - 1) {
					System.out.print("*");
				}else {
					System.out.print(item[j]);
				}
			}System.out.print(" ");
		}
	}

	public static void ulangan4() {
		scn = new Scanner(System.in);
		System.out.println("ulangan 4\n input Kalimat : ");
		String kalimat = scn.nextLine();
		System.out.println(kalimat);
		
		String[] array = kalimat.split(" ");
		for(int i=0; i<array.length; i++) {
			String[] item= array[i].split("");
			for(int j=0; j<item.length; j++) {
				if(j>0 && j<item.length - 1) {
					System.out.print("*");
				}else {
					System.out.print(item[j]);
				}
			}System.out.print(" ");
		}
	}
}
