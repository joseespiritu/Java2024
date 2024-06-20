package jlme.empleados.repositorio;

import jlme.empleados.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRespositorio extends JpaRepository<Empleado, Integer> {
}
