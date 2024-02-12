package com.youcode.myreview.security.user.dto;

import com.youcode.myreview.security.user.enumeration.Role;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.UUID;
@Data
public class UserDTO {
    private UUID id;
    @NotBlank(message = "first name cannot be blank")
    @Size(max = 255, message = "first name must not exceed 255 characters")
    private String firstname;

    @NotBlank(message = "last name cannot be blank")
    @Size(max = 255, message = "last name must not exceed 255 characters")
    private String lastname;

    @NotBlank(message = "email cannot be blank")
    @Size(max = 1000, message = "Email must not exceed 1000 characters")
    private String email;

    private Role role;
}
