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

import com.school.MPPS.MppsModel.MppsTeacher;

@Repository
public class MppsTeacherDaoImpl implements MppsTeacherDao{

	NamedParameterJdbcTemplate npjt;
	@Autowired
	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
	{
	this.npjt = namedParameterJdbcTemplate ;
	}

	private static final class Mappingrow implements RowMapper<MppsTeacher>
	{
		public MppsTeacher mapRow(ResultSet fl,int rNo) throws SQLException
		   {
			   MppsTeacher Sd=new MppsTeacher();
			   Sd.setMppsTid(fl.getInt("mpps_tid"));
			   Sd.setFirstName(fl.getString("first_name"));
			   Sd.setLastName(fl.getString("last_name"));
			   Sd.setAge(fl.getInt("age"));
			   Sd.setCaste(fl.getString("caste"));
			   Sd.setCat(fl.getString("cat"));
			   Sd.setEdq(fl.getString("edq"));
			   return Sd;
			   
		   }
	}
	
	private SqlParameterSource gSPBM(MppsTeacher Sd)
	   {
		   MapSqlParameterSource paramSource =new MapSqlParameterSource();
		   if(Sd!= null)
		   {
			   paramSource.addValue("mpps_tid", Sd.getMppsTid());
			   paramSource.addValue("first_name", Sd.getFirstName());
			   paramSource.addValue("last_name", Sd.getLastName());
			   paramSource.addValue("age", Sd.getAge());
			   paramSource.addValue("edq", Sd.getEdq());
			   paramSource.addValue("caste",Sd.getCaste());
			   paramSource.addValue("cat", Sd.getCat());
			   
		   }
		   return paramSource;
	   }
	
	@Override
	public List<MppsTeacher> TeachersList() {
		// TODO Auto-generated method stub
		String qry="select * from mpps_teacher";
		List<MppsTeacher> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
		return stds;
	}

	@Override
	public void addMppsTeacher(MppsTeacher MppsTeacher) {
		// TODO Auto-generated method stub
		String qry="insert into mpps_teacher(mpps_tid,first_name,last_name,age,caste,cat,edq)) values (:mpps_sid,:first_name,:last_name,:age,:caste,:cat,:edq)";
		npjt.update(qry, gSPBM(MppsTeacher));
		
	}

	@Override
	public void updateMppsTeacher(MppsTeacher MppsTeacher) {
		// TODO Auto-generated method stub
		String qry="update mpps_teacher set first_name=:firstname,last_name=:lastname,age=:age,cat=:cat,edq=:edq where mpps_tid=:mpps_tid";
		npjt.update(qry, gSPBM(MppsTeacher));
		
	}

	@Override
	public void deleteMppsTeacher(int id) {
		// TODO Auto-generated method stub
		String qry="DELETE FROM mpps_teacher WHERE mpps_tid=:mpps_tid";
		npjt.update(qry,gSPBM(new MppsTeacher(id)));
		
	}

	@Override
	public MppsTeacher findMppsTeacherById(int id) {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM mpps_teacher WHERE mpps_tid=:mpps_tid";
		return npjt.queryForObject(qry,gSPBM(new MppsTeacher(id)),new Mappingrow());
	
	}
	

}
