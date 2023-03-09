import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Wine {
    private String type;
    private String name;
    private String brand;
    private  String country;
    private LocalDate dateOfMade;

    public Wine(String type, String name, String brand, String country, LocalDate dateOfMade) {
        this.type = type;
        this.name = name;
        this.brand = brand;
        this.country = country;
        this.dateOfMade = dateOfMade;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDateOfMade() {
        return dateOfMade;
    }

    public void setDateOfMade(LocalDate dateOfMade) {
        this.dateOfMade = dateOfMade;
    }
    public void dateOfMade(LocalDate date){
        Date date1 = new Date();
        System.out.println(date1);
        System.out.println("Год эксплуатации");
        System.out.println(Period.between(dateOfMade,LocalDate.now()).getYears()+"-Жыл");
    }
    @Override
    public String toString() {
        return "Wine: " +"\n"+
                "type: " + type + "\n"+
                "name: " + name + "\n"+
                "brand: " + brand + "\n"+
                "country: " + country + "\n"+
                "dateOfMade: " + dateOfMade ;
    }
}
