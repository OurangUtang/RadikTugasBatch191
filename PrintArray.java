package common;


//overloading nama methode sama tipe data beda
public class PrintArray {
	public static void array2D(String[][] array) {
		for(int i = 0; i<array.length; i++){
			for(int j=0;j<array[i].length;j++){
				System.out.print(array[i][j]+"\t");
			}System.out.println("\n");
		}
	}
}
