package com.school.MPPS.MppsModel;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class MppsTeacher {
	@Id
	private int MppsTid;
	@NotNull
	private String FirstName;
	private String LastName;
	@NotNull
	private int Age;
	private String Caste;
	@NotNull
	private String Edq;
	@NotNull
	private String cat;
	
	public MppsTeacher(int mppsTid) {
		super();
		MppsTid = mppsTid;
	}
	public MppsTeacher() {
		super();
	}
	public int getMppsTid() {
		return MppsTid;
	}
	public void setMppsTid(int mppsTid) {
		MppsTid = mppsTid;
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
	public String getEdq() {
		return Edq;
	}
	public void setEdq(String edq) {
		Edq = edq;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
}

