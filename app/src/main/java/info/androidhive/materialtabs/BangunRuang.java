package info.androidhive.materialtabs;

public class BangunRuang {

    private String nama;
    private String rumus;


    public BangunRuang(String nama, String rumus) {
        this.nama = nama;
        this.rumus = rumus;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getRumus() {
        return rumus;
    }

    public void setRumus(String rumus) {
        this.rumus = rumus;
    }
}
