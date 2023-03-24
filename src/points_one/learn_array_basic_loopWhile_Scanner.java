package points_one;
import java.util.Scanner;
public class learn_array_basic_loopWhile_Scanner {
    public static void main(String [] args) {
        Scanner set = new Scanner(System.in);
        int count = 0 , result = 0 , value; final int constant = 5;

        while (true) {
            System.out.print("input a integer than you need to x5 : ");
            value = set.nextInt();
            result = value*constant;

            System.out.print(value+" x "+constant+" equal "+result+"\n");
            if(value <= 0) break;
            count++;
        }
        System.out.print("loop works all "+count);

    }
}
