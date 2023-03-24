package points_two;
// start 00:42 AM 3/3/23
public class learn_condition_while {
    // declare array
    public int []a,b,c,d ; // these are all array
    public String people[] , peopleTwo , peopleThree; // just people is array

    public static void main(String[] args) {

        learn_condition_while obj = new learn_condition_while();
        obj.setSizeA(3);
        System.out.println(obj.getA().length);
//      System.out.println(new learn_condition_while().a.length);

    }

    public void setSizeA (int size) {
        this.a = new int[size];
    }

    public int []getA () {
        return this.a;
    }


    private void learnWhile (int n) {
        while ((n = n+1) <= 10) { // if (true) : (n + 1) <= 10 หรือไม่
            // will do statement
            System.out.println("get n , n has a "+n);
        }
    }

    private void learnDoWhile (String text , int n) {

        do {
            System.out.println("get text , text has a "+text+" and n is "+n);
            System.out.println("n = n - 5");
        } while ((n = n-5) >= 0);
        System.out.println("when n equals 0 is END");

    }

}


