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

import com.school.MPPS.MppsModel.MppsStudent;

@Repository
public class MppsStudentDaoImpl implements MppsStudentDao{
	
	NamedParameterJdbcTemplate npjt;
	@Autowired
	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
	{
	this.npjt = namedParameterJdbcTemplate ;
	}

	private static final class Mappingrow implements RowMapper<MppsStudent>
	{
		public MppsStudent mapRow(ResultSet fl,int rNo) throws SQLException
		   {
			   MppsStudent Sd=new MppsStudent();
			   Sd.setMppsSid(fl.getInt("mpps_sid"));
			   Sd.setFirstName(fl.getString("first_name"));
			   Sd.setLastName(fl.getString("last_name"));
			   Sd.setAge(fl.getInt("age"));
			   Sd.setCaste(fl.getString("caste"));
			   Sd.setClassId(fl.getInt("class_id"));
			   Sd.setGender(fl.getString("gender"));
			   Sd.setSchoolId(fl.getInt("school_id"));
			   return Sd;
			   
		   }
	}
	
	private SqlParameterSource gSPBM(MppsStudent Sd)
	   {
		   MapSqlParameterSource paramSource =new MapSqlParameterSource();
		   if(Sd!= null)
		   {
			   paramSource.addValue("mpps_sid", Sd.getMppsSid());
			   paramSource.addValue("first_name", Sd.getFirstName());
			   paramSource.addValue("last_name", Sd.getLastName());
			   paramSource.addValue("age", Sd.getAge());
			   paramSource.addValue("gender", Sd.getGender());
			   paramSource.addValue("caste",Sd.getCaste());
			   paramSource.addValue("school_id", Sd.getSchoolId());
			   paramSource.addValue("class_id", Sd.getClassId());
			   
		   }
		   
		   
		   return paramSource;
	   }
	
	@Override
	public List<MppsStudent> StudentsList() {
		String qry="select * from mpps_student";
		List<MppsStudent> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
		return stds;
	}

	@Override
	public void addMppsStudent(MppsStudent Sd) {
	String qry="insert into mpps_student(mpps_sid,first_name,last_name,age,caste,gender,school_id,class_id)) values (:mpps_sid,:first_name,:last_name,:age,:caste,:gender,:school_id,:class_id)";
	npjt.update(qry, gSPBM(Sd));
	}

	@Override
	public void updateMppsStudent(MppsStudent Sd) {
		String qry="update mpps_student set first_name=:firstname,last_name=:lastname,age=:age,gender=:gender,school_id=:school_id,class_id=:class_id where mpps_sid=:mpps_sid";
		npjt.update(qry, gSPBM(Sd));
	}

	@Override
	public void deleteMppsStudent(int id) {
		String qry="DELETE FROM mpps_student WHERE mpps_sid=:mpps_sid";
		npjt.update(qry,gSPBM(new MppsStudent(id)));
	
		
	}

	@Override
	public MppsStudent findMppsStudentById(int id) {
			String qry="SELECT * FROM mpps_student WHERE mpps_sid=:mpps_sid";
			return npjt.queryForObject(qry,gSPBM(new MppsStudent(id)),new Mappingrow());
		
	}

}
