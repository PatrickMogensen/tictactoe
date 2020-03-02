package com.company;

import java.util.HashMap;

public class Game {

    HashMap<String, String> fields = new HashMap<>();

    public Game() {

       for (int i = 1; i < 10; i++) {

           fields.put("f" + i, Integer.toString(i));

       }
   }



    public void redraw() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("\n");

        System.out.print(fields.get("f1") + " ");
        System.out.print(fields.get("f2") + " ");
        System.out.println(fields.get("f3"));

        System.out.print(fields.get("f4") + " ");
        System.out.print(fields.get("f5") + " ");
        System.out.println(fields.get("f6"));

        System.out.print(fields.get("f7") + " ");
        System.out.print(fields.get("f8") + " ");
        System.out.println(fields.get("f9"));


    }

    public String checkForWin(){

        //lodrette matches
        if (fields.get("f1").equals(fields.get("f2")) && fields.get("f1").equals(fields.get("f3"))){
            return fields.get("f1");
        }

        if (fields.get("f4").equals(fields.get("f5")) && fields.get("f4").equals(fields.get("f6"))){
            return fields.get("f4");
        }

        if (fields.get("f7").equals(fields.get("f8")) && fields.get("f7").equals(fields.get("f9"))){
            return fields.get("f7");
        }

        //vandrette matches

        if (fields.get("f1").equals(fields.get("f4")) && fields.get("f1").equals(fields.get("f7"))){
            return fields.get("f1");
        }

        if (fields.get("f2").equals(fields.get("f5")) && fields.get("f2").equals(fields.get("f8"))){
            return fields.get("f2");
        }

        if (fields.get("f3").equals(fields.get("f6")) && fields.get("f3").equals(fields.get("f9"))){
            return fields.get("f3");
        }

        //tværgående matches

        if (fields.get("f1").equals(fields.get("f5")) && fields.get("f1").equals(fields.get("f9"))){
            return fields.get("f1");
        }

        if (fields.get("f3").equals(fields.get("f5")) && fields.get("f3").equals(fields.get("f7"))){
            return fields.get("f3");
        }

        return null;



    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
