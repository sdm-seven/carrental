package com.lkh.ht.carrental.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private long orderId;
	private String orderNo;
	private long createUserId;
	private String createUserName;
	private String createUserPhone;
	private User createUser = new User();
	private String getCarType;		//1:自取；2:送达
	private Date estiStartDate;
	private Date estiEndDate;
	private long ctId;									//车型ID
	private CarModels carModels = new CarModels();		//车型
	private List<CarModels> carModelList = new ArrayList<CarModels>();
	private String ctName;
	private String ctImgURL;
	private String ctDesc;
	private double estimateUnitPrice;
	private double totleEstiAmt;
	private long deptId = 0;
	private Dept dept = new Dept();
	private String addr;
	private long processUserId;
	private User processUser = new User();
	private Date actualStartDate;
	private long carId;
	private List<Car> carList = new ArrayList<Car>();
	private Date actualEndDate;
	private Date createTime;
	private Date updateTime;
	private String orderStatus;		//A:待取车;B:待还车;C:取消 F:完成;
	private String attr1;			//取车时照片目录
	private String attr2;			//还车时照片目录
	
	public List<CarModels> getCarModelList() {
		return carModelList;
	}
	public void setCarModelList(List<CarModels> carModelList) {
		this.carModelList = carModelList;
	}
	public String getCtName() {
		return ctName;
	}
	public void setCtName(String ctName) {
		this.ctName = ctName;
	}
	public String getCtImgURL() {
		return ctImgURL;
	}
	public void setCtImgURL(String ctImgURL) {
		this.ctImgURL = ctImgURL;
	}
	public String getCtDesc() {
		return ctDesc;
	}
	public void setCtDesc(String ctDesc) {
		this.ctDesc = ctDesc;
	}
	public double getEstimateUnitPrice() {
		return estimateUnitPrice;
	}
	public void setEstimateUnitPrice(double estimateUnitPrice) {
		this.estimateUnitPrice = estimateUnitPrice;
	}
	public List<Car> getCarList() {
		return carList;
	}
	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}
	/**
	 * @return the createUserName
	 */
	public String getCreateUserName() {
		return createUserName;
	}
	/**
	 * @param createUserName the createUserName to set
	 */
	public void setCreateUserName(String createUserName) {
		this.createUserName = createUserName;
	}
	/**
	 * @return the createUserPhone
	 */
	public String getCreateUserPhone() {
		return createUserPhone;
	}
	/**
	 * @param createUserPhone the createUserPhone to set
	 */
	public void setCreateUserPhone(String createUserPhone) {
		this.createUserPhone = createUserPhone;
	}
	/**
	 * @return the orderNo
	 */
	public String getOrderNo() {
		return orderNo;
	}
	/**
	 * @param orderNo the orderNo to set
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	/**
	 * @return the createUser
	 */
	public User getCreateUser() {
		return createUser;
	}
	/**
	 * @param createUser the createUser to set
	 */
	public void setCreateUser(User createUser) {
		this.createUser = createUser;
	}
	/**
	 * @return the processUser
	 */
	public User getProcessUser() {
		return processUser;
	}
	/**
	 * @param processUser the processUser to set
	 */
	public void setProcessUser(User processUser) {
		this.processUser = processUser;
	}
	/**
	 * @return the orderId
	 */
	public long getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the createUserId
	 */
	public long getCreateUserId() {
		return createUserId;
	}
	/**
	 * @param createUserId the createUserId to set
	 */
	public void setCreateUserId(long createUserId) {
		this.createUserId = createUserId;
	}
	/**
	 * @return the getCarType
	 */
	public String getGetCarType() {
		return getCarType;
	}
	/**
	 * @param getCarType the getCarType to set
	 */
	public void setGetCarType(String getCarType) {
		this.getCarType = getCarType;
	}
	/**
	 * @return the estiStartDate
	 */
	public Date getEstiStartDate() {
		return estiStartDate;
	}
	/**
	 * @param estiStartDate the estiStartDate to set
	 */
	public void setEstiStartDate(Date estiStartDate) {
		this.estiStartDate = estiStartDate;
	}
	/**
	 * @return the estiEndDate
	 */
	public Date getEstiEndDate() {
		return estiEndDate;
	}
	/**
	 * @param estiEndDate the estiEndDate to set
	 */
	public void setEstiEndDate(Date estiEndDate) {
		this.estiEndDate = estiEndDate;
	}
	/**
	 * @return the ctId
	 */
	public long getCtId() {
		return ctId;
	}
	/**
	 * @param ctId the ctId to set
	 */
	public void setCtId(long ctId) {
		this.ctId = ctId;
	}
	/**
	 * @return the totleEstiAmt
	 */
	public double getTotleEstiAmt() {
		return totleEstiAmt;
	}
	/**
	 * @param totleEstiAmt the totleEstiAmt to set
	 */
	public void setTotleEstiAmt(double totleEstiAmt) {
		this.totleEstiAmt = totleEstiAmt;
	}
	/**
	 * @return the deptId
	 */
	public long getDeptId() {
		return deptId;
	}
	/**
	 * @param deptId the deptId to set
	 */
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}
	/**
	 * @return the dept
	 */
	public Dept getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	/**
	 * @return the addr
	 */
	public String getAddr() {
		return addr;
	}
	/**
	 * @param addr the addr to set
	 */
	public void setAddr(String addr) {
		this.addr = addr;
	}
	/**
	 * @return the processUserId
	 */
	public long getProcessUserId() {
		return processUserId;
	}
	/**
	 * @param processUserId the processUserId to set
	 */
	public void setProcessUserId(long processUserId) {
		this.processUserId = processUserId;
	}
	/**
	 * @return the actualStartDate
	 */
	public Date getActualStartDate() {
		return actualStartDate;
	}
	/**
	 * @param actualStartDate the actualStartDate to set
	 */
	public void setActualStartDate(Date actualStartDate) {
		this.actualStartDate = actualStartDate;
	}
	/**
	 * @return the carId
	 */
	public long getCarId() {
		return carId;
	}
	/**
	 * @param carId the carId to set
	 */
	public void setCarId(long carId) {
		this.carId = carId;
	}
	/**
	 * @return the actualEndDate
	 */
	public Date getActualEndDate() {
		return actualEndDate;
	}
	/**
	 * @param actualEndDate the actualEndDate to set
	 */
	public void setActualEndDate(Date actualEndDate) {
		this.actualEndDate = actualEndDate;
	}
	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * @return the orderStatus
	 */
	public String getOrderStatus() {
		return orderStatus;
	}
	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	/**
	 * @return the attr1
	 */
	public String getAttr1() {
		return attr1;
	}
	/**
	 * @param attr1 the attr1 to set
	 */
	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}
	/**
	 * @return the attr2
	 */
	public String getAttr2() {
		return attr2;
	}
	/**
	 * @param attr2 the attr2 to set
	 */
	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}
	/**
	 * @return the carModels
	 */
	public CarModels getCarModels() {
		return carModels;
	}
	/**
	 * @param carModels the carModels to set
	 */
	public void setCarModels(CarModels carModels) {
		this.carModels = carModels;
	}
}
