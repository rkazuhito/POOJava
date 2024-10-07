import java.util.Date;
import java.util.Locale;
import java.awt.Dimension;
import java.awt.Toolkit;


public class HoraDoSistema {
    public static void main(String[] args){
        Date relogio = new Date();
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());

        Locale idioma = Locale.getDefault();
        System.out.print("O idioma do seu sistema está configurado para: ");
        System.out.println(idioma.getDisplayLanguage());

        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int)size.getWidth();
        int altura = (int)size.getHeight();
        System.out.println("Sua resolução é de : "+ " " + largura + " X " + altura);
    }
}
