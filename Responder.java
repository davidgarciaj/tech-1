import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.util.HashMap;
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
    private HashMap<String,String> respuestaEspecial;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        respuestas = new ArrayList<>(
                Arrays.asList("That sounds interesting. Tell me more...", "Well, continue...", "I dont care...",
                    "Tell me something more interesting please", "Only want speak by you..."));
        rnd = new Random();
        respuestaEspecial = new HashMap<>();
        respuestaEspecial.put("telephone","The telephone is a very util instrument for our company.");        
        respuestaEspecial.put("pc","Our company have a excelent web...");
        respuestaEspecial.put("awesome","Yes, we are awesome.");
        respuestaEspecial.put("demand","Wait a moment please, you need to think better this situation");
    }

    /**
     * Generate a response special with the param.
     * @param String the special word.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String sentence)
    {
        String respuesta = respuestaEspecial.get(sentence);
        if(respuesta == null){ respuesta = respuestas.get(rnd.nextInt(respuestas.size()));}
        return respuesta;
    }
}
