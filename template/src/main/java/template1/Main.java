package template1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Prepare a ham sandwich: ");
        Sandwich hamSandwich = new HamSandwich();
        hamSandwich.makeSandwich();

        System.out.println("***************************************");

        System.out.println("Prepare a cheese sandwich: ");
        Sandwich cheeseSandwich = new CheeseSandwich();
        cheeseSandwich.makeSandwich();
    }
}
