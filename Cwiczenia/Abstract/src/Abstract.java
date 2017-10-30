public class Abstract {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        Samochod s1 = new Samochod("Subaru");
        s1.dodajWyposazenie(new Silnik("V6", 12000));
        s1.dodajWyposazenie(new Okna("Manualne", 875));
        System.out.println(s1.toString());
        buyer.buyCar(s1);

        System.out.println("\n");
        Samochod s2 = new Samochod("Volvo");
        s2.dodajWyposazenie(new Silnik("V8", 14750));
        s2.dodajWyposazenie(new Okna("Elektryczne", 1320));
        System.out.println(s2.toString());
        buyer.buyCar(s2);
    }
}
