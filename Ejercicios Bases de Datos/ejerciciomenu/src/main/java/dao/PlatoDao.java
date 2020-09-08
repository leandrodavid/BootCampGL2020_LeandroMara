package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;



import config.HibernateConfig;
import com.globallogic.menu.entity.Plato;

public class PlatoDao {

	public void createPLato(Plato plato) {

		
		
		Transaction transaction = null;

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

		transaction = session.beginTransaction();

		session.save(plato);
		
	

		transaction.commit();

		} catch (Exception e) {
			

		if (transaction != null) {
        
		transaction.rollback();

		}

		e.printStackTrace();

		}

		}

		public List <Plato> getPlatos() {

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

		return session.createQuery("from Plato", Plato.class).list();

		}

		}

		public List<Plato> getPlatos(String nombre) {

		try (Session session = HibernateConfig.getSessionFactory().openSession()) {

		return session.createQuery("from Plato s where s.nombre=:nombre"

		, Plato.class).setParameter("nombre", nombre).list();

		}

		}
	
		public void updatePlato(Plato plato) {

			Transaction transaction = null;

			try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			session.update(plato);

			transaction.commit();

			} catch (Exception e) {

			if (transaction != null)

			transaction.rollback();

			e.printStackTrace();

			}

			}

			public void removePlato(Plato plato) {

			Transaction transaction = null;

			try (Session session = HibernateConfig.getSessionFactory().openSession()) {

			transaction = session.beginTransaction();

			session.delete(plato);

			transaction.commit();

			} catch (Exception e) {

			if (transaction != null)

			transaction.rollback();

			e.printStackTrace();

			}

			}
		
}
