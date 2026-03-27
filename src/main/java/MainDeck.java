public class MainDeck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck.size());
        Card c1=deck.deal();
        System.out.println(c1);
        System.out.println(deck.size());
        deck.returnCard(c1);
        System.out.println(deck.size());
    }
}
