package test5;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;

@SuppressWarnings("unused")
public class MyFrame extends JFrame {

	/**
	 * �쿡��20204071102
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtusername;
	private JTextField txtpassword;
	private JTextField textField;
	private JTextField txtpasswordverify;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("�û�ע��");
		txtusername = new JTextField();
		txtusername.setFont(new Font("����", Font.PLAIN, 14));
		txtusername.setBounds(100, 33, 232, 30);
		contentPane.add(txtusername);
		txtusername.setColumns(10);
		
		JButton btnNewButton = new JButton("\u6CE8\u518C ");
		btnNewButton.setBounds(223, 264, 93, 23);
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("\u7528\u6237\u540D*");
		label.setFont(new Font("����", Font.PLAIN, 14));
		label.setBounds(36, 41, 75, 15);
		contentPane.add(label);
		
		JLabel lblusername = new JLabel("aaaaaa\r\nbbbbbb");
		lblusername.setFont(new Font("����", Font.PLAIN, 14));
		lblusername.setBounds(360, 25, 184, 47);
		contentPane.add(lblusername);
		lblusername.setText("<html><body>�û���ֻ������ĸ�����֡��»��߹��ɣ�����Ϊ8-20���ַ�</body></html>");
		
		JLabel label_1 = new JLabel("\u5BC6\u7801*");
		label_1.setFont(new Font("����", Font.PLAIN, 14));
		label_1.setBounds(36, 110, 75, 15);
		contentPane.add(label_1);
		
		txtpassword = new JTextField();
		txtpassword.setFont(new Font("����", Font.PLAIN, 14));
		txtpassword.setColumns(10);
		txtpassword.setBounds(100, 102, 232, 30);
		contentPane.add(txtpassword);
		
		JLabel lblpasswrod = new JLabel("<html><body>���ٰ�����д��ĸ��Сд��ĸ�����ֺ�������ţ��ҳ�������8λ</body></html>");
		lblpasswrod.setForeground(Color.RED);
		lblpasswrod.setFont(new Font("����", Font.PLAIN, 14));
		lblpasswrod.setBounds(360, 75, 184, 57);
		contentPane.add(lblpasswrod);
		
		JLabel label_1_1 = new JLabel("Email*");
		label_1_1.setFont(new Font("����", Font.PLAIN, 14));
		label_1_1.setBounds(36, 214, 75, 15);
		contentPane.add(label_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("����", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(100, 207, 232, 30);
		contentPane.add(textField);
		
		JLabel label_1_2 = new JLabel("\u786E\u8BA4\u5BC6\u7801*");
		label_1_2.setFont(new Font("����", Font.PLAIN, 14));
		label_1_2.setBounds(15, 155, 75, 15);
		contentPane.add(label_1_2);
		
		txtpasswordverify = new JTextField();
		txtpasswordverify.setFont(new Font("����", Font.PLAIN, 14));
		txtpasswordverify.setColumns(10);
		txtpasswordverify.setBounds(100, 147, 232, 30);
		contentPane.add(txtpasswordverify);
		
		JLabel lblusernamemessage = new JLabel("");
		lblusernamemessage.setForeground(Color.RED);
		lblusernamemessage.setBounds(100, 66, 160, 15);
		contentPane.add(lblusernamemessage);
		
		txtusername.addFocusListener(new FocusAdapter() {

			@Override
			public void focusLost(FocusEvent e) {
				String value=txtusername.getText();
				String regex="\\w{8,20}";
				if(!value.matches(regex)) {
					lblusernamemessage.setText("�û�����ʽ����");
				}
				else
					lblusernamemessage.setText("");
			}
			
		});
		
		
		txtusername.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				String value=txtusername.getText();
				String regex="\\w{8,20}";
				if(!value.matches(regex)) {
					lblusernamemessage.setText("�û�����ʽ����");
				}
				else
					lblusernamemessage.setText("");
			}
			
			@Override
			public void focusGained(FocusEvent e) {
			}
		});

	}
}
