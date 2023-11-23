package template1;

public class CheeseSandwich extends Sandwich{
    @Override
    protected void addIngredients() {
        System.out.println("Add chicken and lot of cheese");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add cheese souse");
    }
}
