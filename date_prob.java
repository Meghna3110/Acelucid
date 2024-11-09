
import java.util.Scanner;

public class date_prob {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to search for dates in MMDDYYYY format: ");
        String input = scanner.nextLine();
      

        findValidDate(input);
        
        scanner.close();
    }

    public static void findValidDate(String input) {
        int ctr =0;
        int length = input.length();
        for (int i = 0; i <= length - 8; i++) {
            boolean isDate = true;

            for (int j = 0; j < 8; j++) {
                char ch = input.charAt(i + j);
                if (ch < '0' || ch > '9') { 
                    isDate = false;
                    break;
                }
                
            }

            if (isDate) {
                int month = (input.charAt(i) - '0') * 10 + (input.charAt(i + 1) - '0');
                int day = (input.charAt(i + 2) - '0') * 10 + (input.charAt(i + 3) - '0');
                int year = (input.charAt(i + 4) - '0') * 1000 + (input.charAt(i + 5) - '0') * 100
                        + (input.charAt(i + 6) - '0') * 10 + (input.charAt(i + 7) - '0');

                if (isValidDate(month, day, year)) {
                    System.out.print("Found valid date: ");
                    ctr++;
                    for (int j = 0; j < 8; j++) {
                        System.out.print(input.charAt(i + j));
                    }
                    System.out.println();
                }
                
            }
    
            
        }
        if(ctr==0)
        {
            System.out.println("No valid date found");
        }
    }
    private static boolean isValidDate(int month, int day, int year) {
        if (month < 1 || month > 12) return false;
        
        int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return day >= 1 && day <= daysInMonth[month - 1];
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 != 0) return false;
        if (year % 100 != 0) return true;
        return year % 400 == 0;
    }
}
