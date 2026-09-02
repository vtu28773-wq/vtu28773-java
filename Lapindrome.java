import java.util.Scanner;

public class Lapindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String s = sc.nextLine().trim();
            int h = s.length() / 2;
            int[] f = new int[26];
            for (int i = 0; i < h; i++) f[s.charAt(i) - 'a']++;  
            // add first half counts
            for (int i = s.length() - h; i < s.length(); i++) f[s.charAt(i) - 'a']--; 
            // subtract second half counts
            boolean ok = true;
            for (int x : f) if (x != 0) ok = false;   
            // if any count nonzero, halves don't match
            System.out.println(ok ? "YES" : "NO");
        }
    }
}