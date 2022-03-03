package HomeTypes;

public class Villa extends HOME.HomeBuilder {

    private int floorNumber;
    public Villa(int floorNumber){
        super();
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
