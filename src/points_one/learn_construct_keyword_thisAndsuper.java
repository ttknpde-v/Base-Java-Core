package points_one;
// this ใช้เรียก construct attribute method
// super ใช้เรียก construct attribute method ที่เราสืบทอด
public class learn_construct_keyword_thisAndsuper { // test construct
    protected char[] alphabet = {'B','E','E','R'}; // four index element 0 - 3

    public static void main(String[] args) {
//        new learn_construct_k_tAs_child();



    }

}
// actually compiler it will put super() on top line (auto)
class learn_construct_k_tAs_grandparent { // grandparent class (main)
    learn_construct_k_tAs_grandparent() { // method construct
        System.out.println("I'm in construct learn_construct_k_tAs_***grandparent()");
    }
}
class learn_construct_k_tAs_parent extends learn_construct_k_tAs_grandparent { // Parent class
    learn_construct_k_tAs_parent() {
          this(100);
        // it works
        // this() can call construct in same class
        System.out.println("I'm in construct learn_construct_k_tAs_***parent()");
    }

    learn_construct_k_tAs_parent(int n) {
        //super();
        // super ใช้เรียก construct ของ class extends
        // it shows construct in grandparent
        System.out.println("in construct without parameter I declare this(100)");
        System.out.println("I'm in construct learn_construct_k_tAs_***parent("+n+")");
    }
}

class learn_construct_k_tAs_child extends learn_construct_k_tAs_parent{ // Child class
    learn_construct_k_tAs_child() {
        //super(); // it shows construct in parent
        System.out.println("I'm in construct learn_construct_k_tAs_child()");
    }
}


