package models;

import abstractfiles.Motor;
import interfacefiles.Transaksi;
import interfacefiles.Pembayaran;

public class Pembeli implements Transaksi, Pembayaran {
    private String nama;
    private double saldo;

    public Pembeli(String nama, double saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }

    @Override
    public void beli(Motor motor) {
        if (saldo >= motor.getHarga()) {
            bayar(motor.getHarga());
            System.out.println(nama + " membeli motor: ");
            motor.info();
        } else {
            System.out.println("Saldo tidak cukup untuk membeli motor.");
        }
    }

    @Override
    public void bayar(double jumlah) {
        saldo -= jumlah;
        System.out.println("Pembayaran sebesar: " + jumlah + " berhasil. Sisa saldo: " + saldo);
    }
}