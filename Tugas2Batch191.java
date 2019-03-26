package Hari02;

import java.util.Scanner;

public class Tugas2Batch191 {
	static Scanner scn;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//soal1();
		scn=new Scanner(System.in);
		System.out.println("MasuKkan Nomor Soal [1-6] = ");
		int soal=scn.nextInt();
		
		if(soal==1) {
			soal1();
		}else if(soal==2) {
			//System.out.println("dua");
			soal2();
		}else if(soal==3) {
			//System.out.println("tiga");
			soal3();
		}else if(soal==4) {
			soal4();
		}else if (soal==5) {
			//System.out.println("Lima");
			soal5();
		}else if (soal==6) {
			soal6();
		}
	}
	//////////////////////////////////////////////////////////
	public static int soal1() {
		scn=new Scanner (System.in);
		int c = 1;
		int count1=0;
		int count2=0;
		int count3=0;
		System.out.println("Soal 1");
		System.out.println("Masukan Nilai N1 = ");
		int N1=scn.nextInt();
		System.out.println("Masukan Nilai N2 = ");
		int N2=scn.nextInt();
		
		for(int i=0; i<N1; i++) {
			System.out.print(i+" ");
	
		}
		System.out.println("");
		for(int i=0; i<N1; i++) {
			if(i==0) {
				count1=count1+c;
			}else if (i==1) {
				count2=count2+c;
			}else if(i==2) {
				count3=count3+c;
			}
			System.out.print(c + " ");
			c=c*N2;
			
			
		}
		
		int count4=count3+count2+count1;
		System.out.println("\n"+count4);
			
		return 0;
		
	}
	//////////////////////////////////////////////////////////////////
	public static int soal2() {
		scn=new Scanner(System.in);
		int c=1; //int hasil=0;
		int count1=0;
		int count2=0;
		int count3=0;
		System.out.println("Soal 2");
		System.out.println("Masukan Nilai N1 = ");
		int N1=scn.nextInt();
		System.out.println("Masukan Nilai N2 = ");
		int N2=scn.nextInt();
		
		for(int i=0; i<N1; i++) {
			//if (i<=3) {
				//hasil=hasil*N2;
			//}
			if(i==0) {
				count1=count1+c;
			}else if(i==1) {
				count2=count2+c;
			}else if(i==2) {
				c=c*-1;
				count3=count3+c;
			}
			
			if(i==2) {
				c=c*-1;
			}else if (i==5)
			{
				c=c*-1;
			}else if (i==3) {
				c=c*-1;
			}else if (i==6) {
				c=c*-1;
			}
				System.out.print(c+" ");
				c=c*N2;
				
				//System.out.print(hasil);
		}
		int count4=count3*count2*count1;
		System.out.println("\n"+count4);
		//System.out.print(hasil);
		return 0;
	}
	
	//////////////////////////////////////////////////////////////////
	public static int soal3() {
		scn=new Scanner(System.in);
		int c=2; int count1=0;int count2=0; int count3=0;
		System.out.println("Soal 3");
		System.out.println("Masukan Nilai N1 = ");
		int N1=scn.nextInt();
		System.out.println("Masukan Nilai N2 = ");
		int N2=scn.nextInt();
		System.out.println("Masukan Nilai N3 = ");
		int N3=scn.nextInt();
		
		for (int i=0; i<N1;i++) {
			
			
			
			if(i==1) {
				c=c*N2;
			}else if(i>=2&&i<=3) {
				c=c*N3;
			}else if(i>3&&i<6) {
				c=c/N3;
			}else if (i>=6) {
				c=c/N2;
			}
			
			if (i==3) {
				count1=count1+c;
			}else if (i==4) {
				count2=count2+c;
			}else if(i==5) {
				count3=count3+c;
			}
			System.out.print(c+" ");
		}
		int count4=count1-count2-count3;
		System.out.println("\n"+count4);
		return 0;
	}
	
	////////////////////////////////////////////////////////////////
	
	public static int soal4() {
		
		scn=new Scanner (System.in);
		int c1=1; int c2=5; int count1=0;int count2=0; int count3=0;
		System.out.println("Soal 4");
		System.out.println("Masukan Nilai N1 = ");
		int N1=scn.nextInt();
		System.out.println("Masukan Nilai N2 = ");
		int N2=scn.nextInt();
		
		for (int i=0;i<N1;i++) {
			
			if (i%2==0) {
				System.out.print(c1+" ");
				c1=c1+1;
				c2=c2-5;
			}else
				System.out.print(c2+" ");
				c2=c2+N2;
				
				if (i==0) {
					count1=count1+c2;
				}else if (i==2) {
					count2=count2+c2;
				}else if(i==4) {
					count3=count3+c2;
				}
			
		}
		int count4=count1+count2+count3;
		System.out.println("\n"+count4);
		return 0;
	}
	
	////////////////////////////////////////////////////////////////
	
	public static void soal5() {
		scn=new Scanner(System.in);
		System.out.println("Input Kalimat = ");
		
		String kalimat=scn.nextLine();
		StringBuilder sentenceReformed=new StringBuilder();
		
		for(String kata: kalimat.split(" ")){
			sentenceReformed.append(replaceAll(kata,'*'));
			sentenceReformed.append(" ");
		}
		System.out.println(sentenceReformed);
	}
	
	public static String replaceAll(String kata, char replacer) {
		StringBuilder ret = new StringBuilder();
		if(kata.length()>2) {
			ret.append(kata.charAt(0));
			for(int i=1; i<kata.length()-1;i++) {
				ret.append(replacer);
			}
			ret.append(kata.charAt(kata.length()-1));
			return ret.toString();
			
		}
		return kata;
		
	}

	
	/////////////////////////////////////////////////////////////
	
	public static void soal6() {
		scn=new Scanner(System.in);
		System.out.println("Input Kalimat = ");
		String kata=scn.nextLine();
		int uppercase=0;
		for(int i=0; i <kata.length();i++) {
			if (Character.isUpperCase(kata.charAt(i))) {
				uppercase++;
			}
		}
		
		System.out.println("Output : "+ uppercase);	
			System.out.println(kata);
	}
}























