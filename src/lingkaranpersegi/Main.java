
package lingkaranpersegi;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Lingkaran lingkar = new Lingkaran();
        Persegi persegi = new Persegi();
        
        int pilih;
        
        System.out.println("Pilih operasi yang di inginkan : ");
        System.out.println("1. Hitung luas lingkaran");
        System.out.println("2. Hitung luas persegi");
        
        System.out.println("PILIH : ");
        pilih = in.nextInt();
        
        switch(pilih) {
            case 1: 
                 lingkar.hitung();
                 break;
 	    case 2: 
                 persegi.hitung();
                 break;
            default: 
                 System.out.println("Pilihan Salah!!!");
        }
        

    }
    
}
