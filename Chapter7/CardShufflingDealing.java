/*package Chapter7;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;


public class CardShufflingDealing {
    private Card[] cards;
    private int currentCard;

    public Suit suit;
    public Face face;
    public CardShufflingDealing(Suit suit, Face face){
        this.suit = suit;
    }
    public Suit getSuit(){
        return suit;
    }
    public void setFace (String Face){
        this.face = face;
    }
    public Face getFace(){
        re
    }

    public enum Suit {
        HEARTS,DIAMONDS,CLUBS, SPADES
    }
    public enum Face {
        ACE,QUEEN, KING
    }

    public CardShufflingDealing(){
        cards = new Card[52];
        int index = 0;

        for (Suit suit : Suit.values()){
            for (Face face : Face.values()){
                cards[index] = new Card(suit, face);
                index++;
            }
        }
        shuffle();
    }
    public void shuffle() {
        currentCard = 0;
        for (int i = 0; i < cards.length; i++)
        {
            int index = (int) (Math.random() * cards.length);
            Card temp = cards[i];
            cards[i] = cards[index];
            cards[index] = temp;
        }
    }
    public Card dealCard(){
        if (currentCard < cards.length)
            return cards[currentCard++];
        else
            return null;
    }
    public String getFace(){

    }

    public boolean isPair(Hand hand){
        int[] faces = new int[Face.values().length];
        for (Card card : hand.getCards()){
            faces[card.getFace().ordinal()]++;
        }
        for (int count : faces)
            if (count == 2)
                return true;

        return false;
    }
    public boolean isTwoPairs(Hand hand){
        int[] faces = new int[Face.values().length];
        for (Card card : hand.getCards()){
            faces[card.getFace().ordinal()]++;
        }
        int pairs = 0;
        for (int count : faces){
            if (count == 2){
                pairs++;
            }
        }
        return pairs == 2;
    }
    public boolean isThreeOfAKind(Hand hand){
        int[] faces = new int[Face.values().length];
        for (Card card : hand.getCards()){
            faces[card.getFace().ordinal()]++;
        }
        for (int count : faces){
            if (count == 3){
                return true;
            }
        }
        return false;
    }
    public boolean isFourOfAKind(Hand hand){
        int[] faces = new int[Face.values().length];
        for (Card card : hand.getCards()){
            faces[card.getFace().ordinal()]++;
        }
        for (int count : faces){
            if (count == 4){
                return true;
            }
        }
        return false;
    }
    public boolean isFlush(Hand hand){
        Suit suit = hand.getCards()[0].getSuit();
        for (Card card : hand.getCards()){
            if (card.getSuit() != suit){
                return false;
            }
        }
        return true;
    }
    public boolean isStraight(Hand hand){
        int[] faces = new int[Face.values().length];
        for (Card card : hand.getCards()){
            faces[card.getFace().ordinal()]++;
        }
        int start = -1;
        for (int i = 0; i< faces.length;i++){
            if (faces[i]>0){
                start=i;
                break;
            }
        }
        for (int i = start + 1;i<5+1; i++){
            if (faces[i] == 0){
                return false;
            }
        }
        return true;
    }
    public boolean isFullHouse(Hand hand){
        int[] faces = new int[Face.values().length];
        for (Card card : hand.getCards()){
            faces[card.getFace().ordinal()]++;
        }
        int threeOfAKind = -1;
        int pair = -1;
        for (int i = 0; i< faces.length; i++){
            if (faces[i] == 3){
                threeOfAKind = i;
            } else if (faces[i] == 2) {
                pair = i;
            }
        }
        return threeOfAKind != -1 && pair !=-1;
    }

    public class Hand {
        private List<Card> cards;

        public Hand() {
            cards = new ArrayList<>();
        }
        public void addCard(Card card){
            cards.add(card);
        }
        public List<Card> getCards(){
            return cards;
        }
    }
    public static void main(String[] args){
        CardShufflingDealing deck = new CardShufflingDealing();
        Hand hand = new Hand();

        for (int i = 0; i<5;i++){
            hand.addCard(deck.dealCard());
        }
        System.out.println("Your hand is:");
        for (Card card : hand.getCards()){
            System.out.println(card);
        }
        if (deck.isPair(hand)){
            System.out.println("You have a pair");
        }
        if (deck.isTwoPairs(hand)){
            System.out.println("You have two pairs");
        }
        if (deck.isFlush(hand)){
            System.out.println("You have a flush");
        }
        if (deck.isThreeOfAKind(hand)){
            System.out.println("You have three of a kind");
        }
        if (deck.isFourOfAKind(hand)){
            System.out.println("You have four of a kind");
        }
        if (deck.isStraight(hand)){
            System.out.println("You have a Straight");
        }
        if (deck.isFullHouse(hand)){
            System.out.println("You have a full house");
        }

    }

}
*/