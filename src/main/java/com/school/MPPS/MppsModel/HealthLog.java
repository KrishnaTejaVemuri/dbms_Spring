package com.school.MPPS.MppsModel;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HealthLog {
@Id
private int CheckUpId;
private String Problem;
private Date date;
private int SId;

public HealthLog() {
	super();
	// TODO Auto-generated constructor stub
}
public int getCheckUpId() {
	return CheckUpId;
}
public void setCheckUpId(int checkUpId) {
	CheckUpId = checkUpId;
}
public String getProblem() {
	return Problem;
}
public void setProblem(String problem) {
	Problem = problem;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public int getSId() {
	return SId;
}
public void setSId(int sId) {
	SId = sId;
}

}
