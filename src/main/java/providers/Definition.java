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

    /**
     *
     * @param other   the reference object with which to compare.
     * @return
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Definition otherDef) {
            return this.PoS == otherDef.PoS && this.description.equals(otherDef.description)
                    && this.example.equals(otherDef.example);
        }
        return false;
    }

    /**
     * ____
     *
     * @param newExample
     */
    public void editExample(String newExample) {
        this.example = newExample;
    }
}
