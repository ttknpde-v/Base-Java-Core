package points_one;

public class learn_any_modifier {


    public static void main(String [] args) {

//        details_em obj_in_class = new details_em();
//        obj_in_class.using_Employee();

//        or

        new details_em().using_Employee(); // can use!

    }
}

class details_em {
    private class Employee { // details employee
        private int emID;
        private String timeIn , timeOut;
        private double salary;

        // these are attribute

        public Employee (int emID , String timeIn , String timeOut) {
            this.emID = emID;
            this.timeIn = timeIn;
            this.timeOut = timeOut;
            setSalary(this.emID);
        }
        public Employee () {
            this.emID = 0;
            this.timeIn = "";
            this.timeOut = "";
            setSalary(this.emID);
        }
        // these are construct of class

        public void setEmID (int emID) {
            this.emID = emID;
        }

        public void setTimeIn (String timeIn) {
            this.timeIn = timeIn;
        }

        public void setTimeOut (String timeOut) {
            this.timeOut = timeOut;
        }

        private void setSalary (int emID) { // in this case id employee จะเป็นตัวกหนดเงินเดือน
            if (emID == 1) {
                this.salary = 25000;
            }
            else if (emID == 2) {
                this.salary = 45000;
            }
            else {
                this.salary = 15000;
            }
        }

        public void detailEmployee () {
            System.out.println("Id : "+this.emID+"\nTime-in and Time-out : "+this.timeIn+" , "+this.timeOut+"\nSalary : "+this.salary);
        }

    }

    public void using_Employee() {
        // declare Object

        Employee Em1 = new Employee() , Em2 = new Employee() , Em3  = new Employee(2,"11:09AM" , "19:57 PM")
                , E4 = new Employee();

        // or
        // Employee Em1 ,Em2,Em3;
        // Em1 = new Employee();
        // ...

        Em1.setEmID(1);
        Em1.setTimeIn("10:05 AM");
        Em1.setTimeOut("18:00 PM");
        Em1.setSalary(Em1.emID);
        Em1.detailEmployee();

        // #

        Em2.emID = 2 ;
        Em2.timeIn = "08:09 AM";
        Em2.timeOut = "14:30 PM";
        Em2.salary = 90000d;
        Em2.detailEmployee();

        // #

        Em3.detailEmployee();

        E4.detailEmployee();

    }
}
