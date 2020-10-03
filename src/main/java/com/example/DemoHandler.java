package com.example;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;

import com.example.model.DemoRequest;
import com.example.model.DemoResponse;
import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.HttpResponseMessage;
import com.microsoft.azure.functions.HttpStatus;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;


public class DemoHandler extends AzureSpringBootRequestHandler<DemoRequest, DemoResponse> {
	private final Logger logger = LoggerFactory.getLogger(DemoHandler.class);

	@FunctionName("function1")
	public HttpResponseMessage function1(@HttpTrigger(name = "request", methods = { HttpMethod.GET,
			HttpMethod.POST }, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<DemoRequest>> request,
			ExecutionContext context) {

		context.getLogger().info("FunctionRequet1 : " + request.getBody().get());
		logger.debug("------------ ******* FUNCTION1");
		return request.createResponseBuilder(HttpStatus.OK).body(handleRequest(request.getBody().get(), context))
				.header("Content-Type", "application/json").build();
	}
	
	@FunctionName("function2")
	public HttpResponseMessage function2(@HttpTrigger(name = "request", methods = { HttpMethod.GET,
			HttpMethod.POST }, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<DemoRequest>> request,
			ExecutionContext context) {

		context.getLogger().info("FunctionRequet2 : " + request.getBody().get());
		logger.debug("------------ ******* In FUNCTION2");
		return request.createResponseBuilder(HttpStatus.OK).body(handleRequest(request.getBody().get(), context))
				.header("Content-Type", "application/json").build();
	}

}