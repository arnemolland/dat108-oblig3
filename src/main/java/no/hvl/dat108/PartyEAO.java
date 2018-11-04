package no.hvl.dat108;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PartyEAO {
	
    @PersistenceContext(name = "partyPU")
    private EntityManager em;
    
    public Party getParty() {
    	Integer x = 1;
        return em.find(Party.class, x);
    }

    public void updateParty(Party participantList) {
        em.merge(participantList);
    }
}