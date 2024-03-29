import java.util.*;

public class Coding {
    String wrd;
    int len;
    int min, max, temp;

    Coding() {
        wrd = " ";
        len = 0;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        wrd = sc.nextLine();
        len = wrd.length();
        System.out.println("Original Word : " + wrd);

    }

    void find() {
        for (int i = 0; i < len; i++) {
            char alpha = wrd.charAt(i);
            int ascii = (int) alpha;
            System.out.println(alpha + " = " + ascii);

            if (i < len - 1) {
                char tmax = wrd.charAt(i + 1);
                max = (int) tmax;
                char tmin = wrd.charAt(0);
                min = (int) tmin;
                temp = ascii;
                if (temp > max) {

                    max = temp;

                } else if (temp < min) {
                    min = temp;
                }

            }
        }
        System.out.println("Maximum Value of Ascii Code is : " + max);
        System.out.println("Minimum Value of Ascii Code is : " + min);

    }

    public static void main(String args[]) {
        Coding obj = new Coding();
        obj.accept();
        obj.find();
    }
}
