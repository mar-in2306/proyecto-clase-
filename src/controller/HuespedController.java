/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import Dao.DaoHuesped;
import Dto.HuespedDto;
import java.util.List;
/**
 *
 * @author usuario
 */
public class HuespedController {
        private DaoHuesped dao = new DaoHuesped();
    
        
        public String agregarHuesped(HuespedDto dto){
        if (dto.getNombreCompleto().isBlank() || dto.getCorreo().isBlank()){
               return "NombreCompleto y Correo no puden estar vacios";
                }
        if (dto.getDocumento() <0){
            return "El documento tiene q ser mayor q 0";
        }
        if (dto.getTelefono() <0){
            return "El numero tiene q ser mayor q 0 ";
        }
        dao.guardar(dto);
        return "Huesped se guardo correctamente";
        }
        public List<HuespedDto> obtenerHuesped() {
    return dao.listar();
        }
        public void eliminarHuesped(int indice){
            dao.eliminar(indice);
        }
        public String actualizarHuesped(int indice, HuespedDto dto ){
            if (dto.getNombreCompleto().isBlank() || dto.getCorreo().isBlank()){
                return "NombreCompleto y Correo no pueden estar vacios";
            }
            if (dto.getDocumento() <0 || dto.getTelefono() <=0 ){
                return "Documento o telefono deben de ser validos ";
            }
            dao.actualizar(indice, dto);
            return "Huesped se ha actualizado correctamente";
            
        }
}