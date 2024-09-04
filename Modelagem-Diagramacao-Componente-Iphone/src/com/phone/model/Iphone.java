package com.phone.model;

import com.phone.service.ModuloTelefonico;
import com.phone.service.NavegadorWeb;
import com.phone.service.ReprodutorMusical;

import java.util.Scanner;

public class Iphone implements ModuloTelefonico, NavegadorWeb, ReprodutorMusical {
    Scanner terminal = new Scanner(System.in);

    //Music Player methods
    public void play() {
    }

    public boolean pause() {
        return false;
    }

    public void stop() {

    }

    //This is a demonstrative method to simulate a user adding a music through terminal interaction
    public String[] addMusic() {
        String[] choosenMusics = {""};
        //chooseMusic = true means that the user is on the music registration menu
        boolean chooseMusic = true;
        do{
            for(int i = 0; i < choosenMusics.length; i++){
                System.out.println("Digite o nome da música a ser adicionada");
                String music = terminal.nextLine();
                choosenMusics = new String[]{music + choosenMusics[i]};

                System.out.println("Deseja adicionar outra música? (sim/nao): ");
                String response = terminal.nextLine().trim().toLowerCase();
                // Handle the response
                if (response.equals("sim")) {
                    System.out.println("Novamente...");
                    // Continue with the operation
                } else if (response.equals("nao")) {
                    System.out.println("Você está saindo da aba de adicionar músicas.");
                    chooseMusic = false;
                    break;
                    // Handle the denial
                } else {
                    System.out.println("Resposta inválida. Somente (sim/nao) ");
                    // Optionally, you can loop back and ask again
                }
            }
        }while(chooseMusic);

        return choosenMusics;
    }

    // Cellphone calls methods

    public void call() {

    }

    public void answerCall() {

    }

    public String[] saveNumber() {
        return new String[0];
    }

    public void deleteNumber() {

    }

    // Web Navigator Methods

    public void openTab() {

    }

    public void closeTab() {

    }

    public String search() {
        return "";
    }
}
