public class Buku27 {
    public static void main(String[] args) {
        String judul, pengarang;
        int stok, harga, halaman;
    }
    void tampilInformasi() {
        System.out.println("Judul : " + (judul));
        System.out.println("Pengarang : " + (pengarang));
        System.out.println("Jumlah Halaman : " + (halaman));
        System.out.println("Sisa Stok : " + (stok));
        System.out.println("Harga : Rp" + (harga));
    }
    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        }else {
            System.out.println("Stok Habis");
        }
    } 
    void restock(int jml) {
        stok += jml;
    }
    void gantiHarga(int hrg) {
        harga = hrg;
    }
}