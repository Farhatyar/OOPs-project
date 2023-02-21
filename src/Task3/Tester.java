package Task3;

public class Tester {
    public static void main(String[] args) {
        Car [] array={new Sedan(10000,"White",10),
                new Truck(20000,"Black",4500)};
        for (Car car:array){
            System.out.println(car.calculateSalePrice());
        }
    }
}
