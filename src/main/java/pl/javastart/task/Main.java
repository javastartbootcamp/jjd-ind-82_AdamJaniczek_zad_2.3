package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Drink mojito = new Drink();
        mojito.name = "Mojito";
        mojito.price = 13.00;
        mojito.containsAlcohol = true;
        mojito.firstIngredient.name = "woda";
        mojito.firstIngredient.quantity = 50;
        mojito.secondIngredient.name = "sok cytrynowy";
        mojito.secondIngredient.quantity = 100;
        mojito.thirdIngredient.name = "wódka";
        mojito.thirdIngredient.quantity = 60;
        int capacity = mojito.firstIngredient.quantity + mojito.secondIngredient.quantity + mojito.thirdIngredient.quantity;
        System.out.println("Drink: " + mojito.name);
        System.out.println("Cena: " + mojito.price + " zł");
        System.out.println("Cz zawiera alkohol: " + mojito.containsAlcohol);
        System.out.printf("Składniki: \n%s \n%s \n%s", mojito.firstIngredient.name, mojito.secondIngredient.name, mojito.thirdIngredient.name);
        System.out.println("\nPojemność: " + capacity + " ml");

    }
}
