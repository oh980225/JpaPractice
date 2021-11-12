package osj.jpa.jpapractice.order;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import osj.jpa.jpapractice.common.ResponseBody;

import static org.springframework.http.HttpStatus.OK;

@Controller
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {
  private final OrderReader orderReader;
  private final OrderMapper mapper = new OrderMapper();

  @GetMapping("/{id}")
  public ResponseEntity<?> readOrder(@PathVariable("id") Long id) {
    Order order = orderReader.belongsTo(id);

    ResponseBody responseBody = ResponseBody.builder()
      .status(OK.value())
      .message("조회 성공")
      .data(mapper.toOrderJson(order))
      .build();

    return ResponseEntity.ok(responseBody);
  }
}
