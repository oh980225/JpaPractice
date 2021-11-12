package osj.jpa.jpapractice.order;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Table(name = "ORDERS")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Order {
  @Id
  @GeneratedValue
  @Column(name = "ORDER_ID")
  private Long id;

  @Column(name = "MEMBER_ID")
  private Long memberId;

  @OneToMany(mappedBy = "order")
  private List<OrderItem> orderItems = new ArrayList<>();

  @Temporal(TemporalType.TIMESTAMP)
  private Date orderDate;

  @Enumerated(value = EnumType.STRING)
  private OrderStatus status;

  public void addOrderItem(OrderItem orderItem) {
    orderItems.add(orderItem);
    orderItem.setOrder(this);
  }

  @Builder
  public Order(List<OrderItem> orderItems, Date orderDate, OrderStatus status) {
    this.orderItems = orderItems;
    this.orderDate = orderDate;
    this.status = status;
  }
}
