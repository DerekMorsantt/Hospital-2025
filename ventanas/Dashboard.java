package ventanas;
import javax.swing.JFrame;

public class Dashboard extends JFrame {
    
    public Dashboard() {
    
        this.setTitle("Doctor");
        this.setSize(1900,1000);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(null);

        this.setVisible(true);
        
    }

    public JFrame getDashFrame(){
        return this;
    }
}
