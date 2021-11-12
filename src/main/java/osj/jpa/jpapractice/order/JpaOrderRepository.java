package osj.jpa.jpapractice.order;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@RequiredArgsConstructor
@Repository
public class JpaOrderRepository implements OrderRepository {
  private final EntityManager em;

  @Override
  public Order save(Order order) {
    em.persist(order);
    return order;
  }

  @Override
  public Order findById(Long id) {
    return em.find(Order.class, id);
  }
}
