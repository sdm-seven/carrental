package com.lkh.ht.carrental.vo;

public class Role {
	private long RoleId;
	private String roleType;	//1:微信；2:员工；3:管理员
	private String roleName;
	private String rightCode;
	public long getRoleId() {
		return RoleId;
	}
	public void setRoleId(long roleId) {
		RoleId = roleId;
	}
	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRightCode() {
		return rightCode;
	}
	public void setRightCode(String rightCode) {
		this.rightCode = rightCode;
	}
}
