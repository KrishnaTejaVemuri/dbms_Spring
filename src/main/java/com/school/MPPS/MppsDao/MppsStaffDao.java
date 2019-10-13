package com.school.MPPS.MppsDao;

import java.util.List;

import com.school.MPPS.MppsModel.MppsStaff;


public interface MppsStaffDao {

public List<MppsStaff> StaffsList();
	
	public void addMppsStaff(MppsStaff MppsStaff);
	
	public void updateMppsStaff(MppsStaff MppsStaff); 
	
	public void deleteMppsStaff(int id);
	
	public MppsStaff findMppsStaffById(int id);
	
}
