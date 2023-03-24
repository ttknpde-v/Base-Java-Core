package points_one;

public class learn_class_modifier {

    public static void main (String [] args) {
        in_this_private_class $obj = new in_this_private_class();
//        $obj.output_inner_private();
        String message_from_class_private = $obj.get_inner_private("learning Java language");
//        System.out.println(message_from_class_private);
    }

}

class in_this_private_class {



    private class inner_private { // private class เป็นได้แค่ inner in class general
        public void message (String word) { // we can't access method โดยตรง
            System.out.println(word);
        }
        public String message_return (String word) {
            String mes = "I am going to return ("+word+")";
            return mes;
        }
    } // private class

    public void output_inner_private () {
        inner_private $obj = new inner_private();
        $obj.message("I like Pizza");
    }

    public String get_inner_private (String word) {
        inner_private $obj = new inner_private();
        return  $obj.message_return(word);
    }

}
