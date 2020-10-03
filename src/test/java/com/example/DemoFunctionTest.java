package com.example;

import com.example.model.DemoResponse;
import com.example.model.DemoRequest;
import org.junit.Test;
import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;

import static org.assertj.core.api.Assertions.assertThat;

public class DemoFunctionTest {

    @Test
    public void test() {
    	//TODO
    }

    @Test
    public void start() throws Exception {
        AzureSpringBootRequestHandler<DemoRequest, DemoResponse> handler = new AzureSpringBootRequestHandler<>(
                DemoFunction.class);
      //TODO
    }
}
