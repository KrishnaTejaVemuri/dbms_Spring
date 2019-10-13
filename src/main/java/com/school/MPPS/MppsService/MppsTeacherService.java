package com.school.MPPS.MppsService;

import java.util.List;

import com.school.MPPS.MppsModel.MppsTeacher;


public interface MppsTeacherService {

public List<MppsTeacher> TeachersList();
	
	public void addMppsTeacher(MppsTeacher MppsTeacher);
	
	public void updateMppsTeacher(MppsTeacher MppsTeacher); 
	
	public void deleteMppsTeacher(int id);
	
	public MppsTeacher findMppsTeacherById(int id);
}
