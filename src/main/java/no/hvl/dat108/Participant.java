package no.hvl.dat108;

import javax.persistence.*;

@Entity
@Table(schema = "public", name="participants")
public class Participant {

	@Id
	private String phone;
    private String gender;
    private String fullname;
    private String hashedpwd;
    
    @ManyToOne
    @JoinColumn(name="plist_number" , referencedColumnName = "id")
    private ParticipantList participantlist;

    public Participant() {

    }

    public Participant(String gender, String fullname, String hashedpwd, String phone) {
        super();
        this.gender = gender;
        this.fullname = fullname;
        this.hashedpwd = hashedpwd;
        this.phone = phone;
    }

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullame(String name) {
		this.fullname = name;
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