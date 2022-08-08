import CoffeeShopAssortment.Accounting;
import CoffeeShopAssortment.Americano;
import CoffeeShopAssortment.Cappuccino;
import CoffeeShopAssortment.Volumes;
import CoffeeShopWorkers.Barista;
import CoffeeShopWorkers.Worker;
import Visitors.DiscountVisitor;
import Visitors.RegularVisitor;

import static CoffeeShopAssortment.Volumes.LARGE;
import static CoffeeShopAssortment.Volumes.MEDIUM;

public class Program {
    public static void main(String[] args) {
        Accounting day1 = new Accounting();
        Barista ann = new Barista("Ann");
        RegularVisitor visitor = new RegularVisitor("Visitor");
        DiscountVisitor rory = new DiscountVisitor("Rory", 20);
        rory.buyStaff(new Cappuccino(150, MEDIUM));
        rory.getInfo();
        ann.prepareCoffee(new Cappuccino(150, MEDIUM), rory);
        rory.getInfo();

        System.out.println(day1.revenue);
    }
}
