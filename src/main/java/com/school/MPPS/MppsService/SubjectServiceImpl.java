package com.school.MPPS.MppsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.MPPS.MppsDao.SubjectDao;
import com.school.MPPS.MppsModel.Subject;

@Service
@Component
public class SubjectServiceImpl implements SubjectService{
SubjectDao sd;

@Autowired
public void setSd(SubjectDao sd) {
	this.sd = sd;
}

@Override
public List<Subject> SubjectsList() {
	// TODO Auto-generated method stub
	return sd.SubjectsList();
}

@Override
public void addSubject(Subject Subject) {
	// TODO Auto-generated method stub
	sd.addSubject(Subject);
}

@Override
public void updateSubject(Subject Subject) {
	// TODO Auto-generated method stub
	sd.updateSubject(Subject);
}

@Override
public void deleteSubject(int id) {
	// TODO Auto-generated method stub
	sd.deleteSubject(id);
}

@Override
public Subject findSubjectById(int id) {
	// TODO Auto-generated method stub
	return sd.findSubjectById(id);
}


}
