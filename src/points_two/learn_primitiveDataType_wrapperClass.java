package points_two;

import java.util.ArrayList;

public class learn_primitiveDataType_wrapperClass {

    public static void main(String[] argument) {
        new learn_primitiveDataType_wrapperClass().start();
    }

    public void start () {
        ArrayList obj = new ArrayList();
        // obj.testArrayList();
        java.util.ArrayList<Character> alpha;
        /* auto */
        alpha = obj.getAlpha();
        System.out.println(alpha);
    }


    protected class ArrayList{

        /*  Array List
         *  Array general (fix length)
         *  Array List (dynamic length) ปรับขนาด Auto
         *  ArrayList is class (must import)
         *  # structure ArrayList<Wrapper Class> ชื่อตัวแปร = new ArrayList<Wrapper Class>(ขนานด);
         * */
        protected java.util.ArrayList<Character> alpha = new java.util.ArrayList<Character>();
        public void testArrayList () {

            java.util.ArrayList<Integer> Luckynumber = new java.util.ArrayList<>();
            System.out.println("before add some value size is Luckynumber equal "+Luckynumber.size());
            /* method .add(index,value) เพิ่มข้อมูล */
            Luckynumber.add(0,10);
            Luckynumber.add(1,20);
            Luckynumber.add(2,30);
            Luckynumber.add(3,40);
            Luckynumber.add(4,50);
            Luckynumber.add(5,60);
            Luckynumber.add(6,70);

            /* loop show some value */
            for (int e = 0; e < Luckynumber.size() ; e++) {  /* method .size() sam method length */
                System.out.println("order "+e+" has a "+Luckynumber.get(e)); /* method .get() show element */
            }
            System.out.println("after add some value size is Luckynumber equal "+Luckynumber.size());

        }

        /* accessor method */

        public java.util.ArrayList<Character> getAlpha() { /* we can return be array list */
            alpha.add('J');
            alpha.add('A');
            alpha.add('V');
            alpha.add('A');
            alpha.add('S');
            alpha.remove(4);
            return this.alpha;
        }

    }

    private class PrimitiveAndWrapper {

         public int number = 10; /* declare variable "Primitive Data type" ตัวแปรทั่วไป */
         public Integer number_obj_a = new Integer(10); /* declare variable "Wrapper Class" ตัวแปร Object */

         /* change primitive to wrapper */
         public Integer number_obj_b = new Integer(number);
         // # java version 5 up we can change primitive to wrapper ดังนี้
         public Integer number_obj_c = number; /* it set wrapper (auto type) */

        /* and we can change wrapper to primitive datatype
        *  by these method
        *  <object wrapper>.byteValue();
        *  <object wrapper>shortValue();
        *  <object wrapper>intValue();
        *  <object wrapper>longValue();
        *  ... */
        public  int number_primitive = number_obj_b.intValue();
        // # java version 5 up we can change wrapper to primitive ดังนี้
        public int number_primitive_new = number_obj_b; /* it set primitive (auto type) */


    }
    /** details primitive datatype and wrapper class **/


}
