package osj.jpa.jpapractice.order;

public interface OrderRepository {
  Order save(Order order);
  Order findById(Long id);
}
