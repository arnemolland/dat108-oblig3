package no.hvl.dat108;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(schema = "oblig3", name="party")
public class Party {
	
    @Id
    private int id;

    @OneToMany(mappedBy = "party")
    private List<Participant> participants = new ArrayList<Participant>();

    public List<Participant> getParticipantList() {
        return participants;
    }

    public void addParticipant(Participant participant) {
        participants.add(participant);
    }
}