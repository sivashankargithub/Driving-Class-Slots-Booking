package pkg1.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class StudentEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stu_id;
	private String stu_name;
	private long stu_contact;
	private String pincode;
	private String stu_gender;
	private String stu_email;
	
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public long getStu_contact() {
		return stu_contact;
	}
	public void setStu_contact(long stu_contact) {
		this.stu_contact = stu_contact;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getStu_gender() {
		return stu_gender;
	}
	public void setStu_gender(String stu_gender) {
		this.stu_gender = stu_gender;
	}
	public String getStu_email() {
		return stu_email;
	}
	public void setStu_email(String stu_email) {
		this.stu_email = stu_email;
	}
	
	public StudentEntity(int stu_id, String stu_name, long stu_contact, String pincode, String stu_gender,
			String stu_email) {
		super();
		this.stu_id = stu_id;
		this.stu_name = stu_name;
		this.stu_contact = stu_contact;
		this.pincode = pincode;
		this.stu_gender = stu_gender;
		this.stu_email = stu_email;
	}
	public StudentEntity() {
		super();
	}
	
	
}
