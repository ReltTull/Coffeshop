package Visitors;

import CoffeeShopAssortment.Staff;
import CoffeeShopWorkers.Barista;

import java.util.ArrayList;

public abstract class Visitor {
    String name;
    public int score;

    public ArrayList<Staff> staffs;

    public Visitor(String name) {
        this.name = name;
        this.score = 0;
    }

    public void buyStaff(Staff staff) {
            score += staff.cost;
            this.staffs = new ArrayList<>();
        }

    public void getInfo() {
        System.out.println(this.name + ", score: " + score);
        }


}
