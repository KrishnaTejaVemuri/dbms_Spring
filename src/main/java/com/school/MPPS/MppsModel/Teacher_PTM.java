package com.school.MPPS.MppsModel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher_PTM {
@Id
private int PTMId;
private int Tid;

public Teacher_PTM() {
	super();
	// TODO Auto-generated constructor stub
}
public int getPTMId() {
	return PTMId;
}
public void setPTMId(int pTMId) {
	PTMId = pTMId;
}
public int getTid() {
	return Tid;
}
public void setTid(int tid) {
	Tid = tid;
}
}
