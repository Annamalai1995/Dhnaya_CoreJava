package Core_java.Operator;

public class Logical {
    public static void main(String[] args) {
        String place="yercaud";
        String place1="Manali";
        String place2="Manali";
        int encoder=45;
        int decoder=10;
        int encounter=10;
        System.out.println((place==place2)&&(place1==place2));
        System.out.println((encoder>=decoder)||(decoder<=encounter));
        System.out.println(!(encoder==decoder));
        System.out.println(!(decoder==encounter));
    }
}
