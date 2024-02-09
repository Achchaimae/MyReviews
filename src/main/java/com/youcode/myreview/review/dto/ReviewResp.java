package com.youcode.myreview.review.dto;

import com.youcode.myreview.security.user.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewResp {
    private UUID id;
    private LocalDate date;
    private String title;
    private String message;
    private boolean report;
    private String reaction;
    private UserDTO user;
}
