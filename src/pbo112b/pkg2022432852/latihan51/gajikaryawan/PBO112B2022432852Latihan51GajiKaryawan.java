/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo112b.pkg2022432852.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author Mini Pc Nama : DaruL Fitahul Huda 
 * NIM : 2022432852 
 * Kode Kelas :FS112B (PBO112B) 
 * Deksripsi Program : Menghitung Gaji Karyawan
 * 
 */
public class PBO112B2022432852Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Karyawan k = new Karyawan();
        Manager m = new Manager();
        
        //input
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukan NIK : ");
        k.setNik(scan.nextLine());
        System.out.print("Masukan Nama : ");
        k.setNama(scan.nextLine());
        System.out.print("Masukan Golongan (1/2/3) : ");
        k.setGolongan(scan.nextInt());
        System.out.print("Masukan Jabatan (Manajer/Kabag) : ");
        k.setJabatan(scan.next());
        System.out.print("Masukan Jumlah Kehadiran : ");
        m.setKehadiran(scan.nextInt());
     
        
        //output
        System.out.println("");
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK\t : "+k.getNik());
        System.out.println("NAMA\t : "+k.getNama());
        System.out.println("GOLONGAN : "+k.getGolongan());
        System.out.println("JABATAN\t : "+k.getJabatan());
        System.out.println("");
        System.out.println("TUNJANGAN GOLONGAN      : "+m.tunjanganGolongan(k.getGolongan()));
        System.out.println("TUNJANGAN JABATAN       : "+m.tunjanganJabatan(k.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN     : "+m.tunjanganKehadiran(m.getKehadiran()));
        System.out.println("");
        System.out.println("GAJI TOTAL      : "+m.gajiTotal());
    }

}
