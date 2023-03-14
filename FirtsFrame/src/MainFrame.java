// ebben van az ablak:
import javax.swing.JFrame;

// ebben meg a gomb:
import javax.swing.JButton;

public class MainFrame extends JFrame{

    MainFrame(){

        initComponents();

    }
    
    private void initComponents() {

        // ablak mérete in pixel
        this.setSize(400, 300); 

        // ablak felirata
        this.setTitle("Első ablak");

        // Ablak bezáró gomb, több lehetőség a paraméterben!!
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        // elrendezés miatt kell:
        this.setLayout(null);

        // hogy az ablak közepén jelenjen meg
        this.setLocationRelativeTo(null);



        // *** gomb(ok) *** //

        JButton button = new JButton();
        button.setText("Gomb");
        button.setBounds(160, 135, 80, 25);
        button.setSize(80, 25);
        
        
        // tegyük fel az ablakra:
        this.add(button);

    }
}
