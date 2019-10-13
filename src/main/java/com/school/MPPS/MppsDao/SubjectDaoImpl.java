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

import com.school.MPPS.MppsModel.Subject;

@Repository
public class SubjectDaoImpl implements SubjectDao{
	NamedParameterJdbcTemplate npjt;
	@Autowired
	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
	{
	this.npjt = namedParameterJdbcTemplate ;
	}

	private static final class Mappingrow implements RowMapper<Subject>
	{
		public Subject mapRow(ResultSet fl,int rNo) throws SQLException
		   {
			   Subject Sd=new Subject();
			   Sd.setClassId(fl.getInt("class_id"));
			   Sd.setSubId(fl.getInt("sub_id"));
			   Sd.setMppsTId(fl.getInt("mppstid"));
			   Sd.setSubjectName(fl.getString("subject_name"));
			   return Sd;
			   
		   }
	}
	
	private SqlParameterSource gSPBM(Subject Sd)
	   {
		   MapSqlParameterSource paramSource =new MapSqlParameterSource();
		   if(Sd!= null)
		   {
			   paramSource.addValue("class_id", Sd.getClassId());
			   paramSource.addValue("sub_id", Sd.getSubId());
		   }
		   
		   
		   return paramSource;
	   }
	
	
	@Override
	public List<Subject> SubjectsList() {
		// TODO Auto-generated method stub
		String qry="select * from subject";
		List<Subject> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
		return stds;
	}

	@Override
	public void addSubject(Subject Subject) {
		// TODO Auto-generated method stub
		String qry="insert into subject(sub_id,class_id,mppstid,subject_name) values (:sub_id,:class_id,:mppstid,:subject_name)";
		npjt.update(qry, gSPBM(Subject));
	}

	@Override
	public void updateSubject(Subject Subject) {
		// TODO Auto-generated method stub
		String qry="update subject set class_id=:class_id,mppstid=:mppstid,subject_name=:subject_name where sub_id=:sub_id";
		npjt.update(qry, gSPBM(Subject));
	}

	@Override
	public void deleteSubject(int id) {
		// TODO Auto-generated method stub
		String qry="DELETE FROM subject WHERE sub_id=:sub_id";
		npjt.update(qry,gSPBM(new Subject(id)));
	}

	@Override
	public Subject findSubjectById(int id) {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM subject WHERE sub_id=:sub_id";
		return npjt.queryForObject(qry,gSPBM(new Subject(id)),new Mappingrow());
		
	}
}
