package com.school.MPPS.MppsModel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gaurdian {
@Id
private int MppsSid;
private int MppsGid;
private String GName;
private String Relation;

public Gaurdian() {
	super();
}
public int getMppsSid() {
	return MppsSid;
}
public void setMppsSid(int mppsSid) {
	MppsSid = mppsSid;
}
public int getMppsGid() {
	return MppsGid;
}
public void setMppsGid(int mppsGid) {
	MppsGid = mppsGid;
}
public String getGName() {
	return GName;
}
public void setGName(String gName) {
	GName = gName;
}
public String getRelation() {
	return Relation;
}
public void setRelation(String relation) {
	Relation = relation;
}

}
