package com.soccer.view;

import java.util.Scanner;

import com.soccer.Controller;

import com.soccer.model.entity.Doctor;

public class viewDoctor {
       public static Controller controlador;
       public void start() {
              Scanner scanner = new Scanner(System.in);

       while (true) {
              System.out.println("1. Crear doctor");
              System.out.println("2. Actualizar doctor");
              System.out.println("3. Buscar doctor");
              System.out.println("4. Eliminar doctor");
              System.out.println("5. Listar todos los doctores");
              System.out.println("6. Salir");
              int choice = scanner.nextInt();
              scanner.nextLine(); // Consume newline
              switch (choice) {
                     case 1:
                     Doctor doctor =new Doctor();
                     System.out.println("Ingrese el ID del doctor");
                     int iddoctor=scanner.nextInt();
                     doctor.setId(iddoctor);
                     scanner.nextLine();

                     System.out.println("ingrese nombre del doctor");
                     String nombredoctor=scanner.nextLine();
                     doctor.setNombre(nombredoctor);
                     
                     System.out.println("ingrese apellido del doctor");
                     String apellidodoctor=scanner.nextLine();
                     doctor.setApellido(apellidodoctor);
                     
                     System.out.println("ingrese edad del doctor");
                     int edaddoctor=scanner.nextInt();
                     doctor.setEdad(edaddoctor);
                     scanner.nextLine();

                     System.out.println("ingrese apellido del doctor");
                     String titulodr=scanner.nextLine();
                     doctor.setTitulo(titulodr);
                     
                     System.out.println("ingrese id del federacion");
                     int fechaExp=scanner.nextInt();
                     doctor.setExpYear(fechaExp);
                     scanner.nextLine();
                     
                     controlador.doctores.put(String.valueOf(iddoctor), doctor);
                  
                     
                     break;
                     case 2:
                     System.out.println("ingrese codigo del doctor aactualizar");
                     String iddr=scanner.nextLine();
                     if (controlador.doctores.contains(iddr)){
                            Doctor doctoract=controlador.doctores.get(iddr);
                            System.out.println("ingrese nombre del coach");
                            String nuevonombre=scanner.nextLine();
                            doctoract.setNombre(nuevonombre);

                            System.out.println("ingrese apellido");
                            String nuevoapellido=scanner.nextLine();
                            doctoract.setApellido(nuevoapellido);
                            
                            System.out.println("ingrese edad del doctor");
                            int nuevaedad=scanner.nextInt();
                            doctoract.setEdad(nuevaedad);
                            scanner.nextLine();
                            
                            System.out.println("ingrese titulo");
                            String nuevotitulo=scanner.nextLine();
                            doctoract.setTitulo(nuevotitulo);

                            
                            System.out.println("ingrese dorsal del jugador");
                            int nuevoexpyear=scanner.nextInt();
                            doctoract.setExpYear(nuevoexpyear);
                            scanner.nextLine();
                            
                     }else {
                            System.out.println("doctor no encontrado");
                     }
                     break;
                     case 3:
                     System.out.println("ingrese el codigo del doctor a buscar");
                     String codigodoctor=scanner.nextLine();                 
                     
                     
                     Doctor busqueda = controlador.doctores.get(codigodoctor);
                     System.out.println("Doctor encontrado:");
                     System.out.println("Nombre: " + busqueda.getNombre());
                     System.out.println("Apellido: " + busqueda.getApellido());
                     System.out.println("Edad: " + busqueda.getEdad());
                     System.out.println("titulo: " + busqueda.getTitulo());
                     System.out.println("fechaExpedición: " + busqueda.getExpYear());
                     
                     break;
                     case 4:

                     System.out.println("ingrese el codigo del doctor a eliminar");
                     String doctordelete=scanner.nextLine();
                     if (controlador.doctores.contains(doctordelete)){
                            controlador.doctores.remove(doctordelete);
                            System.out.println("dr eliminado");
                     }else{
                            System.out.println("dr no encontrado");
                     }
                     break;
                     case 5:
                     System.out.println("Listado de coach");
                    
                     for (String key: controlador.doctores.keySet()){
                            Doctor listdoctor = controlador.doctores.get(key);
                            System.out.println("Codigo: " + key);
                            System.out.println("Nombre: "+ listdoctor.getNombre());
                            System.out.println("Apellido: "+ listdoctor.getApellido());
                            System.out.println("Edad: "+ listdoctor.getEdad());
                            System.out.println("titulo: "+ listdoctor.getTitulo());
                            System.out.println("fecha: "+ listdoctor.getExpYear());
                            
                            
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

