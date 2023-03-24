package points_one;

// in the Java we can call to class other page
public class learn_array_Loop_basic_2d_Return_split {
    private float sigma = 0; // เก็บผลลัพธ์ของ [][]decimal
    learn_array_Loop_basic_2d_Return $obj = new learn_array_Loop_basic_2d_Return(); // have to create object ของ class ที่ต้องการใช้

    private float calculate_decimal () { // can call to private variable other page
        float [][]cp_decimal = $obj.public_get_decimal();
        for(int e_r = 0 ; e_r < cp_decimal.length; e_r++) {
            for (int e_c = 0 ; e_c < cp_decimal[e_r].length ; e_c++) {
                sigma += cp_decimal[e_r][e_c];
            } // into column
        } // into row
        return sigma;
    }

    protected static void show_value_decimal (float[][]decimal) { // static we call it โดยไม่จำเป็น create object

        for (int e_r = 0; e_r < decimal.length; e_r++) {
        System.out.print("{");
            for (int e_c = 0; e_c < decimal[e_r].length ; e_c++) {
                System.out.print(decimal[e_r][e_c]);
                if(e_c == decimal[e_r].length-1) {
                    System.out.print("}\n");
                    break;
                } // condition
                System.out.print(",");
            } // for column
        } // for row

    }

    public static void main (String [] args) {
        learn_array_Loop_basic_2d_Return_split $obj_here = new learn_array_Loop_basic_2d_Return_split();
        System.out.println("sigma of [][]decimal in other page is "+$obj_here.calculate_decimal());
        show_value_decimal($obj_here.$obj.public_get_decimal());
        // object outside method we can call it
        // froms object in method than using (.)
    }
}
