package points_threee.testAlgorithmExchangeCard;

import java.util.HashMap;

public class TestExchange extends Implement {
    public static void main(String[] args) {

        HashMap degree;
        degree = new TestExchange().getDegreeHashmap();
/* in top line means == Implement ... = new Implement();  */

/*        System.out.println(degree.get("30"));
        System.out.println(degree.get("45"));
        System.out.println(degree.get("60"));*/

        Customer customer = new Customer();
        customer.setAge(30);
        customer.setName("Json");

        System.out.println(customer);

        TestExchange customerOne = new TestExchange();

        Customer customerTwo = customerOne.setCustomer(customer);
        //* customerTwo == customer
        //* customerTwo.getName() == customer.getName()
        System.out.println(customerTwo.getName()+" "+customerTwo.getAge());

    }

}
