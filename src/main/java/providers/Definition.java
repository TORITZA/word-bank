package providers;


import javafx.scene.image.Image;

/**
 * _____
 *
 * @author Tereza Lang (@TORITZA)
 */
public class Definition {
    private PartOfSpeech PoS;
    private String description;
    /** semantic usage of the word this definition is for, exemplified in a sentence */
    private String example;
    private Image img;

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

    /**
     * __
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder defSB = new StringBuilder("[" + PoS.toString() + "] - ");
        defSB.append(description);

        if (!example.isEmpty()) {
            defSB.append("\n").append("EX:").append(example);
        }

        return defSB.toString();
    }


    // ----------------------------------GETTERS----------------------------------

    /**
     *
     * @return
     */
    public PartOfSpeech getPOS() {return PoS;}

    /**
     *
     * @return
     */
    public String getDescription() {return description;}

    /**
     *
     * @return
     */
    public String getExample() {return example;}

    /**
     *
     *
     * @return
     */
    public Image getImage() {
        return img;
    }
}
