package ed.grupo4.main;

import ed.grupo4.GUI.FramePrincipal;
import ed.grupo4.util.Estacion;
/**
 *
 * @author Sebastian Ortiz
 * @author Yeyson Samir Cano
 * @author Richard Saul Alvarez
 */
public class main {
    public static Estacion estacion=new Estacion();
    public static void main(String[] args) {
        FramePrincipal principal = new FramePrincipal();
        principal.setVisible(true);
    }
}
