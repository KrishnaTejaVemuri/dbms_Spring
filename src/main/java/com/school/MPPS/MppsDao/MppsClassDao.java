package com.school.MPPS.MppsDao;

import java.util.List;

import com.school.MPPS.MppsModel.MppsClass;

public interface MppsClassDao {
	public List<MppsClass> ClasssList();
	
	public void addMppsClass(MppsClass MppsClass);
	
	public void updateMppsClass(MppsClass MppsClass); 
	
	public void deleteMppsClass(int id);
	
	public MppsClass findMppsClassById(int id);
	
}
