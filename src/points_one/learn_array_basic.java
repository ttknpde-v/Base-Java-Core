package points_one;

public class learn_array_basic {
    public static void main (String [] args) {
        // double a = 123.123d; double b = 123.123;  same values

        final int []group_age = {
          5 , 20 , 30 , 40
        } ;

        int []arr = new int[10]; // right is in [...lange of index...]

          learn_array_basic obj = new learn_array_basic(); // create object instant
//          obj.set_array(arr);
//          obj.set_array(group_age[0]);
          set_array();

    }

    public void set_array (int []lx) { // asses by obj

//         int []group_num = {n};

         for (int i = 0 ; i < lx.length ; i ++) {

             lx[i] = i;
             System.out.print(lx[i]);

             if(i == lx.length-1) {
                 System.out.print("\n");
                 break;
             }
             System.out.print(",");

         }

    }

    void set_array (int n) {

        int []arr = new int[n];

        for (int count = 0 ; count <= n-1 ; count++) {

            arr[count] = count*count;
            System.out.print(arr[count]);

            if(count == n-1) {
                System.out.println();
                break;
            }
            System.out.print("->");
        }

    }


    static void set_array () {
        //  a static method it can be accessed without creating an object
        String []arr = new String[5];
        int count = 0;

        for(;count < arr.length; count++) {
            arr[count] = "I'm "+count+" year old!";
            System.out.println(arr[count]);
        }

    }
}
