package com.example;

import com.example.model.DemoResponse;
import com.example.model.DemoRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.function.Function;

@SpringBootApplication
public class DemoFunction {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DemoFunction.class, args);
    }

    @Bean
    public Function<DemoRequest, DemoResponse> function1() {
    	return request -> DemoResponse
    			.builder()
    			.sourceCity(request.getSourceCity())
    			.destinationCity(request.getDestinationCity())
    			.numberOfPeople(request.getNumberOfPeople())
    			.date(LocalDate.now())
    			.build();
    }
    
    @Bean
    public Function<DemoRequest, DemoResponse> function2() {
    	return request -> DemoResponse
    			.builder()
    			.sourceCity(request.getSourceCity())
    			.destinationCity(request.getDestinationCity())
    			.numberOfPeople(request.getNumberOfPeople())
    			.date(LocalDate.now())
    			.build();
    }
    
}
