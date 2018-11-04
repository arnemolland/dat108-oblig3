package no.hvl.dat108;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ParticipantEAO {

	@PersistenceContext(name = "ParticipantPU")
	private EntityManager em;
	
	public Participant getParticipant(String phoneNumber) {
		return em.find(Participant.class, phoneNumber);
	}
	
}
