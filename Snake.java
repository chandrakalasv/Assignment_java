package com.bridge.day4;

public class Snake {
    public static void main(String[] args) {
        int player_position = 0;
        int dice = (int) ((Math.random() * 10) % 6) + 1;
        System.out.println(dice);
        int[] ladder = {2, 12, 33, 48, 85};
        int[] ladder_position = {14, 42, 68, 83, 95};
        int[] snake = {15, 38, 53, 69, 97};
        int[] bite_position = {6, 17, 54, 63, 16};
        if(dice == 0) {
            player_position = player_position;
        }
        else if (dice != 0 ) {
            player_position = player_position + dice;
            System.out.println(player_position);
            switch (player_position) {
                case 2: player_position = ladder_position[0];
                        System.out.println(player_position);
                        break;
                case 1: player_position = ladder_position[1];
                         System.out.println(player_position);
                         break;
                case 33: player_position = ladder_position[2];
                System.out.println(player_position);
                    break;
                case 48: player_position = ladder_position[3];
                    System.out.println(player_position);
                    break;
                case 85: player_position = ladder_position[4];
                    System.out.println(player_position);
                    break;
            }
            switch (player_position) {
                case 15: player_position = bite_position[0];
                    System.out.println(player_position);
                    break;
                case 38: player_position = bite_position[0];
                    System.out.println(player_position);
                    break;
                case 53: player_position = bite_position[0];
                    System.out.println(player_position);
                    break;
                case 69: player_position = bite_position[0];
                    System.out.println(player_position);
                    break;
                case 97: player_position = bite_position[0];
                    System.out.println(player_position);
                    break;
            }
            }
        }

    }

