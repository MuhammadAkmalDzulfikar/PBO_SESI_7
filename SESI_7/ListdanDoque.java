package Tugas_7;

import java.util.ArrayList;
import java.util.ArrayDeque;

public class ListdanDoque {
    public static void main(String[] args) {

        ArrayList<String> daftarNama = new ArrayList<>();
        daftarNama.add("Sutisna");
        daftarNama.add("Ferdi");
        daftarNama.add("Budi");

        System.out.println("Isi ArrayList:");
        for (String nama : daftarNama) {
            System.out.println( nama);
        }

        ArrayDeque<String> antrian = new ArrayDeque<>();
        antrian.addLast("Mahasiswa 1");
        antrian.addFirst("Mahasiswa 2");
        antrian.addLast("Mahasiswa 3");

        System.out.println("\nIsi Antrian :");
        while (!antrian.isEmpty()) {
            System.out.println("Dilayani: " + antrian.removeFirst());
        }
    }
}
