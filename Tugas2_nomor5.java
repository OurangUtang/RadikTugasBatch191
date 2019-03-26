package Hari02;

import java.util.Scanner;

public class Tugas2_nomor5 {
		static Scanner scn;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scn=new Scanner(System.in);
		
		System.out.println("Masukan Kalimat = ");
		String text= scn.nextLine();
		
		//a++ artinya a nilai skarang ditambah 1 dengan a sebelumnya
		//split dikanan tipe String[] Array harus sama dengan tipe data String dikanan yaitu String Array
		
		String[] array = text.split(" ");//harus kasih spasi jika ingin split...supaya spasinya sk kebaca...dan juga dibagi perkata
		for(int i=0; i<array.length; i++) { //for pertama mensplit kalimat ke beberapa kata sesuai dengan lengthnya
			
			String[] item = array[i].split(""); //for ke dua untuk mensplit kata menjadi beberapa huruf
			for (int j=0; j<item.length; j++) {
				
				if(j>0 && j<item.length-1) {
					System.out.print("*"); // mengubah huruf didalam kata menjadi bintang, kecuala awal dan akhir huruf di sebuah kata
				}else {
					System.out.print(item[j]);//mengoutput huruf yang tidak diganti yang sudah di simpan dalam array j.
				} 
			}System.out.print(" ");//output spasi
		
		}
	}

}
