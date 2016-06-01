package bookmarks;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created by dima on 6/1/16.
 */
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    // SELECT b from Bookmark b WHERE b.account.username = :username
    Collection<Bookmark> findByAccountUsername(String username);
}
