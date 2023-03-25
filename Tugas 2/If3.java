/* Nim   : 13020210180
   Nama  : Wa Ode Ratna Adiningsih
   Waktu : 23/03/2023 15.07 AM */

import java.util.Scanner;
/* contoh pemakaian IF tiga kasus */ /* Membaca sebuah nilai, */
/* menuliskan 'Nilai a positif , nilai a', jika a >0 */
/* 'Nilai Nol , nilai a', jika a = 0 */
/* 'Nilai a negatif , nilai a', jika a <0 */

	public class If3 {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Kamus */
		int a;
		Scanner masukan=new Scanner(System.in);
		/* Program */
		System.out.print ("Contoh IF tiga kasus \n"); 
		System.out.print ("Ketikkan suatu nilai integer :"); 
		a=masukan.nextInt();
		if (a > 0){
			System.out.println ("Nilai a positif "+ a);
		}else if (a == 0){
			System.out.println ("Nilai Nol "+ a);
		}else /* a > 0 */ {
			System.out.println ("Nilai a negatif "+ a);
		}
	}
}