package template1;

public abstract class Sandwich {

    private void sliceBread(){
        System.out.println("Slice bread");
    }

    protected abstract void addIngredients();

    protected abstract void addCondiments();

    protected void wrap(){
        System.out.println("Wrap the sandwich");
    }

    public final void makeSandwich(){
        sliceBread();
        addIngredients();
        addCondiments();
        wrap();
    }
}
