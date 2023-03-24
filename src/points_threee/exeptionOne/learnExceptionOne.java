package points_threee.exeptionOne;

import points_one_two.Child;

import java.util.InputMismatchException;
import java.util.Scanner;

public class learnExceptionOne {
    private int []index = new int[3];
    private int number;

    public static void main(String[] args) {

        learnExceptionOne one = new learnExceptionOne();
        /*
        one.setValueArray(9);
        one.getValueArray();
        */
        one.setNumber();


    }
    protected Class finding() {
            try {

                // return Class.forName("com.mysql.jdbc.Driver");
                return Class.forName("points_one_two.Child");

            } catch (ClassNotFoundException mess) { /* catch has more than one */

                System.out.println("some Class didn't has..."+mess);

            }
            return null;
    }

    protected void setValueArray(int size) {
        try {

            for (int e = 0; e <= size ; e++) {
                this.index[e] = e*100;
            }

        } catch (ArrayIndexOutOfBoundsException mess) {
            System.out.println("some Size of Array is wrong..."+mess);
        }
    }

    protected void getValueArray() {
        for (int e = 0; e <= index.length-1 ; e++) {
            System.out.println(this.index[e]);
        }
    }

    protected void setNumber() {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.print("?: ");
            this.number = scanner.nextInt();

        } catch (InputMismatchException mess) {
            System.out.println("some value doesn't match..."+mess);
            /* setNumber(); */
        } catch (Exception mess) {
            /* all exception is had an object
            *  when you don't have idea to find some Exception
            *  using Exception */
            System.out.println("All Exception , I catch it!..."+mess.getMessage());
                                                        //* getMessage() == not show some Exception
        }

        System.out.println("ended method");
    }
}
