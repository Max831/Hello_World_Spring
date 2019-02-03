package Program_1.Jest.repos;

import Program_1.Jest.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Long> {
}
