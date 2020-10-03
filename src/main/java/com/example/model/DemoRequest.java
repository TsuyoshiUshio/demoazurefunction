package com.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DemoRequest {

    private String sourceCity;
    private String destinationCity;
    private int numberOfPeople;

}
