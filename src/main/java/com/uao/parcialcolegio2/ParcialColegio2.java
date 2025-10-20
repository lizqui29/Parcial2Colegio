/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uao.parcialcolegio2;

import javax.swing.JOptionPane;
import Modelo.Validador;
import Modelo.Estudiantes;
import Modelo.Profesores;
import Modelo.Persona;
import Modelo.Calculadora;

/**
 *
 * @author Usuario
 */
public class ParcialColegio2 {
    
    private static Estudiantes [] estudiantes = new Estudiantes[5];
    private static Profesores [] profesores = new Profesores[5];
    private static Validador validador = new Validador();
    

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu\n"
                    + "1. Agregar Estudiantes \n"
                    + "2. Agregar Profesores \n"
                    + "3. Listar Estudiantes \n"
                    + "4. Listar Profesores \n"
                    + "5. Salir.\n"
                    + "Elija una opcion"));

            switch (opcion) {
                case 1:
                    agregarEstudiantes();
                    break;
                    
                case 2:
                    agregarProfesores();
                    break;
                    
                case 3:
                    listarEstudiantes ();
                    break;
                    
                case 4:
                    listarProfesores();
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null, "saliendo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opcion invalida");
                    break;
            }
        } while (opcion != 5);
    }
    
        public static void agregarEstudiantes() {
        
       
            int estudiantesLista = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos estudiantes quiere listar?"));
            estudiantes = new Estudiantes[estudiantesLista];
            
            for (int i = 0; i < estudiantes.length; i++) {
            
            
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
            String direccion = JOptionPane.showInputDialog("Ingrese la dirección: ");
            int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el teléfono: "));
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de la fecha de nacimiento: "));
            String mes = JOptionPane.showInputDialog("Ingrese el mes de la fecha de nacimiento: ");
            int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de la fecha de nacimiento: "));
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código: "));
            int grado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el grado: "));
            
            
                if (validador.validarCodigo(codigo) ) {
                    estudiantes [i] = new Estudiantes (nombre, direccion, telefono, dia, mes, año, codigo, grado);
                    JOptionPane.showMessageDialog(null, "Ingreso exitoso ");
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Error, código inválidado. ");
                    i--;
                }
            }
       
        }
        
        
        public static void agregarProfesores() {
            int profesoresLista = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos profesores ?"));
            profesores = new Profesores[profesoresLista];
            
            for (int i = 0; i < profesores.length; i++) {
                
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
            String direccion = JOptionPane.showInputDialog("Ingrese la dirección: ");
            int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el teléfono: "));
            int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día de la fecha de nacimiento: "));
            String mes = JOptionPane.showInputDialog("Ingrese el mes de la fecha de nacimiento: ");
            int año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de la fecha de nacimiento: "));
            int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cédula: "));
            String area = JOptionPane.showInputDialog("Ingrese el área de trabajo: ");
            double salarioPorHora = Double.parseDouble(JOptionPane.showInputDialog("Salario por hora: "));
            int horas = Integer.parseInt(JOptionPane.showInputDialog("Horas trabajadas al mes: "));
            
            
            if (validador.validarSalario(salarioPorHora) && validador.validarHoras(horas)) {
                profesores[i] = new Profesores (nombre, direccion, telefono, dia, mes, año, cedula, area, salarioPorHora, horas);
            
                  JOptionPane.showMessageDialog(null, "Profesor agregado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "ERROR: Datos inválidos");
                i--;
            }
          }
            
        }
        
        
        
        public static void listarEstudiantes() {
        if (estudiantes == null) {
            JOptionPane.showMessageDialog(null, "No hay estudiantes registrados");
            return;
        }
        
        String lista = "Lista de Estudiantes: \n";
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null) {
                lista += (i + 1) + ". " + estudiantes[i].mostrarInfo() + "\n";
            }
        }
        lista += "Total de estudiantes: " + estudiantes.length;
        JOptionPane.showMessageDialog(null, lista);
    }
        
        public static void listarProfesores () {
        if (profesores == null){
            JOptionPane.showMessageDialog(null, "No hay profesores registrados");
            return;
        }
        
        
        
       ordenarProfesoresPorSalario();
    
    String lista = "Lista de Profesores: \n";
    lista += "(De menor a mayor)\n\n";
    
    double totalPrestaciones = 0;
    
    for (int i = 0; i < profesores.length; i++) {
        if (profesores[i] != null) {
            lista += (i + 1) + ". " + profesores[i].mostrarInfo() + "\n";
            lista += "   Salario Mensual: $" + profesores[i].calcularSalarioMensual() + "\n";
            lista += "   Prestaciones: " + profesores[i].calcularPrestaciones() + "\n\n";
            
            totalPrestaciones += profesores[i].calcularPrestaciones();
        }
    }
    
    lista += "Total de profesores: " + profesores.length + "\n";
    lista += "Total de Prestaciones : $" + totalPrestaciones;
    
    JOptionPane.showMessageDialog(null, lista);
         
        
        }
        
    

public static void ordenarProfesoresPorSalario() {
    for (int i = 0; i < profesores.length - 1; i++) {
        for (int j = 0; j < profesores.length - 1 - i; j++) {
            if (profesores[j] != null && profesores[j + 1] != null) {
                double salario1 = profesores[j].calcularSalarioTotal();
                double salario2 = profesores[j + 1].calcularSalarioTotal();
                
                if (salario1 > salario2) {
                    Profesores temp = profesores[j];
                    profesores[j] = profesores[j + 1];
                    profesores[j + 1] = temp;
                }
            }
        }
    }
}
}
      
    
    

