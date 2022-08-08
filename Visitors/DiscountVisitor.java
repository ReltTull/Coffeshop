package Visitors;

import java.util.ArrayList;

import CoffeeShopAssortment.Staff;


public class DiscountVisitor extends Visitor{
    int discount;
    int coef = 1 - (discount / 100);


    public DiscountVisitor(String name, int discount) {
        super(name);
        this.discount = discount;
    }

    @Override
    public void buyStaff(Staff staff) {
        score += staff.cost * coef;
        this.staffs = new ArrayList<>();
    }

    @Override
    public void getInfo() {
        super.getInfo();
    }
}
