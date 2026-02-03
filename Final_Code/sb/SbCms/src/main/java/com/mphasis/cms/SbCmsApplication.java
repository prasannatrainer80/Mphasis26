package com.mphasis.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
info = @Info(
title = "Cms Project",
version = "1.0",
description = "API documentation for Cms Operations"
)
)
public class SbCmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbCmsApplication.class, args);
	}

}
