/* Dati Test
	immettere il numero di righe 5
	Uscita prevista
	1
	12
	123
	1234
	12345 
 */

package com;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserire il numero di righe");
		int numRighe = scan.nextInt();

		for(int i=1; i<=numRighe; i++){ //num righe
			for(int j=1; j<=i; j++){ //num colonne
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
