package points_two;


import java.io.InputStreamReader;
import java.io.BufferedReader;

public class learn_searchMonth_library_InputStreamReaderAndBufferedReader {
    private String []month = {
        "Jan" , "Feb" , "Mar" , "April" , "May" , "June"
     ,  "July" , "Aug" , "Sep"  , "Oct" , "Nov" , "Dec"
    };
    private String str;
    private int element;
    public InputStreamReader ip;
    public BufferedReader ir;

    public static void main(String[] argument) {
        /* String[] arg <- this is commandline argument */
        new learn_searchMonth_library_InputStreamReaderAndBufferedReader().setStr();
        // System.out.println(args.length);
    }

    /* mutator method */
    private void setStr() {
            ir = new BufferedReader(ip = new InputStreamReader(System.in));
            try {

                System.out.print("enter some mont <1 to 12> : ");
                str = ir.readLine();
                element = Integer.parseInt(str);
                if (element < 0|| element > 12) {
                    System.out.println("not found month");
                } else {
                    String month = getStr(element);
                    System.out.println(element+" is "+month);
                }

            } catch (Exception errors) {
                System.out.println("something was wrong "+errors.getMessage());
            }
    }

    private String getStr (int element) {

        for (int e = 0; e < month.length ; e++) {
            if(e == element) {
                return  month[e];
            }
        }

        return "null";
    }

}

