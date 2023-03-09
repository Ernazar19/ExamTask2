import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Wine wine1 = new Wine("White and dry","Chardonnay","CANTI"
                ,"Italy", LocalDate.of(1995,10,21));
        Wine wine2  = new Wine("White and dry ","Corton Charlemegne Grand Cru", "Bonneau du Martray ",
                                "France", LocalDate.of(1997,5,1));
        Wine wine3 =new Wine("Red","Savigny Les Beaune","Leroy",
                "France",LocalDate.of(1983,8,11));
        Wine wine4 =new Wine("Red","Tempranillo Art Collection","Gurpergui",
                "Spain", LocalDate.of(2021,9,3));
        Wine[]wines = {wine1,wine2,wine3,wine4};
        WhineMaker wineMaker=new WhineMaker(wines,9,"France");
        wines[0]=wineMaker.newWine(wines);
        System.out.println(wineMaker);


    }
}