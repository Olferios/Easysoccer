package com.soccer.view;

import java.util.Scanner;

import com.soccer.Controller;
import com.soccer.model.entity.Coach;
import com.soccer.model.entity.Player;
import com.soccer.model.entity.Team;

public class viewCoach {
       public static Controller controlador;
       public void startCoach() {
              Scanner scanner = new Scanner(System.in);

       while (true) {
              System.out.println("1. Crear coach");
              System.out.println("2. Actualizar coach");
              System.out.println("3. Buscar coach");
              System.out.println("4. Eliminar coach");
              System.out.println("5. Listar todos los coachs");
              System.out.println("6. Salir");
              int choice = scanner.nextInt();
              scanner.nextLine(); // Consume newline
              switch (choice) {
                     case 1:
                     Coach entrenador =new Coach();
                     System.out.println("Ingrese el ID del entrenador");
                     int identrenador=scanner.nextInt();
                     entrenador.setId(identrenador);
                     scanner.nextLine();

                     System.out.println("ingrese nombre del entrenador");
                     String nombreentrenador=scanner.nextLine();
                     entrenador.setNombre(nombreentrenador);
                     
                     System.out.println("ingrese apellido del entrenador");
                     String apellidoentrenador=scanner.nextLine();
                     entrenador.setApellido(apellidoentrenador);
                     
                     System.out.println("ingrese edad del entrenador");
                     int edadentrenador=scanner.nextInt();
                     entrenador.setEdad(edadentrenador);
                     scanner.nextLine();
                     
                     System.out.println("ingrese id del federacion");
                     int idFederacion=scanner.nextInt();
                     entrenador.setIdFederacion(idFederacion);
                     scanner.nextLine();
                     
                     controlador.entrenadores.put(String.valueOf(identrenador), entrenador);
                  
                     
                     break;
                     case 2:
                     System.out.println("ingrese codigo del coach aactualizar");
                     String idcoach=scanner.nextLine();
                     if (controlador.entrenadores.contains(idcoach)){
                            Player coachact=controlador.jugadores.get(idcoach);
                            System.out.println("ingrese nombre del coach");
                            String nuevonombre=scanner.nextLine();
                            coachact.setNombre(nuevonombre);

                            System.out.println("ingrese apellido");
                            String nuevoapellido=scanner.nextLine();
                            coachact.setApellido(nuevoapellido);
                            
                            System.out.println("ingrese edad del jugador");
                            int nuevaedad=scanner.nextInt();
                            coachact.setEdad(nuevaedad);
                            scanner.nextLine();
                            
                            System.out.println("ingrese dorsal del jugador");
                            int nuevoidfederacion=scanner.nextInt();
                            coachact.setDorsal(nuevoidfederacion);
                            scanner.nextLine();
                            
                     }else {
                            System.out.println("Jugador no encontrado");
                     }
                     break;
                     case 3:
                     System.out.println("ingrese el codigo del coach a buscar");
                     String codigocoach=scanner.nextLine();                 
                     
                     
                     Coach busqueda = controlador.entrenadores.get(codigocoach);
                     System.out.println("Jugador encontrado:");
                     System.out.println("Nombre: " + busqueda.getNombre());
                     System.out.println("Apellido: " + busqueda.getApellido());
                     System.out.println("Edad: " + busqueda.getEdad());
                     System.out.println("federacion: " + busqueda.getIdFederacion());
                     
                     break;
                     case 4:

                     System.out.println("ingrese el codigo del coach a eliminar");
                     String coachdelete=scanner.nextLine();
                     if (controlador.entrenadores.contains(coachdelete)){
                            controlador.entrenadores.remove(coachdelete);
                            System.out.println("coach eliminado");
                     }else{
                            System.out.println("coach no encontrado");
                     }
                     break;
                     case 5:
                     System.out.println("Listado de coach");
                    
                     for (String key: controlador.entrenadores.keySet()){
                            Coach listentrenador = controlador.entrenadores.get(key);
                            System.out.println("Codigo: " + key);
                            System.out.println("Nombre: "+ listentrenador.getNombre());
                            System.out.println("Apellido: "+ listentrenador.getApellido());
                            System.out.println("Edad: "+ listentrenador.getEdad());
                            System.out.println("id federacion: "+ listentrenador.getIdFederacion());
                            
                            
                     }
                     break;
                     case 6:
                     scanner.close();
                            break;
                     default:
                            System.out.println("Opción no válida");
                            break;
       }
       }
       }

}

