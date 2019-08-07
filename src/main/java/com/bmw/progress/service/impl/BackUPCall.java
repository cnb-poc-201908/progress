package com.bmw.progress.service.impl;

import com.bmw.progress.service.FeignService;

public class BackUPCall implements FeignService{

	@Override
	public String ping(String contractcode, String businessunit) {
		return "back up call : ping";
	}

}
