import java.awt.*;
import javax.swing.*;

public class TestGUI extends JFrame {
    private JLabel label1, label2;
    private JTextField text1, text2;
    private JButton button1;

    public TestGUI(){
    super("TestGui");
    Container mycontainer = getContentPane();
    mycontainer.setLayout(new FlowLayout());
    label1 = new JLabel("First Name");
    label2 = new JLabel("Last Name");
    text1 = new JTextField(20);
    text2 = new JTextField(20);
    mycontainer.add(label1);
    mycontainer.add(text1);
    mycontainer.add(label2);
    mycontainer.add(text2);
    setSize(300,100);
    setVisible(true);
    }


}

