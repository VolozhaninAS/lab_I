public class NumberIdentifier {
    private static String provRoman = "I II III IV V VI VII VIII IX X + - * /";
    private static String provArab = "1 2 3 4 5 6 7 8 9 10 + - * /";
    public static boolean isArabicNumber(String number){
        for(int i = 0; i < number.length(); i++){
            if(provArab.indexOf(number.charAt(i)) == -1){
                return false;
            }
        }
        return true;
    }
    public static boolean isRomanNumber(String number){
        for(int i = 0; i < number.length(); i++){
            if(provRoman.indexOf(number.charAt(i)) == -1){
                return false;
            }
        }
        return true;
    }
}
