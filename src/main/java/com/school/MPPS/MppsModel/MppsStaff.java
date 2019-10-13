package com.school.MPPS.MppsModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class MppsStaff {
@Id
private int StaffId;
@NotNull
private String Stname;
@NotNull
private String Work;
private String StaffPhone;
private String Gender;

public MppsStaff(int staffId) {
	super();
	StaffId = staffId;
}
public int getStaffId() {
	return StaffId;
}
public void setStaffId(int staffId) {
	StaffId = staffId;
}
public String getStname() {
	return Stname;
}
public void setStname(String stname) {
	Stname = stname;
}
public String getWork() {
	return Work;
}
public void setWork(String work) {
	Work = work;
}
public String getStaffPhone() {
	return StaffPhone;
}
public void setStaffPhone(String staffPhone) {
	StaffPhone = staffPhone;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public MppsStaff() {
	super();
}

}
