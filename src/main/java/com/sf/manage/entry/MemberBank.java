package com.sf.manage.entry;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jeff
 * @since 2018-04-11
 */
@TableName("t_member_bank")
public class MemberBank extends Model<MemberBank> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
	@TableField("member_id")
	private Integer memberId;
	@TableField("bank_name")
	private String bankName;
	private String province;
	private String city;
	@TableField("branch_name")
	private String branchName;
	@TableField("bank_number")
	private Integer bankNumber;
	@TableField("real_name")
	private String realName;
	@TableField("bind_time")
	private Date bindTime;
	@TableField("first_choice")
	private String firstChoice;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Integer getBankNumber() {
		return bankNumber;
	}

	public void setBankNumber(Integer bankNumber) {
		this.bankNumber = bankNumber;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Date getBindTime() {
		return bindTime;
	}

	public void setBindTime(Date bindTime) {
		this.bindTime = bindTime;
	}

	public String getFirstChoice() {
		return firstChoice;
	}

	public void setFirstChoice(String firstChoice) {
		this.firstChoice = firstChoice;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "MemberBank{" +
			"id=" + id +
			", memberId=" + memberId +
			", bankName=" + bankName +
			", province=" + province +
			", city=" + city +
			", branchName=" + branchName +
			", bankNumber=" + bankNumber +
			", realName=" + realName +
			", bindTime=" + bindTime +
			", firstChoice=" + firstChoice +
			"}";
	}
}
