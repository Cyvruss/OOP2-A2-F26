package com.champlain.oop2assignment3;

import java.util.Comparator;

public class ReverseRankFirstComparator implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        int rankCompare = card2.getRank().compareTo(card1.getRank());
        if (rankCompare != 0) {
            return rankCompare;
        }
        return card1.getSuit().compareTo(card2.getSuit());
    }
}
