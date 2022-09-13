package Repository;

import Models.Entrees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntreeRepository extends JpaRepository<Entrees,Long> {
}
