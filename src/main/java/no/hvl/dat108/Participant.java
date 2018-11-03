package no.hvl.dat108;

import javax.persistence.*;

@Entity
@Table(schema = "public", name="participants")
public class Participant {

    @Column(name = "gender")
    private String gender;
    @Column(name = "fullname")
    private String name;
    @Column(name = "hashedpwd")
    private String hashedpwd;
    @Id
    @Column(name = "phone")
    private String phone;

    public Participant() {

    }

    public Participant(String gender, String name, String hashedpwd, String phone) {
        super();
        this.gender = gender;
        this.name = name;
        this.hashedpwd = hashedpwd;
        this.phone = phone;
    }

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHashedpwd() {
		return hashedpwd;
	}

	public void setHashedpwd(String hashedpwd) {
		this.hashedpwd = hashedpwd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}