import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JButton jb1 =new JButton("Run");
    private JButton jb2 =new JButton("Exit");
    private JLabel jl1 =new JLabel();
    private JLabel jl2 =new JLabel();
    private JLabel jl3 =new JLabel();
    private TextField tf =new TextField();
    private JPanel jp1 =new JPanel(new GridLayout(2,3,1,1));
    private Container cp ;
public  MainFrame (){
    init();
}
public void init(){
    this.setBounds(500,500,500,500);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.setVisible(true);
    cp =this.getContentPane();
    cp.add(jp1);
    jp1.add(tf);
    jp1.add(jb1);
    jp1.add(jl1);
    jp1.add(jl2);
    jp1.add(jl3);
    jp1.add(jb2);
    jb1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                double v1 =Double.parseDouble(tf.getText());
                double v2 =(0.6*v1);
                jl1.setText(Double.toString(v2));
            }catch (NumberFormatException e1){
                JOptionPane.showMessageDialog(MainFrame.this,"InputError");
            }

        }
    });
    jb2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
}
}
