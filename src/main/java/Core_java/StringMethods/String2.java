package Core_java.StringMethods;

public class String2 {
    public static void main(String[] args) {
        String a="Annamalai";
        String a1="Annamalai";//literal
        String a2=new String("Annamalai");// non literal
        String a3="kumar";
        System.out.println(a.equals(a1));
        System.out.println(a2.equals(a1));
        System.out.println(a.equalsIgnoreCase(a1));
        System.out.println(a==a1);
        System.out.println(a.compareTo(a1));
        System.out.println(a.length());
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());


    }
}
