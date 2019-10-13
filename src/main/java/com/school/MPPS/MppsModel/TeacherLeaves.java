package com.school.MPPS.MppsModel;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TeacherLeaves {
@Id
private int TLId;
private Date FromDate;
private Date ToDate;
private String Type;
private int TId;
public int getTLId() {
	return TLId;
}
public void setTLId(int tLId) {
	TLId = tLId;
}
public Date getFromDate() {
	return FromDate;
}
public void setFromDate(Date fromDate) {
	FromDate = fromDate;
}
public Date getToDate() {
	return ToDate;
}
public void setToDate(Date toDate) {
	ToDate = toDate;
}
public String getType() {
	return Type;
}
public void setType(String type) {
	Type = type;
}
public int getTId() {
	return TId;
}
public void setTId(int tId) {
	TId = tId;
}
public TeacherLeaves() {
	super();
}

}
