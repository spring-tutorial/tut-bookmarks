package bookmarks;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by dima on 6/1/16.
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
    // select a from Account a where a.username = :username
    Optional<Account> findByUsername(String username);
}
