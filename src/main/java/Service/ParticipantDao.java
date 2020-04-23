package Service;

import java.util.List;

import jpaModel.Participant;

public class ParticipantDao {
	
	public Participant findById(int id) {
		return EntityManagerHelper.getEntityManager().find(Participant.class, id);
	}
	
	public List<Participant> findByFirstName(String firstName){
		
		return EntityManagerHelper.getEntityManager()
				.createQuery("select p from participant as p where p.prenom = :prenom", Participant.class)
				.setParameter("prenom", firstName).getResultList();
		
	}
	public List<Participant> findAll(){
		
		return EntityManagerHelper.getEntityManager()
				.createQuery("select p from participant as p", Participant.class)
				.getResultList();
		
	}
	
	public void addParticipant(Participant p) {
		EntityManagerHelper.beginTransaction();
		EntityManagerHelper.getEntityManager().persist(p);
		EntityManagerHelper.commit();
	}
	
	public void delete(int id) {
        EntityManagerHelper.beginTransaction();
        EntityManagerHelper.getEntityManager().remove(this.findById(id));
        EntityManagerHelper.commit();        
    }
	
	

	
	
	
	

}
