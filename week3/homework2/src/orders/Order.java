package orders;

import findOrderStrategy.IFindOrderStrategy;

import java.util.List;
import java.util.ArrayList;

public class Order implements IFindOrderStrategy {

    public List<Order> order;
    public String firstName;
    public String lastName;
    public String orderNumber;
    public String rewardsMemberNumber;

    public Order(ArrayList<Order> order, String firstName, String lastName, String orderNumber, String rewardsMemberNumber){

        this.order = order;
        this.firstName = firstName;
        this.lastName = lastName;
        this.orderNumber = orderNumber;
        this.rewardsMemberNumber = rewardsMemberNumber;

        this.order.add(this);
    }

    @Override
    public String getFindByAttribute(Order order) {
        return null;
    }
}
