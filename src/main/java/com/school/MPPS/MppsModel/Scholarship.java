package com.school.MPPS.MppsModel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Scholarship {
@Id
private int Aplid;
private float AppliedAmount;
private float GrantAmount;
private String Status;
private int MppsSid;
public int getAplid() {
	return Aplid;
}
public void setAplid(int aplid) {
	Aplid = aplid;
}
public float getAppliedAmount() {
	return AppliedAmount;
}
public void setAppliedAmount(float appliedAmount) {
	AppliedAmount = appliedAmount;
}

public float getGrantAmount() {
	return GrantAmount;
}
public void setGrantAmount(float grantAmount) {
	GrantAmount = grantAmount;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
public int getMppsSid() {
	return MppsSid;
}
public void setMppsSid(int mppsSid) {
	MppsSid = mppsSid;
}
public Scholarship() {
	super();
}
}
