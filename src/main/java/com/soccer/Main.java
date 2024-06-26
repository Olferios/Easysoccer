package com.soccer;

import java.util.Scanner;

import com.soccer.view.viewCoach;
import com.soccer.view.viewDoctor;
import com.soccer.view.viewPlayer;
import com.soccer.view.viewTeam;

public class Main {
    public static void main(String[] args) {
        Controller controlEquipos = new Controller();
        viewTeam.controlador = controlEquipos;

        Controller controlJugadores = new Controller();
        viewPlayer.controlador = controlJugadores;

        Controller controlCoachs = new Controller();
        viewCoach.controlador = controlCoachs;

        Controller controlDoctors = new Controller();
        viewDoctor.controlador = controlDoctors;

        Scanner eleccion=new Scanner(System.in);
        while(true){
            System.out.println("--------------------------------");
            System.out.println("1. Ingresa al menu de Equipos");
            System.out.println("2. Ingresa al menu de Jugadores");
            System.out.println("3. Ingresa al menu de Coachs");
            System.out.println("4. Ingresa al menu de Doctores");
            System.out.println("5. Salir");
            System.out.println("--------------------------------");

            int choice = eleccion.nextInt();
            eleccion.nextLine();

            switch (choice) {
                case 1:
                    viewTeam vistaTeam = new viewTeam();
                    vistaTeam.start();
                    
                    break;
            
                case 2:
                    viewPlayer vistaJugadores = new viewPlayer();
                    vistaJugadores.startPlayer();
                    break;

                case 3:
                    viewCoach vistaCoachs = new viewCoach();
                    vistaCoachs.startCoach();
                    break;

                case 4:
                    viewDoctor vistaDoctores = new viewDoctor();
                    vistaDoctores.startDoctor();

                default:
                    System.out.println("Eleccion no valida, de nuevo"); 
                    eleccion.close();
                    break;
        }
        
        // Controller ctrlTeams = new Controller();
        // viewTeam.controlador = ctrlTeams;
        // viewTeam vt = new viewTeam();
        // vt.start();


       // System.out.println("Jugador"+ eq.getLstJugadores().get(0).getNombre());
    }
    }
}