package points_threee.testAlgorithmExchangeCard;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Implement implements Dao<Customer>{
    private Integer result;
    private HashMap<String , String> degree ;
    /*  A HashMap<Type Key,Type Value> store items in "key/value" , we can into them by Key */
    public Implement() {

        degree = new HashMap<>();
        degree.put("30" , "sin30 ํ 1/2 cos30 ํ √3/2 tan30 ํ 1/√3");
        degree.put("45" , "sin45 ํ 1/√2 cos45 ํ 1/√2 tan45 ํ 1");
        degree.put("60" , "sin60 ํ √3/2 cos60 ํ 1/2 tan60 ํ √3/1");

    }
    @Override
    public void exchange(Integer cash) {
        if (cash >= 1000) { //* start 5521
            this.result = cash/1000; //* 5 = 5521/1000
            System.out.println("cash 1000 bath total is "+this.result);
            cash = cash%1000;
            //* 5521 = 5000%1000 => 521 เศษ (divide เอาเศษ)
        }
        if (cash >= 100) {
            this.result = cash/100; //*  5 = 521/100
            System.out.println("cash 100 bath total is "+this.result);
            cash = cash%100; //* 521 = 521/100 => 21 (divide เอาเศษ)
        }
        if (cash >= 10) {
            this.result = cash/10; //* 2 = 21/10
            System.out.println("coin 10 bath total is "+this.result);
            cash = cash%10; //* 21 = 21/10 => 1 (divide เอาเศษ)
        }
        if (cash >= 1) {
            this.result = cash/1;
            System.out.println("coin 1 bath total is "+this.result);

        }

    }

    @Override
    public void timeChange(Float minutes) { //* start 191 minutes
        Integer minute , hours;
        minute = (int) (minutes%60) ; //* 11 = 190%60 (divide เอาเศษ)
        hours = (int) (minutes/60);  //* 2 = 190/60
        System.out.println(hours+":"+minute); //* 2:11
    }

    @Override
    public void getDegree() {

        System.out.println(this.degree); //* it print {key0=value0,key1=value1,...}

    }

    public HashMap getDegreeHashmap() {

        return this.degree;
        /* return array hashmap  */
    }

    @Override
    public Customer setCustomer(Customer o) {
        /* parameter is object class */

        return o;
    }
}
