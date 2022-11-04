import javax.swing.JOptionPane;
import java.awt.*;
import java.net.*;
public class aa {
    public static int PUNTOS = 10000;
    public static int APOSTAR;
    public static void main(String[] args) {
        principal();
    }
    public static void comprobar(){

        if (PUNTOS == 0 ){
            JOptionPane.showMessageDialog(null,"Te has quedado sin puntos fracasado ");
            System.exit(0);
        }

    }
    public static void principal(){
        comprobar();

        String [] botones = { "Jugar", "Consultar Saldo", "Premios" };

        int variable = JOptionPane.showOptionDialog (null, "Que quieres hacer?", "Ruleta v0.1", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null/*icono*/, botones, botones[0]);
        if (variable == 0) ruleta();
        if (variable == 1) consultarSaldo();
        if (variable == 2) premios();

        ruleta();
    }
    public static void premios(){
        String [] botones = { "Wallpaper katana(50012 puntos)", "Youssef le da puñetazo a francho(1200 puntos)", "volver" };

        int variable = JOptionPane.showOptionDialog (null, "Selecciona premio (Tienes " + PUNTOS + " puntos)", "Ruleta v0.1", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null/*icono*/, botones, botones[0]);

        if (variable == 0) {
            if (PUNTOS > 500 ) { PUNTOS = PUNTOS -500;
                try {
                    Desktop.getDesktop().browse(new URL("http://www.google.com").toURI());
                } catch (Exception e) {}



            }
            else { JOptionPane.showMessageDialog(null,"No tienes suficientes puntos"); principal();}
        }
        if (variable == 1) {
            if (PUNTOS > 1200 ) { PUNTOS = PUNTOS -1200; JOptionPane.showMessageDialog(null,"Llamando a Youssef"); principal(); }
            else { JOptionPane.showMessageDialog(null,"No tienes suficientes puntos"); principal();}

        }
        if (variable == 2) principal();
    }

    public static void consultarSaldo(){
        JOptionPane.showMessageDialog(null,"Tienes " + PUNTOS + " puntos ");
        principal();
    }
    public static void ruleta(){

        APOSTAR = Integer.parseInt(JOptionPane.showInputDialog("Introduzca cantidad para apostar: "));
        if(APOSTAR > PUNTOS) {       JOptionPane.showMessageDialog(null,"No tienes suficientes puntos, introduce una cantidad valida"); principal();}
        PUNTOS = PUNTOS- APOSTAR;
        int[] numeros = new int[3];
        numeros[0] =(int) (Math.random() * 2 +1 );
        numeros[1] =(int) (Math.random() * 2 +1);
        numeros[2] =(int) (Math.random() * 2 +1);
        JOptionPane.showMessageDialog(null,"RULETA: " + numeros[0] + numeros[1] + numeros[2]  );

        if( numeros[0] == numeros[1] && numeros[1] == numeros[2] ) {PUNTOS = PUNTOS + (APOSTAR * 15);
            JOptionPane.showMessageDialog(null,"HAS GANADO" + (APOSTAR*15) + " PUNTOS !!! ");}
        else {
            JOptionPane.showMessageDialog(null, "has perdido " + APOSTAR + " puntos :( ");
        }
        principal();
    }
}