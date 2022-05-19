package com.bridge.day4;

public class Snake1 {
    public static void main(String[] args) {
        int player_position = 0;
        int count = 0;
        int[] ladder = {2, 12, 33, 48, 85};
        int[] ladder_position = {14, 42, 68, 83, 95};
        int[] snake = {15, 38, 53, 69, 97};
        int[] bite_position = {6, 17, 54, 63, 16};

        while (player_position <= 100) {
            int dice = (int) ((Math.random() * 10) % 6) + 1;
            System.out.println("dice number " + " " + dice);
            if (dice == 0) {
                player_position = player_position;
            } else if (dice != 0) {
                player_position = player_position + dice;
                if(player_position > 100) {
                    player_position = player_position - dice;
                    System.out.println(player_position);
                }
                if(player_position == 100) {
                    System.out.println("player won the match" + " " + player_position);
                    break;
                }

                System.out.println("player position" + " " + player_position);
                for (int i = 0; i < 5; i++) {
                    if (ladder[i] == player_position) {
                        player_position = ladder_position[i];
                        System.out.println("ladder position" + " " + player_position);
                    } else if (snake[i] == player_position) {
                        player_position = bite_position[i];
                        System.out.println("bite position" + " " + player_position);
                    }

                }
            }
            count++;

        }
        System.out.println("The number of times dice rolled" + " " + count);
    }
}
