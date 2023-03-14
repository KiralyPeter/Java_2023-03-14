import javax.swing.JFrame;

public class MainFrame extends JFrame{

    MainFrame() {

        // ősostály meghívása
        super("Színek");
        initComponents();

    }
    
    private void initComponents(){

        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

    }

}
