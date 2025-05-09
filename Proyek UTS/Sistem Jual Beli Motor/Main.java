import abstractfiles.Motor;
import models.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DaftarMotor<Motor> daftar = new DaftarMotor<>();
        daftar.tambahMotor(new Motor("Yamaha", "NMAX", 30000000, 2021));
        daftar.tambahMotor(new Motor("Honda", "Vario", 25000000, 2022));
        daftar.tambahMotor(new Motor("Suzuki", "Satria", 20000000, 2020));

        Pembeli pembeli = new Pembeli("Akmal", 35000000);

        daftar.tampilkanDaftar();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pilih motor (index mulai dari 0): ");
        int pilihan = scanner.nextInt();

        pembeli.beli(daftar.getMotor(pilihan));
    }
}