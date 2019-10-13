package com.school.MPPS.MppsDao;

import java.util.List;

import com.school.MPPS.MppsModel.MppsStudent;

public interface MppsStudentDao {

	public List<MppsStudent> StudentsList();
	
	public void addMppsStudent(MppsStudent MppsStudent);
	
	public void updateMppsStudent(MppsStudent MppsStudent); 
	
	public void deleteMppsStudent(int id);
	
	public MppsStudent findMppsStudentById(int id);
	
}
