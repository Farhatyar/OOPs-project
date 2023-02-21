package Task2;

public class Tester {
    public static void main(String[] args) {
        Marks []Students={new StudentA(95,85,74),
        new StudentB(90,87,96,98)};
        for (Marks student:Students){
            System.out.println(student.getPercentage()+" %");

        }
    }
}
