import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private ArrayList<String> respuestas;
    private Random rnd;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        respuestas = new ArrayList<>(
                Arrays.asList("That sounds interesting. Tell me more...", "Well, continue...", "I dont care...",
                    "Tell me something more interesting please", "Only want speak by you..."));
        rnd = new Random();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return respuestas.get(rnd.nextInt(respuestas.size()));
    }
}
