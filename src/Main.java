import java.util.Locale;

public class Main {
    public static void main(String[] args){
        double i = 0;
        System.out.println("Pętle pierwsza while:");
        while (i <= 3.1){
            System.out.printf(Locale.ROOT, "%.1f\n", i);
            i += 0.1;
        }
        i = 0;
        System.out.println("Druga pętla (do while):");
        do{
            System.out.printf(Locale.ROOT, "%.1f\n", i);
            i += 0.1;

        }while (i <= 3.1);
    }
}
