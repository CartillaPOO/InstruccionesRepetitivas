import javax.swing.JOptionPane;

public class Test
{
    // Método principal
    public static void main(String[] args)
    {
        //
        // Declaración de variables
        //

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero")); // Input
        int input = n;
        int invertido = 0;
        int resto;

        // Processing
        while(n>0)
        {
            resto = n % 10;
            invertido = invertido * 10 + resto;
            n /= 10;
        }
        System.out.println(invertido); // System.out.println() es un método que imprime en consola

        if(input == invertido)
        {
            JOptionPane.showMessageDialog(null, "Es capicúa"); // Output
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No es capicúa"); // Output
        }

        System.exit(0);
    }
}
