package com.bmw.progress.exception;

import com.bmw.exception.ServiceException;

public class ProgressErrorException extends ServiceException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProgressErrorException() {
        super(10400, "车辆没找到");
    }
}
