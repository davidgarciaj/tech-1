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

    /**
     * Generate a response special with the param.
     * @param String the special word.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(int sentence)
    {
        String response;
        switch (sentence) {
                case 1:  response = "The telephone is a very util instrument for our company.";
                break;
                case 2:  response = "Our company have a excelent web...";
                break;
                case 3:  response = "Yes, we are awesome.";
                break;
                case 4:  response = "Wait a moment please, you need to think better this situation";
                break;
                default: response = generateResponse();
                break;
            }
        return response;
    }
}
