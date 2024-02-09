package com.youcode.myreview.review;

import com.youcode.myreview.review.dto.ReviewReq;
import com.youcode.myreview.review.dto.ReviewResp;
import com.youcode.myreview.shareable.CrudController;
import com.youcode.myreview.shareable.ResponseMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/review")
public class ReviewController extends CrudController<ReviewReq, ReviewResp, UUID, ReviewServiceInterface> {


    public ReviewController(ReviewServiceInterface reviewServiceInterface, ResponseMessage responseMessage) {
        super(reviewServiceInterface, responseMessage);
    }
}
