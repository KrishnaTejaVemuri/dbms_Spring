package com.school.MPPS.MppsModel;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MidDayMeals {
@Id
private int MDMId;
private int NoOfStudentsAte;
private Date date;
private int MSId;
private int StaffId;

public int getStaffId() {
	return StaffId;
}
public void setStaffId(int staffId) {
	StaffId = staffId;
}
public MidDayMeals() {
	super();
}
public int getMDMId() {
	return MDMId;
}
public void setMDMId(int mDMId) {
	MDMId = mDMId;
}
public int getNoOfStudentsAte() {
	return NoOfStudentsAte;
}
public void setNoOfStudentsAte(int noOfStudentsAte) {
	NoOfStudentsAte = noOfStudentsAte;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public int getMSId() {
	return MSId;
}
public void setMSId(int mSId) {
	MSId = mSId;
}

}
