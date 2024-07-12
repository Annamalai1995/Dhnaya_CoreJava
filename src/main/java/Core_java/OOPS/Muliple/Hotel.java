package Core_java.OOPS.Muliple;

public class  Hotel  extends  Meals implements Lunch,Morningtiffen,NightDinner{

    public static void main(String[] args) {
        Hotel hh  = new Hotel();
        hh.dinner();
        hh.lunch();
        hh.tiffen();
        hh.MealsLunch();

    }

    @Override
    public void lunch() {
        System.out.println("Meals of COmbo Price is 130 Rs");
    }

    @Override
    public void tiffen() {
        System.out.println("All type of Tiifens ANd Non veg Avaliable");

    }

    @Override
    public void dinner() {
        System.out.println("All types Of Dinner only Non vegs ");

    }
}
