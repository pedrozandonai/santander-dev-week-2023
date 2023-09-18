package pedro.zandonai.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pedro.zandonai.domain.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
