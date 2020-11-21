package com.mayab.calidad.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;

public interface AlumnoDAO {
	void addAlumno(Alumno alumno);
	void removeAlumno(Alumno alumno);
	void updatePromedio(Alumno alumno, float nuevoPromedio); //Se podr�a poner boolean como a los anteriores
	ArrayList<Alumno> getAll();
	int getNumeroAlumnos(); //tipo entero?
	Alumno getAlumno(int id); //tipo alumno?
	
	
	
	HashMap<Integer, Alumno> getBaseDatos();
	Connection getConnectionORACLE();
}
