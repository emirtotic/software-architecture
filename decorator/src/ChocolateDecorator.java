public class ChocolateDecorator extends BeverageDecorator {

    public ChocolateDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Chocolate";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.70; // add chocolate price
    }
}
