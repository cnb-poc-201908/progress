package com.bmw.progress.service;

import feign.Param;
import feign.RequestLine;

public interface CDKService {

	@RequestLine("GET /{contractcode}/{businessunit}/ping")
    String ping(@Param("contractcode") String contractcode,@Param("businessunit") String businessunit);
	
}
