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

import com.school.MPPS.MppsModel.MppsClass;

@Repository
public class MppsClassDaoImpl implements MppsClassDao{
	NamedParameterJdbcTemplate npjt;
	@Autowired
	public void setNameParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) 
	{
	this.npjt = namedParameterJdbcTemplate ;
	}

	private static final class Mappingrow implements RowMapper<MppsClass>
	{
		public MppsClass mapRow(ResultSet fl,int rNo) throws SQLException
		   {
			   MppsClass Sd=new MppsClass();
			   Sd.setClassId(fl.getInt("class_id"));
			   Sd.setRoomNo(fl.getInt("room_no"));
			   return Sd;
			   
		   }
	}
	
	private SqlParameterSource gSPBM(MppsClass Sd)
	   {
		   MapSqlParameterSource paramSource =new MapSqlParameterSource();
		   if(Sd!= null)
		   {
			   paramSource.addValue("class_id", Sd.getClassId());
			   paramSource.addValue("room_no", Sd.getRoomNo());
		   }
		   
		   
		   return paramSource;
	   }
	
	
	@Override
	public List<MppsClass> ClasssList() {
		// TODO Auto-generated method stub
		String qry="select * from mpps_class";
		List<MppsClass> stds=npjt.query(qry,gSPBM(null) , new Mappingrow());
		return stds;
	}

	@Override
	public void addMppsClass(MppsClass MppsClass) {
		// TODO Auto-generated method stub
		String qry="insert into mpps_class(class_id,room_no) values (:class_id,:room_no)";
		npjt.update(qry, gSPBM(MppsClass));
	}

	@Override
	public void updateMppsClass(MppsClass MppsClass) {
		// TODO Auto-generated method stub
		String qry="update mpps_class set room_no=:room_no where class_id=:class_id";
		npjt.update(qry, gSPBM(MppsClass));
	}

	@Override
	public void deleteMppsClass(int id) {
		// TODO Auto-generated method stub
		String qry="DELETE FROM mpps_class WHERE class_id=:class_id";
		npjt.update(qry,gSPBM(new MppsClass(id)));
	}

	@Override
	public MppsClass findMppsClassById(int id) {
		// TODO Auto-generated method stub
		String qry="SELECT * FROM mpps_class WHERE class_id=:class_id";
		return npjt.queryForObject(qry,gSPBM(new MppsClass(id)),new Mappingrow());
		
	}
}
