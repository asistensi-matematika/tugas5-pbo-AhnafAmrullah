/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS_5_AHNAF;

import static TUGAS_5_AHNAF.LIBRARY.header;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ahnaf
 */
public class TEST123 {

    public static void main(String[] args) {

        Scanner ABCD = new Scanner(System.in);
        BOOK[] PRPSTKN = new BOOK[10000];
        int n = 0;
        double SumPages = 0;
        double FictionPages = 0;
        double NonFictionPages = 0;
        double StandardDeviation = 0;
        double FictionStandardDeviation = 0;
        double NonFictionStandardDeviation = 0;
        Random RNDM = new Random();
        int Fiction = 0;
        int NonFiction = 0;

        for (int i = 0; i < PRPSTKN.length; i++) {
            int coinflip = RNDM.nextInt(2) + 1;
            if (coinflip == 1) {
                PRPSTKN[i] = new FICTION();
            }
            if (coinflip == 2) {
                PRPSTKN[i] = new NONFICTION();
            }
        }

        PRPSTKN[0] = new BOOK("Ikan Tuna Main Kelereng", "James Gunn", "Fiksi", 400);
        Fiction += 1;
        FictionPages += 400;
        SumPages += 400;
        n += 1;

        PRPSTKN[1] = new BOOK("Plankton Naik Haji", "Basil Hawkins", "Non-Fiksi", 400);
        NonFiction += 1;
        NonFictionPages += 400;
        SumPages += 400;
        n += 1;

        PRPSTKN[2] = new BOOK("Shikamaru Si Anak Durhaka", "Makoto Nagano", "Non-Fiksi", 400);
        NonFiction += 1;
        NonFictionPages += 400;
        SumPages += 400;
        n += 1;

        int pil = 1;
        do {

            header("PERPUSTAKAAN.txt");
            System.out.println("");

            System.out.println("Data Buku : ");
            for (int i = 0; i < n; i++) {
                System.out.println("[" + (i + 1) + "] " + PRPSTKN[i].getTitle() + "\t| " + PRPSTKN[i].getAuthor());
            }
            System.out.println("==========================================================================================");
            System.out.println("[1]. Input Buku Baru");
            System.out.println("[2]. Modifikasi Detail Buku");
            System.out.println("[3]. Hapus Buku");
            System.out.println("[0]. Exit");
            System.out.println("==========================================================================================");

            double Avrg = SumPages / n;
            for (int i = 0; i < n; i++) {
                StandardDeviation = Math.pow((PRPSTKN[i].getPages() - Avrg), 2);
            }

            double AvrgFiction = FictionPages / Fiction;
            double AvrgNonFiction = NonFictionPages / NonFiction;
            for (int i = 0; i < n; i++) {
                if (PRPSTKN[i].getType() == "Fiction") {
                    FictionStandardDeviation = Math.pow((PRPSTKN[i].getPages() - AvrgFiction), 2);
                } else {
                    NonFictionStandardDeviation = Math.pow((PRPSTKN[i].getPages() - AvrgNonFiction), 2);
                }
            }

            System.out.println("Jumlah Buku di Dalam Perpustakaan: " + n);
            System.out.println("Rata-Rata Halaman Buku dalam Perpustakaan: " + Avrg);
            System.out.println("Standar Deviasi Halaman Buku dalam Perpustakaan: " + Math.sqrt(StandardDeviation / n));
            System.out.println("==========================================================================================");
            System.out.println("Jumlah Buku Fiksi dalam Perpustakaan: " + Fiction);
            System.out.println("Rata-Rata Halaman Buku Fiksi dalam Perpustakaan: " + AvrgFiction);
            System.out.println("Standar Deviasi Pages Buku Fiksi dalam Perpustakaan: " + Math.sqrt(FictionStandardDeviation / Fiction));
            System.out.println("==========================================================================================");
            System.out.println("Jumlah Buku Non Fiksi dalam Perpustakaan : " + NonFiction);
            System.out.println("Rata-Rata Halaman Buku Non Fiksi dalam Perpustakaan: " + AvrgNonFiction);
            System.out.println("Standar Deviasi Halaman Buku Non Fiksi dalam Perpustakaan: " + Math.sqrt(NonFictionStandardDeviation / NonFiction));
            System.out.println("==========================================================================================");
            System.out.print("MASUKKAN PILIHAN : ");
            int pilihan = ABCD.nextInt();
            if (pilihan == 1) {
                try {
                    header("BUKUBARU.txt");
                    System.out.println("");

                    n += 1;

                    System.out.print("Input Judul Buku : \n> ");
                    String Title = ABCD.next();
                    PRPSTKN[n - 1].setTitle(Title);
                    System.out.print("Input Pengarang Buku : \n> ");
                    String Author = ABCD.next();
                    PRPSTKN[n - 1].setAuthor(Author);
                    System.out.print("input jumlah Halaman Buku : \n> ");

                    int Pages = ABCD.nextInt();

                    PRPSTKN[n - 1].setPages(Pages);

                    int coinflip = RNDM.nextInt(2) + 1;
                    if (coinflip == 1) {
                        PRPSTKN[n - 1] = new BOOK(Title, Author, "Fiksi", Pages);
                        Fiction += 1;
                        FictionPages += Pages;
                        SumPages += Pages;
                    }
                    if (coinflip == 2) {
                        PRPSTKN[n - 1] = new BOOK(Title, Author, "Non-Fiksi", Pages);
                        NonFiction += 1;
                        NonFictionPages += Pages;
                        SumPages += Pages;
                    }

                } catch (Exception e) {
                    TEST123.main(args);
                }
            } else if (pilihan == 2) {

                header("UBAHBUKU.txt");
                System.out.println("");

                System.out.println("Pilih Buku Yang Akan Diubah : ");
                for (int i = 0; i < n; i++) {
                    System.out.println("[" + (i + 1) + "] " + PRPSTKN[i].getTitle() + "\t| " + PRPSTKN[i].getAuthor());
                }
                int UbahBuku = ABCD.nextInt();
                System.out.print("Input Judul Buku : \n> ");
                String Title = ABCD.next();
                PRPSTKN[UbahBuku - 1].setTitle(Title);
                System.out.print("Input Pengarang Buku : \n> ");
                String Author = ABCD.next();
                PRPSTKN[UbahBuku - 1].setAuthor(Author);

                System.out.print("Input Jumlah Halaman Buku : \n> ");
                int Pages = ABCD.nextInt();
                int OldPages = PRPSTKN[UbahBuku - 1].getPages();
                PRPSTKN[UbahBuku - 1].setPages(Pages);
                SumPages = SumPages - OldPages + Pages;
                if (PRPSTKN[UbahBuku - 1].getType() == "Fiction") {
                    FictionPages = FictionPages - OldPages + PRPSTKN[UbahBuku - 1].getPages();
                } else {
                    NonFictionPages = NonFictionPages - OldPages + PRPSTKN[UbahBuku - 1].getPages();
                }
            } else if (pilihan == 3) {

                header("HAPUSBUKU.txt");
                System.out.println("");

                System.out.println("Pilih Buku Yang Akan Dihapus : ");
                for (int i = 0; i < n; i++) {
                    System.out.println("[" + (i + 1) + "] " + PRPSTKN[i].getTitle() + "\t| " + PRPSTKN[i].getAuthor());
                }
                int Delete = ABCD.nextInt();
                SumPages -= PRPSTKN[Delete - 1].getPages();

                if (PRPSTKN[Delete - 1].getType() == "Fiction") {
                    Fiction -= 1;
                    FictionPages -= PRPSTKN[Delete - 1].getPages();
                    n -= 1;
                } else {
                    NonFiction -= 1;
                    NonFictionPages -= PRPSTKN[Delete - 1].getPages();
                    n -= 1;
                }
            } else {
                pil = 0;
            }
        } while (pil != 0);
    
        String path = "DATAPERPUS.txt";
        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < n; i++) {
                int a = i + 1;
                bw.write("{");
                bw.newLine();
                bw.write("\tJudul Buku : "  + PRPSTKN[i].getTitle());
                bw.newLine();
                bw.write("\tPengarang : " + PRPSTKN[i].getAuthor());
                bw.newLine();
                bw.write("\tJumlah Halaman : " + Integer.toString(PRPSTKN[i].getPages()));
                bw.newLine();
                bw.write("\tJenis Buku : " + PRPSTKN[i].getType());
                bw.newLine();
                bw.write("}");
                bw.newLine();
            }
            bw.close();

        } catch (Exception e) {
        }
    }
}
