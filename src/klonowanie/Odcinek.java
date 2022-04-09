package klonowanie;

public class Odcinek {
    private Punkt start;
    private Punkt koniec;

    public Odcinek(Punkt start, Punkt koniec) {
        this.start = start;
        this.koniec = koniec;
    }

    public Punkt getStart() {
        return start;
    }
    public void setStart(Punkt start) {
        this.start = start;
    }
    public Punkt getKoniec() {
        return koniec;
    }
    public void setKoniec(Punkt koniec) {
        this.koniec = koniec;
    }
}