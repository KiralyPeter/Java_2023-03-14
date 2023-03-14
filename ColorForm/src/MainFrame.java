import javax.swing.JFrame;

// A panelek miatt:
import javax.swing.JPanel;

// A BorderLayout miatt:
import java.awt.BorderLayout;

// GridLayout miatt
import java.awt.GridLayout;

// setBackground miatt (nem használjuk)
import java.awt.Color;


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
        // sorok, oszlopok:
        this.setLayout(new GridLayout(1, 1));

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        // mainPanel.setBackground(Color.PINK);
        this.add(mainPanel);

        JPanel westPanel = new JPanel();
        westPanel.setSize(30, 340);
        westPanel.setBackground(Color.yellow);

        // felrakjuk a mainPanelra és elhelyezzük:
        mainPanel.add(westPanel, BorderLayout.WEST);

        JPanel northPanel = new JPanel();
        northPanel.setSize(30, 500);
        northPanel.setBackground(Color.yellow);

        mainPanel.add(northPanel, BorderLayout.NORTH);


        JPanel easatPanel = new JPanel();
        easatPanel.setSize(30, 340);
        easatPanel.setBackground(Color.yellow);

        mainPanel.add(easatPanel, BorderLayout.EAST);

        JPanel southPanel = new JPanel();
        southPanel.setSize(30, 500);
        southPanel.setBackground(Color.yellow);

        mainPanel.add(southPanel, BorderLayout.SOUTH);



    }

}
