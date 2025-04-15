package com.user.login.model;

public class BaseResponse {
	
	private long status;
	
	private boolean error;
	
	private String message;
	
	public static BaseResponse getInstance() {
		BaseResponse baseResponse = new BaseResponse();
		baseResponse.setError(false);
		baseResponse.setStatus(200);
		baseResponse.setMessage(null);
		return baseResponse;
	}

	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
