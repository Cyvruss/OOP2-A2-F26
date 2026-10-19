package com.champlain.oop2assignment3;

import java.util.Comparator;

public class ReverseSuitFirstComparator implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        // Compare by suit first (in reverse order)
        int suitComparison = card2.getSuit().compareTo(card1.getSuit());
        if (suitComparison != 0) {
            return suitComparison;
        }
        // If suits are the same, compare by rank (in reverse order)
        return card1.getRank().compareTo(card2.getRank());
    }

}
