package osj.jpa.jpapractice.order;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderBeanConfig {
  @Bean
  OrderReader orderReader(OrderRepository orderRepository) {
    return new OrderReader(orderRepository);
  }
}
