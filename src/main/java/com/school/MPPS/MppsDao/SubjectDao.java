package com.school.MPPS.MppsDao;

import java.util.List;

import com.school.MPPS.MppsModel.Subject;


public interface SubjectDao {
public List<Subject> SubjectsList();
	
	public void addSubject(Subject Subject);
	
	public void updateSubject(Subject Subject); 
	
	public void deleteSubject(int id);
	
	public Subject findSubjectById(int id);
	
}
