/**
 * 
 */
package com.globalpay.merchantauthdataapimaven;;

/**
 * @author rajeshsaw
 *
 */
public class MerchantAuthDataResponse {
	
	private String emailId;
	private MerchantAuthDataAccess merchantAuthDataAccess;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public MerchantAuthDataAccess getMerchantAuthDataAccess() {
		return merchantAuthDataAccess;
	}
	public void setMerchantAuthDataAccess(MerchantAuthDataAccess merchantAuthDataAccess) {
		this.merchantAuthDataAccess = merchantAuthDataAccess;
	} 
}
