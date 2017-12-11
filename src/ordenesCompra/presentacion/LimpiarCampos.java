
package ordenesCompra.presentacion;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author jarteaga
 */
public class LimpiarCampos 
{
    
      public void limpiar(JPanel jPanel)
            {
	       for(int i=0; jPanel.getComponents().length>i;i++)
               {
	           //Limpia todos los JTextField de un JPanel
	           if(jPanel.getComponents()[i]instanceof JTextField)
                   {
	               ((JTextField)jPanel.getComponents()[i]).setText("");
	           }
	           //Limpia todos los JPasswordField de un JPanel
	           else if(jPanel.getComponents()[i] instanceof JPasswordField)
                    {
                        ((JPasswordField)jPanel.getComponents()[i]).setText("");
                    }          
	       }
            }    
}
