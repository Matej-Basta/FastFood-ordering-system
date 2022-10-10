public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        System.out.println(pizza.getPrice());
        pizza.addTopping("ketchup");
        pizza.addTopping("onion");
        pizza.setName("Onion Pizza");
        pizza.display();
    }

}