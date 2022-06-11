package com.artisan.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.artisan.dao.AdminDao;
import com.artisan.dao.StudentDao;
import com.artisan.model.Admin;
import com.artisan.model.Student;
import com.artisan.model.UserType;
import com.artisan.util.StringUtil;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrm extends JFrame {

	private JPanel contentPane;
	private JTextField UsernametextField;
	private JTextField passwordtextField_1;
	private JComboBox userTypecomboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrm frame = new LoginFrm();
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
	public LoginFrm() {
		setTitle("\u767B\u5F55\u754C\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u5B66\u751F\u4FE1\u606F\u7BA1\u7406\u7CFB\u7EDF\u767B\u5F55\u754C\u9762");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
		
		JLabel lblNewLabel_1 = new JLabel("\u7528\u6237\u540D:");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 15));
		
		UsernametextField = new JTextField();
		UsernametextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u5BC6    \u7801:");
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.BOLD, 15));
		
		passwordtextField_1 = new JTextField();
		passwordtextField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u7528\u6237\u7C7B\u578B:");
		lblNewLabel_3.setFont(new Font("微软雅黑", Font.BOLD, 15));
		
		userTypecomboBox = new JComboBox();
		userTypecomboBox.setModel(new DefaultComboBoxModel(new UserType[] {UserType.ADMIN, UserType.STUDENT}));
		userTypecomboBox.setFont(new Font("微软雅黑", Font.BOLD, 15));
		
		JButton loginButton = new JButton("\u767B \u5F55");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				loginAct(ae);
				
			}
		});
		loginButton.setFont(new Font("微软雅黑", Font.BOLD, 15));
		
		JButton resetButton_1 = new JButton("\u91CD  \u7F6E");
		resetButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				restValue(ae);
			}
		});
		resetButton_1.setFont(new Font("微软雅黑", Font.BOLD, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(128, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
					.addGap(119))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(77)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lblNewLabel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addComponent(lblNewLabel_3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(loginButton, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
							.addComponent(resetButton_1))
						.addComponent(userTypecomboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(passwordtextField_1)
						.addComponent(UsernametextField, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
					.addContainerGap(159, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(24)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(UsernametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(passwordtextField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(44)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(userTypecomboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(loginButton)
						.addComponent(resetButton_1))
					.addGap(27))
		);
		contentPane.setLayout(gl_contentPane);
	}

	protected void loginAct(ActionEvent ae) {
		String userName=UsernametextField.getText().toString();
		String password=passwordtextField_1.getText().toString();
		UserType selectedItem=(UserType)userTypecomboBox.getSelectedItem();
		if(StringUtil.isEmpty(userName)){
			JOptionPane.showMessageDialog(this, "用户名不能为空");
			
			return;
		}
		if(StringUtil.isEmpty(password)){
			JOptionPane.showMessageDialog(this, "密码不能为空");
			
			return;
		}
		Admin admin=null;
		if("系统管理员".equals(selectedItem.getName())){
			AdminDao adminDao=new AdminDao();
			Admin adminTmp=new Admin();
			adminTmp.setName(userName);
			adminTmp.setPassword(password);
			admin=adminDao.login(adminTmp);
			
			if(admin==null){
				JOptionPane.showMessageDialog(this, "用户名或密码错误");
				return;
			}
			JOptionPane.showMessageDialog(this, "欢迎登录系统");
			this.dispose();
			new mainFra(selectedItem, admin).setVisible(true);
		}else {
			Student student=null;
			StudentDao studentDao=new StudentDao();
			Student studentTmp=new Student();
			studentTmp.setName(userName);
			studentTmp.setPassword(password);
			student=studentDao.login(studentTmp);
			
			if(student==null){
				JOptionPane.showMessageDialog(this, "用户名或密码错误");
				return;
			}
			JOptionPane.showMessageDialog(this, "欢迎登录系统");
			this.dispose();
			new mainFra(selectedItem,student).setVisible(true);

		}
	}

	protected void restValue(ActionEvent ae) {
		UsernametextField.setText("");
		passwordtextField_1.setText("");
		userTypecomboBox.setSelectedIndex(0);
	}
}
