package dictionary;

import providers.Definition;
import providers.Flashcard;
import providers.PartOfSpeech;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Tereza Lang (@TORITZA)
 */
public class WordBankModel {
    private Set<Flashcard> flashcards = new LinkedHashSet<>();
    private Set<String> createdTags = new LinkedHashSet<>();

    /**
     * ver. 1
     *
     * @param word
     * @param PoS
     * @param def
     */
    public void addFlashcard(String word, PartOfSpeech PoS, String def) {
        flashcards.add(new Flashcard(word, PoS, def));
    }

    /**
     * ver. 2
     *
     * @param word
     * @param PoS
     * @param def
     * @param example
     */
    public void addFlashcard(String word, PartOfSpeech PoS, String def, String example) {
        flashcards.add(new Flashcard(word, PoS, def, example));
    }

    /**
     * ver. 3
     *
     * @param word
     * @param PoS
     * @param def
     * @param example
     * @param origin
     */
    public void addFlashcard(String word, PartOfSpeech PoS, String def, String example,
                             String origin) {
        flashcards.add(new Flashcard(word, PoS, def, example, origin));
    }

    /**
     * ____
     *
     * @param newTag
     */
    public void createTag(String newTag) {
        createdTags.add(newTag);
    }


    // ----------------------------------GETTERS----------------------------------

    /**
     *
     * @return
     */
    public Set<Flashcard> getFlashcards() { return flashcards; }

    /**
     *
     * @return
     */
    public Set<String> getCreatedTags() { return createdTags; }
}
