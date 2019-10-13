package com.school.MPPS.MppsModel;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class PrevSchool {

	@Id
	private int SchoolId;
	@NotNull
	private	String SchoolName;
	private	String SchoolAddress;
	private	String ContactNo;
	public PrevSchool() {
		super();
	}
	public int getSchoolId() {
		return SchoolId;
	}
	public void setSchoolId(int schoolId) {
		SchoolId = schoolId;
	}
	public String getSchoolName() {
		return SchoolName;
	}
	public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	}
	public String getSchoolAddress() {
		return SchoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		SchoolAddress = schoolAddress;
	}
	public String getContactNo() {
		return ContactNo;
	}
	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	
}
