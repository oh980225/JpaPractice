package osj.jpa.jpapractice.order;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderReader {
  private final OrderRepository orderRepository;

  Order belongsTo(Long id) {
    return orderRepository.findById(id);
  }
}
