package com.puzzles;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/*
@JsonInclude(JsonInclude.Include.NON_NULL)
*/
public class Student {
    private String name;
/*
    @JsonInclude(JsonInclude.Include.NON_NULL)
*/
    private Integer age;
}
