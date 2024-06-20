package jlme.empleados.servicio;

import jlme.empleados.modelo.Empleado;
import jlme.empleados.repositorio.EmpleadoRespositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServicio implements IEmpleadoServicio {

    @Autowired
    private EmpleadoRespositorio empleadoRespositorio;

    @Override
    public List<Empleado> listarEmpleados() {
        return empleadoRespositorio.findAll();
    }

    @Override
    public Empleado buscarEmpleadoPorId(Integer idEmpleado) {
        Empleado empleado = empleadoRespositorio.findById(idEmpleado).orElse(null);
        return empleado;
    }

    @Override
    public void guardarEmpleado(Empleado empleado) {
        empleadoRespositorio.save(empleado);
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
        empleadoRespositorio.delete(empleado);
    }
}
