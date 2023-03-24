package points_threee.testAlgorithmExchangeCard;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public interface Dao<T>{ /* <T> is generic */
    public void exchange(Integer cash);
    public void timeChange(Float minutes);

    public void getDegree() ;

    public T setCustomer(T t);

}
