package com.school.MPPS.MppsDao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.school.MPPS.MppsModel.MppsStaff;
@Repository
public class MppsStaffDaoImpl implements MppsStaffDao {

	NamedParameterJdbcTemplate npjt;
	@Autowired
	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
	{
	this.npjt = namedParameterJdbcTemplate ;
	}

	private static final class Mappingrow implements RowMapper<MppsStaff>
	{
		public MppsStaff mapRow(ResultSet fl,int rNo) throws SQLException
		   {
			   MppsStaff Sd=new MppsStaff();
			   Sd.setStaffId(fl.getInt("staff_id"));
			   Sd.setStname(fl.getString("stname"));
			   Sd.setWork(fl.getString("work"));
			   Sd.setGender(fl.getString("gender"));
			   Sd.setStaffPhone(fl.getString("staff_phone"));
			   return Sd;
			   
		   }
	}
	
	private SqlParameterSource gSPBM(MppsStaff Sd)
	   {
		   MapSqlParameterSource paramSource =new MapSqlParameterSource();
		   if(Sd!= null)
		   {
			   paramSource.addValue("staff_id", Sd.getStaffId());
			   paramSource.addValue("stname", Sd.getStname());
			   paramSource.addValue("work", Sd.getWork());
			   paramSource.addValue("staff_phone", Sd.getStaffPhone());
			   paramSource.addValue("gender", Sd.getGender());
			   
		   }
		   
		   
		   return paramSource;
	   }
	
	
	@Override
	public List<MppsStaff> StaffsList() {
		// TODO Auto-generated method stub
		String qry="select * from mpps_Staff";
		List<MppsStaff> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
		return stds;
	}

	@Override
	public void addMppsStaff(MppsStaff MppsStaff) {
		// TODO Auto-generated method stub
		String qry="insert into mpps_staff(staff_id,gender,staff_phone,stname,work) values (:staff_id,:gender,:staff_phone,:stname,:work)";
		npjt.update(qry, gSPBM(MppsStaff));
	}

	@Override
	public void updateMppsStaff(MppsStaff MppsStaff) {
		// TODO Auto-generated method stub
		String qry="update mpps_staff set gender=:gender,staff_phone=:staff_phone,stname=:stname,work=:work where staff_id=:staff_id";
		npjt.update(qry, gSPBM(MppsStaff));
	}

	@Override
	public void deleteMppsStaff(int id) {
		// TODO Auto-generated method stub
		String qry="DELETE FROM mpps_staff WHERE staff_id=:staff_id";
		npjt.update(qry,gSPBM(new MppsStaff(id)));
	}

	@Override
	public MppsStaff findMppsStaffById(int id) {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM mpps_staff WHERE staff_id=:staff_id";
		return npjt.queryForObject(qry,gSPBM(new MppsStaff(id)),new Mappingrow());
		
	}

}
