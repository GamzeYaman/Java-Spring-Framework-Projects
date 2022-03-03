import ServiceClass.Service;

public class Main {

    public static void main(String[] args) throws Exception {
        Service service1 = new Service();
        System.out.println("List of Home Types!");
        service1.getList();
        System.out.println("-----------------------------------");
        System.out.println("Sum of all type of homes' prices : " + service1.calculateSumOfAllTypeOfHomePrices() + "TL");
        service1.calculateSumOfHomePrice();
        System.out.println("-----------------------------------");
        System.out.println("Average of all type of homes' squaremeters : " + service1.calculateAverageAllTypeOfHomeSquaremeters() + "TL");
        service1.calculateAverageOfHomeSquaremeter();
        System.out.println("-----------------------------------");
        System.out.println("Filtering homes according to room nd hall numbers!");
        service1.filterHomeTypes();
        System.out.println("-----------------------------------");

    }
}
