package points_one_two;
import poins_one_one.Parent;


public class Child extends Parent { // extends คือการสืบทอด class
    private String childMessage = "I'm a Attribute in Class Child";
    Child () {
        System.out.println(childMessage);
    }

    public static void main(String[] args) {
        new Child();
        // output will show construct class ที่เราทำการ extends
    }
}
