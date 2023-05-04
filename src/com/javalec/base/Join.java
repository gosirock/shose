package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Join extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Join frame = new Join();
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
	public Join() {
		setTitle("회원가입");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID :");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel.setBounds(12, 28, 57, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Pw :");
		lblPassword.setFont(new Font("굴림", Font.PLAIN, 15));
		lblPassword.setBounds(12, 71, 35, 15);
		contentPane.add(lblPassword);
		
		JLabel lblNewLabel_1 = new JLabel("이름 :");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(12, 114, 57, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("전화번호 :");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(12, 169, 79, 27);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("이메일 :");
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(12, 224, 79, 27);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("전화번호 :");
		lblNewLabel_1_1_2.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1_1_2.setBounds(12, 279, 79, 27);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("주소 :");
		lblNewLabel_1_1_2_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1_1_2_1.setBounds(12, 334, 79, 27);
		contentPane.add(lblNewLabel_1_1_2_1);
		
		textField = new JTextField();
		textField.setBounds(94, 25, 179, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(94, 68, 179, 21);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(94, 117, 179, 21);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(94, 172, 179, 21);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(94, 227, 179, 21);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(94, 282, 179, 21);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(94, 337, 179, 21);
		contentPane.add(textField_6);
		
		JButton btnNewButton = new JButton("회원가입");
		btnNewButton.setBounds(176, 405, 97, 23);
		contentPane.add(btnNewButton);
	}

}
