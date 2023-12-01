package labtirpl2p3act50420577;

public class TambahDataBuku {
    private final String kode;
    private final String nama;
    private final int jumlah;
    
    public TambahDataBuku(String kode, String nama, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.jumlah = jumlah;
    }
    
    public String getKode() {
        return kode;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getJumlah() {
        return jumlah;
    }
    
    @Override
    public String toString() {
        return "Kode Buku: " + kode + "\nNama Buku: " + nama + "\nJumlah Buku: " + jumlah;
    }
}