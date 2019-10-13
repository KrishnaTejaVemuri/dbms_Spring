package com.school.MPPS.MppsModel;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AuthoritiesVisit {
@Id
private int AuId;
private String Designation;
private String AuthName;
private Date Dov;
private String Remarks;

public AuthoritiesVisit() {
	super();
}
public int getAuId() {
	return AuId;
}
public void setAuId(int auId) {
	AuId = auId;
}
public String getDesignation() {
	return Designation;
}
public void setDesignation(String designation) {
	Designation = designation;
}
public String getAuthName() {
	return AuthName;
}
public void setAuthName(String authName) {
	AuthName = authName;
}
public Date getDov() {
	return Dov;
}
public void setDov(Date dov) {
	Dov = dov;
}
public String getRemarks() {
	return Remarks;
}
public void setRemarks(String remarks) {
	Remarks = remarks;
}

}
