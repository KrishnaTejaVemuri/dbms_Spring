package com.school.MPPS.MppsModel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gaurdian_PTM {
	@Id
	private int SId;
	private int GId;
	private int PTMId;
	
	public Gaurdian_PTM() {
		super();
	}
	public int getSId() {
		return SId;
	}
	public void setSId(int sId) {
		SId = sId;
	}
	public int getGId() {
		return GId;
	}
	public void setGId(int gId) {
		GId = gId;
	}
	public int getPTMId() {
		return PTMId;
	}
	public void setPTMId(int pTMId) {
		PTMId = pTMId;
	}
	

}
