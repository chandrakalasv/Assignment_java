package com.bridge.day4;

public class SnakeLadder {
    public static void main(String[] args) {
        int player_position = 0;
        int count = 0;
        int[] ladder = {2, 12, 33, 48, 85};
        int[] ladder_position = {14, 42, 68, 83, 95};
        int[] snake = {15, 38, 53, 69, 97};
        int[] bite_position = {4, 17, 54, 63, 16};
        while (player_position <= 100) {
            int dice = (int) ((Math.random() * 10) % 6) + 1;
            count++;
            System.out.println("dice number " + " " + dice);
            System.out.println("player position is " + " " + player_position);
            if (dice != 0) {
                player_position = player_position + dice;
                System.out.println("After dice roll player position is " + " " + player_position);
                if(player_position > 100) {
                    player_position = player_position - dice;
                    System.out.println("player_position is" + " " + player_position);
                }
                if (player_position == 100) {
                    System.out.println("player gets winning position" + " " + player_position);
                    break;
                }
                for (int i = 0; i < 5; i++) {
                    if (ladder[i] == player_position) {
                        player_position = ladder_position[i];
                        System.out.println("player gets ladder position" + " " + player_position);
                    } else if (snake[i] == player_position) {
                        player_position = bite_position[i];
                        System.out.println("player bitten by snake position" + " " + player_position);
                    }

                }
            }
        }
        System.out.println("number of times the dice was played" + " " + count);
    }
}
