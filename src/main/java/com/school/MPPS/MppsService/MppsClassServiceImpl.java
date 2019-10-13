package com.school.MPPS.MppsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.MPPS.MppsDao.MppsClassDao;
import com.school.MPPS.MppsModel.MppsClass;

@Service
@Component
public class MppsClassServiceImpl implements MppsClassService {
	MppsClassDao mcd;
	@Autowired
	public void setMcd(MppsClassDao mcd) {
		this.mcd = mcd;
	}

	@Override
	public List<MppsClass> ClasssList() {
		// TODO Auto-generated method stub
		return mcd.ClasssList();
	}

	@Override
	public void addMppsClass(MppsClass MppsClass) {
		// TODO Auto-generated method stub
		mcd.addMppsClass(MppsClass);
	}

	@Override
	public void updateMppsClass(MppsClass MppsClass) {
		// TODO Auto-generated method stub
		mcd.updateMppsClass(MppsClass);
	}

	@Override
	public void deleteMppsClass(int id) {
		// TODO Auto-generated method stub
		mcd.deleteMppsClass(id);
	}

	@Override
	public MppsClass findMppsClassById(int id) {
		// TODO Auto-generated method stub
		return mcd.findMppsClassById(id);
	}

}
