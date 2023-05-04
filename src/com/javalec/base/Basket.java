package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Basket extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buy frame = new Buy();
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
	public Basket() {
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
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("총 구매액 :");
		lblNewLabel_2_1_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1.setBounds(34, 499, 81, 18);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JButton btnNewButton = new JButton("돌아가기");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton.setBounds(374, 497, 97, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("전체삭제");
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_1.setBounds(507, 283, 97, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("구매");
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 15));
		btnNewButton_2.setBounds(507, 497, 97, 23);
		contentPane.add(btnNewButton_2);
	}
}
