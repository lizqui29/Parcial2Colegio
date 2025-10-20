/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Validador {
    
    public boolean validarCodigo(int codigo) {
        return codigo > 21000;
    }
    
  
    public boolean validarSalario(double salario) {
        return salario > 0;
    }
    
    public boolean validarHoras(int horas) {
        return horas > 0 && horas <= 300;
    }
    
}
