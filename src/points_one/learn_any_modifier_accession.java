package points_one;
//
//  program show to work
//  of method
//
public class learn_any_modifier_accession { // test parameter

    public void changePrimitive (int n) {
        n = 10;
    }

    public void changeObjectReference (Information obj) { // argument have to object from any class
        // parameter type variable Object
        // and variable pointer to Object in any class
        obj = new Information();
        // value is not to change when using method
    }

    public void changeObjectAttribute (Information obj) { // argument have to object from any class
        // this variable "obj" Object
        // it changes default value
        // in class Information

        obj.get_set_weight_private(10);
        obj.weight_protected = 10;
        obj.weight_public = 10;

        // value is to change! when using method

    }

    public static void main (String [] args) {

        System.out.println("default value in class Information()");
        System.out.println("weight_private is "+new Information().get_weight_private());
        System.out.println("weight_protected is "+new Information().weight_protected);
        System.out.println("weight_public is "+new Information().weight_public);
        System.out.println("");
        System.out.println("set value in class Information(60,60,60)");
        System.out.println("weight_private is "+new Information(60,60,60).get_weight_private());
        System.out.println("weight_protected is "+new Information(60,60,60).weight_protected);
        System.out.println("weight_public is "+new Information(60,60,60).weight_public);
        System.out.println("");
        System.out.println("get method changePrimitive");
        learn_any_modifier_accession obj = new learn_any_modifier_accession();
        int n = 5;
        System.out.println("n is "+n);
        obj.changePrimitive(n);
        System.out.println("then using changePrimitive() so n is "+n);

        System.out.println("");
        Information obj_info_class = new Information(100,100,100);
        System.out.println("set value in class Information(100,100,100)");
        System.out.println("weight_private is "+obj_info_class.get_weight_private());
        System.out.println("weight_protected is "+obj_info_class.weight_protected);
        System.out.println("weight_public is "+obj_info_class.weight_public);

        obj.changeObjectReference(obj_info_class); // put variable object ที่เก็บผลลัพธ์ (100,100,100)
        System.out.println("then using changeReference()");
        System.out.println("weight_private is "+obj_info_class.get_weight_private());
        System.out.println("weight_protected is "+obj_info_class.weight_protected);
        System.out.println("weight_public is "+obj_info_class.weight_public);

        obj.changeObjectAttribute(obj_info_class); // change value in class Information too
        System.out.println("then using changeAttribute()");
        System.out.println("weight_private is "+obj_info_class.get_weight_private());
        System.out.println("weight_protected is "+obj_info_class.weight_protected);
        System.out.println("weight_public is "+obj_info_class.weight_public);

        System.out.println("");
        System.out.println("default weight_private in object (obj_info_class_spilt) from Information");
        Information obj_info_class_spilt = new Information(100,100,100);
        System.out.println("weight_private is "+obj_info_class_spilt.get_weight_private()); // result is 100
        System.out.println("then using mutator(set) method and show it by accessor(get) method");
        obj_info_class_spilt.get_set_weight_private(12345);
        System.out.println("weight_private is "+obj_info_class_spilt.get_weight_private());

    }

}

class Information {
    private int weight_private ;
    protected int weight_protected ;
    public int weight_public ;

    public Information () {
        this.weight_private = 0;
        this.weight_protected = 0;
        this.weight_public = 0;
    }
    public Information (int pri , int pro , int pub) {
        this.weight_private = pri;
        this.weight_protected = pro;
        this.weight_public = pub;
    }
    // these are construct method

    private void set_weight_private (int pri) {
        this.weight_private = pri;
    }

    public void get_set_weight_private (int pri) {
        // we call method "mutator method"
        // means we can set attribute private
        this.set_weight_private(pri);
    }
    public int get_weight_private () {
        // we call method "accessor method"
        // means we can use attribute private
        return this.weight_private;
    }
}
