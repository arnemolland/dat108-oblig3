package no.hvl.dat108;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PartyEAO {
	
    @PersistenceContext(name = "PartyPU")
    private EntityManager em;

    public PartyEAO() {}
    
    public Party getParticipants() {
        return em.find(Party.class, 1);
    }
    public void updateParticipants(Party participantList) {
        em.merge(participantList);
    }
}