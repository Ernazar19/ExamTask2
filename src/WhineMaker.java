import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class WhineMaker implements  NewWine{
    private  Wine[]wines;
    private int workExperience;
    private String workAddress;

    public WhineMaker(Wine[] wines, int workExperience, String workAddress) {
        this.wines = wines;
        this.workExperience = workExperience;
        this.workAddress = workAddress;
    }

    public Wine[] getWines() {
        return wines;
    }

    public void setWines(Wine[] wines) {
        this.wines = wines;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    @Override
    public Wine newWine(Wine[] wines) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("~~~~New wine type~~~~");
        String type= scanner.next();
        System.out.println("~~~~New wine name~~~~");
        String name = scanner.next();
        System.out.println("~~~~Brand~~~~");
        String brand = scanner.next();
        System.out.println("~~~~Country of production wine~~~~");
        String country = scanner.next();
        System.out.println("~~~~date?~~~~");
       LocalDate date1=LocalDate.of(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt());
       Wine wine = new Wine(type,name,brand,country,date1);
       return wine;
    }
    @Override
    public String toString() {
        return "WhineMaker: " +"\n"+
                "wines: " + Arrays.toString(wines) +"\n"+
                "workExperience: " + workExperience +"\n"+
                "workAddress: " + workAddress;
    }
}
