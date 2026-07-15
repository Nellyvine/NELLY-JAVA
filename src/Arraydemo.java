import java.util.Arrays;

public class Arraydemo {
    public static void main(String[] args) {
        String[] names = {"Chronix","Kigali","Africa"};

        System.out.println(names[1]);
        names[1] = "Burna Boy";
        System.out.println(names[1]);
        System.out.println(names.length);

        for(int i=0;i<names.length;i++){
            System.out.println(i + " " + names[i]);
            System.out.println();
        }
    }
}
