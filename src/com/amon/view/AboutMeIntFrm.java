package com.amon.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.CardLayout;

/**
* @author Amon E-mail:248779716@qq.com
* @version ����ʱ�䣺2018��3��29�� ����6:56:37
* ��˵��
*/
public class AboutMeIntFrm extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutMeIntFrm frame = new AboutMeIntFrm();
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
	public AboutMeIntFrm() {
		getContentPane().setForeground(new Color(220, 220, 220));
		getContentPane().setLayout(null);
		
		JLabel lblAmon = new JLabel("Amon");
		lblAmon.setFont(new Font("����", Font.BOLD, 20));
		lblAmon.setBounds(380, 246, 54, 15);
		getContentPane().add(lblAmon);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 434, 271);
		label.setIcon(new ImageIcon("C:\\Users\\Administrator\\Pictures\\\u56FE\u7247\\11.jpg"));
		getContentPane().add(label);
		setIconifiable(true);
		setClosable(true);
		setBounds(100, 100, 450, 300);

	}

}