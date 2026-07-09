package providers;

import org.w3c.dom.Text;

import java.util.LinkedHashMap;

/**
 *
 *
 * @author Tereza Lang (@TORITZA)
 */
public class flashCard {
    private String word;
    private LinkedHashMap<partOfSpeech, Text> definition = new LinkedHashMap<>();

    /**
     * Default constructor. Creates a blank flash card, front and back.
     */
    public flashCard() {
        this.word = "";
    }

    /**
     * A constructor to fill out the front and back side of a flash card.
     *
     * @param word name of the word
     * @param PoS initial definition's part of speech
     * @param def the definition of the designated word
     */
    public flashCard(String word, partOfSpeech PoS, Text def) {
        this.word = word;
        definition.put(PoS, def);
    }

    public void edit(String content) {
        this.word = content;
    }

    public void edit(partOfSpeech PoS, Text content) {
        //if PoS
        //definition.get(PoS) = content;
    }
}



