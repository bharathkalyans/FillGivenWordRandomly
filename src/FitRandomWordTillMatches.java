import java.util.Random;
import java.util.Scanner;

public class FitRandomWordTillMatches {


    private static void matchTheGivenWord(String word) {

        int n=word.length();
        int count=0;
        Random r=new Random(33);
        //33 --> !
        //126 --> ~

        StringBuilder sb=new StringBuilder();
        do {
            int c = r.nextInt(126);
            char cc = (char) c;
            if (cc == word.charAt(count)) {
                count++;
                sb.append(cc);
                System.out.println(sb);
            }

        } while (count != n || !sb.toString().equals(word));
        System.out.println("Finally :: the word is ::  "+sb);

    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Word! :");
        matchTheGivenWord(sc.nextLine().toLowerCase());


    }
}
