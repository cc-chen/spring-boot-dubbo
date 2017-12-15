package com.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.boot.dubbo.annotation.EnableDubboConfiguration;

@SpringBootApplication
@EnableDubboConfiguration
public class DubboProviderLauncher {
	
	public static void main(String[] args) {
		SpringApplication.run(DubboProviderLauncher.class, args);
	}
}
