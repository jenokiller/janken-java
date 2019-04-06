package com.janken.janken;

public class Janken {
    public String play(String p1Hand, String p2Hand) {
        if (p1Hand.equals(p2Hand)) {
            return "draw";
        } else if (p1Hand.equals("rock") && p2Hand.equals("paper")
                || p1Hand.equals("scissors") && p2Hand.equals("rock")
                || p1Hand.equals("paper") && p2Hand.equals("scissors")) {
            return "p2";
        }
        return "p1";
    }
}
