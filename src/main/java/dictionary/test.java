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
        Flashcard cardOne = new Flashcard("grail", PartOfSpeech.NOUN, " the object of an" +
                " extended or difficult quest", "'We must find the holy grail!'");
        cardOne.addSource("F. Scott Fitzgerald, The Great Gatsby");

        System.out.println(cardOne);


    }
}
