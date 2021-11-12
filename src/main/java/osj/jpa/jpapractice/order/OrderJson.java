package osj.jpa.jpapractice.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class OrderJson {
  @JsonProperty
  private Date orderDate;
  @JsonProperty
  private OrderStatus status;

  @Builder
  public OrderJson(Date orderDate, OrderStatus status) {
    this.orderDate = orderDate;
    this.status = status;
  }
}
