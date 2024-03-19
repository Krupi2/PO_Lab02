import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args){
        System.out.println("Podaj a");
        int wspolczynnikKierunkowy = inputInt();
        System.out.println("Podaj b");
        int b = inputInt();
        System.out.println("Podaj c");
        int c = inputInt();
        zadanie1(wspolczynnikKierunkowy,b,c);
        System.out.println("Podaj x do funkcji a(x)");
        double x_a = inputDouble();
        System.out.println(zadanie2_a(x_a));
        System.out.println("Podaj x do funkcji b(x)");
        double x_b = inputDouble();
        System.out.println(zadanie2_b(x_b));
        System.out.println("Podaj x do funkcji c(x)");
        double x_c = inputDouble();
        System.out.println(zadanie2_c(x_c));
        System.out.println("Podaj 1-szą liczbę do posortowania");
        int x = inputInt();
        System.out.println("Podaj 2-gą liczbę do posortowania");
        int y = inputInt();
        System.out.println("Podaj 3-cią liczbę do posortowania");
        int z = inputInt();
        zadanie3(x,y,z);
        System.out.println("Czy pada deszcz? (true/false)");
        boolean rain = inputBoolean();
        System.out.println("Czy jest autobus? (true/false)");
        boolean bus = inputBoolean();
        zadanie4(rain,bus);
        System.out.println("Czy otrzymałeś podwyżkę? (true/false)");
        boolean raise = inputBoolean();
        System.out.println("Czy jest zniżka na samochód? (true/false)");
        boolean discount = inputBoolean();
        zadanie5(raise,discount);
        System.out.println("Podaj operator działania (+ - * / %");
        String operator = inputChar();
        System.out.println("Podaj liczbę x");
        int x_6 = inputInt();
        System.out.println("Podaj liczbę y");
        int y_6 = inputInt();
        zadanie6(operator,x_6,y_6);

    }//koniec main
    public static int inputInt(){
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }
    public static double inputDouble(){
        Scanner scanner = new Scanner(System.in);
        double liczba = scanner.nextDouble();
        return liczba;
    }
    public static boolean inputBoolean() {
        Scanner scanner = new Scanner(System.in);
        boolean wartoscBoolean = scanner.nextBoolean();
        return wartoscBoolean;
    }

    public static String inputChar(){
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.next();
        return symbol;
    }
    public static void zadanie1(int a, int b, int c){
        int delta = (b*b)-(4*a*c);
        if (delta<0) {
            System.out.println("Równianie nie ma rozwiązań, delta wynosi "+delta);
        } else if (delta == 0){
            double x0 = -b/(2*a);
            System.out.println("Równanie ma jedno rozwiązanie, x0 = "+x0+", delta wynosi 0");
        } else {
            double sqrtOfDelta = Math.sqrt(delta);
            double x1 = (-b-sqrtOfDelta)/(2*a);
            double x2 = (-b+sqrtOfDelta)/(2*a);
            System.out.println("Równanie ma dwa rozwiązania, x1 = "+x1+", x2 = "+x2+", delta wynosi "+delta);
        }
    }
    public static double zadanie2_a(double x){
        if (x<0){
         return  -3*x;
        }
        else if (x==0){
            return 0;
        }
        else{
            return 2*x;
        }
    }
    public static double zadanie2_b(double x){
        if (x<1){
         return  x;
        }
        else {
         return (x*x);
        }
    }
    public static double zadanie2_c(double x){
        if (x<2){
         return  x-4;
        }
        else if (x==2){
            return 8;
        }
        else{
            return 2+x;
        }
    }
    public static void zadanie3(int frst, int scnd, int thrd){
        int tab[] = new int[3];
        tab[0] = frst;
        tab[1] = scnd;
        tab[2] = thrd;
        int temp;
        for (int j=0; j<3;j++) {
            for (int i = 0; i < 2; i++) {
                if (tab[i] > tab[i + 1]) {
                    temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                }
            }
        }
        System.out.println("Posortowane: "+tab[0]+" "+tab[1]+" "+tab[2]);
    }
    public static void zadanie4(boolean rain, boolean bus) {
        if (rain && bus) {
            System.out.println("Weź parasol");
            System.out.println("Dostaniesz się na uczelnie");
        } else if (rain && !bus) {
            System.out.println("Nie dostaniesz się na uczelnię");
        } else if (!rain && bus) {
            System.out.println("Dostaniesz się na uczelnię");
            System.out.println("Miłego dnia i pięknej pogody");
        }
    }
    public static void zadanie5(boolean raise, boolean discount) {
        if (raise || !discount) {
            System.out.println("Możesz kupić samochod!");
            System.out.println("Zniżki na samochód nie ma");
        } else if (!raise || !discount) {
            System.out.println("Zakup samochodu trzeba odłożyć na później");
            System.out.println("Zniżki na samochód nie ma");
        } else if (raise || discount) {
            System.out.println("Możesz kupić samochod!");
        }
    }

    public static void zadanie6(String operator, int x, int y){
        switch(operator){
            case "+":
                System.out.println(x+"+"+y+"="+(x+y));
                break;
            case "-":
                System.out.println(x+"-"+y+"="+(x-y));
                break;
            case "*":
                System.out.println(x+"*"+y+"="+(x*y));
                break;
            case "/":
                System.out.println(x+"/"+y+"="+(x/y));
                break;
            case "%":
                System.out.println(x+"%"+y+"="+(x%y));
                break;
        }
    }
}// koniec klasy