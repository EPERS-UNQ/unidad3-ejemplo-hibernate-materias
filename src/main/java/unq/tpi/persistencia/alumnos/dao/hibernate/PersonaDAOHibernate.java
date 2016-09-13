package unq.tpi.persistencia.alumnos.dao.hibernate;

import unq.tpi.persistencia.alumnos.arq.dao.BaseHibernateDAO;
import unq.tpi.persistencia.alumnos.dao.PersonaDAO;
import unq.tpi.persistencia.alumnos.model.Persona;

public class PersonaDAOHibernate extends BaseHibernateDAO<Persona> implements PersonaDAO {
	
	public PersonaDAOHibernate() {
		super(Persona.class);
	}

}
