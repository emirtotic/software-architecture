public class Main {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());

        beverage = new MilkDecorator(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());

        beverage = new ChocolateDecorator(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());
    }
}
