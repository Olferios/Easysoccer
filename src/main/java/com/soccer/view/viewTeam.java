package com.soccer.view;

import java.util.Scanner;

import com.soccer.Controller;
import com.soccer.model.entity.Coach;
import com.soccer.model.entity.Doctor;
import com.soccer.model.entity.Player;
import com.soccer.model.entity.Team;

public class viewTeam {
    public static Controller controlador;
    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Crear Equipo");
            System.out.println("2. Actualizar Equipo");
            System.out.println("3. Buscar Equipo");
            System.out.println("4. Eliminar Equipo");
            System.out.println("5. Listar todos Equipos");
            System.out.println("6. Agregar jugador a un equipo");
            System.out.println("7. Agregar coach a un equipo");
            System.out.println("8. Agregar doctor a un equipo");
            System.out.println("9. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                        Team equipo = new Team();
                        String codigoEquipo = null;
                        System.out.println("Ingrese el codigo del equipo :");
                        codigoEquipo = scanner.nextLine();
                        System.out.println("Ingrese Nombre del equipo :");
                        equipo.setNombre(scanner.nextLine());
                        System.out.println("Ingrese la ciudad :");
                        equipo.setCiudad(scanner.nextLine());
                        controlador.equipos.put(codigoEquipo, equipo);
                    break;

                case 2:
                System.out.println("ingrese codigo del team aactualizar");
                String idteam=scanner.nextLine();
                if (controlador.equipos.contains(idteam)){
                    Team equipoupd=controlador.equipos.get(idteam);
                    System.out.println("ingrese nombre del equipo");
                    String nuevonombre=scanner.nextLine();
                    equipoupd.setNombre(nuevonombre);

                    System.out.println("ingrese ciudad");
                    String nuevociudad=scanner.nextLine();
                    equipoupd.setCiudad(nuevociudad);                        
                  
                    }else {
                            System.out.println("Jugador no encontrado");
                     }
                break;

                    

                case 3:
                    Team eq = new Team();
                    String codigoE = "001";
                    eq = controlador.equipos.get(codigoE);
                    System.out.println("Mi equipo" + eq.getNombre());
                    break;
                case 4:
                System.out.println("ingrese el codigo del EQUIPO a a eliminar");
                String equipodelete=scanner.nextLine();
                if (controlador.equipos.contains(equipodelete)){
                    controlador.equipos.remove(equipodelete);
                    System.out.println("Equipo eliminado");
                }else{
                    System.out.println("Equipo no encontrado");
                     }
                     break;
                    

                case 5:
                System.out.println("Listado de equipos");
                for (String key: controlador.equipos.keySet()){
                    Team listequipo = controlador.equipos.get(key);
                    System.out.println("Codigo: " + key);
                    System.out.println("Nombre: "+ listequipo.getNombre());
                    System.out.println("Apellido: "+ listequipo.getCiudad());
                    
                            
                     }
                     break;

                    

                     case 6:
                     System.out.println("Ingrese el código del EQUIPO del jugador a agregar:");
                     String idteamjug = scanner.nextLine();
                     
                     if (controlador.equipos.containsKey(idteamjug)) {
                         System.out.println("Ingrese código jugador:");
                         String codjugador = scanner.nextLine();
                         
                         if (controlador.jugadores.containsKey(codjugador)) {
                             Player jugador = controlador.jugadores.get(codjugador);
                             Team equipo1 = controlador.equipos.get(idteamjug); 
                             equipo1.getLstJugadores().add(jugador);
                             System.out.println("Jugador agregado");
                         } else {
                             System.out.println("Jugador no encontrado.");
                         }
                     } else {
                         System.out.println("Equipo no encontrado.");
                     }
                     break;
                 
                    
                case 7:
                System.out.println("Ingrese el código del EQUIPO del entrenador a agregar:");
                     String idteamjug2 = scanner.nextLine();
                     
                     if (controlador.equipos.containsKey(idteamjug2)) {
                         System.out.println("Ingrese código entrenador:");
                         String codentrenador = scanner.nextLine();
                         
                         if (controlador.entrenadores.containsKey(codentrenador)) {
                             Coach entrenador = controlador.entrenadores.get(codentrenador);
                             Team equipo1 = controlador.equipos.get(idteamjug2); 
                             equipo1.getLstEntrenadores().add(entrenador);
                             System.out.println("Entrenador agregado");
                         } else {
                             System.out.println("Entrenador no encontrado.");
                         }
                     } else {
                         System.out.println("Equipo no encontrado.");
                     }
                     break;
                    

                case 8:
                System.out.println("Ingrese el código del EQUIPO del doctor a agregar:");
                     String idteamjug3 = scanner.nextLine();
                     
                     if (controlador.equipos.containsKey(idteamjug3)) {
                         System.out.println("Ingrese código doctor:");
                         String coddoctor= scanner.nextLine();
                         
                         if (controlador.doctores.containsKey(coddoctor)) {
                             Doctor doctor = controlador.doctores.get(coddoctor);
                             Team equipo1 = controlador.equipos.get(idteamjug3); 
                             equipo1.getLstMasajistas().add(doctor);
                             System.out.println("Dcotor agregado");
                         } else {
                             System.out.println("Doctor no encontrado.");
                         }
                     } else {
                         System.out.println("Equipo no encontrado.");
                     }
                     break;
                    
                
                case 9:
                
                     System.out.println("Salir");
                     return;
                     default:
                     scanner.close();
                            
                     break;
            }
        }
    }
}