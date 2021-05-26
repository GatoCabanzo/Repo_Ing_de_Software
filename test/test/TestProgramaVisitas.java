/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dto.Visita;
import logica.OperVisita;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alejo
 */
public class TestProgramaVisitas {

    public TestProgramaVisitas() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void crearExitoso() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico("Carlitos");
        v.setFecha("2021-05-30");
        v.setHora("13:00:00");
        v.setDireccion("Avenida boyaca # 123456");
        v.setMotivo_visita("Cambio chapas");
        assertEquals(1, oper.insertar(v));
    }

    @Test
    public void crearCamposVacios() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico("");
        v.setFecha("");
        v.setHora("");
        v.setDireccion("");
        v.setMotivo_visita("");
        assertEquals(0, oper.insertar(v));
    }
    
    @Test
    public void crearNombreVacio() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico("");
        v.setFecha("2021-05-30");
        v.setHora("13:00:00");
        v.setDireccion("Avenida boyaca # 123456");
        v.setMotivo_visita("Cambio chapas");
        assertEquals(0, oper.insertar(v));
    }
    
    @Test
    public void crearFechaVacio() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico("Carlos Gomez");
        v.setFecha("");
        v.setHora("13:00:00");
        v.setDireccion("Avenida boyaca # 123456");
        v.setMotivo_visita("Cambio chapas");
        assertEquals(0, oper.insertar(v));
    }
    
    @Test
    public void crearHoraVacio() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico("Carlos Gomez");
        v.setFecha("2021-05-30");
        v.setHora("");
        v.setDireccion("Avenida boyaca # 123456");
        v.setMotivo_visita("Cambio chapas");
        assertEquals(0, oper.insertar(v));
    }
    
    @Test
    public void crearDireccionVacio() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico("Carlos Gomez");
        v.setFecha("2021-05-30");
        v.setHora("13:00:00");
        v.setDireccion("");
        v.setMotivo_visita("Cambio chapas");
        assertEquals(0, oper.insertar(v));
    }
    
    @Test
    public void crearMotivoVisitaVacio() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico("Carlos Gomez");
        v.setFecha("2021-05-30");
        v.setHora("13:00:00");
        v.setDireccion("Avenida boyaca # 123456");
        v.setMotivo_visita("");
        assertEquals(0, oper.insertar(v));
    }

    @Test
    public void crearCamposNull() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico(null);
        v.setFecha(null);
        v.setHora(null);
        v.setDireccion(null);
        v.setMotivo_visita(null);
        assertEquals(0, oper.insertar(v));
    }

    @Test
    public void crearNombreNull() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico(null);
        v.setFecha("2021-05-30");
        v.setHora("13:00:00");
        v.setDireccion("Avenida boyaca # 123456");
        v.setMotivo_visita("Cambio chapas");
        assertEquals(0, oper.insertar(v));
    }
    
    @Test
    public void crearFechaNull() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico("Carlos Gomez");
        v.setFecha(null);
        v.setHora("13:00:00");
        v.setDireccion("Avenida boyaca # 123456");
        v.setMotivo_visita("Cambio chapas");
        assertEquals(0, oper.insertar(v));
    }
    
    @Test
    public void crearHoraNull() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico("Carlos Gomez");
        v.setFecha("2021-05-30");
        v.setHora(null);
        v.setDireccion("Avenida boyaca # 123456");
        v.setMotivo_visita("Cambio chapas");
        assertEquals(0, oper.insertar(v));
    }
    
    @Test
    public void crearDireccionNull() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico("Carlos Gomez");
        v.setFecha("2021-05-30");
        v.setHora("13:00:00");
        v.setDireccion(null);
        v.setMotivo_visita("Cambio chapas");
        assertEquals(0, oper.insertar(v));
    }
    
    @Test
    public void crearMotivoVisitaNull() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico("Carlos Gomez");
        v.setFecha("2021-05-30");
        v.setHora("13:00:00");
        v.setDireccion("Avenida boyaca # 123456");
        v.setMotivo_visita(null);
        assertEquals(0, oper.insertar(v));
    }
    
    @Test
    public void actualizarCampos() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico("Carlitos");
        v.setFecha("2021-05-30");
        v.setHora("13:00:00");
        v.setDireccion("Avenida boyaca # 123456");
        v.setMotivo_visita("Cambio chapas");
        assertEquals(1, oper.actualizar(v));
    }

    @Test
    public void actualizarCamposVacios() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico("");
        v.setFecha("");
        v.setHora("");
        v.setDireccion("");
        v.setMotivo_visita("");
        assertEquals(0, oper.actualizar(v));
    }
    
    @Test
    public void actualizarNombreVacio() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico("");
        v.setFecha("2021-05-30");
        v.setHora("13:00:00");
        v.setDireccion("Avenida boyaca # 123456");
        v.setMotivo_visita("Cambio chapas");
        assertEquals(0, oper.actualizar(v));
    }
    
    @Test
    public void actualizarFechaVacio() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico("Carlos Gomez");
        v.setFecha("");
        v.setHora("13:00:00");
        v.setDireccion("Avenida boyaca # 123456");
        v.setMotivo_visita("Cambio chapas");
        assertEquals(0, oper.actualizar(v));
    }
    
    @Test
    public void actualizarHoraVacio() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico("Carlos Gomez");
        v.setFecha("2021-05-30");
        v.setHora("");
        v.setDireccion("Avenida boyaca # 123456");
        v.setMotivo_visita("Cambio chapas");
        assertEquals(0, oper.actualizar(v));
    }
    
    @Test
    public void actualizarDireccionVacio() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico("Carlos Gomez");
        v.setFecha("2021-05-30");
        v.setHora("13:00:00");
        v.setDireccion("");
        v.setMotivo_visita("Cambio chapas");
        assertEquals(0, oper.actualizar(v));
    }
    
    @Test
    public void actualizarMotivoVisitaVacio() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico("Carlos Gomez");
        v.setFecha("2021-05-30");
        v.setHora("13:00:00");
        v.setDireccion("Avenida boyaca # 123456");
        v.setMotivo_visita("");
        assertEquals(0, oper.actualizar(v));
    }
    
    @Test
    public void actualizarCamposNull() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(null);
        v.setNombre_tecnico(null);
        v.setFecha(null);
        v.setHora(null);
        v.setDireccion(null);
        v.setMotivo_visita(null);
        assertEquals(0, oper.actualizar(v));
    }
    
    @Test
    public void actualizarNombreNull() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico(null);
        v.setFecha("2021-05-30");
        v.setHora("13:00:00");
        v.setDireccion("Avenida boyaca # 123456");
        v.setMotivo_visita("Cambio chapas");
        assertEquals(0, oper.actualizar(v));
    }
    
    @Test
    public void actualizarFechaNull() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico("Carlos Gomez");
        v.setFecha(null);
        v.setHora("13:00:00");
        v.setDireccion("Avenida boyaca # 123456");
        v.setMotivo_visita("Cambio chapas");
        assertEquals(0, oper.actualizar(v));
    }
    
    @Test
    public void actualizarHoraNull() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico("Carlos Gomez");
        v.setFecha("2021-05-30");
        v.setHora(null);
        v.setDireccion("Avenida boyaca # 123456");
        v.setMotivo_visita("Cambio chapas");
        assertEquals(0, oper.actualizar(v));
    }
    
    @Test
    public void actualizarDireccionNull() {
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico("Carlos Gomez");
        v.setFecha("2021-05-30");
        v.setHora("13:00:00");
        v.setDireccion(null);
        v.setMotivo_visita("Cambio chapas");
        assertEquals(0, oper.actualizar(v));
    }
    
    @Test
    public void actualizarMotivoVisitaNull() { 
        OperVisita oper = new OperVisita();
        Visita v = new Visita();
        v.setId(1L);
        v.setNombre_tecnico("Carlos Gomez");
        v.setFecha("2021-05-30");
        v.setHora("13:00:00");
        v.setDireccion("Avenida boyaca # 123456");
        v.setMotivo_visita(null);
        assertEquals(0, oper.actualizar(v));
    }

}
