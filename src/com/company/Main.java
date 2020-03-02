package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Game game = new Game();
        game.redraw();

        Scanner scanner = new Scanner(System.in);

        String tur = "X";
        System.out.println("Det er " + tur + "'s tur");

        while (scanner.hasNext()){

           int input = scanner.nextInt();
           if (input < 1 || input > 9 ){
               continue;
           }
           if(  game.fields.get("f" + input).equals("X") || game.fields.get("f" + input).equals("O")){
               continue;
           }

           game.fields.put("f"+ input, tur);
           game.redraw();
           if (game.checkForWin() != null){
               System.out.println("vinderen er " + game.checkForWin() + "!");
               break;

           }

           if (tur.equals("X")){
               tur = "O";
           } else {
               tur = "X";
           }

            System.out.println("Det er " + tur + "'s tur");
        }


        }

    }

