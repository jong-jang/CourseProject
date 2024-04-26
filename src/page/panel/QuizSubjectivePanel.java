package page.panel;


import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.border.SoftBevelBorder;

import page.StudentExamPage;

import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

public class QuizSubjectivePanel extends JPanel {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizSubjectivePanel panel = new QuizSubjectivePanel();
					panel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QuizSubjectivePanel() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 135, 51);
		add(panel);
		
		JLabel lblNewLabel = new JLabel("시험풀기");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 71, 774, 187);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("1.");
		lblNewLabel_1.setBounds(12, 10, 43, 48);
		panel_1.add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(63, 22, 699, 143);
		panel_1.add(textArea);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 268, 774, 281);
		add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(533, 10, 229, 50);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(277, 559, 231, 30);
		add(panel_7);
		panel_7.setLayout(new GridLayout(1, 2, 0, 0));
		
		JButton left_bt = new JButton("◀");
		panel_7.add(left_bt);
		
		JButton right_bt = new JButton("▶");
		right_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_7.add(right_bt);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(710, 555, 76, 34);
		add(panel_8);
		
		JButton submit_bt = new JButton("제출");
		panel_8.add(submit_bt);
		
		JPanel panel_7_1 = new JPanel();
		panel_7_1.setBounds(555, 10, 231, 30);
		add(panel_7_1);
		panel_7_1.setLayout(new GridLayout(1, 2, 0, 0));
		
		JButton allQuiz_btn = new JButton("전체문제");
		panel_7_1.add(allQuiz_btn);
		
		JButton yetQuiz_btn = new JButton("풀지않은문제");
		panel_7_1.add(yetQuiz_btn);
		
	}

}
