package com.asto.domain.domain;

import java.util.Date;

public class Account {
	private Integer id;
	private String account;
	private String companyId;
	private String mobile;
	private String email;
	private String ip;
	private Date gmtLastLogin;
	private Date gmtCraeted;
	private Date gmtModified;
	private String password;
	private String pwdMd5;
	private Float sumMoney;
	private String payPassword;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getGmtLastLogin() {
		return gmtLastLogin;
	}

	public void setGmtLastLogin(Date gmtLastLogin) {
		this.gmtLastLogin = gmtLastLogin;
	}

	public Date getGmtCraeted() {
		return gmtCraeted;
	}

	public void setGmtCraeted(Date gmtCraeted) {
		this.gmtCraeted = gmtCraeted;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPwdMd5() {
		return pwdMd5;
	}

	public void setPwdMd5(String pwdMd5) {
		this.pwdMd5 = pwdMd5;
	}

	public Float getSumMoney() {
		return sumMoney;
	}

	public void setSumMoney(Float sumMoney) {
		this.sumMoney = sumMoney;
	}

	public String getPayPassword() {
		return payPassword;
	}

	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}

}
