import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) 
    {
        //
        // Declaración de variables
        //

        double n = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número para calcular su factorial")); // Input
        double fact = 1;

        // Processing
        if(n > 0)
        {
            for(int i = 1; i<=n; i++)
            {
                fact *= i; // fact = fact * i
            }
            JOptionPane.showMessageDialog(null, "El factorial de " + n + "es " + fact); // Output
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No se pueden introducir números negativos"); // Output
        }

        System.exit(0);
    }
}