package osj.jpa.jpapractice.common;

import javax.persistence.MappedSuperclass;
import java.time.Instant;

@MappedSuperclass
public abstract class BaseEntity {
  private Instant createdDate;
  private Instant lastModifiedDate;
}
