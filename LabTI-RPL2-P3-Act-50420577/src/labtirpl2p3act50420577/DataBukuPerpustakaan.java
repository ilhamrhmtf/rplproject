package labtirpl2p3act50420577;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataBukuPerpustakaan {
    public static void main(String[] args) {
        List<TambahDataBuku> dataBuku = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("Tambah Data Buku (y/n): ");
            String tambah = input.nextLine();

            if(!tambah.equalsIgnoreCase("y")) {
                break;
            }
            
            System.out.print("Kode: ");
            String kode = input.nextLine();
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("Jumlah: ");
            int harga = input.nextInt();
            
            input.nextLine();
            TambahDataBuku data = new TambahDataBuku(kode, nama, harga);
            dataBuku.add(data);
        }
        
        System.out.println("\n\nList Data Buku");
        System.out.println("----------------");
        for(TambahDataBuku data : dataBuku) {
            System.out.println(data);
            System.out.println("----------------");
        }
    }
}