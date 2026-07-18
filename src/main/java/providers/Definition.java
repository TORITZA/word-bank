package providers;


import javafx.scene.text.Text;

/**
 *
 *
 * @author Tereza Lang (@TORITZA)
 */
public class Definition {
    private PartOfSpeech PoS;
    private Text description;
    /** semantic usage of the word this definition is for, exemplified in a sentence */
    private Text example;

    /**
     *
     *
     * @param PoS
     * @param description
     */
    public Definition(PartOfSpeech PoS, Text description) {
        this.PoS = PoS;
        this.description = description;
        this.example = new Text();
    }

    /**
     *
     *
     * @param PoS
     * @param description
     * @param example
     */
    public Definition(PartOfSpeech PoS, Text description, Text example) {
        this.PoS = PoS;
        this.description = description;
        this.example = example;
    }

    private void editExample(Text newExample) {
        this.example = newExample;
    }
}
