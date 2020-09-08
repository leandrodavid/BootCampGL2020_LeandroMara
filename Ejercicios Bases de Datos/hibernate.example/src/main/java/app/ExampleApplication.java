package app;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dao.AlumnoDao;
import hibernate.example.entity.Alumno;

public class ExampleApplication {

	private static Logger LOGGER= LoggerFactory.getLogger(ExampleApplication.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlumnoDao  alumnoDao= new AlumnoDao();
		
		
		alumnoDao.createAlumno(new Alumno(0,"Jose", "Perez"));
		alumnoDao.createAlumno(new Alumno(0,"Esteban", "Quito"));
		alumnoDao.createAlumno(new Alumno(0,"Ulrica", "Godofreda"));
		
        List <Alumno> alumnos = alumnoDao.getAlumnos();
        alumnos.get(1).setApellido("Estefano");
        alumnoDao.updateAlumno(alumnos.get(1));
        alumnos = alumnoDao.getAlumnos();
        LOGGER.info("Alumnos filtrados: {}",alumnoDao.getAlumnos());
        alumnoDao.removeAlumno(alumnos.get(0));
        LOGGER.info("Alumnos filtrados: {}",alumnoDao.getAlumnos());
        
        
    
    }


}
