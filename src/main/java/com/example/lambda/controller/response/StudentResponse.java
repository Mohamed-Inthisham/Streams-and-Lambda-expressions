package com.example.lambda.controller.response;


import jdk.jshell.Snippet;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentResponse {
    private String name;
    private Long id;


}

