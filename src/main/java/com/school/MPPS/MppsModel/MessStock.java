package com.school.MPPS.MppsModel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MessStock {
@Id
private int MSId;
private int NoEggs;
private String month;
private int Ricekgs;
public int getMSId() {
	return MSId;
}
public void setMSId(int mSId) {
	MSId = mSId;
}
public int getNoEggs() {
	return NoEggs;
}
public void setNoEggs(int noEggs) {
	NoEggs = noEggs;
}
public String getMonth() {
	return month;
}
public void setMonth(String month) {
	this.month = month;
}
public int getRicekgs() {
	return Ricekgs;
}
public void setRicekgs(int ricekgs) {
	Ricekgs = ricekgs;
}
public MessStock() {
	super();
}

}
