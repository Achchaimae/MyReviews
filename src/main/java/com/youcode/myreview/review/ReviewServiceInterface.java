package com.youcode.myreview.review;

import com.youcode.myreview.review.dto.ReviewReq;
import com.youcode.myreview.review.dto.ReviewResp;
import com.youcode.myreview.shareable.CrudInterface;

import java.util.UUID;

public interface ReviewServiceInterface extends CrudInterface<ReviewReq, ReviewResp, UUID> {
}
