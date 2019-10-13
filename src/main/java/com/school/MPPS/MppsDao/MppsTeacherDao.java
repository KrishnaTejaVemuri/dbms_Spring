package com.school.MPPS.MppsDao;

import java.util.List;

import com.school.MPPS.MppsModel.MppsTeacher;

public interface MppsTeacherDao {
	

public List<MppsTeacher> TeachersList();
	
	public void addMppsTeacher(MppsTeacher MppsTeacher);
	
	public void updateMppsTeacher(MppsTeacher MppsTeacher); 
	
	public void deleteMppsTeacher(int id);
	
	public MppsTeacher findMppsTeacherById(int id);

}
