import java.util.*;
//Main part : if throughout the process the value of number becomes 
//1-- then it is a happy number
//4-- then it is not a happy number

//instance valiables
// cnumber for storing the number
// sum for storing the number after sqauring its digits
// tnumber for temporary storing the number / a temporary variable
// temp for the same as tnumber
public class happy {
    int cnumber;
    int sum = 0;
    static int tnumber=1;
    static int temp = 0;
    // data memebers/ methods
    // happy(int x) for giving the value of enetered number to cnumber
    // int recursion(int x) for the recusrion part and the sqaring of digits
    // void thetruth() for the checking of returned value on the basis of 4 and 1 and for displayong the result

    happy(int dnumber) {
        cnumber = dnumber;
    }

    int recursion(int onumber) {

        if (tnumber > 0) {
            int fdigit = onumber % 10;
            sum += fdigit * fdigit;
            System.out.println(sum);
            tnumber = onumber / 10;
            if (tnumber != 0) {
                recursion(tnumber);
            }

            if (sum == 4 || sum == 1)
                temp++;

        }
        if (tnumber == 0 && temp == 0 && sum > 0) {
            tnumber=sum;
            sum=0;
            recursion(tnumber);
        }

        return sum;

    }

    void thetruth() {
        if (cnumber != 1 && cnumber != 4) {
            int result = recursion(cnumber);
            if (result == 1) {
                System.out.println("Enetred number is a happy number");
            } else {
                System.out.println("Entered number is not a happy number");
            }
        } else {
            if (cnumber == 1) {
                System.out.println("Enetred number is a happy number");
            } else {
                System.out.println("Entered number is not a happy number");
            }

        }

    }
// Main method for enetering the number and the calling of constructor and other methods
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();// Contains the number on which operations are to be executed
        happy object = new happy(number);
        object.thetruth();

    }
}
