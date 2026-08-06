package providers;


import java.util.*;

import javafx.scene.image.Image;
import providers.Definition;

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
    /** related words */
    private Set<String> relatedWords = new LinkedHashSet<>();
    /** front-end update, gather images from each stored def & aggregate
     * them in this field */
    private List<Image> gallery = new ArrayList<>();

    /**
     * Default constructor. Creates a blank flash card, front and back.
     */
    public Flashcard() {
        this.word = "";
    }

    /**
     * A constructor to fill out the front and back side of a flashcard, excluding
     * any example sentences using the vocabulary word & from where the user first
     * encountered the word.
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
     * A constructor to fill out the front and back side of a flashcard, including
     * any example sentences using the vocabulary word.
     *
     * @param word name of the word
     * @param PoS initial definition's part of speech
     * @param def the definition of the designated word
     * @param example a sentence showcasing the semantic & syntactic properties of the word
     */
    public Flashcard(String word, PartOfSpeech PoS, String def, String example) {
        this.word = word;
        definitions.add(new Definition(PoS, def, example));
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
    public Flashcard(String word, PartOfSpeech PoS, String def, String example, String origin) {
        this.word = word;
        definitions.add(new Definition(PoS, def, example));
        source.add(origin);
    }

    /**
     *
     *
     * @param other
     * @return
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Flashcard otherCard) {
            return this.word.equals(otherCard.word) && this.definitions.equals
                    (otherCard.definitions) && this.source.equals(otherCard.source) &&
                    this.tags.equals(otherCard.tags);
        }
        return false;
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
     *
     * @param index
     * @param setText
     */
    public void editExample(Integer index, String setText) {
        definitions.get(index).editExample(setText);
    }

    /**
     *
     *
     * @param origin
     */
    public void addSource(String origin) {
        source.add(origin);
    }

    /**
     *
     * @param tag
     */
    public void addTag(String tag) {
        tags.add(tag);
    }

    /**
     *
     * @param tag
     */
    public void removeTag(String tag) {
        tags.remove(tag);
    }

    /**
     *
     * @param tag
     * @return
     */
    public boolean hasTag(String tag) {
        return tags.contains(tag);
    }

    /**
     * __
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder cardSB = new StringBuilder(word.toLowerCase());

        if (!definitions.isEmpty()) {
            cardSB.append("\n");
            for (Definition def : definitions) {
                cardSB.append("\t").append(def).append("\n");
            }
        }
        if (!source.isEmpty()) {
            cardSB.append("\n").append(source).append("\n");
        }
        if (!tags.isEmpty()) {
            cardSB.append("Tags:").append("\n").append("\t");
            for (String tag : tags) {
                cardSB.append(tag).append("  ");
            }
            cardSB.append("\n");
        }
        if (!relatedWords.isEmpty()) {
            cardSB.append("Related:").append("\n").append("\t");
            for (String word : relatedWords) {
                cardSB.append(word).append("  ");
            }
            cardSB.append("\n");
        }

        return cardSB.toString();
    }


    // ----------------------------------GETTERS----------------------------------

    /**
     *
     * @return
     */
    public String getWord() {return word;}

    /**
     *
     * @return
     */
    public List<Definition> getDefinitions() {return definitions;}

    /**
     *
     * @return
     */
    public List<String> getSource() {return source;}

    /**
     *
     * @return
     */
    public Set<String> getTags() {return tags;}

    /**
     *
     * @return
     */
    public Set<String> getRelatedWords() {return relatedWords;}

    /**
     *
     * @return
     */
    public List<Image> getGallery() {return gallery;}

}



