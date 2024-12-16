package org.mdasolutions.web.Repos;

import org.mdasolutions.web.Entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Long> {
}
