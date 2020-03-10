

/**
 * @author David López Fontecha
 * @version 10/03/2020
 */
public interface doc
{

    /** Devuelve el contenido de la fila x del fichero de texto con ruta absoluta file.
     * @param String  
     * @param int
     * @return String
     *
     */
    public abstract String obtenerLinea(int x, String file);
    
    /**
     * Devuelve latitud y altitud de una calle determinada de dos int ubicados 
     * en un HashMap como valor y el nombre de la calle como clave en otro 
     * HashMap. Todo esto es convertido a String.
     * 
     * @param  String 
     * @return   String 
     */
    public abstract String latitudAltitud(String nombreCalle);
    

}
