/* Nim   : 13020210180
   Nama  : Wa Ode Ratna Adiningsih
   Waktu : 23/03/2023 14.39 AM */


import java.util.Scanner;

/* Baca N, Print 1 s/d N dengan FOR */
public class PriFor {

/**
 * @param args
 */
public static void main(String[] args) {
	// TODO Auto-generated method stub
	/* Kamus */
	int i,N;
	Scanner masukan=new Scanner(System.in);
	/* Program */
	/* program */

	System.out.print ("Baca N, print 1 s/d N ");
	System.out.print ("N = ");

	N=masukan.nextInt();
	
	for (i = 1; i <= N; i++){
	System.out.println (i); };
	System.out.println ("Akhir program \n");
	}
}
