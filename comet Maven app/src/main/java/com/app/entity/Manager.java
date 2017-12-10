package com.app.entity;

public class Manager {
	// 管理员唯一识别码
	private String id;
	// 管理员姓名
	private String fn;
	// 管理员账号
	private String un;
	// 管理员密码
	private String pw;
	// 管理员地区编码
	private String region_rc;
	// 管理员行政级别
	private String grade;
	// ??
	private String parent_id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getRegion_rc() {
		return region_rc;
	}

	public void setRegion_rc(String region_rc) {
		this.region_rc = region_rc;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getParent_id() {
		return parent_id;
	}

	public void setParent_id(String parent_id) {
		this.parent_id = parent_id;
	}

}
