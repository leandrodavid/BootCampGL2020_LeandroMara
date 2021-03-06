package config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.globallogic.menu.entity.Menu;
import com.globallogic.menu.entity.Plato;

public class HibernateConfig {

	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {

	if (sessionFactory == null) {

	try {

	Configuration configuration = new Configuration();

	Properties settings = new Properties();

	settings.put(Environment.DRIVER, "org.h2.Driver");

	settings.put(Environment.URL, "jdbc:h2:C:\\GLBootCamp\\data\\Menu.h2");

	settings.put(Environment.USER, "root");

	settings.put(Environment.PASS, "root");

	settings.put(Environment.HBM2DDL_AUTO, "create-drop");

	configuration.setProperties(settings);

	configuration.addAnnotatedClass(Menu.class);
	
	configuration.addAnnotatedClass(Plato.class);

	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()

	.applySettings(configuration.getProperties()).build();

	sessionFactory = configuration.buildSessionFactory(serviceRegistry);

	} catch (Exception e) {

	e.printStackTrace();

	}

	}

	return sessionFactory;

	}
	
}

