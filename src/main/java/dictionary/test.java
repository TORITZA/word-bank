package dictionary;

import providers.Flashcard;
import providers.PartOfSpeech;

/**
 * A class intended to test & debug the components of this project.
 *
 * @author Tereza Lang (@TORITZA)
 */
public class test {
    
    public static void main() {
        Flashcard cardOne = new Flashcard("grail", PartOfSpeech.NOUN, "the object of an" +
                " extended or difficult quest", "'We must find the holy grail!'");
        cardOne.addSource("F. Scott Fitzgerald, The Great Gatsby");
        cardOne.addTag("Allusion");
        cardOne.addTag("Literary");

        System.out.println(cardOne);

        cardOne.addNew(PartOfSpeech.NOUN, "any supreme goal that you " +
                "chase after for a long time");
        cardOne.editExample(1, "'That reward was the grail I staked EVERYTHING on.'");

        System.out.println(cardOne);

        // To retrieve index and thus edit components of the selected definition
        //cardOne.getDefinitions().indexOf()

    }
}
