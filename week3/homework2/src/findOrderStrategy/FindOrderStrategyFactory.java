package findOrderStrategy;

import orders.Order;
import orders.OrderListTest;

public class FindOrderStrategyFactory {
    public static IFindOrderStrategy getFindByRewardsNumberStrategy() {
        return new IFindOrderStrategy() {
            @Override
            public String getFindByAttribute(Order order) {
                return order.rewardsMemberNumber;
            }
        };
    }

    public static IFindOrderStrategy getFindByLastNameStrategy() {
        return new IFindOrderStrategy() {
            @Override
            public String getFindByAttribute(Order order) {
                return order.lastName;
            }
        };
    }

    public static IFindOrderStrategy getFindByOrderNumberStrategy() {
        return new IFindOrderStrategy() {
            @Override
            public String getFindByAttribute(Order order) {
                return order.orderNumber;
            }
        };
    }


}
