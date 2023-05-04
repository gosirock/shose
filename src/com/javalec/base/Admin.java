package com.javalec.base;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class Admin extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin frame = new Admin();
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
	public Admin() {
		setTitle("관리자모드");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 50, 592, 223);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("ID :");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel.setBounds(12, 10, 24, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblUserId = new JLabel("");
		lblUserId.setFont(new Font("굴림", Font.PLAIN, 15));
		lblUserId.setBounds(48, 10, 108, 15);
		contentPane.add(lblUserId);
		
		JLabel lblNewLabel_1 = new JLabel("신발사진");
		lblNewLabel_1.setBounds(12, 303, 214, 223);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("브랜드 :");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(238, 303, 81, 18);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("상품명 :");
		lblNewLabel_2_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(238, 331, 81, 18);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("구매수량 :");
		lblNewLabel_2_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_2_1_1.setBounds(238, 359, 81, 18);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("가격 :");
		lblNewLabel_2_1_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1.setBounds(238, 387, 81, 18);
		
		contentPane.add(lblNewLabel_2_1_1_1);
		JButton btnNewButton = new JButton("담기");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton.setBounds(481, 493, 97, 23);
		contentPane.add(btnNewButton);
	}
}
