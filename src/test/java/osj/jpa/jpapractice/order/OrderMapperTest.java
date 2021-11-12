package osj.jpa.jpapractice.order;

import org.junit.jupiter.api.Test;

import java.sql.Date;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static osj.jpa.jpapractice.order.OrderStatus.ORDER;

class OrderMapperTest {
  OrderMapper mapper = new OrderMapper();

  @Test
  void OrderJson으로_변환() {
    Order order = Order.builder()
      .orderDate(Date.valueOf("1998-02-25"))
      .orderItems(null)
      .status(ORDER)
      .build();

    OrderJson orderJson = mapper.toOrderJson(order);

    assertThat(orderJson, is(OrderJson.builder()
      .orderDate(Date.valueOf("1998-02-25"))
      .status(ORDER)
      .build()));
  }
}