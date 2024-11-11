public class Main {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());

        // Espresso with milk
        beverage = new MilkDecorator(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());

        // Espresso with milk and chocolate
        beverage = new ChocolateDecorator(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());
    }
}
