package nahye.vcalendar.user;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
	Optional<Users> findByusername(String username);
}
