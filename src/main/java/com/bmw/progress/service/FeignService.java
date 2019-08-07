package com.bmw.progress.service;

import org.springframework.web.bind.annotation.PathVariable;

import feign.RequestLine;
//@Headers({"Content-Type: application/json"})
//@Component
//@FeignClient(name = "bmw-progress", fallback = BackUPCall.class)
//@FeignClient(name = "dashboard-reservation", url = "${api.gatewayUri}", fallback = BackUPCall.class, configuration = FeignConfig.class )
public interface FeignService {
	
//	@GetMapping(path = "/{contractcode}/{businessunit}/ping")
	@RequestLine("GET /{contractcode}/{businessunit}/ping")
    String ping(@PathVariable(value="contractcode") String contractcode,@PathVariable(value="businessunit") String businessunit);
}
