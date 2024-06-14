package jlme.estudiantes.repositorio;

import jlme.estudiantes.modelo.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepositorio extends JpaRepository<Estudiante,Integer> {
}
