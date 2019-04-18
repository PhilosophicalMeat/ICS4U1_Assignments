import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUItemp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500,500));
        frame.setVisible(true);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.BLUE);
        panel.setSize(500,200);

        JLabel label = new JLabel("Dog Cheese and other Delicious Dog Milk Products");
        label.setBounds(100,100, 200,50);
        panel.add(label);

        JButton button = new JButton("cool button");
        button.setBounds(200, 400, 100,50);
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.add(panel);


        frame.pack();
    }
}
