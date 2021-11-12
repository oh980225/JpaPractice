package osj.jpa.jpapractice.order;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Item {
  @Id
  @GeneratedValue
  @Column(name = "ITEM_ID")
  private Long id;

  @ManyToMany(mappedBy = "items")
  private List<Category> categories = new ArrayList<>();

  private String name;
  private int price;
  private int stockQuantity;
}
