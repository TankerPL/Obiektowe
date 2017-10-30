import java.util.ArrayList;

public class Samochod {
    private String model = null;
    private ArrayList<Wyposazenie> wyposazenieList = new ArrayList<>();
    private double cena = 0.;

    public Samochod(String model) {
        this.model = model;
    }

    public void dodajWyposazenie(Wyposazenie wyposazenie) {
        cena += wyposazenie.getPrice();
        this.wyposazenieList.add(wyposazenie);
    }

    public double getPrice() {
        return cena;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(model + "\n");
        for(Wyposazenie w: wyposazenieList) {
            s.append(w.toString()).append("\n");
        }
        s.append(cena).append(" PLN");
        return s.toString();
    }
}
