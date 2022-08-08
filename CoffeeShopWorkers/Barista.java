package CoffeeShopWorkers;

import CoffeeShopAssortment.Staff;
import Visitors.Visitor;

public class Barista extends Worker{
    public Barista(String name) {
        super(name);
    }


    public void prepareCoffee(Staff order, Visitor visitor) {
        visitor.staffs.add(order);
    }
}
