package com.rails.ecommerce.core.student.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

 /**
 *  Class Name: StudentInfo.java
 *  Function:学生表
 *  
 *  Modifications:   
 *  
 *  @author gxl  DateTime 2015-1-9 上午10:08:46    
 *  @version 1.0 
 */
@Entity
@Table(name = "lq_student_info")
public class StudentInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "st_id")
	private String stId;
	
	@Column(name = "_st_idcard")
	private String _stIdcard;
	
	@Column(name = "st_no")
	private String stNo;
	
	@Column(name = "st_name")
	private String stName;
	
	@Column(name = "qq")
	private String qq;
	
	@Column(name = "remark")
	private String remark;

	@Column(name = "st_sex")
	private String stSex;
	
	@Column(name = "st_addr", length=255)
	private String stAddr;
	
	@Column(name = "lxdz", length=255)
	private String lxdz;
	
	@Column(name = "st_idcard")
	private String stIdcard;

	@Column(name = "st_otcard")
	private String stOtcard;

	@Column(name = "st_phone")
	private String stPhone;
	
	@Column(name = "jgids")
	private String jgids;
	
	@Column(name = "st_handset")
	private String stHandset;
	
	@Column(name = "st_ctype")
	private String stCtype;
	
	@Column(name = "st_leadcarddate")
	private Date stLeadcarddate;
	
	@Column(name = "st_sign")
	private String stSign;
	
	@Column(name = "st_pwd")
	private String stPwd;
	
	@Column(name = "st_classsign")
	private String stClasssign;
	
	@Column(name = "st_classsname")
	private String stClasssname;
	
	@Column(name = "lxxzrq")
	private Date lxxzrq;
	
	@Column(name = "bmf")
	private String bmf;
	
	@Column(name = "bmftype")
	private String bmftype;
	
	@Column(name = "bmrq")
	private Date bmrq;
	
	@Column(name = "bmtbman")
	private String bmtbman;
	
	@Column(name = "zhlb")
	private String zhlb;
	
	@Column(name = "sqcx")
	private String sqcx;
	
	@Column(name = "sqcxname")
	private String sqcxname;
	
	@Column(name = "jxname")
	private String jxname;
	
	@Column(name = "jxid")
	private String jxid;

	@Column(name = "fpsj")
	private String fpsj;
	
	@Column(name = "ssfy")
	private String ssfy;
	
	@Column(name = "stauts")
	private String stauts;
	
	@Column(name = "stautsname")
	private String stautsname;
	
	@Column(name = "usexss")
	private String usexss;

	@Column(name = "xlxss")
	private String xlxss;
	
	@Column(name = "yywlxss")
	private String yywlxss;
	
	@Column(name = "syxss")
	private String syxss;
	
	@Column(name = "zfxss")
	private String zfxss;
	
	@Column(name = "gmxss")
	private String gmxss;
	
	@Column(name = "xjbj")
	private String xjbj;
	
	@Column(name = "xybmd")
	private String xybmd;
	
	@Column(name = "st_ctypename")
	private String stCtypename;
	
	@Column(name = "fpjsname")
	private String fpjsname;
	
	@Column(name = "fpzwh")
	private String fpzwh;
	
	@Column(name = "sfzx")
	private String sfzx;
	
	@Column(name = "ifjdwzcf")
	private String ifjdwzcf;
	
	@Column(name = "cnbh")
	private String cnbh;
	
	@Column(name = "count_number")
	private String countNumber;
	
	@Column(name = "jgid")
	private String jgid;
	
	@Column(name = "xxzh")
	private String xxzh;
	
	@Column(name = "xxzt")
	private String xxzt;
	
	@Column(name = "st_linkman")
	private String stLinkman;
	
	@Column(name = "st_linkmanp")
	private String stLinkmanp;
	
	@Column(name = "sc_id")
	private String scId;

	public String getStId() {
		return stId;
	}

	public void setStId(String stId) {
		this.stId = stId;
	}

	public String get_stIdcard() {
		return _stIdcard;
	}

	public void set_stIdcard(String _stIdcard) {
		this._stIdcard = _stIdcard;
	}

	public String getStNo() {
		return stNo;
	}

	public void setStNo(String stNo) {
		this.stNo = stNo;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public String getStSex() {
		return stSex;
	}

	public void setStSex(String stSex) {
		this.stSex = stSex;
	}

	public String getStAddr() {
		return stAddr;
	}

	public void setStAddr(String stAddr) {
		this.stAddr = stAddr;
	}

	public String getLxdz() {
		return lxdz;
	}

	public void setLxdz(String lxdz) {
		this.lxdz = lxdz;
	}

	public String getStIdcard() {
		return stIdcard;
	}

	public void setStIdcard(String stIdcard) {
		this.stIdcard = stIdcard;
	}

	public String getStOtcard() {
		return stOtcard;
	}

	public void setStOtcard(String stOtcard) {
		this.stOtcard = stOtcard;
	}
	
	public String getStPhone() {
		return stPhone;
	}

	public void setStPhone(String stPhone) {
		this.stPhone = stPhone;
	}

	public String getJgids() {
		return jgids;
	}

	public void setJgids(String jgids) {
		this.jgids = jgids;
	}

	public String getStHandset() {
		return stHandset;
	}

	public void setStHandset(String stHandset) {
		this.stHandset = stHandset;
	}

	public String getStCtype() {
		return stCtype;
	}

	public void setStCtype(String stCtype) {
		this.stCtype = stCtype;
	}

	public Date getStLeadcarddate() {
		return stLeadcarddate;
	}

	public void setStLeadcarddate(Date stLeadcarddate) {
		this.stLeadcarddate = stLeadcarddate;
	}

	public String getStSign() {
		return stSign;
	}

	public void setStSign(String stSign) {
		this.stSign = stSign;
	}

	public String getStPwd() {
		return stPwd;
	}

	public void setStPwd(String stPwd) {
		this.stPwd = stPwd;
	}

	public String getStClasssign() {
		return stClasssign;
	}

	public void setStClasssign(String stClasssign) {
		this.stClasssign = stClasssign;
	}

	public String getStClasssname() {
		return stClasssname;
	}

	public void setStClasssname(String stClasssname) {
		this.stClasssname = stClasssname;
	}

	public Date getLxxzrq() {
		return lxxzrq;
	}

	public void setLxxzrq(Date lxxzrq) {
		this.lxxzrq = lxxzrq;
	}

	public String getBmf() {
		return bmf;
	}

	public void setBmf(String bmf) {
		this.bmf = bmf;
	}

	public String getBmftype() {
		return bmftype;
	}

	public void setBmftype(String bmftype) {
		this.bmftype = bmftype;
	}

	public Date getBmrq() {
		return bmrq;
	}

	public void setBmrq(Date bmrq) {
		this.bmrq = bmrq;
	}

	public String getBmtbman() {
		return bmtbman;
	}

	public void setBmtbman(String bmtbman) {
		this.bmtbman = bmtbman;
	}

	public String getZhlb() {
		return zhlb;
	}

	public void setZhlb(String zhlb) {
		this.zhlb = zhlb;
	}

	public String getSqcx() {
		return sqcx;
	}

	public void setSqcx(String sqcx) {
		this.sqcx = sqcx;
	}

	public String getSqcxname() {
		return sqcxname;
	}

	public void setSqcxname(String sqcxname) {
		this.sqcxname = sqcxname;
	}

	public String getJxname() {
		return jxname;
	}

	public void setJxname(String jxname) {
		this.jxname = jxname;
	}

	public String getJxid() {
		return jxid;
	}

	public void setJxid(String jxid) {
		this.jxid = jxid;
	}
	
	public String getFpsj() {
		return fpsj;
	}

	public void setFpsj(String fpsj) {
		this.fpsj = fpsj;
	}

	public String getSsfy() {
		return ssfy;
	}

	public void setSsfy(String ssfy) {
		this.ssfy = ssfy;
	}

	public String getStauts() {
		return stauts;
	}

	public void setStauts(String stauts) {
		this.stauts = stauts;
	}

	public String getStautsname() {
		return stautsname;
	}

	public void setStautsname(String stautsname) {
		this.stautsname = stautsname;
	}

	public String getUsexss() {
		return usexss;
	}

	public void setUsexss(String usexss) {
		this.usexss = usexss;
	}
	
	public String getXlxss() {
		return xlxss;
	}

	public void setXlxss(String xlxss) {
		this.xlxss = xlxss;
	}

	public String getYywlxss() {
		return yywlxss;
	}

	public void setYywlxss(String yywlxss) {
		this.yywlxss = yywlxss;
	}

	public String getSyxss() {
		return syxss;
	}

	public void setSyxss(String syxss) {
		this.syxss = syxss;
	}

	public String getZfxss() {
		return zfxss;
	}

	public void setZfxss(String zfxss) {
		this.zfxss = zfxss;
	}

	public String getGmxss() {
		return gmxss;
	}

	public void setGmxss(String gmxss) {
		this.gmxss = gmxss;
	}

	public String getXjbj() {
		return xjbj;
	}

	public void setXjbj(String xjbj) {
		this.xjbj = xjbj;
	}

	public String getXybmd() {
		return xybmd;
	}

	public void setXybmd(String xybmd) {
		this.xybmd = xybmd;
	}

	public String getStCtypename() {
		return stCtypename;
	}

	public void setStCtypename(String stCtypename) {
		this.stCtypename = stCtypename;
	}

	public String getFpjsname() {
		return fpjsname;
	}

	public void setFpjsname(String fpjsname) {
		this.fpjsname = fpjsname;
	}

	public String getFpzwh() {
		return fpzwh;
	}

	public void setFpzwh(String fpzwh) {
		this.fpzwh = fpzwh;
	}

	public String getSfzx() {
		return sfzx;
	}

	public void setSfzx(String sfzx) {
		this.sfzx = sfzx;
	}

	public String getIfjdwzcf() {
		return ifjdwzcf;
	}

	public void setIfjdwzcf(String ifjdwzcf) {
		this.ifjdwzcf = ifjdwzcf;
	}

	public String getCnbh() {
		return cnbh;
	}

	public void setCnbh(String cnbh) {
		this.cnbh = cnbh;
	}

	public String getCountNumber() {
		return countNumber;
	}

	public void setCountNumber(String countNumber) {
		this.countNumber = countNumber;
	}

	public String getJgid() {
		return jgid;
	}

	public void setJgid(String jgid) {
		this.jgid = jgid;
	}

	public String getXxzh() {
		return xxzh;
	}

	public void setXxzh(String xxzh) {
		this.xxzh = xxzh;
	}

	public String getXxzt() {
		return xxzt;
	}

	public void setXxzt(String xxzt) {
		this.xxzt = xxzt;
	}

	public String getStLinkman() {
		return stLinkman;
	}

	public void setStLinkman(String stLinkman) {
		this.stLinkman = stLinkman;
	}

	public String getStLinkmanp() {
		return stLinkmanp;
	}

	public void setStLinkmanp(String stLinkmanp) {
		this.stLinkmanp = stLinkmanp;
	}

	public String getScId() {
		return scId;
	}

	public void setScId(String scId) {
		this.scId = scId;
	}
	
	
}
