package com.dubbo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dubbo.api.DubboService;
import com.reger.dubbo.annotation.Inject;

@RestController
public class IndexController {

	@Inject
	private DubboService dubboService;
	
	@RequestMapping("/add/{a}/{b}")
	public int add(@PathVariable int a, @PathVariable int b){
		return dubboService.add(a, b);
	}
	
	
}
