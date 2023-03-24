package points_one;
import java.util.Scanner;
public class learn_array_basic_loopFor_Return {
    public static void main (String [] args) {
        Scanner get = new Scanner(System.in);
        learn_array_basic_loopFor_Return Obj_1 = new learn_array_basic_loopFor_Return();

        String [][]check_employee;
        float []check_weight_animal;
        check_employee = Obj_1.employee();
        check_weight_animal = Obj_1.weight();
//        Obj_1.show_array_employee(check_employee);
//        Obj_1.show_array_weight(check_weight_animal);


    }

    protected void test_array_1 () {
        String []cpu = new String[5]; // book an area 4 element

        for (int e = 0 ; e <= cpu.length -1 ; e++) {
            cpu[e] = "I'm in element "+e+"!";
        }

        System.out.println("What are []cpu having ?");
        for(int e = 0 ; e < cpu.length ;e++) {
            System.out.println(cpu[e]);
        }
    } // void == return

    protected String [][]employee () { // return arrays 2D
        //   not void have to set some type
        String [][]name = {
                {"Mr.AAA" , "Ms.BBB","Mr.DDD"},
                {"Dr.EEE", "Dr.FFF" ,"Dr.GGG"}
                // 2 x 3 ; 2 is rows and 3 is column
                // [0][0] is Mr.AAA
        };

        return name;

    }

    protected float []weight () { // return array type float
        float []weight_animal = new float[5];
        weight_animal[0] = 7.21f;
        weight_animal[1] = 5.98f;
        weight_animal[2] = 10.1f;
        weight_animal[3] = 4.33f;
        weight_animal[4] = 13.01f;

        return weight_animal;
    }



    protected void show_array_employee (String [][]employee) {
        for (int eOFr = 0 ; eOFr <= 1 ; eOFr ++) {
            System.out.print("row "+eOFr+" has ");
            for(int eOFc = 0 ; eOFc <= 2 ; eOFc ++) {
                System.out.print(employee[eOFr][eOFc]);
                if (eOFc == 2) {
                    System.out.println();
                    break;
                } // condition
                System.out.print(" , ");
            } // for column
        } // for rows
    }

    private void show_array_weight (float []weight) {
        for (int e = 0 ; e < weight.length ; e ++) {
            System.out.println("element "+e+" contains weight "+weight[e]+" Kg.");
        }
    }
}
