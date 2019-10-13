package com.school.MPPS.MppsModel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MppsExam {
@Id
private int ExamId;
private String ExamName;
private float MarksObtained;
private float MaxMarks;
private int MppsSid;

public MppsExam() {
	super();
}
public String getExamName() {
	return ExamName;
}
public void setExamName(String examName) {
	ExamName = examName;
}
public int getExamId() {
	return ExamId;
}
public void setExamId(int examId) {
	ExamId = examId;
}
public float getMarksObtained() {
	return MarksObtained;
}
public void setMarksObtained(float marksObtained) {
	MarksObtained = marksObtained;
}
public float getMaxMarks() {
	return MaxMarks;
}
public void setMaxMarks(float maxMarks) {
	MaxMarks = maxMarks;
}
public int getMppsSid() {
	return MppsSid;
}
public void setMppsSid(int mppsSid) {
	MppsSid = mppsSid;
}
}
