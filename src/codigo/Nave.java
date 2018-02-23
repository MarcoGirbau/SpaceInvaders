/*
 * La nave del juego
 */
package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * @author Marco Girbau
 */
public class Nave 
{
    public Image imagen = null;
    public int x = 0;
    public int y = 0;
    private boolean pulsadoIzquierda = false;

    public boolean isPulsadoIzquierda() {
        return pulsadoIzquierda;
    }

    public void setPulsadoIzquierda(boolean pulsadoIzquierda) {
        this.pulsadoIzquierda = pulsadoIzquierda;
    }

    public boolean isPulsadoDerecha() {
        return pulsadoDerecha;
    }

    public void setPulsadoDerecha(boolean pulsadoDerecha) {
        this.pulsadoDerecha = pulsadoDerecha;
    }
    private boolean pulsadoDerecha = false;
    
    public Nave()
    {
        try
        {
            imagen = ImageIO.read(getClass().getResource("/imagenes/nave.png"));
        }
        catch(IOException ramonaLaPechugona){}
    }
    
    public void mueve()
    {
        if(pulsadoIzquierda && x > 0)
        {
            x--;
        }
        //TODO: falta mover a la derecha
    }
}
