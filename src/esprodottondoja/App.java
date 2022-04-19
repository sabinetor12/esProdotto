package esprodottondoja;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        NonAlimentare sku = new NonAlimentare("cacca", false, "di carlo", 100, "maro");
        Alimentare gang = new Alimentare(2021, 04, "nome", 100, "italia");
        //sku.applicaSconto();
        //System.out.println(sku.prezzo);
        gang.applicaSconto();
        System.out.println(gang.prezzo);
    }
}
