import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner str_scan = new Scanner(System.in);
        while (true) {
            String number = str_scan.nextLine();
            if (NumberIdentifier.isArabicNumber(number)) {
                ArabicCalcs ar = new ArabicCalcs();
                ar.trancription(number);
                break;
            } else if (NumberIdentifier.isRomanNumber(number)) {
                RomanCalcs ar = new RomanCalcs();
                ar.trancription(number);
                break;
            } else {
                System.out.println("Неверный формат чисел");
            }
        }
    }
}
