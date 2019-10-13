package com.school.MPPS.MppsModel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Class_MDM_Rel {
@Id
private int ClassId;
private int MDMId;

public Class_MDM_Rel() {
	super();
}
public int getClassId() {
	return ClassId;
}
public void setClassId(int classId) {
	ClassId = classId;
}
public int getMDMId() {
	return MDMId;
}
public void setMDMId(int mDMId) {
	MDMId = mDMId;
}
}
