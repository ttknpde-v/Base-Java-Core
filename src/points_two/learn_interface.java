package points_two;

public class learn_interface{

    public static void main(String[] args) {


        MyPhone myPhone = new MyPhone();
        myPhone.answerTheCall();

        new Office().completeForm("Mr.A" , 49.95d , 174.2d);

    }





}
class Office implements Form {
    @Override
    public void completeForm(String name, double weight, double height) {
        System.out.println("########################## "+ Form.message+" ##########################");
        System.out.println("name "+name+" weight "+weight+" kilogram. height "+height+" centimeter.");
        System.out.println("############################### End ##############################");
    }
}
class MyPhone implements Phone{
    @Override
    public void answerTheCall() {
        System.out.println("Hello , It's mine cell-phone");
    }

    @Override
    public String setTheCall(String name) {
        return "Tuod Tuod Tuod Tu... Hi , Mr."+name;
    }

    @Override
    public void takeSomePicture() {

    }

    @Override
    public void sendEmail() {

    }

    @Override
    public void videoCall() {

    }
}


interface Form {

    public static final String message = "This is Form"; /* รูปแบบการเรียกใช้ <name interface>.<name variable> */
    /* all variable on interface class
    *  must declare be static and final
    * */
    public void completeForm(String name , double weight , double height );


}

interface Phone extends SmartPhone {
    public void answerTheCall();
    public String setTheCall(String name);

}

interface SmartPhone {

    public void takeSomePicture();
    public void videoCall();
    public void sendEmail();

}