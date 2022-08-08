package CoffeeShopAssortment;

public class Cappuccino extends Staff {
    Volumes volumes;
    public Cappuccino(int cost, Volumes volume) {
        super(cost);
        this.volumes = volume;
    }
}
