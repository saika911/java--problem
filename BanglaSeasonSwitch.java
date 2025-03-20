import java.util.Scanner;

public class BanglaSeasonSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a month (1-12): ");
        int month = scanner.nextInt();
        
        String season;
        
        switch (month) {
            case 4:
            case 5:
                season = "(Grishmo)- Summer";
                break;
            case 6:
            case 7:
                season = "(Borsha)- Monsoon";
                break;
            case 8:
            case 9:
                season = "(Sharat)- Autumn";
                break;
            case 10:
            case 11:
                season = "(Hemanto)- Late Autumn";
                break;
            case 12:
            case 1:
                season = "(Sheet)- Winter";
                break;
            case 2:
            case 3:
                season = "(Bashonto)- Spring";
                break;
            default:
                season = "Invalid month";
                break;
        }
        
        System.out.println("The Bangla season is: " + season);
        
        scanner.close();
    }
}