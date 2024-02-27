public class BukuMain27 {

    public static class Buku {
        private String judul;
        private String pengarang;
        private int halaman;
        private int stok;
        private int harga;

        public Buku() {
            this.judul = "";
            this.pengarang = "";
            this.halaman = 0;
            this.stok = 0;
            this.harga = 0;
        }

        public Buku(String judul, String pengarang, int halaman, int stok, int harga) {
            this.judul = judul;
            this.pengarang = pengarang;
            this.halaman = halaman;
            this.stok = stok;
            this.harga = harga;
        }

        public String getJudul() {
            return judul;
        }

        public void setJudul(String judul) {
            this.judul = judul;
        }

        public String getPengarang() {
            return pengarang;
        }

        public void setPengarang(String pengarang) {
            this.pengarang = pengarang;
        }

        public int getHalaman() {
            return halaman;
        }

        public void setHalaman(int halaman) {
            this.halaman = halaman;
        }

        public int getStok() {
            return stok;
        }

        public void setStok(int stok) {
            this.stok = stok;
        }

        public int getHarga() {
            return harga;
        }

        public void setHarga(int harga) {
            this.harga = harga;
        }

        void tampilInformasi() {
            System.out.println("Judul: " + judul);
            System.out.println("Pengarang: " + pengarang);
            System.out.println("Halaman: " + halaman);
            System.out.println("Stok: " + stok);
            System.out.println("Harga: Rp" + harga);
        }

        void terjual(int jumlah) {
            if (stok >= jumlah) {
                stok -= jumlah;
            } else {
                System.out.println("Stok tidak mencukupi!");
            }
        }

        void ubahHarga(int hargaBaru) {
            if (hargaBaru < 0) {
                throw new IllegalArgumentException("Harga tidak boleh negatif!");
            }
            harga = hargaBaru;
        }
    }

    public static class BukuMain {
        public static void main(String[] args) {
            Buku bk1 = new Buku();
            bk1.setJudul("Today Ends Tomorrow Comes");
            bk1.setPengarang("Denanda Pratiwi");
            bk1.setHalaman(198);
            bk1.setStok(13);
            bk1.setHarga(71000);
            bk1.tampilInformasi();

            Buku bk2 = new Buku("Self Reward", "Maheera Ayesha", 160, 18, 59000);
            bk2.tampilInformasi();

            Buku bukuAndini = new Buku("Senja di Langit Praha", "Bernard Batubara", 256, 20, 85000);
            bukuAndini.tampilInformasi();

            bk1.terjual(5);
            bk1.ubahHarga(60000);
            bk1.tampilInformasi();
        }
    }
}