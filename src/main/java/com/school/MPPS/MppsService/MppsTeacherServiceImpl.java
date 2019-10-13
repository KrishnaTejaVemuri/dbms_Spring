package com.school.MPPS.MppsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.MPPS.MppsDao.MppsTeacherDao;
import com.school.MPPS.MppsModel.MppsTeacher;

@Service
@Component
public class MppsTeacherServiceImpl implements MppsTeacherService{

	MppsTeacherDao mtd;
	
	@Autowired
	public void setMtd(MppsTeacherDao mtd) {
		this.mtd = mtd;
	}

	@Override
	public List<MppsTeacher> TeachersList() {
		// TODO Auto-generated method stub
		return mtd.TeachersList();
	}

	@Override
	public void addMppsTeacher(MppsTeacher MppsTeacher) {
		// TODO Auto-generated method stub
		mtd.addMppsTeacher(MppsTeacher);
	}

	@Override
	public void updateMppsTeacher(MppsTeacher MppsTeacher) {
		// TODO Auto-generated method stub
		mtd.updateMppsTeacher(MppsTeacher);
	}

	@Override
	public void deleteMppsTeacher(int id) {
		// TODO Auto-generated method stub
		mtd.deleteMppsTeacher(id);
	}

	@Override
	public MppsTeacher findMppsTeacherById(int id) {
		// TODO Auto-generated method stub
		return mtd.findMppsTeacherById(id);
	}

}
