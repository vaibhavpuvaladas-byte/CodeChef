import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        while (T > 0) {

            int N = in.nextInt();
            String S = in.next();

            int Consonants = 0;
            boolean easy = true;

            for (int i = 0; i < N; i++) {

                char ch = S.charAt(i);

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {

                    Consonants = 0;

                } else {

                    Consonants++;
                }

                if (Consonants >= 4) {
                    easy = false;
                    break;
                }
            }

            if (easy) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            T--;
        }

        in.close();
    }
}