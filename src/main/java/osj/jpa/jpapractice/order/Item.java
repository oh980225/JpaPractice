package osj.jpa.jpapractice.order;

import javax.persistence.*;

@Entity
public class Item {
  @Id
  @GeneratedValue
  @Column(name = "ITEM_ID")
  private Long id;

  private String name;
  private int price;
  private int stockQuantity;
}
