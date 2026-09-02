import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        // trim removes the spaces

        String period = s.substring(8);          // AM or PM
        int hour = Integer.parseInt(s.substring(0, 2));
        String rest = s.substring(2, 8);          // :MM:SS

        if (period.equals("AM")) {
            if (hour == 12) hour = 0;             // 12AM -> 00
        } else {
            if (hour != 12) hour += 12;            // PM, except 12PM stays 12
        }

        String result = String.format("%02d", hour) + rest;
        System.out.println(result);

        sc.close();
    }
}