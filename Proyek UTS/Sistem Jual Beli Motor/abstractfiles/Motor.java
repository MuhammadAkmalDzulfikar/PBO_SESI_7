package abstractfiles;

public class Motor extends Kendaraan {
    private int tahun;

    public Motor(String merk, String model, double harga, int tahun) {
        super(merk, model, harga);
        this.tahun = tahun;
    }

    @Override
    public void info() {
        System.out.println("Motor: " + merk + " " + model + ", Tahun: " + tahun + ", Harga: " + harga);
    }

    public int getTahun() {
        return tahun;
    }
}