package com.orm.onetomany.controller.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class CourseErrorResponse {

    private int statusCode;
    private String errorMsg;
}
