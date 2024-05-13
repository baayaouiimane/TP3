package ma.fsm.hopitalll.security.repo;

import ma.fsm.hopitalll.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,String>
{
    AppUser findByUsername(String username);
}
