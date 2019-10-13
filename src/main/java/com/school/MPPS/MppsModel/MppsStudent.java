package com.school.MPPS.MppsModel;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class MppsStudent {
		@Id
		private int MppsSid;
		@NotNull
		private String FirstName;
		private String LastName;
		@NotNull
		private int Age;
		private String Caste;
		private String Gender;
		@NotNull
		private int ClassId;
		private int SchoolId;
		public MppsStudent(int id) {
			super();
			this.MppsSid=id;
			
		}
		public int getSchoolId() {
			return SchoolId;
		}
		public void setSchoolId(int schoolId) {
			SchoolId = schoolId;
		}
		public int getClassId() {
			return ClassId;
		}
		public void setClassId(int classId) {
			ClassId = classId;
		}
		public MppsStudent() {
			super();
			
		}
		public int getMppsSid() {
			return MppsSid;
		}
		public void setMppsSid(int mppsSid) {
			MppsSid = mppsSid;
		}
		public String getFirstName() {
			return FirstName;
		}
		public void setFirstName(String firstName) {
			FirstName = firstName;
		}
		public String getLastName() {
			return LastName;
		}
		public void setLastName(String lastName) {
			LastName = lastName;
		}
		
		public int getAge() {
			return Age;
		}
		public void setAge(int age) {
			Age = age;
		}
		public String getCaste() {
			return Caste;
		}
		public void setCaste(String caste) {
			Caste = caste;
		}
		public String getGender() {
			return Gender;
		}
		public void setGender(String gender) {
			Gender = gender;
		}
		
		
	}


