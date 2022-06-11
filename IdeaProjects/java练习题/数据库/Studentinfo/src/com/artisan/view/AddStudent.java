package com.artisan.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.artisan.dao.StudentDao;
import com.artisan.model.Student;
import com.artisan.util.StringUtil;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddStudent extends JFrame {

	private JPanel contentPane;
	private JTextField studentnametextField;
	private JPasswordField studentpasswordField;
	private JTextField studentdatetextField_1;
	private JTextField studentteltextField_2;
	private JTextField studengtaddresstextField_3;
	private JTextField addstudentsextextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent frame = new AddStudent();
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
	public AddStudent() {
		setTitle("\u6DFB\u52A0\u5B66\u751F");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u5B66\u751F\u59D3\u540D:");
		
		studentnametextField = new JTextField();
		studentnametextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u767B\u5F55\u5BC6\u7801:");
		
		studentpasswordField = new JPasswordField();
		
		JLabel lblNewLabel_2 = new JLabel("\u51FA\u751F\u65E5\u671F:");
		
		studentdatetextField_1 = new JTextField();
		studentdatetextField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u8054\u7CFB\u7535\u8BDD:");
		
		studentteltextField_2 = new JTextField();
		studentteltextField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\u5730        \u5740:");
		
		studengtaddresstextField_3 = new JTextField();
		studengtaddresstextField_3.setColumns(10);
		
		JButton submitButton = new JButton("\u786E\u8BA4");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				studentAddAct(ae);
			}
		});
		
		JLabel lblNewLabel_5 = new JLabel("\u6027     \u522B\uFF1A");
		
		addstudentsextextField = new JTextField();
		addstudentsextextField.setColumns(10);
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(38)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_4)
									.addGap(18)
									.addComponent(studengtaddresstextField_3, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(studentnametextField, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1)
										.addComponent(lblNewLabel_5))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(addstudentsextextField)
										.addComponent(studentpasswordField, 221, 221, Short.MAX_VALUE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblNewLabel_3)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(studentteltextField_2))
										.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
											.addComponent(lblNewLabel_2)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(studentdatetextField_1, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE))))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(173)
							.addComponent(submitButton)))
					.addGap(42))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(studentnametextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(addstudentsextextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(studentpasswordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(13)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(studentdatetextField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(studentteltextField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(studengtaddresstextField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4))
					.addGap(37)
					.addComponent(submitButton)
					.addGap(118))
		);
		contentPane.setLayout(gl_contentPane);
	}

	protected void studentAddAct(ActionEvent ae) {
		String studentName=studentnametextField.getText().toString();
		String studentSex=addstudentsextextField.getText().toString();
		String studentPassword= studentpasswordField.getText().toString();
		String studentdate =studentdatetextField_1.getText().toString();
		String studenttel=studentteltextField_2.getText().toString();
		String studentaddress=studengtaddresstextField_3.getText().toString();
		if(StringUtil.isEmpty(studentName)){
			JOptionPane.showMessageDialog(this, "请写入学生姓名");
			return;
		}
		if(StringUtil.isEmpty(studentPassword)){
			JOptionPane.showMessageDialog(this, "请写入密码");
			return;
		}
		Student student=new Student();
		student.setName(studentName);
		student.setSex(studentSex);
		student.setPassword(studentPassword);
		student.setDate(studentdate);
		student.setTel(studenttel);
		student.setAddress(studentaddress);
		StudentDao studentDao=new StudentDao();
		if(studentDao.addStudent(student)){
			JOptionPane.showMessageDialog(this, "添加成功");
		}else{
			JOptionPane.showMessageDialog(this, "添加失败");
		}
		
	}
}
