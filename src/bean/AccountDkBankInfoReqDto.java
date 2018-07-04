package bean;

import java.io.Serializable;

public class AccountDkBankInfoReqDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3883761053766592063L;
	/** 银行账号 */
	private String bankAccount;
	
	private String bankName;
	
	/** 预留手机 */
	private String phone;
	/**身份证号*/
	private String cerdNo;
	/**姓名*/
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCerdNo() {
		return cerdNo;
	}
	public void setCerdNo(String cerdNo) {
		this.cerdNo = cerdNo;
	}
	
}
