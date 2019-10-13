package com.school.MPPS.MppsService;

import java.util.List;

import com.school.MPPS.MppsModel.MppsClass;

public interface MppsClassService {
public List<MppsClass> ClasssList();
	
	public void addMppsClass(MppsClass MppsClass);
	
	public void updateMppsClass(MppsClass MppsClass); 
	
	public void deleteMppsClass(int id);
	
	public MppsClass findMppsClassById(int id);
	
}
