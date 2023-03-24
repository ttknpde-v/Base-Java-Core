package points_one;
// key word this and super
public class learn_construct_method_and_extends_super {
    public static void main(String[] args) {
//        new WorkingConstruct();
//        new WorkingConstruct(15);
//        new WorkingConstruct(37,"Ajax");
//
//        System.out.println(); // or
//
//        WorkingConstruct obj = new WorkingConstruct();
//        obj = new WorkingConstruct(51);
//        obj = new WorkingConstruct(5,"peter");
//        obj = new WorkingConstruct(62.354f);

    }
}



class WorkingConstruct { // learn to work of method construct
    public int age;
    private String name = "Json";

    public WorkingConstruct () {
        this.age = 22;

        System.out.println(this.name+" "+this.age+" years He's here in construct without parameter");
    }

    public WorkingConstruct(int age) {
        this.age = age;
        System.out.println(this.name+" "+this.age+" years He's here in construct has a parameter");
    }

    public WorkingConstruct(float weight) {
        System.out.println(this.name+" "+weight+" kg. He's here in construct has a parameter(float)");
    }


    public WorkingConstruct(int age , String name) {
        this.age = age;
        this.name = name;
        System.out.println(this.name+" "+this.age+" years He's here in construct has two parameter");
    }

    // ...




}
