package com.dubbo.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.api.DubboService;

@Service(interfaceClass = DubboService.class, interfaceName = "dubboService")
public class DubboServiceImpl implements DubboService{

	@Override
	public int add(int i, int j) {
		return i + j;
	}

}
