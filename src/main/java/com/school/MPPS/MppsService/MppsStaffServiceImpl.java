package com.school.MPPS.MppsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.school.MPPS.MppsDao.MppsStaffDao;
import com.school.MPPS.MppsModel.MppsStaff;

@Service
@Component
public class MppsStaffServiceImpl implements MppsStaffService{

	MppsStaffDao mstd;
	@Autowired
	public void setMstd(MppsStaffDao mstd) {
		this.mstd = mstd;
	}

	@Override
	public List<MppsStaff> StaffsList() {
		// TODO Auto-generated method stub
		return mstd.StaffsList();
	}

	@Override
	public void addMppsStaff(MppsStaff MppsStaff) {
		// TODO Auto-generated method stub
		mstd.addMppsStaff(MppsStaff);
	}

	@Override
	public void updateMppsStaff(MppsStaff MppsStaff) {
		// TODO Auto-generated method stub
		mstd.updateMppsStaff(MppsStaff);
	}

	@Override
	public void deleteMppsStaff(int id) {
		// TODO Auto-generated method stub
		mstd.deleteMppsStaff(id);
	}

	@Override
	public MppsStaff findMppsStaffById(int id) {
		// TODO Auto-generated method stub
		return mstd.findMppsStaffById(id);
	}

}
