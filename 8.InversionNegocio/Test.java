import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args)
    {
        //
        // Declaración de variables
        //

        // Input
        double c1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el capital de pedro"));
        double c2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el capital de juan"));
        double c3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la inversion del negocio"));
        double meses = 0;

        // Processing
        while(c1 + c2 < c3)
        {
            meses ++; // meses = meses + 1;
            c1 += c1*0.03;
            c2 += c2*0.04;
        }

        // Output
        JOptionPane.showMessageDialog(null, "Los meses necesarios para alcanzar la inversión son: " + meses);

        System.exit(0);
    }
}