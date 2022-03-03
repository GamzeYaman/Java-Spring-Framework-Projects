package HomeTypes;

public class SummerHome extends HOME.HomeBuilder {

    private boolean hasGarden;
    public SummerHome(boolean hasGarden){
        super();
        this.hasGarden = hasGarden;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }
}
