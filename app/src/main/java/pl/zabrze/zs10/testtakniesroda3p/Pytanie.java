package pl.zabrze.zs10.testtakniesroda3p;
public class Pytanie {
    private String trescPytanie;
    private boolean odpowiedz;
    private int idZdejcia;
    private boolean czyUdzielonoPoprawnejOdpowiedzi;
    private String podpowiedz;

    public Pytanie(String trescPytanie, boolean odpowiedz, int idZdejcia, String podpowiedz) {
        this.trescPytanie = trescPytanie;
        this.odpowiedz = odpowiedz;
        this.idZdejcia = idZdejcia;
        this.podpowiedz = podpowiedz;
        czyUdzielonoPoprawnejOdpowiedzi =false;
    }

    public Pytanie(String trescPytanie, boolean odpowiedz, int idZdejcia) {
        this.trescPytanie = trescPytanie;
        this.odpowiedz = odpowiedz;
        this.idZdejcia = idZdejcia;
        czyUdzielonoPoprawnejOdpowiedzi = false;
    }

    public String getPodpowiedz() {
        return podpowiedz;
    }

    public String getTrescPytanie() {
        return trescPytanie;
    }

    public boolean isOdpowiedz() {
        return odpowiedz;
    }

    public int getIdZdejcia() {
        return idZdejcia;
    }

    public boolean isCzyUdzielonoPoprawnejOdpowiedzi() {
        return czyUdzielonoPoprawnejOdpowiedzi;
    }

    public void setCzyUdzielonoPoprawnejOdpowiedzi(boolean czyUdzielonoPoprawnejOdpowiedzi) {
        this.czyUdzielonoPoprawnejOdpowiedzi = czyUdzielonoPoprawnejOdpowiedzi;
    }
}
