package osj.jpa.jpapractice.order;

public class OrderMapper {
  public OrderJson toOrderJson(Order order) {
    return OrderJson.builder()
      .orderDate(order.orderDate())
      .status(order.status())
      .build();
  }
}
