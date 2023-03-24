package points_one;

public class learn_loop {
    public static void main(String [] args) {
        int[] group_number = {
                10 ,20 ,30 ,40
        };

        System.out.print("group_number have = ");
        // print + ln == new line
        display_array(group_number);

    }

   static void display_array (int... fx) { // method
        // static เข้าถึงได้ทุก method
        for (int i = 0 ; i < fx.length ; i++) {
            System.out.print(fx[i]);
            if(i == 2) {    break;  }
            System.out.print(",");
        }

    }
}
