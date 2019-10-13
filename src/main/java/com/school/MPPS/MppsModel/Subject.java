package com.school.MPPS.MppsModel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {

	@Id
	private int SubId;
	private String SubjectName;
	private int ClassId;
	private int MppsTId;
	
	public Subject(int subId) {
		super();
		SubId = subId;
	}
	public Subject() {
		super();
	}
	public int getSubId() {
		return SubId;
	}
	public void setSubId(int subId) {
		SubId = subId;
	}
	public String getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
	public int getClassId() {
		return ClassId;
	}
	public void setClassId(int classId) {
		ClassId = classId;
	}
	public int getMppsTId() {
		return MppsTId;
	}
	public void setMppsTId(int mppsTId) {
		MppsTId = mppsTId;
	}

}
