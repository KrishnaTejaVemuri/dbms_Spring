package com.school.MPPS.MppsModel;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ParentTeacherMeetLog {
@Id
private int PTMId;
private Date dom;
private String Remarks;


public ParentTeacherMeetLog() {
	super();
}
public int getPTMId() {
	return PTMId;
}
public void setPTMId(int pTMId) {
	PTMId = pTMId;
}
public Date getDom() {
	return dom;
}
public void setDom(Date dom) {
	this.dom = dom;
}
public String getRemarks() {
	return Remarks;
}
public void setRemarks(String remarks) {
	Remarks = remarks;
}

}
