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
@TableName("t_member")
public class Member extends Model<Member> {

    private static final long serialVersionUID = 1L;

    /**
     * 会员编号
     */
	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 会员帐号
     */
	private String account;
    /**
     * 会员密码
     */
	private String pwd;
    /**
     * 会员昵称
     */
	private String nick;
    /**
     * 最后登录时间
     */
	@TableField("login_time")
	private Date loginTime;
    /**
     * 登录次数
     */
	@TableField("login_num")
	private Integer loginNum;
    /**
     * 最后登录ip
     */
	@TableField("login_ip")
	private String loginIp;
    /**
     * 在线状态
     */
	@TableField("online_status")
	private Integer onlineStatus;
    /**
     * 代理接口
     */
	@TableField("parent_id")
	private Integer parentId;
    /**
     * 用户状态0正常1停用2连锁3未激活
     */
	@TableField("use_status")
	private Integer useStatus;
    /**
     * 投注状态 0正常1禁止投注2联锁
     */
	@TableField("betting_status")
	private Integer bettingStatus;
    /**
     * 是否处于黑名单中 0正常 1无法存提款
     */
	@TableField("black_status")
	private Integer blackStatus;
	@TableField("session_id")
	private String sessionId;


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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Integer getLoginNum() {
		return loginNum;
	}

	public void setLoginNum(Integer loginNum) {
		this.loginNum = loginNum;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public Integer getOnlineStatus() {
		return onlineStatus;
	}

	public void setOnlineStatus(Integer onlineStatus) {
		this.onlineStatus = onlineStatus;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getUseStatus() {
		return useStatus;
	}

	public void setUseStatus(Integer useStatus) {
		this.useStatus = useStatus;
	}

	public Integer getBettingStatus() {
		return bettingStatus;
	}

	public void setBettingStatus(Integer bettingStatus) {
		this.bettingStatus = bettingStatus;
	}

	public Integer getBlackStatus() {
		return blackStatus;
	}

	public void setBlackStatus(Integer blackStatus) {
		this.blackStatus = blackStatus;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Member{" +
			"id=" + id +
			", account=" + account +
			", pwd=" + pwd +
			", nick=" + nick +
			", loginTime=" + loginTime +
			", loginNum=" + loginNum +
			", loginIp=" + loginIp +
			", onlineStatus=" + onlineStatus +
			", parentId=" + parentId +
			", useStatus=" + useStatus +
			", bettingStatus=" + bettingStatus +
			", blackStatus=" + blackStatus +
			", sessionId=" + sessionId +
			"}";
	}
}
