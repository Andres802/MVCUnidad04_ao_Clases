/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad03_05.controlador;

import java.util.List;
import p61.unidad03_05.modelo.Ciudad;
import p61.unidad03_05.servicio.CiudadServiceImpl;

/**
 *
 * @author Mauricio Ortiz
 */
public class CiudadControl {

    private CiudadServiceImpl ciudadServiceImpl = new CiudadServiceImpl();

    public void crear(String[] data) throws Exception {

        try {
            var codigo = Integer.valueOf(data[0]);
            var nombre = data[1];
            var pais = data[2];
            var poblacion = Integer.valueOf(data[3]);

            var ciudad = new Ciudad(codigo, nombre, pais, poblacion);
            if (this.ciudadServiceImpl.codigoExiste(codigo)) {
                throw new RuntimeException("Codigo Existe");
            } else {

                this.ciudadServiceImpl.crear(ciudad);
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Error al convetir el formato");
        }

    }

    

    public List<Ciudad> listar() {
        return this.ciudadServiceImpl.listar();
    }

}
