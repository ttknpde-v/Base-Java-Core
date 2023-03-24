package points_two;
// # it works together
import java.io.InputStreamReader;
import java.io.BufferedReader;
/*
*   get input with class BufferedReader ร่วมกับ InputStreamReader
*   and method for get value to variable is read() , readLine();
*   ex. String st = <object>.readLine()
*          ** it means read String
* */
public class learn_algorithm_minAndmax_with_array {

    protected String []str = new String[3];
    protected int []number = new int[3];
    protected int max, min ;

    public static void main(String[] args) {
        learn_algorithm_minAndmax_with_array objClass = new learn_algorithm_minAndmax_with_array();

        objClass.setStr();
        objClass.setNumber(objClass.str); /* take value of array string to array integer */
        objClass.minAndmax(objClass.number);
        System.out.println("A max value is "+objClass.max);
        System.out.println("A min value is "+objClass.min);

    }

    /* create mutator method () set */
    protected void setStr () {
            InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader ip = new BufferedReader(ir);
            /* this class together working  (same Scanner ??)
            *   System.in (means get some keyboard) */
            try {

                for(int c = 0 ; c < str.length ; c++ ) {
                    System.out.print((c+1)+". enter a number (this type String) : ");
                    str[c] = ip.readLine();
                }

            } catch (Exception errors) {
                System.out.println("somethings was wrong "+errors.getMessage());
            }
    }
    /* accessor method */
    protected String[] getStr () { // when need to use a value Attribute
        return  this.str;
    }

    /* method find max and min value */

    protected void setNumber(String []str) {

        for (int e = 0; e < str.length; e++) {

                number[e] = Integer.parseInt(str[e]);
                /**  change String to Integer
                 *   use this method <type>.parse<type>();
                 *  */
        }

    }

    /* accessor method (get) */
    protected int[] getNumber() { // when need to use a value Attribute
        return this.number;
    }

    protected void minAndmax (int [] number) {
        min = number[0];
        max = number[0];
        for (int e = 0; e < number.length; e++) {

            /* algorithm finding some value min and max */
            if (number[e] > max) {
                max = number[e];
                /* mutator set */
            }

            if(number[e] < min) {
                min = number[e];
                /* mutator set */
            }
        }
    }






}
