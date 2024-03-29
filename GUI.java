import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.Proxy;

public class GUI extends Main{
    JFrame frame;
    JPanel panel;
    JLabel message1;
    JLabel IdPrompt;
    JTextField Id;

    JLabel agePrompt;
    JTextField age;

    JLabel btPrompt;
    JComboBox BT;
    //Bt = bloodtype
    String[] types = {"O","A","B","AB"};

    JLabel rhPrompt;
    JComboBox RH;

    String[] bloodrhs = {"+","-"};
    JButton submit;
    JLabel result1;
    JLabel result2;

    JLabel result3;

    public GUI(){
        frame = new JFrame();
        panel = new JPanel();
        panel.setLayout(new GridBagLayout());

        message1 = new JLabel("Welcome user.");

        IdPrompt = new JLabel("Enter your ID Number");
        Id = new JTextField();

        agePrompt = new JLabel("Enter your age");
        age = new JTextField();

        btPrompt = new JLabel("Blood Type:");
        BT = new JComboBox(types);

        rhPrompt = new JLabel("Blood RH:");
        RH = new JComboBox(bloodrhs);

        submit = new JButton("Submit");
        submit.addActionListener(this::ActionListener);

        result1 = new JLabel("");
        result2 = new JLabel("");
        result3 = new JLabel("");

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(message1,gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(IdPrompt,gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.ipadx = 50;
        panel.add(Id,gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(agePrompt,gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 50;
        panel.add(age,gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(btPrompt,gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(BT,gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(rhPrompt,gbc);
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(RH,gbc);

        gbc.gridx = 0;
        gbc.gridy = 10;
        panel.add(submit,gbc);
        gbc.gridx = 0;
        gbc.gridy = 11;
        panel.add(result1,gbc);
        gbc.gridx = 0;
        gbc.gridy = 12;
        panel.add(result2,gbc);
        gbc.gridx = 0;
        gbc.gridy = 13;
        panel.add(result3,gbc);


        frame.add(panel);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("TestBloodData");
        frame.setVisible(true);
    }

    public void ActionListener(ActionEvent e){
        String bloodSelected = String.valueOf(BT.getSelectedItem());
        String rhSelected = String.valueOf(RH.getSelectedItem());

        bloodData b = new bloodData(bloodSelected,rhSelected);
        Patient p = new Patient(Integer.parseInt(Id.getText()), Integer.parseInt(age.getText()), b);

        result1.setText("ID:" + p.getID());
        result2.setText("Age: "+p.getAge());
        result3.setText("Bloodtype: "+p.getData().toString());
        panel.revalidate();

    }
}
