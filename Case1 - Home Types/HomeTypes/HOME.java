package HomeTypes;

import java.util.ArrayList;
import java.util.List;

public class HOME {
    private int roomNumber;
    private int hallNumber;
    private int squareMeter;
    private int homePrice;

    private String cityName;
    private String districtName;
    private String neighborhoodName;
    private String homeType;


    private HOME(HomeBuilder builder){
        this.homeType = builder.homeType;
        this.roomNumber = builder.roomNumber;
        this.hallNumber = builder.hallNumber;
        this.squareMeter = builder.squareMeter;
        this.homePrice = builder.homePrice;
        this.cityName = builder.cityName;
        this.districtName = builder.districtName;
        this.neighborhoodName = builder.neighborhoodName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getHallNumber() {
        return hallNumber;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public int getHomePrice() {
        return homePrice;
    }

    public String getHomeType(){ return homeType; }

    public String getCityName() {
        return cityName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public String getNeighborhoodName() {
        return neighborhoodName;
    }

    public String printHomeFeatures(){
       return this.cityName + ", " + this.districtName + ", " + this.neighborhoodName + ", " +
                this.roomNumber + ", " + this.hallNumber + ", " + this.squareMeter + ", " + this.homePrice + ".";
    }

    public static class HomeBuilder{

        private int roomNumber;
        private int hallNumber;
        private int squareMeter;
        private int homePrice;

        private String cityName;
        private String districtName;
        private String neighborhoodName;
        private String homeType;

        public HomeBuilder roomNumber(int roomNumber){
            this.roomNumber = roomNumber;
            return this;
        }

        public HomeBuilder hallNumber(int hallNumber){
            this.hallNumber = hallNumber;
            return this;
        }

        public HomeBuilder squareMeter(int squareMeter){
            this.squareMeter = squareMeter;
            return this;
        }

        public HomeBuilder homePrice(int homePrice){
            this.homePrice = homePrice;
            return this;
        }

        public HomeBuilder cityName(String cityName){
            this.cityName = cityName;
            return this;
        }

        public HomeBuilder districtName(String districtName){
            this.districtName = districtName;
            return this;
        }

        public HomeBuilder neighborhoodName(String neighborhoodName){
            this.neighborhoodName = neighborhoodName;
            return this;
        }

        public HomeBuilder homeType(String homeType){
            this.homeType = homeType;
            return this;
        }

        public HOME buildHome(){
            HOME home = new HOME(this);
            return home;
        }
    }

}
