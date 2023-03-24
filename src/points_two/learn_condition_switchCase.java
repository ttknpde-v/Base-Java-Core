package points_two;

public class learn_condition_switchCase {
    private String aTrue = "True" , aFalse = "False";

    private int binary ;

    private int score ;

    public static void main(String[] args) {
        learn_condition_switchCase obj = new learn_condition_switchCase();
        learn_condition_switchCase objTwo = new learn_condition_switchCase();
        obj.setBinary(2);
        obj.showMessageBinary();

        obj.setScore(4);
        System.out.println(obj.conditionScore());

        obj.setScore(-8);
        System.out.println(obj.conditionScore());

        obj.setScore((int) 1.6f);
        System.out.println(obj.conditionScore());

//        objTwo.score = 4;
        System.out.println(objTwo.conditionScore());


    }


    private void setScore (int s) {
        this.score = s;
    }

    private String conditionScore () {
        switch (this.score) {
            case (0) :  return this.score+" equal F";
            case (1): return this.score+" equal D";
            case (2): return this.score+" equal C";
            case (3): return this.score+" equal B";
            case (4): return this.score+" equal A";
            default: return "false score and fuck u bro";
        }
    }



    protected void setBinary (int b) { // set
        this.binary = b;
    }
    protected String switchCondition () { // get
        switch(this.binary) {
            case 1,2:
                return this.aTrue;
            default:
                return this.aFalse;
        }
    }
    protected void showMessageBinary() {
        System.out.println("Binary "+this.binary+" is "+switchCondition());
    }

}
