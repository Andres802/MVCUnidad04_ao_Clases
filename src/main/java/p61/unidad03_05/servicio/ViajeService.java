/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p61.unidad03_05.servicio;

import java.util.List;
import p61.unidad03_05.modelo.Viaje;

/**
 *
 * @author Mauricio Ortiz
 */
public interface ViajeService {

    public void crear(Viaje viaje);

    public boolean codigoExiste(int codigoActual);
    public List<Viaje> listar();
}
