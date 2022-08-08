package CoffeeShopWorkers;

import CoffeeShopAssortment.Accounting;
import CoffeeShopAssortment.Staff;
import Visitors.Visitor;

public abstract class Worker {
    String name;

    public Worker(String name) {
        this.name = name;
    }

    public void calculateClientBill(Accounting accounting, Visitor visitor) {
        accounting.revenue += visitor.score;
        visitor.score = 0;
    }
}
