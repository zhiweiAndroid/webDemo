package bean;

public class JsonResult<T> {
	private boolean ok;
	private int code;
	private String message;
	
	private T result;
	public boolean isOk() {
		return ok;
	}
	public void setOk(boolean ok) {
		this.ok = ok;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	
	public static <T> JsonResult<T> ok(T value) {
		JsonResult<T> result = new JsonResult<T>();
		result.ok = true;
		result.result = value;
		return result;
	}
	
	public static <T> JsonResult<T> ok(int code) {
		JsonResult<T> result = new JsonResult<T>();
		result.ok = true;
		result.code = code;
		return result;
	}
	
	public static <T> JsonResult<T> ok(int code, T value) {
		JsonResult<T> result = new JsonResult<T>();
		result.ok = true;
		result.code = code;
		result.result = value;
		return result;
	}
	
	
	public static <T> JsonResult<T> ok() {
		JsonResult<T> result = new JsonResult<T>();
		result.ok = true;
		result.code = ResultCode.SIGN_OK;
		return result;
	}
	public static <T> JsonResult<T> ok(T value, String message) {
		JsonResult<T> result = new JsonResult<T>();
		result.ok = true;
		result.result = value;
		result.message = message;
		return result;
	}
	public static <T> JsonResult<T> ok(int code, String message) {
		JsonResult<T> result = new JsonResult<T>();
		result.ok = true;
		
		result.message = message;
		return result;
	}
	public static <T> JsonResult<T> error() {
		JsonResult<T> result = new JsonResult<T>();
		result.ok = false;
		result.message = ResultMessage.UNKNOWN_EXCEPTION;
		return result;
	}
	
	public static <T> JsonResult<T> error(int code, String message) {
		JsonResult<T> result = new JsonResult<T>();
		result.ok = false;
		result.code = code;
		result.message = message;
		return result;
	}
	
	public static <T> JsonResult<T> error(int code, String message, T value) {
		JsonResult<T> result = new JsonResult<T>();
		result.ok = false;
		result.code = code;
		result.message = message;
		result.result = value;
		return result;
	}
	
	public static <T> JsonResult<T> error(T value) {
		JsonResult<T> result = new JsonResult<T>();
		result.ok = false;
		result.result = value;
		return result;
	}
	
	public static <T> JsonResult<T> error(int code) {
		JsonResult<T> result = new JsonResult<T>();
		result.ok = false;
		result.code = code;
		result.message = ResultMessage.UNLAWFUL_REQUEST;
		return result;
	}
	
	public static <T> JsonResult<T> error(T value, String message) {
		JsonResult<T> result = new JsonResult<T>();
		result.ok = false;
		result.result = value;
		result.message = message;
		return result;
	}
	
	@Override
	public String toString() {
		return "JsonResult [ok=" + ok + ", code=" + code + ", message="
				+ message + ", result=" + result + "]";
	}
}

