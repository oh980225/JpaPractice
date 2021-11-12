package osj.jpa.jpapractice.order;

import javax.persistence.*;

@Entity
@Table(name = "ORDER_ITEM")
public class OrderItem {
  @Id
  @GeneratedValue
  @Column(name = "ORDER_ITEM_ID")
  private Long id;

  @ManyToOne
  @JoinColumn(name = "ITEM_ID")
  private Item item;

  @ManyToOne
  @JoinColumn(name = "ORDER_ID")
  private Order order;

  private int orderPrice;
  private int count;

  public void setOrder(Order order) {
    this.order = order;
  }

  public void setItem(Item item) {
    this.item = item;
  }
}
