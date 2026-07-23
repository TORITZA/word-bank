package providers;


import java.util.*;

import javafx.scene.text.Text;

/**
 *
 *
 * @author Tereza Lang (@TORITZA)
 */
public class Flashcard {
    private String word;
    private List<Definition> definitions = new ArrayList<>();
    private List<String> source = new ArrayList<>();
    private Set<String> tags = new LinkedHashSet<>();

    /**
     * Default constructor. Creates a blank flash card, front and back.
     */
    public Flashcard() {
        this.word = "";
    }

    /**
     * A constructor to fill out the front and back side of a flashcard, excluding
     * any example sentences using the vocabulary word.
     *
     * @param word name of the word
     * @param PoS initial definition's part of speech
     * @param def the definition of the designated word
     */
    public Flashcard(String word, PartOfSpeech PoS, String def) {
        this.word = word;
        definitions.add(new Definition(PoS, def));
    }

    /**
     * A constructor to fill out all fields on both the front and back side of
     * a flashcard.
     *
     * @param word
     * @param PoS
     * @param def
     * @param example
     */
    public Flashcard(String word, PartOfSpeech PoS, String def, String example) {
        this.word = word;
        definitions.add(new Definition(PoS, def, example));
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
    public void edit(PartOfSpeech PoS, int selected, String newContent) {
        definitions.set(selected, new Definition(PoS, newContent));
    }

    /**
     *
     *
     * @param PoS
     * @param newDef
     */
    public void addNew(PartOfSpeech PoS, String newDef) {
        definitions.add(new Definition(PoS, newDef));
    }

    /**
     *
     * @param index
     * @param setText
     */
    public void editExample(Integer index, Text setText) {
        //definitions.get(index).
    }
}



