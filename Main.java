package projectOfJava.pizzaStore;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("WELCOME IN PIZZA STORE !!!!!!!!!!!!!!!!");

    System.out.println("Do You Want :- \n 1. Regular Pizza \n 2. delux Pizza");
    int whichPizza = sc.nextInt();

    System.out.println("Do You Want :- \n  1. Veg Pizza \n 2. Non-veg Pizza");
    int choice = sc.nextInt();

    if (whichPizza == 1) {
      pizza base = new pizza(choice);
      base.menu();

      int option = sc.nextInt();
      base.needExtra(option);

      System.out.println("Do you Take Away the Order \n 1. Yes \n 2. No");
      int deliveryOfOrder = sc.nextInt();
      base.getAway(deliveryOfOrder);

      base.printBill();
    } else if (whichPizza == 2) {
      deluxPizza dp = new deluxPizza(choice);

      System.out.println("Do you Take Away the Order \n 1. Yes \n 2. No");
      int deliveryOfOrder = sc.nextInt();
      dp.getAway(deliveryOfOrder);

      dp.printBill();
    }

    sc.close();
  }
}
