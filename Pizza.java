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

    

}
