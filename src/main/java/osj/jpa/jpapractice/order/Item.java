package osj.jpa.jpapractice.order;

import osj.jpa.jpapractice.common.BaseEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE")
public abstract class Item extends BaseEntity {
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
