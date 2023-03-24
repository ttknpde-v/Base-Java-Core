package points_one;

public class learn_array_Loop_basic_Algorithm_Return {

    public static void main (String[] args) {
        learn_array_Loop_basic_Algorithm_Return Obj_1 = new learn_array_Loop_basic_Algorithm_Return();
        int []check_group_number = Obj_1.group_number();
        int []min_and_max_of_group_number = minimum_and_maximum(check_group_number);
//        System.out.println("this is a maximum in array "+search_max_value(check_group_number)); //
        System.out.println("this minimum value is "+min_and_max_of_group_number[0]+"\n"+"this maximum value is "+min_and_max_of_group_number[1]);
    }
    private int []group_number () {
        int []group_number = {
          2 , 4 , 8 ,16 ,32 ,64 ,128 , 256
        }; // 6 element
        return group_number;
    }

    static int search_max_value (int []group_number) { // static can call by not thing object
        int hold = group_number[0];
        for (int e = 0 ; e <= group_number.length-1 ; e++ ) {
            if (hold < group_number[e]) {
                hold = group_number[e];
            } // condition
        }
        return hold;
    }

    static int []minimum_and_maximum (int []group_number) {
        int []min_and_max = new int[2];
        int min = group_number[0]; // find minimum number
        int max = group_number[0];

        for (int e = 0 ; e < group_number.length ; e++) {
            if(min > group_number[e]) {
                min = group_number[e];
            }
            if(max < group_number[e]) {
                max = group_number[e];
            }
        } // end
        min_and_max[0] = min;
        min_and_max[1] = max;
        return min_and_max;
    }
}
