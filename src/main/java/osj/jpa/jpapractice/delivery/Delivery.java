package osj.jpa.jpapractice.delivery;

import osj.jpa.jpapractice.common.BaseEntity;

import javax.persistence.*;

@Entity
public class Delivery extends BaseEntity {
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
