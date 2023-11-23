package template1;

public class HamSandwich extends Sandwich{
    @Override
    protected void addIngredients() {
        System.out.println("Adding ham and salad");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding ketchup");
    }
}
