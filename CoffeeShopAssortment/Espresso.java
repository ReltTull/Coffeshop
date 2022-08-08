package CoffeeShopAssortment;

public class Espresso extends Staff {
    Volumes volumes;
    public Espresso(int cost) {
        super(cost);
        this.volumes = Volumes.SHOT;
    }
}
