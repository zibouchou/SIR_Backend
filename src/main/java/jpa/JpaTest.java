package jpa;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import Service.EntityManagerHelper;
import Service.ParticipantDao;
import Service.PropositionDao;
import jpaModel.Participant;
import jpaModel.Proposition;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManager manager = EntityManagerHelper.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		//tx.begin();
		System.out.println("test");


		try {
			
			ParticipantDao dao = new ParticipantDao();
			Participant p = new Participant("part", "participant", "sidymohamedaziz@gmail.com");
			dao.addParticipant(p);
			System.out.println(dao.findByFirstName("part"));
			PropositionDao pdao = new PropositionDao();
			Proposition prop = new Proposition("14/05/2020", "14/05/2020", "appart", true);
			pdao.addProp(prop);
			
			pdao.findByPropAccept(true);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//tx.commit();


		manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		//		factory.close();
	}


}
