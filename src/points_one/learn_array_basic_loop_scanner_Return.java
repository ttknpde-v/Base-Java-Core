package points_one;
import java.util.Scanner;
public class learn_array_basic_loop_scanner_Return {
    final private int max_people = 5; // employee
    private int []hours = new int[max_people]; // set employee works all hours start is zero
    private float wage = 0; // ค่าจ้างต่อชั่วโมง
    private float []total_wage = new float[max_people];
    private Scanner $get = new Scanner(System.in);
    static learn_array_basic_loop_scanner_Return $my_obj_here = new learn_array_basic_loop_scanner_Return();

    private int []set_hours_employee () { // remember! return any type so , method it has to same type
        for (int e = 0; e < hours.length; e++) {
            System.out.print("order "+(e+1)+" works : ");
            hours[e] = $get.nextInt();
        }
        return hours;
    }

    private float set_wage () {
        System.out.print("wage per hours : ");
        wage = $get.nextFloat();
        return wage;
    }

    private float []calculate_wage_per_hours () {
        for (int e = 0; e < hours.length; e++) {
            total_wage[e] = hours[e]*wage;
        }
        return total_wage;
    }

    protected static void display_data_employee () {

        for (int employee = 0; employee < $my_obj_here.max_people; employee++) {
            System.out.println("order "+(employee+1)+" works "+$my_obj_here.hours[employee]+" hours income is "+ $my_obj_here.total_wage[employee]+" baht");
        }
    }

    public static void main (String [] args) {
        $my_obj_here.set_hours_employee();
        $my_obj_here.set_wage();
        $my_obj_here.calculate_wage_per_hours();
        display_data_employee();
    }
}
