package CoffeeShopAssortment;

public class Americano extends Staff {
    Volumes volumes;
    public Americano(int cost, Volumes volume) {
        super(cost);
        this.volumes = volume;
    }

}
