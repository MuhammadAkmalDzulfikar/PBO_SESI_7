package abstractfiles;

public abstract class Kendaraan {
    protected String merk;
    protected String model;
    protected double harga;

    public Kendaraan(String merk, String model, double harga) {
        this.merk = merk;
        this.model = model;
        this.harga = harga;
    }

    public abstract void info();

    public double getHarga() {
        return harga;
    }
}