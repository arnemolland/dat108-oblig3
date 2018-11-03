package no.hvl.dat108;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ParticipantEAO {
    @PersistenceContext(name = "participantsPU")
    private EntityManager em;

    public ParticipantList getParticipants() {
        return em.find(ParticipantList.class, 1);
    }
    public void updateParticipants(ParticipantList participantList) {
        em.merge(participantList);
    }
}