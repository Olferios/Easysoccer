package com.soccer.view;

import java.util.Scanner;

import com.soccer.Controller;
import com.soccer.model.entity.Player;
import com.soccer.model.entity.Team;

public class viewPlayer {
       public static Controller controlador;
       public void start() {
              Scanner scanner = new Scanner(System.in);

       while (true) {
              System.out.println("1. Crear Jugador");
              System.out.println("2. Actualizar Jugador");
              System.out.println("3. Buscar Jugador");
              System.out.println("4. Eliminar Jugador");
              System.out.println("5. Listar todos los jugadores");
              System.out.println("6. Salir");
              int choice = scanner.nextInt();
              scanner.nextLine(); // Consume newline
              switch (choice) {
                     case 1:
                     Player jugador =new Player();
                     System.out.println("Ingrese el ID del jugador");
                     int idjugador=scanner.nextInt();
                     jugador.setId(idjugador);
                     scanner.nextLine();

                     System.out.println("ingrese nombre del jugador");
                     String nombrejugador=scanner.nextLine();
                     jugador.setNombre(nombrejugador);
                     
                     System.out.println("ingrese apellido del jugador");
                     String apellidojugador=scanner.nextLine();
                     jugador.setApellido(apellidojugador);
                     
                     System.out.println("ingrese edad del jugador");
                     int edadjugador=scanner.nextInt();
                     jugador.setEdad(edadjugador);
                     scanner.nextLine();
                     
                     System.out.println("ingrese dorsal del jugador");
                     int dorsaljugador=scanner.nextInt();
                     jugador.setDorsal(dorsaljugador);
                     scanner.nextLine();
                     
                     System.out.println("ingrese posicion del jugador");
                     String posicionjugador=scanner.nextLine();
                     jugador.setPosicion(posicionjugador);

                     controlador.jugadores.put(String.valueOf(idjugador), jugador);



                     
                     
                     break;
                     case 2:
                     System.out.println("ingrese codigo del jugador aactualizar");
                     String idplayer=scanner.nextLine();
                     if (controlador.jugadores.contains(idplayer)){
                            Player jugadorupd=controlador.jugadores.get(idplayer);
                            System.out.println("ingrese nombre del jugador");
                            String nuevonombre=scanner.nextLine();
                            jugadorupd.setNombre(nuevonombre);

                            System.out.println("ingrese apellido");
                            String nuevoapellido=scanner.nextLine();
                            jugadorupd.setApellido(nuevoapellido);
                            
                            System.out.println("ingrese edad del jugador");
                            int nuevaedad=scanner.nextInt();
                            jugadorupd.setEdad(nuevaedad);
                            scanner.nextLine();
                            
                            System.out.println("ingrese dorsal del jugador");
                            int nuevodorsal=scanner.nextInt();
                            jugadorupd.setDorsal(nuevodorsal);
                            scanner.nextLine();
                            
                            System.out.println("ingrese posicion del jugador");
                            String nuevaposicion=scanner.nextLine();
                            jugadorupd.setPosicion(nuevaposicion);


                     }else {
                            System.out.println("Jugador no encontrado");
                     }
                     break;
                     case 3:
                     System.out.println("ingrese el codigo del equipo a buscar");
                     String codigoplayer=scanner.nextLine();                 
                     
                     
                     Player busqueda = controlador.jugadores.get(codigoplayer);
                     System.out.println("Jugador encontrado:");
                     System.out.println("Nombre: " + busqueda.getNombre());
                     System.out.println("Apellido: " + busqueda.getApellido());
                     System.out.println("Edad: " + busqueda.getEdad());
                     System.out.println("Dorsal: " + busqueda.getDorsal());
                     System.out.println("Posición: " + busqueda.getPosicion());
                     break;
                     case 4:

                     System.out.println("ingrese el codigo del jugador a a eliminar");
                     String jugadordelete=scanner.nextLine();
                     if (controlador.jugadores.contains(jugadordelete)){
                            controlador.jugadores.remove(jugadordelete);
                            System.out.println("Jugador eliminado");
                     }else{
                            System.out.println("jugador no encontrado");
                     }
                     break;
                     case 5:
                     System.out.println("Listado de jugadores");
                    
                     for (String key: controlador.jugadores.keySet()){
                            Player listjugador = controlador.jugadores.get(key);
                            System.out.println("Codigo: " + key);
                            System.out.println("Nombre: "+ listjugador.getNombre());
                            System.out.println("Apellido: "+ listjugador.getApellido());
                            System.out.println("Edad: "+ listjugador.getEdad());
                            System.out.println("Dorsal: "+ listjugador.getDorsal());
                            System.out.println("pocision; "+listjugador.getPosicion());
                            
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

