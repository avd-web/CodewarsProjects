package com.codewars.playground;

public class Playground2 {
    public static int points(String[] games) {
        int stringLength = games.length;
        int counter = 0;

        for (int i = 0; i < stringLength; i++){
            char[] characterArray = games[i].toCharArray();
            System.out.println(characterArray[0]);
            counter += characterArray[0];
            //counter = characterArray[0];
        }

        //char[] characterArray = games[0].toCharArray();
        System.out.println(counter);







    return 0;
    }

    public static void main(String[] args) {
        points(new String[]{"1:0","2:0","3:0","4:0","2:1","3:1","4:1","3:2","4:2","4:3"});

    }
}

