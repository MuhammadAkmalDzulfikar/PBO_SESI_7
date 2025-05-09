package models;

import abstractfiles.Motor;
import java.util.ArrayList;
import java.util.List;

public class DaftarMotor<T extends Motor> {
    private List<T> daftar = new ArrayList<>();

    public void tambahMotor(T motor) {
        daftar.add(motor);
    }

    public void tampilkanDaftar() {
        System.out.println("=== Daftar Motor ===");
        for (T motor : daftar) {
            motor.info();
        }
    }

    public T getMotor(int index) {
        return daftar.get(index);
    }
}