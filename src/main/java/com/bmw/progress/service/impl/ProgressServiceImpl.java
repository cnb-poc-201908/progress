package com.bmw.progress.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmw.progress.exception.ProgressErrorException;
import com.bmw.progress.service.CDKService;
import com.bmw.progress.service.FeignService;
import com.bmw.progress.service.ProgressService;

@Service
public class ProgressServiceImpl implements ProgressService {
	
//	@Autowired
//	private FeignService feignService;
	
//	@Autowired
//	private CDKClient cDKClient;
	
	@Override
	public String test(String id) {
		throw new ProgressErrorException();
	}

	@Override
	public String testPing() {
//		return cDKClient.ping("MBOBI", "987501");
//		return this.restTemplate.getForObject("https://stage.apigw.cdkapps.cn/service/MBOBI/987501/ping", String.class);
		return "";
	}

	
}
