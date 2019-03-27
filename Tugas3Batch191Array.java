import java.until.Scanner;
public class Tugas3Batch191Array{
   static Scanner scn;
	public static void main(String args[])
	{
		scn=new Scanner(System.in);
		System.out.println("Input N : "); int n=scn.nextInt();
		System.out.println("input M : "); int m=scn.nextInt();
		System.out.println("input O : "); int o=scn.nextInt();
		
		int[] deret=new int [n*3];
		int angka = 0; int tiga=m;
		for(int i=0;i<deret.lenght;i++){
			if(i%4==3){
				deret[i]=tiga;
				tiga=tiga*3;
			}else{
				deret[i]=angka;
				angka=angka+3;
			}
		}
		
		String[][] array= new String [n][n];
		int index=0;
		
		for(int i=0;i<n;i++){
			array[i+1][i+1]=deret[index]+"";
			index++;
		}
		
		for(int i=n-2;i>=0;i--){
			array[n-1][i]=deret[index]+"";
			index++;
		}
		
		for(int i=n-2; i>0;i--){
			array[i][0]=deret[index]+"";
		}
		
		PrintArray.array2D(array);
	}

}
