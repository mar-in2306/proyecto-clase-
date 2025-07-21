/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import java.util.ArrayList;
import java.util.List;
import Dto.HabitacionDto;
/**
 *
 * @author usuario
 */
public class HabitacionDao {
    private ArrayList<HabitacionDto> habitaciones = new ArrayList<>();
    
    public void agregar(HabitacionDto dto){
        habitaciones.add(dto);
    }
    public List<HabitacionDto> listar(){
        return habitaciones;
    }
    
    public HabitacionDto buscarPorNumero(int numeroHabitacion ){
        for (HabitacionDto h : habitaciones){
            if (h.getNumeroHabitacion() == numeroHabitacion)
                return h;
        }
        return null;
                } 
    public void actualizar (int indice, HabitacionDto dto){
        if (indice >= 0 && indice <habitaciones.size()){
            habitaciones.set(indice, dto);
                }
        }
    public void eliminar(int indice){
        if (indice >= 0 && indice < habitaciones.size()) {
            habitaciones.remove(indice);
                }
        }
}
