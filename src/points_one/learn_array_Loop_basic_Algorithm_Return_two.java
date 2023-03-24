package points_one;

public class learn_array_Loop_basic_Algorithm_Return_two {
    private int []lucky_number = {10,9,8,7,6,5,4,3,2,1};
    private int sigma = 0;
    private char []alphabet_thai = {'ก' ,'ข', 'ฃ' , 'ค'};

    protected int calculate_lucky_number (int []lucky_number) {
        for (int e = 0 ; e < lucky_number.length ; e++) {
            sigma = sigma+lucky_number[e];
        }
        return sigma;
    }
    private String []alphabet_english () {
       String []alpha = new String[2]; // element 0 - 1
       alpha[0] = "A B C D E F G H I J K";
       alpha[1] = "L M N O P Q R S T U W X Y Z";
       return alpha;
   }

   private char []get_char_alpha (char []alphabet_thai) {
        char []cp = alphabet_thai;
        return cp;
   }
   private void display_alphabet_english (String []alphabet_english) {
        int count = 0;
        while (count <= alphabet_english.length-1) {
            System.out.println(alphabet_english[count]);
            count = count+1;
        }
   }
   public static void main (String [] args) {
        learn_array_Loop_basic_Algorithm_Return_two $obj = new learn_array_Loop_basic_Algorithm_Return_two();
        char []alpha_thai;
        alpha_thai = $obj.get_char_alpha($obj.alphabet_thai); // public ขึ้นไป ต้องมี instance for call any method
        // []alphabet_thai have data same private char []alphabet_thai outside main class
        String []alphabet_english = $obj.alphabet_english();
        // $obj.display_alphabet_english(alphabet_english);
        // System.out.println("before using calculate_lucky_number() sigma equal "+$obj.sigma); // check value variable sigma
        // $obj.calculate_lucky_number($obj.lucky_number);
        // System.out.println("after using calculate_lucky_number() sigma equal "+$obj.sigma);
    }

}
