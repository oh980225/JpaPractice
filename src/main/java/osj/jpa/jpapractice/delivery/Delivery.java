package osj.jpa.jpapractice.delivery;

import javax.persistence.*;

@Entity
public class Delivery {
  @Id
  @GeneratedValue
  @Column(name = "DELIVERY_ID")
  private Long id;

  private String city;
  private String street;
  private String zipcode;

  @Enumerated(value = EnumType.STRING)
  private DeliveryStatus status;
}
