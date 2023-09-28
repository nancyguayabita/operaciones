package operacionesbasicas;
import javax.swing.JOptionPane;
public class Operacionesbasicas 
{
    public static void main(String[] args) 
    {
        //suma
        double d1,d2,denny;
        String esp1,esp2;
        JOptionPane.showMessageDialog(null,"suma");
        esp1=JOptionPane.showInputDialog("ingresar el primero numero: ");
        d1=Double.parseDouble(esp1);
        esp2=JOptionPane.showInputDialog("ingresa el segundo numero: ");
        d2=Double.parseDouble(esp2);
        denny=d1+d2;
        JOptionPane.showMessageDialog(null,"el resultado de la suma es: " + denny);
        //resta
        JOptionPane.showMessageDialog(null,"resta");
        esp1=JOptionPane.showInputDialog("ingresar el primero numero: ");
        d1=Double.parseDouble(esp1);
        esp2=JOptionPane.showInputDialog("ingresa el segundo numero: ");
        d2=Double.parseDouble(esp2);
        denny=d1-d2;
        JOptionPane.showMessageDialog(null,"el resultado de la resta es: " + denny);
        //multiplicacion
        JOptionPane.showMessageDialog(null,"multiplicacion");
        esp1=JOptionPane.showInputDialog("ingresar el primero numero: ");
        d1=Double.parseDouble(esp1);
        esp2=JOptionPane.showInputDialog("ingresa el segundo numero: ");
        d2=Double.parseDouble(esp2);
        denny=d1*d2;
        JOptionPane.showMessageDialog(null,"el resultado de la multiplicacion es: " + denny);
        //divicion
        JOptionPane.showMessageDialog(null,"divicion");
        esp1=JOptionPane.showInputDialog("ingresar el primero numero: ");
        d1=Double.parseDouble(esp1);
        esp2=JOptionPane.showInputDialog("ingresa el segundo numero: ");
        d2=Double.parseDouble(esp2);
        denny=d1/d2;
        JOptionPane.showMessageDialog(null,"el resultado de la divicion es: " + denny);
    }
    
}
