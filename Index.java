import java.util.*;

public class Index {
    public static void main(String args[]) {
        int exit = 0;
        int j = 1;
        int i = 1;
        int z = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("|   |  |---  |     |---  |---|  |-  -|  |---");
        System.out.println("| | |  |--   |     |     |   |  | -- |  |-");
        System.out.println("|_|_|  |---  |___  |---  |---|  |    |  |---");
        System.out.println("                 -----  |---|");
        System.out.println("                   |    |   |");
        System.out.println("                   |    |---|");
        System.out.println("");
        System.out.println("       -----   |-  |     |  |--  - / ");
        System.out.println("         |     | - |  |--|  |--   X  ");
        System.out.println("       _____   |  -|  |--|  |--  /  -");
        System.out.println("");
        System.out.println("                                            ~HarshitSharma");

        while (i > 0) {
            j = 1;
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("\t" + "Choose The Type Of Operation");
            System.out.println("");
            System.out.println("\t" + "1) Opertations on 'Numbers'");
            System.out.println("\t" + "2) Operations on 'String' / 'Characters");
            System.out.println("\t" + "3) Operations on 'Matrices'");
            System.out.println("\t" + "4) For exit press 0");
            System.out.println("");
            System.out.print("Input : ");
            int operations = sc.nextInt();
            System.out.println("");
            System.out.println("");
            if (operations == 0) {
                break;
            }

            if (operations == 1) {

                while (j > 0) {

                    System.out.println("Programs Avaliable : ");
                    System.out.println("");
                    System.out.println("1) Happy Number");
                    System.out.println("");

                    System.out.print("Input : ");
                    int program = sc.nextInt();
                    System.out.println("");
                    System.out.println("");

                    if (program == 1) {

                        System.out.print("Enter a number : ");
                        System.out.println(" ");
                        int number = sc.nextInt();
                        happy prog = new happy(number);
                        prog.recursion(happy.cnumber);
                        prog.thetruth();
                        System.out.println(" ");
                        System.out.println(" ");
                        
                    }
                    System.out.println("For Programs Menu Press  1");
                        System.out.println(" ");
                        System.out.println("For Main Menu Press 2 ");
                        System.out.println(" ");
                        System.out.println("For Exiting Press 0 ");
                        System.out.println(" ");
                        System.out.print("Input :  ");
                        int choice = sc.nextInt();
                        if (choice == 1) {
                            j = 1;
                        }
                        if (choice == 2) {
                            i = 1;
                            j = 0;
                            ;
                        }
                        if (choice == 0) {
                            i = 0;
                            j = 0;
                        }


                }
            }
            if(operations == 2)
            {
                while (z > 0) {

                    System.out.println("Programs Avaliable : ");
                    System.out.println("");
                    System.out.println("1) Coding : For Ascii Code");
                    System.out.println("");
                    System.out.print("Input : ");
                    int program = sc.nextInt();
                    System.out.println("");
                    System.out.println("");

                    if (program == 1) {

                        Coding code = new Coding();
                        code.accept();
                        code.find();
                        System.out.println(" ");
                        System.out.println(" ");
                        
                    }
                    System.out.println("For Programs Menu Press  1");
                        System.out.println(" ");
                        System.out.println("For Main Menu Press 2 ");
                        System.out.println(" ");
                        System.out.println("For Exiting Press 0 ");
                        System.out.println(" ");
                        System.out.print("Input :  ");
                        int choose = sc.nextInt();
                        if (choose == 1) {
                            z = 1;
                        }
                        if (choose == 2) {
                            i = 1;
                            z = 0;
                            ;
                        }
                        if (choose == 0) {
                            i = 0;
                            z = 0;
                        }
            }
        }
    }
}
}
