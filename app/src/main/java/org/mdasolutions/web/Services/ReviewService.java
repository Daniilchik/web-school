package org.mdasolutions.web.Services;

import org.mdasolutions.web.Entities.Review;
import org.mdasolutions.web.Repos.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ReviewService {

    @Autowired
    private ReviewRepo reviewRepo;

    public List<Review> getAllReviews() {
        return reviewRepo.findAll();
    }

    public void addReview(Review review) {
        reviewRepo.save(review);
    }
}
