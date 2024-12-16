package org.mdasolutions.web.Controllers;

import org.mdasolutions.web.Entities.Review;
import org.mdasolutions.web.Services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ReviewController {

    @Autowired
    private ReviewService servicesService;

    @GetMapping("/reviews")
    public String getServicesPage(Model model) {
        List<Review> servicesList = servicesService.getAllReviews();

        model.addAttribute("reviews", servicesList);

        return "reviews";
    }

    @PostMapping("/reviews/add")
    public String addService(Review review) {
        servicesService.addReview(review);
        return "redirect:/reviews";
    }
}
