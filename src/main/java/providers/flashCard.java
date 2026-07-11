package providers;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 *
 *
 * @author Tereza Lang (@TORITZA)
 */
public class flashCard {
    private String word;
    private LinkedHashMap<partOfSpeech, List<Text>> definition = new LinkedHashMap<>();

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
        definition.put(PoS, new ArrayList<>());
        definition.get(PoS).add(def);
    }

    /**
     * WIP desc -> this.word
     *
     * @param newContent
     */
    public void edit(String newContent) {
        word = newContent;
    }

    /**
     * WIP desc -> this.definition
     *
     * @param PoS
     * @param selected
     * @param newContent
     */
    public void edit(partOfSpeech PoS, int selected, Text newContent) {
        definition.get(PoS).set(selected, newContent);
    }

    /**
     *
     *
     * @param PoS
     * @param newDef
     */
    public void addNew(partOfSpeech PoS, Text newDef) {
        if (definition.containsKey(PoS)) {
            definition.get(PoS).add(newDef);
        } else {
            definition.put(PoS, new ArrayList<>());
            definition.get(PoS).add(newDef);
        }
    }
}



