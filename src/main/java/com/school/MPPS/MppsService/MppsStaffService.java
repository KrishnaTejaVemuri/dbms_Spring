package com.school.MPPS.MppsService;

import java.util.List;

import com.school.MPPS.MppsModel.MppsStaff;

public interface MppsStaffService {

public List<MppsStaff> StaffsList();
	
	public void addMppsStaff(MppsStaff MppsStaff);
	
	public void updateMppsStaff(MppsStaff MppsStaff); 
	
	public void deleteMppsStaff(int id);
	
	public MppsStaff findMppsStaffById(int id);
	
}
