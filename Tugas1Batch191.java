package hari01;

import java.util.Scanner;

public class Tugas1Batch191 {
	static Scanner scn;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		soal1();
		soal2();
		soal3();
		soal4();
		soal5();
		soal6();
		soal7();
		soal8();
		soal9();
		soal10();
	}
	
	public static void soal1() {
		scn = new Scanner (System.in);
		int n=7; int a=1;
		System.out.println("Soal 1: ");
		for(int i=0;i<n;i++) {
			System.out.print(a+" ");
			a=a+2;
		}	
	}
	
	public static void soal2() {
		scn = new Scanner (System.in);
		int n=7; int a=2;
		System.out.println("\nSoal 2: ");
		for (int i=0;i<n;i++) {
			System.out.print(a+" ");
			a=a+2;
		}
	}
	
	public static void soal3() {
		scn = new Scanner (System.in);
		int n=7; int a=1;
		System.out.println("\nSoal 3: ");
		for (int i=0;i<n;i++) {
			System.out.print(a+" ");
			a=a+3;
		}
	}
	
	public static void soal4() {
		scn = new Scanner (System.in);
		int n=7; int a=1;
		System.out.println("\nSoal 4: ");
		for (int i=0;i<n;i++) {
			System.out.print(a+" ");
			a=a+3;
		}
	}
	
	public static void soal5() {
		scn = new Scanner (System.in);
		int n=6; int a=1;
		System.out.println("\nSoal 5: ");
		for (int i=1;i<n;i++) {
			System.out.print(a+" ");
			a=a+4;
			if (i==2||i==4) {
				System.out.print("* ");
			}
		}
	}
	
	public static void soal6() {
		scn = new Scanner (System.in);
		int n=7; int a=1;
		System.out.println("\nSoal 6: ");
		for (int i=0;i<n;i++) {
			if(i==2||i==5) {
				System.out.print("* ");
				a=a+4;
			}else if(i!=2||i!=5){
				System.out.print(a +" ");
				a=a+4;
			}
		}
			
	}
	
	public static void soal7() {
		scn = new Scanner (System.in);
		int n=7; int a=2;
		System.out.println("\nSoal 7: ");
		for (int i=0; i<n; i++) {
			System.out.print(a+" ");
			a=a*2;
		}
	}
	public static void soal8() {
		scn = new Scanner (System.in);
		int n=7; int a=3;
		System.out.println("\nSoal 8: ");
		for (int i=0; i<n; i++) {
			System.out.print(a+" ");
			a=a*3;
		}
	}	
	
	public static void soal9() {
		scn = new Scanner (System.in);
		int n=6; int a=4;
		System.out.println("\nSoal 9: ");
		for (int i=1;i<n;i++) {
			System.out.print(a+" ");
			a=a*4;
			if (i==2||i==4) {
				System.out.print("* ");
			}
		}
	}
	
	public static void soal10() {
		scn = new Scanner (System.in);
		int n=7; int a=3;
		System.out.println("\nSoal 10: ");
		for (int i=0;i<n;i++) {
			if(i==3) {
				System.out.print("XXX ");
				a=a*3;
			}else if(1!=3) {
				System.out.print(a+" ");
				a=a*3;
			}
		}
	}

}
