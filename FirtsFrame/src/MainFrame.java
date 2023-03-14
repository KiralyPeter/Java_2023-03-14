import javax.swing.JFrame;

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

    }
}
