/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author alejo
 * @param <T>
 */
public interface Operaciones<T> {
    public int insertar(T dato);
    public int borrar(long dato);
    public int actualizar(T dato);
    public ArrayList listar();

}
