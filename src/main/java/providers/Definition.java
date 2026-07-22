package providers;


/**
 *
 *
 * @author Tereza Lang (@TORITZA)
 */
public class Definition {
    private PartOfSpeech PoS;
    private String description;
    /** semantic usage of the word this definition is for, exemplified in a sentence */
    private String example;

    /**
     *
     *
     * @param PoS
     * @param description
     */
    public Definition(PartOfSpeech PoS, String description) {
        this.PoS = PoS;
        this.description = description;
        this.example = "";
    }

    /**
     *
     *
     * @param PoS
     * @param description
     * @param example
     */
    public Definition(PartOfSpeech PoS, String description, String example) {
        this.PoS = PoS;
        this.description = description;
        this.example = example;
    }

    private void editExample(String newExample) {
        this.example = newExample;
    }
}
