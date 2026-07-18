package providers;

/**
 *
 *
 * @author Tereza Lang (@TORITZA)
 */
public enum PartOfSpeech {
    NOUN("n."),
    PRONOUN("prn."),
    ADJECTIVE("adj."),
    ADVERB("adv."),
    VERB("v."),
    PREPOSITION("pre."),
    CONJUNCTION("con."),
    INTERJECTION("int.");

    private final String abbreviation;

    /**
     *
     * @param abbreviation
     */
    PartOfSpeech(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return this.abbreviation;
    }
}


