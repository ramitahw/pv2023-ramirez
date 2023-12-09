package ar.edu.unju.edm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Alumno;
import ar.edu.unju.edm.model.Cuestionario;
import ar.edu.unju.edm.model.CuestionarioPregunta;
import ar.edu.unju.edm.model.Docente;
import ar.edu.unju.edm.model.Pregunta;
import ar.edu.unju.edm.service.IAlumnoService;
import ar.edu.unju.edm.service.ICuestionarioPreguntaService;
import ar.edu.unju.edm.service.ICuestionarioService;
import ar.edu.unju.edm.service.IDocenteService;
import ar.edu.unju.edm.service.IPreguntaService;

@SpringBootApplication
public class ProyectoBrunoMolloApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProyectoBrunoMolloApplication.class, args);	
	}

	@Autowired
	Docente docente;
	
	@Autowired
	IDocenteService docenteService;
	
	@Autowired
	Alumno alumno;
	
	@Autowired
	IAlumnoService alumnoService;
	
	/*@Autowired
	Pregunta pregunta;
	
	@Autowired
	IPreguntaService preguntaService;
	
	@Autowired
	Cuestionario cuestionario;
	
	@Autowired
	ICuestionarioService cuestionarioService;
	
	@Autowired
	CuestionarioPregunta cuestionarioPregunta;
	
	@Autowired
	ICuestionarioPreguntaService cuestionarioPreguntaService;*/
	
	@Override
	public void run (String... args) throws Exception{
		
		docente.setEstado(true);
		docente.setApellido("Ramirez");
		docente.setContrasenia("ramita1234");
		docente.setDni(45881380);
		docente.setCorreo("rama@gmail.com");
		docente.setMateria("programacion");
		docente.setNombre("Mateo");
		docente.setTipo("ADMIN");
		docente.setTelefono("3884633949");
		docente.setDireccion("cuyaya");
		docente.setLegajo(1234);
		docente.setLocalidad("Jujuy");
		docenteService.cargarDocente(docente);
		
		alumno.setApellido("ficoseco");
		alumno.setTelefono("3884644938");
		alumno.setDni(45881380);
		alumno.setCorreo("fico@gmail.com");
		alumno.setEstado(true);
		alumno.setNombre("valentin");
		alumno.setCurso((short) 3);
		alumno.setDireccion("VILLA PAZ");
		alumno.setDivision('A');
		alumnoService.cargarAlumno(alumno);
		
		/*pregunta.setDificultad((short) 1);
		pregunta.setEstado(true);
		pregunta.setOpcion1("Nooby");
		pregunta.setOpcion2("Crack");
		pregunta.setOpcion3("Pecho Frio");
		pregunta.setOpcion4("Cr7");
		pregunta.setOpcionCorrecta(2);
		pregunta.setPregunta("Como es Messi?");
		preguntaService.cargarPregunta(pregunta);
		
		cuestionario.setDescripcion("Super Pro");
		cuestionario.setEstado(true);
		cuestionario.setTitulo("Base de Datos");
		cuestionario.setDocente(docente);
		cuestionario.setPuntajeTotal(20);
		cuestionarioService.cargarCuestionario(cuestionario);
		
		cuestionarioPregunta.setCuestionario(cuestionario);
		cuestionarioPregunta.setPregunta(pregunta);
		cuestionarioPregunta.setPuntaje(30);
		cuestionarioPreguntaService.cargarCuestionarioPregunta(cuestionarioPregunta);*/

	}
	
	/**@Override
	public void run (String... args) throws Exception{
		
	}**/
	
}
