public class Buyer {
    private double discount = 0.;

    Buyer() {
    }

    public void buyCar(Samochod samochod) {
        if (discount == 0) {
            System.out.printf("Zaplacono: %.2f (brak znizki)", samochod.getPrice());
        } else if (samochod.getPrice() >= discount) {
            System.out.printf("Zaplacono: %.2f (znizka %.2f)\n", samochod.getPrice() - discount, discount);
            discount = 0.;
        } else {
            System.out.printf("Wykorzystano pelna znizke %.2f\n", samochod.getPrice());
            discount -= samochod.getPrice();
        }
        discount += samochod.getPrice() * 0.01;
    }
}
