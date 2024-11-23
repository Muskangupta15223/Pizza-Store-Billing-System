package projectOfJava.pizzaStore;

public class deluxPizza extends pizza {

  public deluxPizza(int veg) {
    super(veg);
    super.addToppingsWithCheese();
  }
}
