package com.school.MPPS.MppsModel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CashBookSSA {
@Id
private int SGId;
private float MaintainanceGrant;
private float SchoolGrant;
private String month;
public int getSGId() {
	return SGId;
}
public void setSGId(int sGId) {
	SGId = sGId;
}
public float getMaintainanceGrant() {
	return MaintainanceGrant;
}
public void setMaintainanceGrant(float maintainanceGrant) {
	MaintainanceGrant = maintainanceGrant;
}
public float getSchoolGrant() {
	return SchoolGrant;
}
public void setSchoolGrant(float schoolGrant) {
	SchoolGrant = schoolGrant;
}
public String getMonth() {
	return month;
}
public void setMonth(String month) {
	this.month = month;
}
public CashBookSSA() {
	super();
}

}
