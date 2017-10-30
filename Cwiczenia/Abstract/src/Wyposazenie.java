public abstract class Wyposazenie {

    private String type = null;
    private String value = null;
    private double price = 0.;

    Wyposazenie(String type, String value, double price) {
        this.type = type;
        this.value = value;
        this.price = price;
    }

    double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", type, value);
    }
}
