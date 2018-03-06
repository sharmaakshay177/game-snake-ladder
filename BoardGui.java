package snakeLadd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.SystemColor;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class BoardGui extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoardGui frame = new BoardGui();
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
	public BoardGui() {
		setResizable(false);
		setBackground(SystemColor.textHighlight);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 820, 713);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
		);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaptionBorder);
		
		JButton btnNewButton = new JButton("Dice Roll");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 21));
		
		JPanel panel_2 = new JPanel();
		
		JPanel panel_3 = new JPanel();
		
		JPanel panel_4 = new JPanel();
		
		JPanel panel_5 = new JPanel();
		
		JPanel panel_6 = new JPanel();
		
		JPanel panel_7 = new JPanel();
		
		JPanel panel_8 = new JPanel();
		
		JPanel panel_9 = new JPanel();
		
		JPanel panel_10 = new JPanel();
		
		JPanel panel_11 = new JPanel();
		
		JPanel panel_12 = new JPanel();
		
		JPanel panel_13 = new JPanel();
		
		JPanel panel_21 = new JPanel();
		
		JPanel panel_22 = new JPanel();
		
		JPanel panel_23 = new JPanel();
		
		JPanel panel_24 = new JPanel();
		
		JPanel panel_25 = new JPanel();
		
		JPanel panel_26 = new JPanel();
		
		JPanel panel_27 = new JPanel();
		
		JPanel panel_28 = new JPanel();
		
		JPanel panel_29 = new JPanel();
		
		JPanel panel_30 = new JPanel();
		
		JPanel panel_38 = new JPanel();
		
		JPanel panel_39 = new JPanel();
		
		JPanel panel_40 = new JPanel();
		
		JPanel panel_41 = new JPanel();
		
		JPanel panel_42 = new JPanel();
		
		JPanel panel_79 = new JPanel();
		
		JPanel panel_80 = new JPanel();
		
		JPanel panel_81 = new JPanel();
		
		JLabel label_1 = new JLabel("2");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_21 = new GroupLayout(panel_21);
		gl_panel_21.setHorizontalGroup(
			gl_panel_21.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_21.createSequentialGroup()
					.addGap(19)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(28, Short.MAX_VALUE))
		);
		gl_panel_21.setVerticalGroup(
			gl_panel_21.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_21.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_21.setLayout(gl_panel_21);
		
		JLabel label_10 = new JLabel(" 1");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_10.setBackground(new Color(255, 222, 173));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(19)
					.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(28, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_2.createSequentialGroup()
					.addContainerGap(21, Short.MAX_VALUE)
					.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_2.setLayout(gl_panel_2);
		
		JLabel label_9 = new JLabel(" 1");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_9.setBackground(new Color(255, 222, 173));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(22)
					.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
					.addContainerGap(21, Short.MAX_VALUE)
					.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_3.setLayout(gl_panel_3);
		
		JLabel label_8 = new JLabel(" 1");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_8.setBackground(new Color(255, 222, 173));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(18)
					.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(29, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_4.createSequentialGroup()
					.addContainerGap(21, Short.MAX_VALUE)
					.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_4.setLayout(gl_panel_4);
		
		JLabel label_7 = new JLabel(" 1");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_7.setBackground(new Color(255, 222, 173));
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(20)
					.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_5.createSequentialGroup()
					.addContainerGap(21, Short.MAX_VALUE)
					.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_5.setLayout(gl_panel_5);
		
		JLabel label_6 = new JLabel(" 1");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_6.setBackground(new Color(255, 222, 173));
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addGap(20)
					.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_6.createSequentialGroup()
					.addContainerGap(21, Short.MAX_VALUE)
					.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_6.setLayout(gl_panel_6);
		
		JLabel label_5 = new JLabel(" 1");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_5.setBackground(new Color(255, 222, 173));
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addGap(20)
					.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_7.createSequentialGroup()
					.addContainerGap(21, Short.MAX_VALUE)
					.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_7.setLayout(gl_panel_7);
		
		JLabel label_4 = new JLabel(" 1");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_4.setBackground(new Color(255, 222, 173));
		GroupLayout gl_panel_8 = new GroupLayout(panel_8);
		gl_panel_8.setHorizontalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addGap(22)
					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel_8.setVerticalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_8.createSequentialGroup()
					.addContainerGap(21, Short.MAX_VALUE)
					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_8.setLayout(gl_panel_8);
		
		JLabel label_3 = new JLabel(" 1");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setBackground(new Color(255, 222, 173));
		GroupLayout gl_panel_9 = new GroupLayout(panel_9);
		gl_panel_9.setHorizontalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addGap(20)
					.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		gl_panel_9.setVerticalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_9.createSequentialGroup()
					.addContainerGap(21, Short.MAX_VALUE)
					.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_9.setLayout(gl_panel_9);
		
		JLabel label_2 = new JLabel(" 1");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBackground(new Color(255, 222, 173));
		GroupLayout gl_panel_10 = new GroupLayout(panel_10);
		gl_panel_10.setHorizontalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addGap(18)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(29, Short.MAX_VALUE))
		);
		gl_panel_10.setVerticalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_10.createSequentialGroup()
					.addContainerGap(21, Short.MAX_VALUE)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_10.setLayout(gl_panel_10);
		
		JLabel label = new JLabel(" 1");
		label.setBackground(new Color(255, 222, 173));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_11 = new GroupLayout(panel_11);
		gl_panel_11.setHorizontalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_11.createSequentialGroup()
					.addGap(21)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_11.setVerticalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_11.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label)
					.addContainerGap())
		);
		panel_11.setLayout(gl_panel_11);
		
		JPanel panel_14 = new JPanel();
		
		JLabel label_30 = new JLabel("2");
		label_30.setHorizontalAlignment(SwingConstants.CENTER);
		label_30.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_14 = new GroupLayout(panel_14);
		gl_panel_14.setHorizontalGroup(
			gl_panel_14.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_14.createSequentialGroup()
					.addGap(24)
					.addComponent(label_30, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_panel_14.setVerticalGroup(
			gl_panel_14.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_14.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_30, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_14.setLayout(gl_panel_14);
		
		JPanel panel_31 = new JPanel();
		
		JLabel label_31 = new JLabel("2");
		label_31.setHorizontalAlignment(SwingConstants.CENTER);
		label_31.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_31 = new GroupLayout(panel_31);
		gl_panel_31.setHorizontalGroup(
			gl_panel_31.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_31.createSequentialGroup()
					.addGap(21)
					.addComponent(label_31, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_31.setVerticalGroup(
			gl_panel_31.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_31.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_31, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_31.setLayout(gl_panel_31);
		
		JPanel panel_43 = new JPanel();
		
		JLabel label_32 = new JLabel("2");
		label_32.setHorizontalAlignment(SwingConstants.CENTER);
		label_32.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_43 = new GroupLayout(panel_43);
		gl_panel_43.setHorizontalGroup(
			gl_panel_43.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_43.createSequentialGroup()
					.addGap(22)
					.addComponent(label_32, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel_43.setVerticalGroup(
			gl_panel_43.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_43.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_32, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_43.setLayout(gl_panel_43);
		
		JPanel panel_49 = new JPanel();
		
		JLabel label_33 = new JLabel("2");
		label_33.setHorizontalAlignment(SwingConstants.CENTER);
		label_33.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_49 = new GroupLayout(panel_49);
		gl_panel_49.setHorizontalGroup(
			gl_panel_49.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_49.createSequentialGroup()
					.addGap(23)
					.addComponent(label_33, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		gl_panel_49.setVerticalGroup(
			gl_panel_49.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_49.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_33, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_49.setLayout(gl_panel_49);
		
		JPanel panel_55 = new JPanel();
		
		JLabel label_34 = new JLabel("2");
		label_34.setHorizontalAlignment(SwingConstants.CENTER);
		label_34.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_55 = new GroupLayout(panel_55);
		gl_panel_55.setHorizontalGroup(
			gl_panel_55.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_55.createSequentialGroup()
					.addGap(22)
					.addComponent(label_34, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel_55.setVerticalGroup(
			gl_panel_55.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_55.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_34, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_55.setLayout(gl_panel_55);
		
		JPanel panel_61 = new JPanel();
		
		JLabel label_35 = new JLabel("2");
		label_35.setHorizontalAlignment(SwingConstants.CENTER);
		label_35.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_61 = new GroupLayout(panel_61);
		gl_panel_61.setHorizontalGroup(
			gl_panel_61.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_61.createSequentialGroup()
					.addGap(23)
					.addComponent(label_35, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		gl_panel_61.setVerticalGroup(
			gl_panel_61.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_61.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_35, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_61.setLayout(gl_panel_61);
		
		JPanel panel_64 = new JPanel();
		
		JLabel label_36 = new JLabel("2");
		label_36.setHorizontalAlignment(SwingConstants.CENTER);
		label_36.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_64 = new GroupLayout(panel_64);
		gl_panel_64.setHorizontalGroup(
			gl_panel_64.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_64.createSequentialGroup()
					.addGap(21)
					.addComponent(label_36, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_64.setVerticalGroup(
			gl_panel_64.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_64.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_36, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_64.setLayout(gl_panel_64);
		
		JPanel panel_82 = new JPanel();
		
		JLabel label_37 = new JLabel("2");
		label_37.setHorizontalAlignment(SwingConstants.CENTER);
		label_37.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_82 = new GroupLayout(panel_82);
		gl_panel_82.setHorizontalGroup(
			gl_panel_82.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_82.createSequentialGroup()
					.addContainerGap(26, Short.MAX_VALUE)
					.addComponent(label_37, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		gl_panel_82.setVerticalGroup(
			gl_panel_82.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_82.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_37, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_82.setLayout(gl_panel_82);
		
		JPanel panel_86 = new JPanel();
		
		JLabel label_38 = new JLabel("17");
		label_38.setHorizontalAlignment(SwingConstants.CENTER);
		label_38.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_86 = new GroupLayout(panel_86);
		gl_panel_86.setHorizontalGroup(
			gl_panel_86.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_86.createSequentialGroup()
					.addContainerGap(27, Short.MAX_VALUE)
					.addComponent(label_38, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
		);
		gl_panel_86.setVerticalGroup(
			gl_panel_86.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_86.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_38, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_86.setLayout(gl_panel_86);
		
		JPanel panel_87 = new JPanel();
		
		JLabel label_39 = new JLabel("4");
		label_39.setHorizontalAlignment(SwingConstants.CENTER);
		label_39.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_87 = new GroupLayout(panel_87);
		gl_panel_87.setHorizontalGroup(
			gl_panel_87.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_87.createSequentialGroup()
					.addGap(24)
					.addComponent(label_39, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_panel_87.setVerticalGroup(
			gl_panel_87.createParallelGroup(Alignment.LEADING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, gl_panel_87.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_39, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_87.setLayout(gl_panel_87);
		
		JPanel panel_15 = new JPanel();
		
		JLabel label_40 = new JLabel("2");
		label_40.setHorizontalAlignment(SwingConstants.CENTER);
		label_40.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_15 = new GroupLayout(panel_15);
		gl_panel_15.setHorizontalGroup(
			gl_panel_15.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_15.createSequentialGroup()
					.addGap(24)
					.addComponent(label_40, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_panel_15.setVerticalGroup(
			gl_panel_15.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_15.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_40, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_15.setLayout(gl_panel_15);
		
		JPanel panel_16 = new JPanel();
		
		JLabel label_41 = new JLabel("2");
		label_41.setHorizontalAlignment(SwingConstants.CENTER);
		label_41.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_16 = new GroupLayout(panel_16);
		gl_panel_16.setHorizontalGroup(
			gl_panel_16.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_16.createSequentialGroup()
					.addGap(21)
					.addComponent(label_41, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_16.setVerticalGroup(
			gl_panel_16.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_16.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_41, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_16.setLayout(gl_panel_16);
		
		JPanel panel_17 = new JPanel();
		
		JLabel label_42 = new JLabel("2");
		label_42.setHorizontalAlignment(SwingConstants.CENTER);
		label_42.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_17 = new GroupLayout(panel_17);
		gl_panel_17.setHorizontalGroup(
			gl_panel_17.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_17.createSequentialGroup()
					.addGap(22)
					.addComponent(label_42, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel_17.setVerticalGroup(
			gl_panel_17.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_17.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_42, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_17.setLayout(gl_panel_17);
		
		JPanel panel_18 = new JPanel();
		
		JLabel label_43 = new JLabel("2");
		label_43.setHorizontalAlignment(SwingConstants.CENTER);
		label_43.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_18 = new GroupLayout(panel_18);
		gl_panel_18.setHorizontalGroup(
			gl_panel_18.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_18.createSequentialGroup()
					.addGap(23)
					.addComponent(label_43, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		gl_panel_18.setVerticalGroup(
			gl_panel_18.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_18.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_43, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_18.setLayout(gl_panel_18);
		
		JPanel panel_19 = new JPanel();
		
		JLabel label_44 = new JLabel("2");
		label_44.setHorizontalAlignment(SwingConstants.CENTER);
		label_44.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_19 = new GroupLayout(panel_19);
		gl_panel_19.setHorizontalGroup(
			gl_panel_19.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_19.createSequentialGroup()
					.addGap(22)
					.addComponent(label_44, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel_19.setVerticalGroup(
			gl_panel_19.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_19.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_44, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_19.setLayout(gl_panel_19);
		
		JPanel panel_20 = new JPanel();
		
		JLabel label_45 = new JLabel("2");
		label_45.setHorizontalAlignment(SwingConstants.CENTER);
		label_45.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_20 = new GroupLayout(panel_20);
		gl_panel_20.setHorizontalGroup(
			gl_panel_20.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_20.createSequentialGroup()
					.addGap(23)
					.addComponent(label_45, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		gl_panel_20.setVerticalGroup(
			gl_panel_20.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_20.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_45, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_20.setLayout(gl_panel_20);
		
		JPanel panel_32 = new JPanel();
		
		JLabel label_46 = new JLabel("2");
		label_46.setHorizontalAlignment(SwingConstants.CENTER);
		label_46.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_32 = new GroupLayout(panel_32);
		gl_panel_32.setHorizontalGroup(
			gl_panel_32.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_32.createSequentialGroup()
					.addGap(21)
					.addComponent(label_46, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_32.setVerticalGroup(
			gl_panel_32.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_32.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_46, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_32.setLayout(gl_panel_32);
		
		JPanel panel_33 = new JPanel();
		
		JLabel label_47 = new JLabel("2");
		label_47.setHorizontalAlignment(SwingConstants.CENTER);
		label_47.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_33 = new GroupLayout(panel_33);
		gl_panel_33.setHorizontalGroup(
			gl_panel_33.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_33.createSequentialGroup()
					.addContainerGap(26, Short.MAX_VALUE)
					.addComponent(label_47, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		gl_panel_33.setVerticalGroup(
			gl_panel_33.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_33.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_47, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_33.setLayout(gl_panel_33);
		
		JPanel panel_34 = new JPanel();
		
		JLabel label_48 = new JLabel("16");
		label_48.setHorizontalAlignment(SwingConstants.CENTER);
		label_48.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_34 = new GroupLayout(panel_34);
		gl_panel_34.setHorizontalGroup(
			gl_panel_34.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_34.createSequentialGroup()
					.addContainerGap(27, Short.MAX_VALUE)
					.addComponent(label_48, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
		);
		gl_panel_34.setVerticalGroup(
			gl_panel_34.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_34.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_48, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_34.setLayout(gl_panel_34);
		
		JPanel panel_35 = new JPanel();
		
		JLabel label_49 = new JLabel("5");
		label_49.setHorizontalAlignment(SwingConstants.CENTER);
		label_49.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_35 = new GroupLayout(panel_35);
		gl_panel_35.setHorizontalGroup(
			gl_panel_35.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_35.createSequentialGroup()
					.addGap(24)
					.addComponent(label_49, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_panel_35.setVerticalGroup(
			gl_panel_35.createParallelGroup(Alignment.LEADING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, gl_panel_35.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_49, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_35.setLayout(gl_panel_35);
		
		JPanel panel_36 = new JPanel();
		
		JLabel label_50 = new JLabel("2");
		label_50.setHorizontalAlignment(SwingConstants.CENTER);
		label_50.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_36 = new GroupLayout(panel_36);
		gl_panel_36.setHorizontalGroup(
			gl_panel_36.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_36.createSequentialGroup()
					.addGap(24)
					.addComponent(label_50, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_panel_36.setVerticalGroup(
			gl_panel_36.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_36.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_50, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_36.setLayout(gl_panel_36);
		
		JPanel panel_37 = new JPanel();
		
		JLabel label_51 = new JLabel("2");
		label_51.setHorizontalAlignment(SwingConstants.CENTER);
		label_51.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_37 = new GroupLayout(panel_37);
		gl_panel_37.setHorizontalGroup(
			gl_panel_37.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_37.createSequentialGroup()
					.addGap(21)
					.addComponent(label_51, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_37.setVerticalGroup(
			gl_panel_37.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_37.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_51, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_37.setLayout(gl_panel_37);
		
		JPanel panel_44 = new JPanel();
		
		JLabel label_52 = new JLabel("2");
		label_52.setHorizontalAlignment(SwingConstants.CENTER);
		label_52.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_44 = new GroupLayout(panel_44);
		gl_panel_44.setHorizontalGroup(
			gl_panel_44.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_44.createSequentialGroup()
					.addGap(22)
					.addComponent(label_52, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel_44.setVerticalGroup(
			gl_panel_44.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_44.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_52, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_44.setLayout(gl_panel_44);
		
		JPanel panel_45 = new JPanel();
		
		JLabel label_53 = new JLabel("2");
		label_53.setHorizontalAlignment(SwingConstants.CENTER);
		label_53.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_45 = new GroupLayout(panel_45);
		gl_panel_45.setHorizontalGroup(
			gl_panel_45.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_45.createSequentialGroup()
					.addGap(23)
					.addComponent(label_53, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		gl_panel_45.setVerticalGroup(
			gl_panel_45.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_45.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_53, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_45.setLayout(gl_panel_45);
		
		JPanel panel_46 = new JPanel();
		
		JLabel label_54 = new JLabel("2");
		label_54.setHorizontalAlignment(SwingConstants.CENTER);
		label_54.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_46 = new GroupLayout(panel_46);
		gl_panel_46.setHorizontalGroup(
			gl_panel_46.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_46.createSequentialGroup()
					.addGap(22)
					.addComponent(label_54, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel_46.setVerticalGroup(
			gl_panel_46.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_46.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_54, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_46.setLayout(gl_panel_46);
		
		JPanel panel_47 = new JPanel();
		
		JLabel label_55 = new JLabel("2");
		label_55.setHorizontalAlignment(SwingConstants.CENTER);
		label_55.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_47 = new GroupLayout(panel_47);
		gl_panel_47.setHorizontalGroup(
			gl_panel_47.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_47.createSequentialGroup()
					.addGap(23)
					.addComponent(label_55, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		gl_panel_47.setVerticalGroup(
			gl_panel_47.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_47.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_55, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_47.setLayout(gl_panel_47);
		
		JPanel panel_48 = new JPanel();
		
		JLabel label_56 = new JLabel("2");
		label_56.setHorizontalAlignment(SwingConstants.CENTER);
		label_56.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_48 = new GroupLayout(panel_48);
		gl_panel_48.setHorizontalGroup(
			gl_panel_48.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_48.createSequentialGroup()
					.addGap(21)
					.addComponent(label_56, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_48.setVerticalGroup(
			gl_panel_48.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_48.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_56, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_48.setLayout(gl_panel_48);
		
		JPanel panel_50 = new JPanel();
		
		JLabel label_57 = new JLabel("2");
		label_57.setHorizontalAlignment(SwingConstants.CENTER);
		label_57.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_50 = new GroupLayout(panel_50);
		gl_panel_50.setHorizontalGroup(
			gl_panel_50.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_50.createSequentialGroup()
					.addContainerGap(26, Short.MAX_VALUE)
					.addComponent(label_57, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		gl_panel_50.setVerticalGroup(
			gl_panel_50.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_50.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_57, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_50.setLayout(gl_panel_50);
		
		JPanel panel_51 = new JPanel();
		
		JLabel label_58 = new JLabel("15");
		label_58.setHorizontalAlignment(SwingConstants.CENTER);
		label_58.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_51 = new GroupLayout(panel_51);
		gl_panel_51.setHorizontalGroup(
			gl_panel_51.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_51.createSequentialGroup()
					.addContainerGap(27, Short.MAX_VALUE)
					.addComponent(label_58, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
		);
		gl_panel_51.setVerticalGroup(
			gl_panel_51.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_51.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_58, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_51.setLayout(gl_panel_51);
		
		JPanel panel_52 = new JPanel();
		
		JLabel label_59 = new JLabel("6");
		label_59.setHorizontalAlignment(SwingConstants.CENTER);
		label_59.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_52 = new GroupLayout(panel_52);
		gl_panel_52.setHorizontalGroup(
			gl_panel_52.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_52.createSequentialGroup()
					.addGap(24)
					.addComponent(label_59, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_panel_52.setVerticalGroup(
			gl_panel_52.createParallelGroup(Alignment.LEADING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, gl_panel_52.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_59, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_52.setLayout(gl_panel_52);
		
		JPanel panel_53 = new JPanel();
		
		JLabel label_60 = new JLabel("7");
		label_60.setHorizontalAlignment(SwingConstants.CENTER);
		label_60.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_53 = new GroupLayout(panel_53);
		gl_panel_53.setHorizontalGroup(
			gl_panel_53.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_53.createSequentialGroup()
					.addGap(24)
					.addComponent(label_60, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_panel_53.setVerticalGroup(
			gl_panel_53.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_53.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_60, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_53.setLayout(gl_panel_53);
		
		JPanel panel_54 = new JPanel();
		
		JLabel label_61 = new JLabel("14");
		label_61.setHorizontalAlignment(SwingConstants.CENTER);
		label_61.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_54 = new GroupLayout(panel_54);
		gl_panel_54.setHorizontalGroup(
			gl_panel_54.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_54.createSequentialGroup()
					.addContainerGap(27, Short.MAX_VALUE)
					.addComponent(label_61, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
		);
		gl_panel_54.setVerticalGroup(
			gl_panel_54.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_54.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_61, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_54.setLayout(gl_panel_54);
		
		JPanel panel_56 = new JPanel();
		
		JLabel label_62 = new JLabel("2");
		label_62.setHorizontalAlignment(SwingConstants.CENTER);
		label_62.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_56 = new GroupLayout(panel_56);
		gl_panel_56.setHorizontalGroup(
			gl_panel_56.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_56.createSequentialGroup()
					.addContainerGap(26, Short.MAX_VALUE)
					.addComponent(label_62, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		gl_panel_56.setVerticalGroup(
			gl_panel_56.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_56.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_62, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_56.setLayout(gl_panel_56);
		
		JPanel panel_57 = new JPanel();
		
		JLabel label_63 = new JLabel("2");
		label_63.setHorizontalAlignment(SwingConstants.CENTER);
		label_63.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_57 = new GroupLayout(panel_57);
		gl_panel_57.setHorizontalGroup(
			gl_panel_57.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_57.createSequentialGroup()
					.addGap(21)
					.addComponent(label_63, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_57.setVerticalGroup(
			gl_panel_57.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_57.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_63, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_57.setLayout(gl_panel_57);
		
		JPanel panel_58 = new JPanel();
		
		JLabel label_64 = new JLabel("8");
		label_64.setHorizontalAlignment(SwingConstants.CENTER);
		label_64.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_58 = new GroupLayout(panel_58);
		gl_panel_58.setHorizontalGroup(
			gl_panel_58.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_58.createSequentialGroup()
					.addGap(24)
					.addComponent(label_64, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_panel_58.setVerticalGroup(
			gl_panel_58.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_58.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_64, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_58.setLayout(gl_panel_58);
		
		JPanel panel_59 = new JPanel();
		
		JLabel label_65 = new JLabel("13");
		label_65.setHorizontalAlignment(SwingConstants.CENTER);
		label_65.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_59 = new GroupLayout(panel_59);
		gl_panel_59.setHorizontalGroup(
			gl_panel_59.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_59.createSequentialGroup()
					.addContainerGap(27, Short.MAX_VALUE)
					.addComponent(label_65, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
		);
		gl_panel_59.setVerticalGroup(
			gl_panel_59.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_59.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_65, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_59.setLayout(gl_panel_59);
		
		JPanel panel_60 = new JPanel();
		
		JLabel label_66 = new JLabel("2");
		label_66.setHorizontalAlignment(SwingConstants.CENTER);
		label_66.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_60 = new GroupLayout(panel_60);
		gl_panel_60.setHorizontalGroup(
			gl_panel_60.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_60.createSequentialGroup()
					.addContainerGap(26, Short.MAX_VALUE)
					.addComponent(label_66, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		gl_panel_60.setVerticalGroup(
			gl_panel_60.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_60.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_66, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_60.setLayout(gl_panel_60);
		
		JPanel panel_62 = new JPanel();
		
		JLabel label_67 = new JLabel("2");
		label_67.setHorizontalAlignment(SwingConstants.CENTER);
		label_67.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_62 = new GroupLayout(panel_62);
		gl_panel_62.setHorizontalGroup(
			gl_panel_62.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_62.createSequentialGroup()
					.addGap(21)
					.addComponent(label_67, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_62.setVerticalGroup(
			gl_panel_62.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_62.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_67, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_62.setLayout(gl_panel_62);
		
		JPanel panel_63 = new JPanel();
		
		JLabel label_68 = new JLabel("2");
		label_68.setHorizontalAlignment(SwingConstants.CENTER);
		label_68.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_63 = new GroupLayout(panel_63);
		gl_panel_63.setHorizontalGroup(
			gl_panel_63.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_63.createSequentialGroup()
					.addGap(24)
					.addComponent(label_68, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_panel_63.setVerticalGroup(
			gl_panel_63.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_63.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_68, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_63.setLayout(gl_panel_63);
		
		JPanel panel_65 = new JPanel();
		
		JLabel label_69 = new JLabel("2");
		label_69.setHorizontalAlignment(SwingConstants.CENTER);
		label_69.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_65 = new GroupLayout(panel_65);
		gl_panel_65.setHorizontalGroup(
			gl_panel_65.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_65.createSequentialGroup()
					.addContainerGap(27, Short.MAX_VALUE)
					.addComponent(label_69, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
		);
		gl_panel_65.setVerticalGroup(
			gl_panel_65.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_65.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_69, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_65.setLayout(gl_panel_65);
		
		JPanel panel_66 = new JPanel();
		
		JLabel label_70 = new JLabel("2");
		label_70.setHorizontalAlignment(SwingConstants.CENTER);
		label_70.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_66 = new GroupLayout(panel_66);
		gl_panel_66.setHorizontalGroup(
			gl_panel_66.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_66.createSequentialGroup()
					.addContainerGap(26, Short.MAX_VALUE)
					.addComponent(label_70, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		gl_panel_66.setVerticalGroup(
			gl_panel_66.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_66.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_70, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_66.setLayout(gl_panel_66);
		
		JPanel panel_67 = new JPanel();
		
		JLabel label_71 = new JLabel("2");
		label_71.setHorizontalAlignment(SwingConstants.CENTER);
		label_71.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_67 = new GroupLayout(panel_67);
		gl_panel_67.setHorizontalGroup(
			gl_panel_67.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_67.createSequentialGroup()
					.addGap(21)
					.addComponent(label_71, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_67.setVerticalGroup(
			gl_panel_67.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_67.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_71, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_67.setLayout(gl_panel_67);
		
		JPanel panel_68 = new JPanel();
		
		JLabel label_72 = new JLabel("2");
		label_72.setHorizontalAlignment(SwingConstants.CENTER);
		label_72.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_68 = new GroupLayout(panel_68);
		gl_panel_68.setHorizontalGroup(
			gl_panel_68.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_68.createSequentialGroup()
					.addGap(24)
					.addComponent(label_72, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_panel_68.setVerticalGroup(
			gl_panel_68.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_68.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_72, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_68.setLayout(gl_panel_68);
		
		JPanel panel_69 = new JPanel();
		
		JLabel label_73 = new JLabel("2");
		label_73.setHorizontalAlignment(SwingConstants.CENTER);
		label_73.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_69 = new GroupLayout(panel_69);
		gl_panel_69.setHorizontalGroup(
			gl_panel_69.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_69.createSequentialGroup()
					.addContainerGap(27, Short.MAX_VALUE)
					.addComponent(label_73, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
		);
		gl_panel_69.setVerticalGroup(
			gl_panel_69.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_69.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_73, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_69.setLayout(gl_panel_69);
		
		JPanel panel_70 = new JPanel();
		
		JLabel label_74 = new JLabel("2");
		label_74.setHorizontalAlignment(SwingConstants.CENTER);
		label_74.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_70 = new GroupLayout(panel_70);
		gl_panel_70.setHorizontalGroup(
			gl_panel_70.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_70.createSequentialGroup()
					.addContainerGap(26, Short.MAX_VALUE)
					.addComponent(label_74, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		gl_panel_70.setVerticalGroup(
			gl_panel_70.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_70.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_74, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_70.setLayout(gl_panel_70);
		
		JPanel panel_71 = new JPanel();
		
		JLabel label_75 = new JLabel("2");
		label_75.setHorizontalAlignment(SwingConstants.CENTER);
		label_75.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_71 = new GroupLayout(panel_71);
		gl_panel_71.setHorizontalGroup(
			gl_panel_71.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_71.createSequentialGroup()
					.addGap(21)
					.addComponent(label_75, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_71.setVerticalGroup(
			gl_panel_71.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_71.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_75, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_71.setLayout(gl_panel_71);
		
		JPanel panel_72 = new JPanel();
		
		JLabel label_76 = new JLabel("9");
		label_76.setHorizontalAlignment(SwingConstants.CENTER);
		label_76.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_72 = new GroupLayout(panel_72);
		gl_panel_72.setHorizontalGroup(
			gl_panel_72.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_72.createSequentialGroup()
					.addGap(24)
					.addComponent(label_76, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_panel_72.setVerticalGroup(
			gl_panel_72.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_72.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_76, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_72.setLayout(gl_panel_72);
		
		JPanel panel_73 = new JPanel();
		
		JLabel label_77 = new JLabel("12");
		label_77.setHorizontalAlignment(SwingConstants.CENTER);
		label_77.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_73 = new GroupLayout(panel_73);
		gl_panel_73.setHorizontalGroup(
			gl_panel_73.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_73.createSequentialGroup()
					.addContainerGap(27, Short.MAX_VALUE)
					.addComponent(label_77, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
		);
		gl_panel_73.setVerticalGroup(
			gl_panel_73.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_73.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_77, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_73.setLayout(gl_panel_73);
		
		JPanel panel_74 = new JPanel();
		
		JLabel label_78 = new JLabel("2");
		label_78.setHorizontalAlignment(SwingConstants.CENTER);
		label_78.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_74 = new GroupLayout(panel_74);
		gl_panel_74.setHorizontalGroup(
			gl_panel_74.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_74.createSequentialGroup()
					.addContainerGap(26, Short.MAX_VALUE)
					.addComponent(label_78, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		gl_panel_74.setVerticalGroup(
			gl_panel_74.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_74.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_78, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_74.setLayout(gl_panel_74);
		
		JPanel panel_75 = new JPanel();
		
		JLabel label_79 = new JLabel("2");
		label_79.setHorizontalAlignment(SwingConstants.CENTER);
		label_79.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_75 = new GroupLayout(panel_75);
		gl_panel_75.setHorizontalGroup(
			gl_panel_75.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_75.createSequentialGroup()
					.addGap(21)
					.addComponent(label_79, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_75.setVerticalGroup(
			gl_panel_75.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_75.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_79, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_75.setLayout(gl_panel_75);
		
		JPanel panel_76 = new JPanel();
		
		JLabel label_80 = new JLabel("10");
		label_80.setHorizontalAlignment(SwingConstants.CENTER);
		label_80.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_76 = new GroupLayout(panel_76);
		gl_panel_76.setHorizontalGroup(
			gl_panel_76.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_76.createSequentialGroup()
					.addGap(24)
					.addComponent(label_80, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_panel_76.setVerticalGroup(
			gl_panel_76.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_76.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_80, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_76.setLayout(gl_panel_76);
		
		JPanel panel_77 = new JPanel();
		
		JLabel label_81 = new JLabel("11");
		label_81.setHorizontalAlignment(SwingConstants.CENTER);
		label_81.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_77 = new GroupLayout(panel_77);
		gl_panel_77.setHorizontalGroup(
			gl_panel_77.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_77.createSequentialGroup()
					.addContainerGap(27, Short.MAX_VALUE)
					.addComponent(label_81, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
		);
		gl_panel_77.setVerticalGroup(
			gl_panel_77.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_77.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_81, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_77.setLayout(gl_panel_77);
		
		JPanel panel_78 = new JPanel();
		
		JLabel label_82 = new JLabel("2");
		label_82.setHorizontalAlignment(SwingConstants.CENTER);
		label_82.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_78 = new GroupLayout(panel_78);
		gl_panel_78.setHorizontalGroup(
			gl_panel_78.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_78.createSequentialGroup()
					.addContainerGap(26, Short.MAX_VALUE)
					.addComponent(label_82, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		gl_panel_78.setVerticalGroup(
			gl_panel_78.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_78.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_82, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_78.setLayout(gl_panel_78);
		
		JPanel panel_83 = new JPanel();
		
		JLabel label_83 = new JLabel("2");
		label_83.setHorizontalAlignment(SwingConstants.CENTER);
		label_83.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_83 = new GroupLayout(panel_83);
		gl_panel_83.setHorizontalGroup(
			gl_panel_83.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_83.createSequentialGroup()
					.addGap(21)
					.addComponent(label_83, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_83.setVerticalGroup(
			gl_panel_83.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_83.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_83, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_83.setLayout(gl_panel_83);
		
		JPanel panel_84 = new JPanel();
		
		JLabel label_84 = new JLabel("2");
		label_84.setHorizontalAlignment(SwingConstants.CENTER);
		label_84.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_84 = new GroupLayout(panel_84);
		gl_panel_84.setHorizontalGroup(
			gl_panel_84.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_84.createSequentialGroup()
					.addGap(24)
					.addComponent(label_84, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_panel_84.setVerticalGroup(
			gl_panel_84.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_84.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_84, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_84.setLayout(gl_panel_84);
		
		JPanel panel_85 = new JPanel();
		
		JLabel label_85 = new JLabel("2");
		label_85.setHorizontalAlignment(SwingConstants.CENTER);
		label_85.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_85 = new GroupLayout(panel_85);
		gl_panel_85.setHorizontalGroup(
			gl_panel_85.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_85.createSequentialGroup()
					.addContainerGap(27, Short.MAX_VALUE)
					.addComponent(label_85, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
		);
		gl_panel_85.setVerticalGroup(
			gl_panel_85.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_85.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_85, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_85.setLayout(gl_panel_85);
		
		JPanel panel_88 = new JPanel();
		
		JLabel label_86 = new JLabel("2");
		label_86.setHorizontalAlignment(SwingConstants.CENTER);
		label_86.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_88 = new GroupLayout(panel_88);
		gl_panel_88.setHorizontalGroup(
			gl_panel_88.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_88.createSequentialGroup()
					.addContainerGap(26, Short.MAX_VALUE)
					.addComponent(label_86, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		gl_panel_88.setVerticalGroup(
			gl_panel_88.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_88.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_86, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_88.setLayout(gl_panel_88);
		
		JPanel panel_89 = new JPanel();
		
		JLabel label_87 = new JLabel("2");
		label_87.setHorizontalAlignment(SwingConstants.CENTER);
		label_87.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_89 = new GroupLayout(panel_89);
		gl_panel_89.setHorizontalGroup(
			gl_panel_89.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_89.createSequentialGroup()
					.addGap(21)
					.addComponent(label_87, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_89.setVerticalGroup(
			gl_panel_89.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_89.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_87, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_89.setLayout(gl_panel_89);
		
		JPanel panel_90 = new JPanel();
		
		JLabel label_88 = new JLabel("2");
		label_88.setHorizontalAlignment(SwingConstants.CENTER);
		label_88.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_90 = new GroupLayout(panel_90);
		gl_panel_90.setHorizontalGroup(
			gl_panel_90.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_90.createSequentialGroup()
					.addGap(24)
					.addComponent(label_88, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_panel_90.setVerticalGroup(
			gl_panel_90.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_90.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_88, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_90.setLayout(gl_panel_90);
		
		JPanel panel_91 = new JPanel();
		
		JLabel label_89 = new JLabel("2");
		label_89.setHorizontalAlignment(SwingConstants.CENTER);
		label_89.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_91 = new GroupLayout(panel_91);
		gl_panel_91.setHorizontalGroup(
			gl_panel_91.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_91.createSequentialGroup()
					.addContainerGap(27, Short.MAX_VALUE)
					.addComponent(label_89, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
		);
		gl_panel_91.setVerticalGroup(
			gl_panel_91.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_91.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_89, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_91.setLayout(gl_panel_91);
		
		JPanel panel_92 = new JPanel();
		
		JLabel label_90 = new JLabel("2");
		label_90.setHorizontalAlignment(SwingConstants.CENTER);
		label_90.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_92 = new GroupLayout(panel_92);
		gl_panel_92.setHorizontalGroup(
			gl_panel_92.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_92.createSequentialGroup()
					.addContainerGap(26, Short.MAX_VALUE)
					.addComponent(label_90, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		gl_panel_92.setVerticalGroup(
			gl_panel_92.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_92.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_90, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_92.setLayout(gl_panel_92);
		
		JPanel panel_93 = new JPanel();
		
		JLabel label_91 = new JLabel("2");
		label_91.setHorizontalAlignment(SwingConstants.CENTER);
		label_91.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_93 = new GroupLayout(panel_93);
		gl_panel_93.setHorizontalGroup(
			gl_panel_93.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_93.createSequentialGroup()
					.addGap(21)
					.addComponent(label_91, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_93.setVerticalGroup(
			gl_panel_93.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_93.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_91, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_93.setLayout(gl_panel_93);
		
		JPanel panel_94 = new JPanel();
		
		JLabel label_92 = new JLabel("2");
		label_92.setHorizontalAlignment(SwingConstants.CENTER);
		label_92.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_94 = new GroupLayout(panel_94);
		gl_panel_94.setHorizontalGroup(
			gl_panel_94.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_94.createSequentialGroup()
					.addGap(21)
					.addComponent(label_92, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_94.setVerticalGroup(
			gl_panel_94.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_94.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_92, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_94.setLayout(gl_panel_94);
		
		JPanel panel_95 = new JPanel();
		
		JLabel label_93 = new JLabel("2");
		label_93.setHorizontalAlignment(SwingConstants.CENTER);
		label_93.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_95 = new GroupLayout(panel_95);
		gl_panel_95.setHorizontalGroup(
			gl_panel_95.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_95.createSequentialGroup()
					.addGap(21)
					.addComponent(label_93, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_95.setVerticalGroup(
			gl_panel_95.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_95.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_93, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_95.setLayout(gl_panel_95);
		
		JPanel panel_96 = new JPanel();
		
		JLabel label_94 = new JLabel("2");
		label_94.setHorizontalAlignment(SwingConstants.CENTER);
		label_94.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_96 = new GroupLayout(panel_96);
		gl_panel_96.setHorizontalGroup(
			gl_panel_96.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_96.createSequentialGroup()
					.addGap(21)
					.addComponent(label_94, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_96.setVerticalGroup(
			gl_panel_96.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_96.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_94, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_96.setLayout(gl_panel_96);
		
		JPanel panel_97 = new JPanel();
		
		JLabel label_95 = new JLabel("2");
		label_95.setHorizontalAlignment(SwingConstants.CENTER);
		label_95.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_97 = new GroupLayout(panel_97);
		gl_panel_97.setHorizontalGroup(
			gl_panel_97.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_97.createSequentialGroup()
					.addGap(21)
					.addComponent(label_95, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_97.setVerticalGroup(
			gl_panel_97.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_97.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_95, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_97.setLayout(gl_panel_97);
		
		JPanel panel_98 = new JPanel();
		
		JLabel label_96 = new JLabel("2");
		label_96.setHorizontalAlignment(SwingConstants.CENTER);
		label_96.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_98 = new GroupLayout(panel_98);
		gl_panel_98.setHorizontalGroup(
			gl_panel_98.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_98.createSequentialGroup()
					.addGap(21)
					.addComponent(label_96, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_98.setVerticalGroup(
			gl_panel_98.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_98.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_96, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_98.setLayout(gl_panel_98);
		
		JPanel panel_99 = new JPanel();
		
		JLabel label_97 = new JLabel("2");
		label_97.setHorizontalAlignment(SwingConstants.CENTER);
		label_97.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_99 = new GroupLayout(panel_99);
		gl_panel_99.setHorizontalGroup(
			gl_panel_99.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_99.createSequentialGroup()
					.addGap(21)
					.addComponent(label_97, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_99.setVerticalGroup(
			gl_panel_99.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_99.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_97, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_99.setLayout(gl_panel_99);
		
		JPanel panel_100 = new JPanel();
		
		JLabel label_98 = new JLabel("2");
		label_98.setHorizontalAlignment(SwingConstants.CENTER);
		label_98.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_100 = new GroupLayout(panel_100);
		gl_panel_100.setHorizontalGroup(
			gl_panel_100.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_100.createSequentialGroup()
					.addGap(21)
					.addComponent(label_98, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_100.setVerticalGroup(
			gl_panel_100.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_100.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_98, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_100.setLayout(gl_panel_100);
		
		JPanel panel_101 = new JPanel();
		
		JLabel label_99 = new JLabel("2");
		label_99.setHorizontalAlignment(SwingConstants.CENTER);
		label_99.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_101 = new GroupLayout(panel_101);
		gl_panel_101.setHorizontalGroup(
			gl_panel_101.createParallelGroup(Alignment.LEADING)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGap(0, 76, Short.MAX_VALUE)
				.addGroup(gl_panel_101.createSequentialGroup()
					.addGap(21)
					.addComponent(label_99, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_101.setVerticalGroup(
			gl_panel_101.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGap(0, 57, Short.MAX_VALUE)
				.addGroup(gl_panel_101.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_99, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_101.setLayout(gl_panel_101);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_29, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_30, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_28, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_38, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_27, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_39, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_26, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_40, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_25, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_41, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_24, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_42, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_23, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_79, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_22, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_80, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_81, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_31, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_43, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_49, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_55, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_61, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_64, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_82, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_86, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_87, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_19, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_20, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_32, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_33, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_34, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_35, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_36, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_98, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_99, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_100, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_101, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_37, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_94, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_95, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_96, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_97, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_48, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_50, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_51, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_52, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_57, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_56, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_54, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_53, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_62, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_60, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_59, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_58, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_75, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_74, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_73, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_72, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_83, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_78, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_77, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_76, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_44, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_45, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_46, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_47, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_67, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_66, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_65, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_63, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_71, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_70, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_69, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_68, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_89, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_88, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_85, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_84, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_93, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_92, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_91, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_90, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))))
					.addGap(4))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_29, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_30, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_28, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_38, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_27, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_39, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_26, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_40, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_25, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_41, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_24, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_42, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_23, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_79, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_22, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_80, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_21, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_81, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_14, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_31, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_43, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_49, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_55, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_61, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_64, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_82, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_86, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_87, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_15, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_16, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_17, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_18, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_19, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_20, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_32, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_33, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_34, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(panel_35, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_36, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_98, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_99, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_100, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_101, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_37, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_94, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_95, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_96, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_97, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(panel_44, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_45, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_46, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_47, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(panel_67, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_66, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_65, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_63, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(panel_71, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_70, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_69, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_68, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(panel_89, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_88, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_85, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_84, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(panel_93, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_92, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_91, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_90, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(panel_57, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_56, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_54, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_53, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(panel_48, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_50, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_51, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_52, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(panel_62, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_60, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_59, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_58, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(panel_75, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_74, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_73, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_72, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(panel_83, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_78, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_77, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addComponent(panel_76, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap())
		);
		
		JLabel label_29 = new JLabel("3");
		label_29.setHorizontalAlignment(SwingConstants.CENTER);
		label_29.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_81 = new GroupLayout(panel_81);
		gl_panel_81.setHorizontalGroup(
			gl_panel_81.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_81.createSequentialGroup()
					.addGap(24)
					.addComponent(label_29, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_panel_81.setVerticalGroup(
			gl_panel_81.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_81.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_29, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_81.setLayout(gl_panel_81);
		
		JLabel label_28 = new JLabel("18");
		label_28.setHorizontalAlignment(SwingConstants.CENTER);
		label_28.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_80 = new GroupLayout(panel_80);
		gl_panel_80.setHorizontalGroup(
			gl_panel_80.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_80.createSequentialGroup()
					.addContainerGap(27, Short.MAX_VALUE)
					.addComponent(label_28, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
		);
		gl_panel_80.setVerticalGroup(
			gl_panel_80.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_80.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_28, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_80.setLayout(gl_panel_80);
		
		JLabel label_27 = new JLabel("2");
		label_27.setHorizontalAlignment(SwingConstants.CENTER);
		label_27.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_79 = new GroupLayout(panel_79);
		gl_panel_79.setHorizontalGroup(
			gl_panel_79.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_79.createSequentialGroup()
					.addContainerGap(26, Short.MAX_VALUE)
					.addComponent(label_27, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		gl_panel_79.setVerticalGroup(
			gl_panel_79.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_79.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_27, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_79.setLayout(gl_panel_79);
		
		JLabel label_26 = new JLabel("2");
		label_26.setHorizontalAlignment(SwingConstants.CENTER);
		label_26.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_42 = new GroupLayout(panel_42);
		gl_panel_42.setHorizontalGroup(
			gl_panel_42.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_42.createSequentialGroup()
					.addGap(21)
					.addComponent(label_26, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_42.setVerticalGroup(
			gl_panel_42.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_42.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_26, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_42.setLayout(gl_panel_42);
		
		JLabel label_25 = new JLabel("2");
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		label_25.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_41 = new GroupLayout(panel_41);
		gl_panel_41.setHorizontalGroup(
			gl_panel_41.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_41.createSequentialGroup()
					.addGap(23)
					.addComponent(label_25, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		gl_panel_41.setVerticalGroup(
			gl_panel_41.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_41.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_25, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_41.setLayout(gl_panel_41);
		
		JLabel label_24 = new JLabel("2");
		label_24.setHorizontalAlignment(SwingConstants.CENTER);
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_40 = new GroupLayout(panel_40);
		gl_panel_40.setHorizontalGroup(
			gl_panel_40.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_40.createSequentialGroup()
					.addGap(22)
					.addComponent(label_24, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel_40.setVerticalGroup(
			gl_panel_40.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_40.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_24, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_40.setLayout(gl_panel_40);
		
		JLabel label_23 = new JLabel("2");
		label_23.setHorizontalAlignment(SwingConstants.CENTER);
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_39 = new GroupLayout(panel_39);
		gl_panel_39.setHorizontalGroup(
			gl_panel_39.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_39.createSequentialGroup()
					.addGap(23)
					.addComponent(label_23, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		gl_panel_39.setVerticalGroup(
			gl_panel_39.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_39.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_23, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_39.setLayout(gl_panel_39);
		
		JLabel label_22 = new JLabel("2");
		label_22.setHorizontalAlignment(SwingConstants.CENTER);
		label_22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_38 = new GroupLayout(panel_38);
		gl_panel_38.setHorizontalGroup(
			gl_panel_38.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_38.createSequentialGroup()
					.addGap(22)
					.addComponent(label_22, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(25, Short.MAX_VALUE))
		);
		gl_panel_38.setVerticalGroup(
			gl_panel_38.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_38.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_22, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_38.setLayout(gl_panel_38);
		
		JLabel label_21 = new JLabel("2");
		label_21.setHorizontalAlignment(SwingConstants.CENTER);
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_30 = new GroupLayout(panel_30);
		gl_panel_30.setHorizontalGroup(
			gl_panel_30.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_30.createSequentialGroup()
					.addGap(21)
					.addComponent(label_21, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_panel_30.setVerticalGroup(
			gl_panel_30.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_30.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_21, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_30.setLayout(gl_panel_30);
		
		JLabel label_20 = new JLabel("2");
		label_20.setHorizontalAlignment(SwingConstants.CENTER);
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_13 = new GroupLayout(panel_13);
		gl_panel_13.setHorizontalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addGap(24)
					.addComponent(label_20, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_panel_13.setVerticalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_13.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_20, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_13.setLayout(gl_panel_13);
		
		JLabel label_19 = new JLabel("2");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_12 = new GroupLayout(panel_12);
		gl_panel_12.setHorizontalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addGap(23)
					.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		gl_panel_12.setVerticalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_12.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_12.setLayout(gl_panel_12);
		
		JLabel label_18 = new JLabel("2");
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_29 = new GroupLayout(panel_29);
		gl_panel_29.setHorizontalGroup(
			gl_panel_29.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_29.createSequentialGroup()
					.addGap(24)
					.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		gl_panel_29.setVerticalGroup(
			gl_panel_29.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_29.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_18, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_29.setLayout(gl_panel_29);
		
		JLabel label_17 = new JLabel("2");
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_28 = new GroupLayout(panel_28);
		gl_panel_28.setHorizontalGroup(
			gl_panel_28.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_28.createSequentialGroup()
					.addGap(23)
					.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		gl_panel_28.setVerticalGroup(
			gl_panel_28.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_28.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_17, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_28.setLayout(gl_panel_28);
		
		JLabel label_16 = new JLabel("2");
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_25 = new GroupLayout(panel_25);
		gl_panel_25.setHorizontalGroup(
			gl_panel_25.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_25.createSequentialGroup()
					.addGap(19)
					.addComponent(label_16, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(28, Short.MAX_VALUE))
		);
		gl_panel_25.setVerticalGroup(
			gl_panel_25.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_25.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_16, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_25.setLayout(gl_panel_25);
		
		JLabel label_14 = new JLabel("2");
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_27 = new GroupLayout(panel_27);
		gl_panel_27.setHorizontalGroup(
			gl_panel_27.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_27.createSequentialGroup()
					.addGap(20)
					.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		gl_panel_27.setVerticalGroup(
			gl_panel_27.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_27.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_27.setLayout(gl_panel_27);
		
		JLabel label_15 = new JLabel("2");
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_26 = new GroupLayout(panel_26);
		gl_panel_26.setHorizontalGroup(
			gl_panel_26.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_26.createSequentialGroup()
					.addGap(19)
					.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(28, Short.MAX_VALUE))
		);
		gl_panel_26.setVerticalGroup(
			gl_panel_26.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_26.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_15, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_26.setLayout(gl_panel_26);
		
		JLabel label_13 = new JLabel("2");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_24 = new GroupLayout(panel_24);
		gl_panel_24.setHorizontalGroup(
			gl_panel_24.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_24.createSequentialGroup()
					.addGap(19)
					.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(28, Short.MAX_VALUE))
		);
		gl_panel_24.setVerticalGroup(
			gl_panel_24.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_24.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_24.setLayout(gl_panel_24);
		
		JLabel label_12 = new JLabel("2");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_23 = new GroupLayout(panel_23);
		gl_panel_23.setHorizontalGroup(
			gl_panel_23.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_23.createSequentialGroup()
					.addGap(19)
					.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(28, Short.MAX_VALUE))
		);
		gl_panel_23.setVerticalGroup(
			gl_panel_23.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_23.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_23.setLayout(gl_panel_23);
		
		JLabel label_11 = new JLabel("19");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel_22 = new GroupLayout(panel_22);
		gl_panel_22.setHorizontalGroup(
			gl_panel_22.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_22.createSequentialGroup()
					.addGap(20)
					.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(27, Short.MAX_VALUE))
		);
		gl_panel_22.setVerticalGroup(
			gl_panel_22.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_22.createSequentialGroup()
					.addContainerGap(24, Short.MAX_VALUE)
					.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_22.setLayout(gl_panel_22);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 818, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(326)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 625, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
		);
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);
	}
}
