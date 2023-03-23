package com.codewars.projects;

public class aWolfInSheepsClothing_kyu8 {
    public static String warnTheSheep(String[] array) {

        int sheepCounter = 0;
        int stringSize = array.length;
        String result;


        for (int i = stringSize-1; i >= 0; i--){

            if (array[i].equals("sheep")){
                sheepCounter++;

            }
            else if (array[stringSize-1].equals("wolf")){
                return "Pls go away and stop eating my sheep";
            }
            else if (array[i].equals("wolf")) {
                break;
            }

        }
        result = "Oi! Sheep number " + sheepCounter + "! You are about to be eaten by a wolf!";
        return result;

    }

    public static void main(String[] args) {

        System.out.println(warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));

    }
}