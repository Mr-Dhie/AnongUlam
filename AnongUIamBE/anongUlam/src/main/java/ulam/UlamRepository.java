package ulam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UlamRepository extends JpaRepository<Ulam, Integer>{

}
