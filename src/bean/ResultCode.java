package bean;

public class ResultCode {
	/** Token失效 */
	public static final int INVALID_TOKEN = -99;
	/** 登录错误 */
	public static final int LOGIN_ERROR = -10;
	/** 错误的参数 */
	public static final int INVALID_PARAM = -100;
	/** 业务处理错误 */
	public static final int SERVICE_ERROR = -101;
	/** 不存在 */
	public static final int NOT_EXISTS = -102;
	/** 没有改变 */
	public static final int NOT_MODIFY = 304;
	/** 进件审批退回 */
	public static final int APP_RETURN = -105;
	/** 升级 */
	public static final int VERSION_UPGRAD = -103;
	/** 签约成功 */
	public static final int SIGN_OK = 100;
	/** 签约失败 */
	public static final int SIGN_FAIL = -106;
	/** 签约中 */
	public static final int SIGN_ING = -107;
	/**签名验证失败**/
	public static final int SIGN_INVALID = -108;
	/**商户编号验证失败**/
	public static final int RETAIL_ID_INVALID = -109;
	/**过期时间**/
	public static final int INVOKE_OUT_TIME = -110;
}
