package com.youcode.myreview.review.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewReq {
    private UUID id;
    private LocalDate date;
    private String title;
    private String message;
    private boolean report;
    private String reaction;
    private UUID     user_id;
}
