package pkg1.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="teacher")
public class TeacherEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int teach_id;
	
	String teach_name;
	@Column(nullable=false,unique=true)
	long teach_contact;
	String teach_gender;
	int teach_pincode;
	String teach_country;
	String slots;
	public int getTeach_id() {
		return teach_id;
	}
	public void setTeach_id(int teach_id) {
		this.teach_id = teach_id;
	}
	public String getTeach_name() {
		return teach_name;
	}
	public void setTeach_name(String teach_name) {
		this.teach_name = teach_name;
	}
	public long getTeach_contact() {
		return teach_contact;
	}
	public void setTeach_contact(long teach_contact) {
		this.teach_contact = teach_contact;
	}
	public String getTeach_gender() {
		return teach_gender;
	}
	public void setTeach_gender(String teach_gender) {
		this.teach_gender = teach_gender;
	}
	public int getTeach_pincode() {
		return teach_pincode;
	}
	public void setTeach_pincode(int teach_pincode) {
		this.teach_pincode = teach_pincode;
	}
	public String getTeach_country() {
		return teach_country;
	}
	public void setTeach_country(String teach_country) {
		this.teach_country = teach_country;
	}
	public String getSlots() {
		return slots;
	}
	public void setSlots(String slots) {
		this.slots = slots;
	}
	public TeacherEntity(String teach_name, long teach_contact, String teach_gender, int teach_pincode,
			String teach_country, String slots) {
		super();
		this.teach_name = teach_name;
		this.teach_contact = teach_contact;
		this.teach_gender = teach_gender;
		this.teach_pincode = teach_pincode;
		this.teach_country = teach_country;
		this.slots = slots;
	}
	public TeacherEntity() {
		super();
	}
	
	
}
