import javax.swing.JButton;
import javax.swing.JFrame;

// A panelek miatt:
import javax.swing.JPanel;
// import javax.swing.event.AncestorListener;

// A BorderLayout miatt:
import java.awt.BorderLayout;

// GridLayout miatt
import java.awt.GridLayout;

// setBackground miatt (nem használjuk)
import java.awt.Color;

import java.awt.FlowLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainFrame extends JFrame implements ActionListener{

    JButton redButton;
    JButton greenButton;
    JButton blueButton;
    JButton exitButton;
    JPanel centerPanel;

    
    MainFrame() {

        // ősostály meghívása
        super("Színek");
        initComponents();

    }
    
    private void initComponents(){

        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
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
        southPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        mainPanel.add(southPanel, BorderLayout.SOUTH);
        
        // A southPanel-ra rakunk gombokat
        redButton = new JButton("Piros");
        greenButton = new JButton("Zöld");
        blueButton = new JButton("Kék");
        exitButton = new JButton("Kilép");

        southPanel.add(redButton);
        southPanel.add(greenButton);
        southPanel.add(blueButton);
        southPanel.add(exitButton);

        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
        exitButton.addActionListener(this);


        // Center
        centerPanel = new JPanel();
        centerPanel.setBackground(Color.LIGHT_GRAY);
        mainPanel.add(centerPanel, BorderLayout.CENTER);




    }

    // nem kötelező, de javasolt az "@Override"
    @Override
    public void actionPerformed(ActionEvent event) {

        // Melyik gobról érkezett az aktuális action?
        // Ez így hivatalosan ronda...
        if(event.getSource() == exitButton){
            System.exit(0);
        } else if (event.getSource() == redButton) {
            // setRed(); lenne a szép...
            centerPanel.setBackground(Color.red);

        } else if (event.getSource() == greenButton) {
            centerPanel.setBackground(Color.green);

        } else if (event.getSource() == blueButton) {
            centerPanel.setBackground(Color.blue);

        }
        
    }
}
