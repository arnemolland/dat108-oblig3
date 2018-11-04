package no.hvl.dat108;

import javax.persistence.*;

@Entity
@Table(schema = "oblig3", name="participant")
public class Participant {

	@Id
	private String phone;
    private String gender;
    private String fullname;
    private String hashedpwd;
    
    @ManyToOne
    @JoinColumn(name="plist_id" , referencedColumnName = "id")
    private Party party;

    public Participant() {}

    public Participant(String gender, String fullname, String hashedpwd, String phone, Party party) {
        super();
        this.gender = gender;
        this.fullname = fullname;
        this.hashedpwd = hashedpwd;
        this.phone = phone;
        this.party = party;
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