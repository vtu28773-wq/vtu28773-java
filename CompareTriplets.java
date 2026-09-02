import java.util.Scanner;

public class CompareTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = new int[3];
        // read Alice's ratings
        for (int i = 0; i < 3; i++) a[i] = sc.nextInt(); 
         // read Bob's ratings
        for (int i = 0; i < 3; i++) b[i] = sc.nextInt();  
        int aliceScore = 0, bobScore = 0;

        for (int i = 0; i < 3; i++) {
            // Alice scores if her rating is higher
            if (a[i] > b[i]) aliceScore++;        
             // Bob scores if his rating is higher
            else if (a[i] < b[i]) bobScore++;    
        }

        System.out.println(aliceScore + " " + bobScore);  

        sc.close();
    }
}