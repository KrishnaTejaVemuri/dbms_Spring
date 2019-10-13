package com.school.MPPS.MppsModel;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MppsClass {
@Id
private int ClassId;
private int RoomNo;
	
		
	public MppsClass(int classId) {
	super();
	ClassId = classId;
}
	public MppsClass() {
		super();
	}
	public int getClassId() {
		return ClassId;
	}
	public void setClassId(int classId) {
		ClassId = classId;
	}
		public int getRoomNo() {
			return RoomNo;
		}
		public void setRoomNo(int roomNo) {
			RoomNo = roomNo;
		}
		
		

}
