package timecapsule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import timecapsule.domain.Letter;

public interface LetterRepository extends JpaRepository<Letter, Long> {

}
