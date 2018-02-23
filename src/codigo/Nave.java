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
    private boolean pulsadoDerecha = false;
    
    private int anchoPantalla;

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

    public Nave(int _anchoPantalla)
    {
        try
        {
            imagen = ImageIO.read(getClass().getResource("/imagenes/nave.png"));
        }
        catch(IOException ramonaLaPechugona){}
        anchoPantalla = _anchoPantalla;
    }
    
    public void mueve()
    {
        if(pulsadoIzquierda && x > 0)
        {
            x--;
            x--;
            x--;
            x--;
            x--;
        }
        if(pulsadoDerecha && x < anchoPantalla - imagen.getWidth(null))
        {
            x++;
            x++;
            x++;
            x++;
            x++;
        }
    }
}
