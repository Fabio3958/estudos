package CodeWars;

import java.util.Objects;

public class Rps {

    public String game(String p1, String p2){

        if (Objects.equals(p1, p2)){
            return "Draw!";
        }

        if (Objects.equals(p1, "rock")){
            if (Objects.equals(p2, "paper")){
                return "Player 2 won!";
            }
            if (Objects.equals(p2, "scissors")){
                return "Player 1 won!";
            }
        }

        if (Objects.equals(p1, "paper")){
            if (Objects.equals(p2, "scissors")){
                return "Player 2 won!";
            }
            if (Objects.equals(p2, "rock")){
                return "Player 1 won!";
            }
        }

        if (Objects.equals(p1, "scissors")){
            if (Objects.equals(p2, "rock")){
                return "Player 2 won!";
            }
            if (Objects.equals(p2, "paper")){
                return "Player 1 won!";
            }
        }

        return "Input a valid choice";

    }


    public static void main(String[] args) {

        Rps rps = new Rps();

        String joguinho = rps.game("rock", "scissors");
        System.out.println(joguinho);
    }

}
