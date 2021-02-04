
package lingkaranpersegi;

import java.util.Scanner;


public class Persegi {
    Scanner in = new Scanner(System.in);
    int sisi;
    int hasil;
    
    void hitung(){
        System.out.print("masukkan panjang sisi = ");
        sisi = in.nextInt();
        hasil = sisi*sisi;
        System.out.print("Luas dari lingkaran adalah = "+hasil);
        
    }
    
}
