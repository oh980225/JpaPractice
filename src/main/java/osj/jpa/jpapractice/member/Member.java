package osj.jpa.jpapractice.member;

import osj.jpa.jpapractice.common.BaseEntity;

import javax.persistence.*;

@Entity
public class Member extends BaseEntity {
  @Id
  @GeneratedValue
  @Column(name = "MEMBER_ID")
  private Long id;

  private String name;
  private String city;
  private String street;
  private String zipcode;
}
