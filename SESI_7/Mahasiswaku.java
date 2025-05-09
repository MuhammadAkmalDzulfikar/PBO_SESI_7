package Tugas_7;

class Mahasiswa <S,U,T>{
    private S Nim;
    private U Nama;
    private T Clas;

    public void setNim(S Nim){
        this.Nim = Nim;
    }

    public void setNama(U Nama){
        this.Nama = Nama;
    }

    public void setClas(T Clas){
        this.Clas = Clas;
    }

    public S getNim(){
        return Nim;
    }

    public U getNama(){
        return Nama;
    }

    public T getClas(){
        return Clas;
    }

}


public class Mahasiswaku {
    public static void main(String[] args) {
        Mahasiswa <String,String, Integer> m = new Mahasiswa<String, String, Integer>();
        m.setNim("23457");
        m.setNama("Ferdi S");
        m.setClas(21);

        System.out.println(m.getNim());
        System.out.println(m.getNama());
        System.out.println(m.getClas());
    }
}
