package com.youcode.myreview.review;

import com.youcode.myreview.security.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue
    private UUID id;
    private LocalDate date;
    private String title;
    private String message;
    private boolean report;
    private Integer reaction;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}