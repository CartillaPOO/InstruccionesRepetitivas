import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) 
    {
        //
        // Declaración de variables
        //

        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número")); // Input
        boolean primo = true;

        // Processing
        for(int i = 2; i<=n; i++)
        {
            if(i != n && n%i == 0)
            {
                System.out.println();
                primo = false;
            }
        }
        if(n != 1 && primo)
        {
            JOptionPane.showMessageDialog(null, "El número " + n + " es primo"); // Output
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El número " + n + " no es primo"); // Output
        }
        
        System.exit(0);
    }
}
