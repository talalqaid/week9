import java.util.Random;

public class Card implements Comparable<Card> {
    private int rank; // 0..12
    private int suit; // 0..3

    private static final String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8",
            "9", "10", "Jack", "Queen", "King", "Ace"
    };

    private static final String[] SUITS = {
            "Clubs", "Diamonds", "Hearts", "Spades"
    };

    public Card() {
        Random random = new Random();
        this.rank = random.nextInt(RANKS.length);
        this.suit = random.nextInt(SUITS.length);
    }

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return RANKS[rank];
    }

    public String getSuit() {
        return SUITS[suit];
    }

    public int getRankValue() {
        return rank;
    }

    public boolean isBiggerThan(Card anotherCard) {
        return this.rank > anotherCard.rank;
    }

    @Override
    public int compareTo(Card otherCard) {
        if (this.getRankValue() > otherCard.getRankValue()) {
            return 1;
        } else if (this.getRankValue() < otherCard.getRankValue()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return getRank() + " of " + getSuit();
    }
}