package points_one;

import java.util.Calendar;
// import java.util.GregorianCalendar;

// Calender (n. ปฏิทิน) method for set about day month year ...
// get time hours day ...

public class learn_any_modifier_accessorGet_mutatorSet {
//    public static void main (String [] args) {
////            Calendar calendar = new GregorianCalendar();
////            int year = calendar.get(Calendar.YEAR);
////            int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
//////            System.out.println(year);
//////            System.out.println(dayOfMonth);
//////            System.out.println(calendar.get(Calendar.HOUR_OF_DAY)+" : "+calendar.get(Calendar.MINUTE)+" : "+calendar.get(Calendar.SECOND));
////            System.out.println(Calendar.getInstance());
//
//    }
    public static void main(String[] args) {
        int myMonth;
        String myPromotion;
        Promotion promotion = new Promotion(); // create object of class Promotion
        myMonth = promotion.getMonth();
        myPromotion = promotion.getPromotion();
        System.out.println("Mouth : "+promotion.getStringMonthNumber(myMonth)+" Has some Promotion : "+myPromotion);

        promotion.setMonth(9);
        promotion.setPromotion("Buy two Ice-Scream add Free topping");
        myPromotion = promotion.getPromotion();
        System.out.println("Mouth : "+promotion.getStringMonthNumber(promotion.getMonth())+" Has some Promotion : "+myPromotion);

        promotion.setMonth(-9); // method exit() working
        System.out.println("Mouth : "+promotion.getStringMonthNumber(promotion.getMonth())+" Has some Promotion : "+promotion.getPromotion());

    }
}


class Promotion {
    static Calendar calendar = Calendar.getInstance(); // return information about Asia/Bangkok
    private int month = calendar.get(Calendar.MONTH)+1;
    private String promotion = "Buy some Ice-Scream , Free some T-Shirt";

    // get month
    // accessor method
    // specify type you need
    public int getMonth () {
        return this.month;
    }

    // set moth
    // mutator method
    // not return but parameter
    public void setMonth (int month) {
        if(month > 0 && month <= 12) {
            this.month = month;
        }
        else {
            System.exit(0);
            // method end process 0 is successful termination
            // status other is not end process
        }
    }

    public String getPromotion() { // get or accessor
        return this.promotion;
    }
    public void setPromotion (String newPro) { // set or mutator
         this.promotion = newPro;
    }

    public String getStringMonthNumber (int month) {
        switch (month) {
            case 1 : return "Jan";
            case 2 : return "Feb";
            case 3 : return "Mar";
            case 4 : return "April";
            case 5 : return "May";
            case 6 : return "June";
            case 7 : return "July";
            case 8 : return "Aug";
            case 9 : return "Sep";
            case 10 : return "Oct";
            case 11 : return "Nov";
            case 12 : return "Dec";
            default: return "error mouth";
        }
    }

}