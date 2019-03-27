package common;

public class DeretAngka {
	public static int[] deret01(int nPanjang, int nIncrement, int nAwal) {
		int deret[]=new int[nPanjang];
		int angka = nAwal;
		for(int i=0; i<deret.length;i++) {
			if(i%4==3) {
				deret[i]=nIncrement;
				nIncrement*=3;
			}else {
				deret[i]=angka;
				angka+=3;
			}
		}
		return deret;
	}
}
