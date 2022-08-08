package Visitors;

import CoffeeShopAssortment.Staff;

import java.util.ArrayList;

public class RegularVisitor extends Visitor{

    public RegularVisitor(String name) {
        super(name);
    }

    @Override
    public void buyStaff(Staff staff) {
        super.buyStaff(staff);
    }

    @Override
    public void getInfo() {
        super.getInfo();
    }
}
