package projectOfJava.pizzaStore;

public class pizza {

  private int price;
  private int veg;
  private int baseprice;

  public pizza(int veg) {
    this.veg = veg;
    if (this.veg == 1) {
      this.price = 300;
    } else {
      this.price = 400;
    }
    baseprice = this.price;
  }

  private int ExtraCheese = 100;
  private int ExtraToppings = 150;
  private int ExtraBoth = 220;
  private int bagPack = 20;

  private boolean isExtraCheese = false;
  private boolean isExtraToppings = false;
  private boolean isExtraBoth = false;
  private boolean isbagPack = false;

  public int getPrice() {
    return this.price;
  }

  public void menu() {
    System.out.println("Do you want to add Anything..");
    System.out.println("1.Add extra Toppings");
    System.out.println("2.Add extra Cheese");
    System.out.println("3.Nothing!");
  }

  public void addToppings() {
    isExtraToppings = true;
    this.price += ExtraToppings;
    getPrice();
  }

  public void addCheese() {
    isExtraCheese = true;
    this.price += ExtraCheese;
    getPrice();
  }

  public void addToppingsWithCheese() {
    isExtraBoth = true;
    this.price += ExtraBoth;
    getPrice();
  }

  public void getAway(int bg) {
    if (bg == 1) {
      isbagPack = true;
      this.price += bagPack;
      getPrice();
    } else {
      getPrice();
    }
  }

  public void needExtra(int opt) {
    switch (opt) {
      case 1:
        addToppings();
        break;
      case 2:
        addCheese();
        break;
      case 3:
        break;
      case 4:
        System.out.println("Invalid");
    }
  }

  public void printBill() {
    System.out.println("THANKYOU!! for being our customer ..\n ");
    System.out.println("Pizza price :" + baseprice);
    if (isExtraToppings) {
      System.out.println("Add Toppings :" + ExtraToppings);
    }
    if (isExtraCheese) {
      System.out.println("Add Cheese :" + ExtraCheese);
    }
    if (isExtraBoth) {
      System.out.println("Delux pizza ExtraPrice :" + ExtraBoth);
    }
    if (isbagPack) {
      System.out.println("Add Delivery Charges :" + bagPack);
    }

    System.out.println("your total Billprice = " + this.price);
  }
}
