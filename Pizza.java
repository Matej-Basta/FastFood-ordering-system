import java.util.ArrayList;
import java.util.List;

public class Pizza extends Food {
    
    protected List<String> toppings;
    
    public Pizza() {
        super("Pizza", 45);
        toppings = new ArrayList<>();
    }

    public void addTopping(String topping) {
        toppings.add(topping);
        price += 10;
    }

    public void setName(String name) {
        super.name = name;
    }

    public void display() {
        super.display();

        String displayedToppings = "";
        String separator = "";
        for (String topping : toppings) {
            displayedToppings += separator + " " + topping;
            separator = ",";
        }

        System.out.print(" {" + displayedToppings + " }");
    }
}
