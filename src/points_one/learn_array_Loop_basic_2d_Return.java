package points_one;

class learn_array_Loop_basic_2d_Return {
    // # variable outside method we call attributes
    final private float [][]decimal = { // matrix 3x4
            {0.1f,0.12f,0.13f,0.14f}, // row one
            {0.21f,0.22f,0.23f,0.24f}, // row two
            {0.31f,0.32f,0.33f,0.34f}, // row three
    };
    private float [][]add_one_decimal = new float[3][4]; // should set size element always
    private float [][]get_decimal () { // we can clone array 2 d from this method
        return decimal;
    }
    private float[][]add_one_all_element_decimal () {

        for (int e_r = 0 ; e_r <= decimal.length-1 ; e_r++) { // rows [name array.length] it returns size row
            for (int e_c = 0 ; e_c <= decimal[e_r].length-1 ; e_c ++) { // column [name array[row].length] it returns size column
                add_one_decimal[e_r][e_c] = (decimal[e_r][e_c])+1;
            }
        }
        return add_one_decimal;

    }
    public float [][]public_get_decimal (){
        return decimal;
    }
    public static void main (String [] args) {
        learn_array_Loop_basic_2d_Return $obj_instance;
        float [][]cp_decimal , add_one_all_element_decimal;
        $obj_instance = new learn_array_Loop_basic_2d_Return();
        // into other class in folder
        cp_decimal = $obj_instance.get_decimal(); // default array 2 d
        add_one_all_element_decimal = $obj_instance.add_one_all_element_decimal(); // new a value array 2 d
//        System.out.println("default value cp_decimal[1][1] is "+cp_decimal[1][1]); // result 0.1
//        System.out.println("not set a value $obj_instance.add_one_decimal[1][1] is "+$obj_instance.add_one_decimal[1][1]); // when we don't set it will set default zero
//        $obj_instance.add_one_all_element_decimal(); // add 1 all element
//        System.out.println("add one all element by $obj_instance.add_one_decimal[1][1] is "+$obj_instance.add_one_decimal[1][1]); // result 1.1

    }

}

