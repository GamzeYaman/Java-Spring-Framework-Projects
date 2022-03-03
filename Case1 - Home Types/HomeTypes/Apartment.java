package HomeTypes;

import java.util.ArrayList;

public class Apartment extends HOME.HomeBuilder {

    private int inWhichFloor;
    public Apartment(int inWhichFloor){
        super();
        this.inWhichFloor = inWhichFloor;
    }

    public int getInWhichFloor() {
        return inWhichFloor;
    }
}
