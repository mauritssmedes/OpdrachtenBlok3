package opdracht1;
import java.util.stream.IntStream;

public class main {
    public static void main(String[] args) {
    ForLoop();
    WhileLoop();
    RandomNumbers();
    Optellen();
    ZaagTandPatroon();
    }

    public static void ForLoop() {
        int[] nummers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int item : nummers) {
            System.out.println(item);
        }
    }

    public static void WhileLoop() {
        int a = 1;
        while(a < 11){
            System.out.println(a);
            a++;
        }
    }

    public static void RandomNumbers() {
        int a = 0;
        while(a<11){
            System.out.println(Math.random());
            a++;
        }
    }

    public static void Optellen() {
        int a = 1;
        int b = 0;
        while(a < 41){
            System.out.println(b);
            b = b + a;
            a++;
        }
    }

    public static void ZaagTandPatroon() {
        int a = 0;
        while(a < 20){
            if(a % 2 == 0)
                System.out.println("s");
            else
                System.out.println("ss");
            a++;
        }
    }
}