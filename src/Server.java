import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server extends JFrame implements ActionListener {

    JTextField text;
    JPanel a1;
    Box vertical = Box.createVerticalBox();

    Server() {
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(7, 94, 84));
        p1.setBounds(0, 0, 450, 70);
        p1.setLayout(null);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        Image i2 = i1.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel back = new JLabel(i3);
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.setBounds(5, 22, 25, 25);
        p1.add(back);

        back.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ae) {
                System.exit(0);
            }
        });

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));
        Image i5 = i4.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel profile = new JLabel(i6);
        profile.setBounds(40, 10, 50, 50);
        p1.add(profile);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
        Image i8 = i7.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel video = new JLabel(i9);
        video.setBounds(300, 20, 30, 30);
        p1.add(video);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
        Image i11 = i10.getImage().getScaledInstance(35, 40, Image.SCALE_SMOOTH);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel phone = new JLabel(i12);
        phone.setBounds(350, 22, 35, 30);
        p1.add(phone);

        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
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

        a1 = new JPanel();
        a1.setBounds(0, 71, 450, 590);
        a1.setLayout(new BorderLayout());

        JScrollPane scrollPane = new JScrollPane(a1);
        scrollPane.setBounds(0, 71, 450, 590);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(scrollPane);

        text = new JTextField();
        text.setBounds(5, 665, 310, 30);
        text.setFont(new Font("SAN-SERIF", Font.PLAIN, 16));
        add(text);

        JButton send = new JButton("Send");
        send.setBounds(330, 664, 100, 30);
        send.setBackground(new Color(7, 94, 84));
        send.setForeground(Color.WHITE);
        send.addActionListener(this);
        send.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        add(send);

        setSize(450, 700);
        setLocation(200, 50);
        setUndecorated(true);
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String out = text.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String time = sdf.format(new Date());

        JPanel p2 = formatLabel(out);

        JPanel right = new JPanel(new BorderLayout());
        right.add(p2, BorderLayout.LINE_END);


        JPanel timePanel = new JPanel();
        timePanel.setLayout(new BorderLayout());
        JLabel timeLabel = new JLabel(time);
        timeLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
        timeLabel.setForeground(Color.GRAY);
        timePanel.add(timeLabel, BorderLayout.LINE_END);

        vertical.add(right);
        vertical.add(timePanel);
        vertical.add(Box.createVerticalStrut(15));

        a1.add(vertical, BorderLayout.PAGE_START);

        repaint();
        invalidate();
        validate();

        text.setText("");
    }

    public static JPanel formatLabel(String out) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel messageLabel = new JLabel("<html><p style='width:auto;'>" + out + "</p></html>");
        messageLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));

        FontMetrics fm = messageLabel.getFontMetrics(messageLabel.getFont());
        int messageWidth = fm.stringWidth(out);

        int maxMessageWidth = 250;
        if (messageWidth > maxMessageWidth) {
            messageLabel.setText("<html><p style='width:" + maxMessageWidth + "px;'>" + out + "</p></html>");
        }

        panel.add(messageLabel);
        panel.setBackground(new Color(37, 211, 102));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 20));

        return panel;
    }

    public static void main(String[] args) {
        new Server();
    }
}
