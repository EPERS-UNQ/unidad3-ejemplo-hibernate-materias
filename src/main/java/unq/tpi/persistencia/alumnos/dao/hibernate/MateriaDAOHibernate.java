package unq.tpi.persistencia.alumnos.dao.hibernate;

import unq.tpi.persistencia.alumnos.arq.dao.BaseHibernateDAO;
import unq.tpi.persistencia.alumnos.dao.MateriaDAO;
import unq.tpi.persistencia.alumnos.model.Materia;

public class MateriaDAOHibernate extends BaseHibernateDAO<Materia> implements MateriaDAO {

	public MateriaDAOHibernate() {
		super(Materia.class);
	}

	@Override
	public Materia getPorCodigo(String codigoMateria) {
		throw new RuntimeException("Implement me :(");
	}

	@Override
	public Integer getCantidadAprobados(String codigoMateria) {
		throw new RuntimeException("Implement me :(");
	}

}
