package points_one;

public class learn_construct_method_and_Extends extends Split_learn_c_m_a_E {
    private float realNumber = 28.7f;
    public learn_construct_method_and_Extends() {
        super(12.3f);
        System.out.println("value in attribute is "+this.realNumber);
    }
    public static void main(String[] args) {
        // when comment line 4 - 7 program will error
        // because class ที่เราสืบทอดมานั้นมี construct has a parameter
        // solution
        // create construct
        // แล้วใช้ keyword super(parameter)
        // super() จะนำค่าผ่าน parameter ไปที่ class child
        new learn_construct_method_and_Extends();
    }

}

class Split_learn_c_m_a_E {
    private float realNumber;
    public Split_learn_c_m_a_E (float realNumber) { // construct method
        this.realNumber += realNumber+10;
        System.out.println("value in attribute is "+this.realNumber);
    }

}
