
package lingkaranpersegi;

import java.util.Scanner;


public class Lingkaran {
    Scanner in = new Scanner(System.in);
    double jarijari;
    double hasil;
    double phi = 3.14;
    
    void hitung(){
        System.out.print("masukkan panjang jari jari = ");
        jarijari = in.nextInt();
        hasil = phi*jarijari*jarijari;
        System.out.print("Luas dari lingkaran adalah = "+hasil);
        
    }
    
}
