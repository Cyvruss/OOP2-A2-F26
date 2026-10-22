package com.champlain.oop2assignment3;

import java.util.Comparator;

/**
 * Compares two Card objects by rank in reverse order.
 * If the cards have the same rank, they are compared by suit
 * in ascending order.
 */
public class ReverseRankFirstComparator implements Comparator<Card> {
    /**
     * Compares two cards by their rank in descending order.
     * If their ranks are equal, compares their suits in ascending order.
     *
     * @param card1 the first card to compare
     * @param card2 the second card to compare
     * @return a negative integer if card1 should come before card2,
     *         a positive integer if card1 should come after card2,
     *         or zero if both cards have the same rank and suit
     */
    @Override
    public int compare(Card card1, Card card2) {
        int rankCompare = card2.getRank().compareTo(card1.getRank());
        if (rankCompare != 0) {
            return rankCompare;
        }
        return card1.getSuit().compareTo(card2.getSuit());
    }
}
