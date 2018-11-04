package no.hvl.dat108;

import javax.persistence.*;

@Entity
@Table(schema = "oblig3", name="participant")
public class Participant {

	@Id
	private String phone;
    private String gender;
    private String firstName;
    private String lastName;
    private String hashedpwd;
    
    @ManyToOne
    @JoinColumn(name="plist_id" , referencedColumnName = "id")
    private Party party;

    public Participant() {}

    public Participant(String phone, String firstname, String lastName,String gender, 
    		String hashedpwd, Party party) {
        super();
        this.phone = phone;
        this.firstName = firstname;
        this.lastName = lastName;
        this.gender = gender;
        this.hashedpwd = hashedpwd;
        this.party = party;
    }

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
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