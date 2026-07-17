package providers;


import javafx.scene.text.Text;

/**
 *
 *
 * @author Tereza Lang (@TORITZA)
 */
public class definition {
    private partOfSpeech PoS;
    private Text description;
    /** semantic usage of the word this definition is for, exemplified in a sentence */
    private Text example;

    /**
     *
     *
     * @param PoS
     * @param description
     */
    public definition(partOfSpeech PoS, Text description) {
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
    public definition(partOfSpeech PoS, Text description, Text example) {
        this.PoS = PoS;
        this.description = description;
        this.example = example;
    }
}
