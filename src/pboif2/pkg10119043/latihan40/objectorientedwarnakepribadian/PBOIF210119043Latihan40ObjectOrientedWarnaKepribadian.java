/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan40.objectorientedwarnakepribadian;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : FERMI
 * DESKRIPSI : Program warna kepribadian dengan object oriented
 */
public class PBOIF210119043Latihan40ObjectOrientedWarnaKepribadian {

    /**
     * @param args the command line arguments
     */
    
    public static final String NORMAL = "\u001b[0m";

    public static final String BLACK = "\u001b[30m";
    public static final String RED = "\u001b[31m";
    public static final String GREEN = "\u001b[32m";
    public static final String YELLOW = "\u001b[33m";
    public static final String BLUE = "\u001b[34m";
    public static final String MAGENTA = "\u001b[35m";
    public static final String CYAN = "\u001b[36m";
    public static final String WHITE = "\u001b[37m";

    public static final String BLINK = "\u001b[5m";
    public static String nama, pilihan;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(RED + "YUK " + GREEN + "CEK " + YELLOW +  "KEPRIBADIANMU " + CYAN + "DARI " + MAGENTA + "WARNA " + MAGENTA + "FAVORITMU ");
        System.out.println(RED + "MERAH");
        System.out.println(GREEN + "HIJAU");
        System.out.println(YELLOW + "KUNING");
        System.out.println(BLUE + "BIRU");
        System.out.println(MAGENTA + "UNGU" + NORMAL);
        System.out.println();
        
        System.out.print("PILIH WARNA FAVORITMU : ");
        pilihan = scanner.nextLine();
        pilihan = pilihan.toUpperCase();
        System.out.print("NAMA KAMU : ");
        nama = scanner.nextLine();
        nama = nama.toUpperCase();
        
        System.out.println();
        User user = new User();
        user.cekTes(pilihan, nama);
    }
    
}
