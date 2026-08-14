Food
class Food {
    String Category;

    Food(String category) {
        this.Category = category;
    }

    void showcategory() {
        System.out.println("Category: " + Category);
    }
}

class Pizza extends Food {

    static String restaurant = "Pizza Hub";

    String size;
    String topping;
    double price;

    Pizza(String category, String size, String topping, double price) {
        super(category);
        this.size = size;
        this.topping = topping;
        this.price = price;
    }

    void displayPizza() {
        super.showcategory();

        System.out.println("Restaurant : " + restaurant);
        System.out.println("Size : " + size);
        System.out.println("Topping : " + topping);
        System.out.println("Price : " + price);
    }

    static void showrestaurant() {
        System.out.println("Restaurant Name : " + restaurant);
    }
}

public class Main {

    public static void main(String[] args) {

        Pizza.showrestaurant();

        System.out.println();

        Pizza p1 = new Pizza("Fast Food", "Medium", "Farm Fresh", 350);
        Pizza p2 = new Pizza("Fast Food", "Large", "Paprika", 650);

        System.out.println("Pizza 1 Details");
        p1.displayPizza();

        System.out.println();

        System.out.println("Pizza 2 Details");
        p2.displayPizza();
    }
}
