package com.school.MPPS.MppsService;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.MPPS.MppsDao.MppsStudentDao;
import com.school.MPPS.MppsModel.MppsStudent;

@Service
@Component
public class MppsStudentServiceImpl implements MppsStudentService{

	MppsStudentDao msd;

	public void setMppsstudentdao(MppsStudentDao mppsstudentdao) {
		this.msd = mppsstudentdao;
	}

	@Override
	public List<MppsStudent> StudentsList() {
	
		return msd.StudentsList();
	}

	@Override
	public void addMppsStudent(MppsStudent MppsStudent) {
		// TODO Auto-generated method stub
		msd.addMppsStudent(MppsStudent);
	}

	@Override
	public void updateMppsStudent(MppsStudent MppsStudent) {
		// TODO Auto-generated method stub
		msd.updateMppsStudent(MppsStudent);
	}

	@Override
	public void deleteMppsStudent(int id) {
		// TODO Auto-generated method stub
		msd.deleteMppsStudent(id);
	}

	@Override
	public MppsStudent findMppsStudentById(int id) {
		// TODO Auto-generated method stub
		return msd.findMppsStudentById(id);
	}

}
