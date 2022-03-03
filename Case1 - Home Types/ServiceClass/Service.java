package ServiceClass;

import HomeTypes.Apartment;
import HomeTypes.HOME;
import HomeTypes.SummerHome;
import HomeTypes.Villa;

import java.util.*;

public class Service implements IService{

    // Apartment Instances
    HOME apartment1 =  new Apartment(8 ).homeType("Apartment").cityName("Ankara").districtName("Pursaklar")
            .neighborhoodName("Fatih Mahallesi").squareMeter(130).roomNumber(3).hallNumber(1).homePrice(300_000)
            .buildHome();

    HOME apartment2 =  new Apartment(3).homeType("Apartment").cityName("Samsun").districtName("Vezirköprü")
            .neighborhoodName("İncesu Mahallesi").squareMeter(120).roomNumber(3).hallNumber(1).homePrice(290_000)
            .buildHome();

    HOME apartment3 =  new Apartment(2).homeType("Apartment").cityName("Gümüşhane").districtName("Şiran")
            .neighborhoodName("Akçalı Mahallesi").squareMeter(150).roomNumber(2).hallNumber(1).homePrice(250_000)
            .buildHome();

    // Villa Instances
    HOME villa1 =  new Villa(3).homeType("Villa").cityName("Muğla").districtName("Bodrum")
            .squareMeter(350).roomNumber(7).hallNumber(1).homePrice(650_000)
            .buildHome();

    HOME villa2 =  new Villa(2).homeType("Villa").cityName("Aydın").districtName("Kuşadası")
            .squareMeter(270).roomNumber(5).hallNumber(2).homePrice(470_000)
            .buildHome();

    HOME villa3 =  new Villa(3).homeType("Villa").cityName("Antalya").districtName("Alanya")
            .squareMeter(300).roomNumber(6).hallNumber(2).homePrice(590_000)
            .buildHome();

    //Summer Home Instances
    HOME summerHome1 =  new SummerHome(true).homeType("Summer Home").cityName("Antalya").districtName("Alanya")
            .squareMeter(150).roomNumber(3).hallNumber(1).homePrice(200_000)
            .buildHome();

    HOME summerHome2 =  new SummerHome(true).homeType("Summer Home").cityName("Rize").districtName("Hemşin")
            .squareMeter(120).roomNumber(2).hallNumber(1).homePrice(170_000)
            .buildHome();

    HOME summerHome3 =  new SummerHome(true).homeType("Summer Home").cityName("Çanakkale").districtName("Eceabat")
            .squareMeter(230).roomNumber(4).hallNumber(2).homePrice(510_000)
            .buildHome();


    ArrayList<HOME> apartmentSet = new ArrayList<>();
    public void addApartmentList(){
        apartmentSet.add(apartment1);
        apartmentSet.add(apartment2);
        apartmentSet.add(apartment3);
    }

    ArrayList<HOME> villaSet = new ArrayList<>();
    public void addVillaList(){
        villaSet.add(villa1);
        villaSet.add(villa2);
        villaSet.add(villa3);
    }

    ArrayList<HOME> summerHomeSet = new ArrayList<>();
    public void addSummerHomeList(){
        summerHomeSet.add(summerHome1);
        summerHomeSet.add(summerHome2);
        summerHomeSet.add(summerHome3);

    }

    Scanner scan = new Scanner(System.in);
    String hometype1 = "apartment";
    String hometype2 = "villa";
    String hometype3 = "summerhome";
    String selectHomeType;

    public void selectHomeType(){
        System.out.println("Home Types: \n" + "Apartment, " + "Villa, " + "SummerHome");
        System.out.print("Select the home type in order to search : ");
        selectHomeType = scan.next();
    }

    @Override
    public void getList() throws Exception {
        selectHomeType();
         if(selectHomeType.toLowerCase().equals(hometype1)){
             System.out.println("Apartments List >>>");
             addApartmentList();
             int j = 1;
             for(HOME i : apartmentSet){
                 System.out.println("Apartment"+ j + ">>>" + i.printHomeFeatures());
                 j++;
             }

         }else if(selectHomeType.toLowerCase().equals(hometype2)){
            System.out.println("Villas List >>>");
            addVillaList();
             int j = 1;
             for(HOME i : villaSet){
                 System.out.println("Villa"+ j + ">>>" + i.printHomeFeatures());
                 j++;
             }
        }else if(selectHomeType.toLowerCase().equals(hometype3)){
             System.out.println("Summerhomes List >>>");
             addSummerHomeList();
             int j = 1;
             for(HOME i : summerHomeSet){
                 System.out.println("SummerHome"+ j + ">>>" + i.printHomeFeatures());
                 j++;
             }
         }else{
             throw new Exception("Invalid Process!");
         }
    }

    @Override
    public void calculateSumOfHomePrice(){
        selectHomeType();
        int sum = 0;
        if(selectHomeType.toLowerCase().equals(hometype1)){
            addApartmentList();
            for (int i = 0; i < apartmentSet.size(); i++) {
                sum += apartmentSet.get(i).getHomePrice();
            }
        }else if(selectHomeType.toLowerCase().equals(hometype2)){
            addVillaList();
            for (int i = 0; i < villaSet.size(); i++) {
                sum += villaSet.get(i).getHomePrice();
            }
        }else if(selectHomeType.toLowerCase().equals(hometype3)) {
            addSummerHomeList();
            for (int i = 0; i < summerHomeSet.size(); i++) {
                sum += summerHomeSet.get(i).getHomePrice();
            }
        }
        System.out.println("Sum of the home prices includes " + selectHomeType + " : " + sum +"TL");
        System.out.println("-----------------------------------");
    }
    public int calculateSumOfAllTypeOfHomePrices(){
        return apartment1.getHomePrice() + apartment2.getHomePrice() + apartment3.getHomePrice()
                + villa1.getHomePrice() + villa2.getHomePrice() + summerHome1.getHomePrice() + summerHome2.getHomePrice();
    }

    @Override
    public void calculateAverageOfHomeSquaremeter(){
        selectHomeType();
        int sum = 0;
        double average;
        if(selectHomeType.toLowerCase().equals(hometype1)){
            addApartmentList();
            for(HOME i : apartmentSet){
                sum += i.getSquareMeter();
            }
        }else if(selectHomeType.toLowerCase().equals(hometype2)){
            addVillaList();
            for(HOME i : villaSet){
                sum += i.getSquareMeter();
            }
        }else if(selectHomeType.toLowerCase().equals(hometype3)) {
            addSummerHomeList();
            for (HOME i : summerHomeSet) {
                sum += i.getSquareMeter();
            }
        }
        average = sum / 3;
        System.out.println("Average of the squaremeter includes " + selectHomeType + " : " + Math.round(average));
        System.out.println("-----------------------------------");

    }
    public double calculateAverageAllTypeOfHomeSquaremeters(){
        return ( apartment1.getSquareMeter() + apartment2.getSquareMeter() + apartment3.getSquareMeter()
                + villa1.getSquareMeter() + villa2.getSquareMeter() + summerHome1.getSquareMeter() + summerHome2.getSquareMeter() ) / 9 ;
    }

    public void filterHomeTypes() throws Exception {
        selectHomeType();
        System.out.print("Enter room number : ");
        int roomNumber = scan.nextInt();
        System.out.print("Enter hall number : ");
        int hallNumber = scan.nextInt();

        if(roomNumber < 0 || hallNumber < 0){
            throw new Exception("Numbers cannot be negative!");
        }else{
            if(selectHomeType.toLowerCase().equals(hometype1)){
                addApartmentList();
                System.out.println("Apartments List >>>");
                for(HOME i : apartmentSet){
                    if(i.getRoomNumber() == roomNumber && i.getHallNumber() == hallNumber){
                        System.out.println(i.printHomeFeatures());
                    };
                }
            }else if(selectHomeType.toLowerCase().equals(hometype2)){
                addVillaList();
                System.out.println("Villas List >>>");
                for(HOME j : villaSet){
                    if(j.getRoomNumber() == roomNumber && j.getHallNumber() == hallNumber){
                        System.out.println(j.printHomeFeatures());
                    };
                }
            }else if(selectHomeType.toLowerCase().equals(hometype3)) {
                addSummerHomeList();
                System.out.println("Summer homes List >>>");
                for(HOME x : summerHomeSet){
                    if(x.getRoomNumber() == roomNumber && x.getHallNumber() == hallNumber){
                        System.out.println(x.printHomeFeatures());
                    };
                }
            }
        }
    }

}
