/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.List;
import Dto.HabitacionDto;
import Dao.HabitacionDao;
/**
 *
 * @author usuario
 */
public class HabitacionesController {
     private HabitacionDao dao = new HabitacionDao();
     
    public String registrarHabitacion(int numeroHabitacion, String tipo, int capacidad, String estado){
       if(capacidad<= 0){
           return "La capacidad tiene q ser mayor a cero";
         }
      
       if (dao.buscarPorNumero(numeroHabitacion) != null){
           return "El numero de habitacion ya esta registrado";
        }
       HabitacionDto h = new HabitacionDto(numeroHabitacion, tipo, capacidad, estado);
       dao.agregar(h); 
       return "Habitacion reistrada con exito";
        }
    public HabitacionDto obternerHabitacion(int numeroHabitacion){
     return dao.buscarPorNumero(numeroHabitacion);
    }
  public List<HabitacionDto> obtenerTodas(){
      return dao.listar();
        }
   public String modificarHabitacion(int numeroHabitacion, String tipo, int capacidad, String estado){
       if (capacidad <= 0);
       return " no se puede modificar la Habitacion";
        }
     public void eliminarabitacion(int indice){
            dao.eliminar(indice);
        }
   }
  

  
   
