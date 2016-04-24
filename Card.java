public class Card {
    
    private int suit;
    private int face;
    
    public Card(int cardSuit, int cardFace)
    {
        suit = cardSuit;
        face = cardFace;
    }
    
    public int getSuit()
    {
        return suit;
    }
    
    public int getFace()
    {
        return face;
    }
    
    public int getValue()
    {
        if(face > 10)
        {
            return 10;
        }
        else
        {
            return face;
        }
    }
    
    @Override
    public String toString()
    {
        String output = "[";
        switch(face)
        {
            case 1 : output += "A";
                break;
            case 11: output += "J";
                break;
            case 12: output += "Q";
                break;
            case 13: output += "K";
                break;
            default: output += face;
                break;
        }
        switch(suit)
        {
            case 0 : output += "♠";
                break;
            case 1 : output += "♥";
                break;
            case 2 : output += "♣";
                break;
            default: output += "♦";
        }
        return output + "]";
    }
    
    public String getFilePath()
    {
        String path = "cards/";
        switch(face)
        {
            case 1 : path += "ace";
                break;
            case 11 : path += "jack";
                break;
            case 12 : path += "queen";
                break;
            case 13 : path += "king";
                break;
            default : path += face;
                break;
        }
        switch(suit)
        {
            case 1 : path += "spades";
                break;
            case 2 : path += "hearts";
                break;
            case 3 : path += "clubs";
                break;
            default : path += "diamonds";
                break;
        }
        path += ".GIF";
        return path;
    }
    
}
