/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import java.util.ArrayList;
import java.util.List;
import Dto.HuespedDto;
/**
 *
 * @author usuario
 */
public class DaoHuesped {
    private List<HuespedDto> huespedes = new ArrayList<> ();
    
    public void guardar(HuespedDto dto) {
       huespedes.add(dto);
        
        }  
    
    public List<HuespedDto> listar() {
    return huespedes;
}
    public void eliminar(int indice){
        if (indice >= 0 && indice < huespedes.size()) {
            huespedes.remove(indice);
                
                }
        }
    public void actualizar (int indice, HuespedDto dto){
        if (indice >= 0 && indice <huespedes.size()){
            huespedes.set(indice, dto);
        }
            
    }
            
    
        }
