import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Server extends JFrame implements ActionListener{

    Server() {

        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(7, 94, 84));
        p1.setBounds(0, 0, 450, 70);
        p1.setLayout(null);
        add(p1);

        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        Image i2 = i1.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel back = new JLabel(i3);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.setBounds(5, 22, 25, 25);
        p1.add(back);

        back.addMouseListener(new MouseAdapter()  {
            public void mouseClicked(MouseEvent ae) {
                System.exit(0);
            }
        });

        ImageIcon i4 =new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));
        Image i5 = i4.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel profile = new JLabel(i6);
        profile.setBounds(40, 10, 50, 50);
        p1.add(profile);

        ImageIcon i7 =new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
        Image i8 = i7.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel video = new JLabel(i9);
        video.setBounds(300, 20, 30, 30);
        p1.add(video);

        ImageIcon i10 =new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
        Image i11 = i10.getImage().getScaledInstance(35, 40, Image.SCALE_SMOOTH);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel phone = new JLabel(i12);
        phone.setBounds(350, 22, 35, 30);
        p1.add(phone);

        ImageIcon i13 =new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
        Image i14 = i13.getImage().getScaledInstance(10, 25, Image.SCALE_SMOOTH);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel morevert = new JLabel(i15);
        morevert.setBounds(410, 24, 10, 25);
        p1.add(morevert);

        JLabel name = new JLabel("Harry");
        name.setBounds(110, 18, 100, 24);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("SAN_SERIF", Font.BOLD, 18));
        p1.add(name);

        JLabel status = new JLabel("Active Now");
        status.setBounds(110, 38, 100, 24);
        status.setForeground(Color.WHITE);
        status.setFont(new Font("SAN_SERIF", Font.BOLD, 12));
        p1.add(status);

        JPanel a1 = new JPanel();
        a1.setBounds(0, 71 , 470, 590);
        add(a1);

        JTextField text = new JTextField();
        text.setBounds(5, 665, 310, 30);
        text.setFont(new Font("SAN-SERIF", Font.PLAIN, 16));
        add(text);

        JButton send = new JButton("Send");
        send.setBounds(330, 664, 100, 30);
        send.setBackground(new Color(7, 94, 84));
        send.setForeground(Color.WHITE);
        send.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        add(send);

        setSize(450, 700);
        setLocation(200, 50);
        setUndecorated(true);
        getContentPane().setBackground(Color.WHITE);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

    }





    public static void main(String[] args) {
        new Server();
    }
}