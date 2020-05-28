package unitri.sistemamatricula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unitri.sistemamatricula.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
