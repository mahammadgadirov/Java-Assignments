import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit = sc.nextDouble(), centigrade;
        centigrade = (fahrenheit - 32) * 5 / 9;
        System.out.println(centigrade);
    }
}