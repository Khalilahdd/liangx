package com.artisan.view;

import java.awt.EventQueue;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.artisan.dao.StudentDao;
import com.artisan.model.Student;

import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StudentManageFrm extends JFrame {

	private JPanel contentPane;
	private JTable studenListtable;
	private JTextField editsnametextField_1;
	private JPasswordField editspasswordField;
	private JTextField editsdatetextField_2;
	private JTextField editsteltextField_3;
	private JTextField editsaddresstextField_4;
	private JTextField editStudentsextextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentManageFrm frame = new StudentManageFrm();
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
	public StudentManageFrm() {
		
	
		setTitle("\u5B66\u751F\u7BA1\u7406");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 752, 538);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel_1 = new JLabel("\u5B66\u751F\u59D3\u540D\uFF1A");
		
		editsnametextField_1 = new JTextField();
		editsnametextField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u5BC6    \u7801\uFF1A");
		
		editspasswordField = new JPasswordField();
		
		JLabel lblNewLabel_3 = new JLabel("\u51FA\u751F\u65E5\u671F\uFF1A");
		
		editsdatetextField_2 = new JTextField();
		editsdatetextField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\u7535\u8BDD\u53F7\u7801\uFF1A");
		
		editsteltextField_3 = new JTextField();
		editsteltextField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\u5730 \u5740\uFF1A");
		
		editsaddresstextField_4 = new JTextField();
		editsaddresstextField_4.setColumns(10);
		
		JButton subiteditbtnNewButton_1 = new JButton("\u786E\u5B9A\u4FEE\u6539");
		subiteditbtnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				submitEditAct(ae);
			}
		});
		
		JButton deletestubtnNewButton_2 = new JButton("\u5220\u9664\u5B66\u751F");
		deletestubtnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				deleteStudent(ae);
			}
		});
		
		JLabel lblNewLabel = new JLabel("\u6027    \u522B\uFF1A");
		
		editStudentsextextField = new JTextField();
		editStudentsextextField.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(46)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(editStudentsextextField)
								.addComponent(editsnametextField_1, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(49)
									.addComponent(lblNewLabel_3)
									.addGap(18)
									.addComponent(editsdatetextField_2, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addGap(45)
									.addComponent(lblNewLabel_2)
									.addGap(18)
									.addComponent(editspasswordField, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)))
							.addGap(30)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_5, Alignment.TRAILING)
								.addComponent(lblNewLabel_4, Alignment.TRAILING))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(editsteltextField_3)
								.addComponent(editsaddresstextField_4, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(196)
							.addComponent(subiteditbtnNewButton_1)
							.addGap(115)
							.addComponent(deletestubtnNewButton_2))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(35)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 585, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(34)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(editsnametextField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(editsdatetextField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_5)
						.addComponent(editsaddresstextField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(editsteltextField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4)
						.addComponent(editspasswordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel)
						.addComponent(editStudentsextextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(subiteditbtnNewButton_1)
						.addComponent(deletestubtnNewButton_2))
					.addContainerGap())
		);
		
		studenListtable = new JTable();
		studenListtable.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				selectTableRow(arg0);
			}
		});
		studenListtable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u5B66\u751F\u7F16\u53F7", "\u5B66\u751F\u59D3\u540D", "\u6027\u522B", "\u5BC6\u7801", "\u51FA\u751F\u65E5\u671F", "\u7535\u8BDD\u53F7\u7801", "\u5730\u5740"
			}
		));
		scrollPane.setViewportView(studenListtable);
		contentPane.setLayout(gl_contentPane);
		setTable(new Student());	
	}

	protected void submitEditAct(ActionEvent ae) {
		String studentName=editsnametextField_1.getText().toString();
		String studentSex=editStudentsextextField.getText().toString();
		String studentpassword=editspasswordField.getText().toString();
		String studentdate=editsdatetextField_2.getText().toString();
		String studenttel=editsteltextField_3.getText().toString();
		String studentaddress=editsaddresstextField_4.getText().toString();
		int row=studenListtable.getSelectedRow();
		if(row==-1){
			JOptionPane.showMessageDialog(this, "请选择要修改的数据");
			return;
		}
		Student student=new Student();
		student.setName(studentName);
		student.setSex(studentSex);
		student.setPassword(studentpassword);
		student.setDate(studentdate);
		student.setTel(studenttel);
		student.setAddress(studentaddress);
		student.setId((Integer.parseInt(studenListtable.getValueAt(row, 0).toString())));
		StudentDao studentDao=new StudentDao();
		
		
		if(studentDao.update(student)){
			JOptionPane.showMessageDialog(this, "更新成功");
		}else{
			JOptionPane.showMessageDialog(this, "更新失败");
		}
		setTable(new Student());
	}

	protected void selectTableRow(MouseEvent me) {
		DefaultTableModel dft=(DefaultTableModel) studenListtable.getModel();
		editsnametextField_1.setText(dft.getValueAt(studenListtable.getSelectedRow(), 1).toString());
		editStudentsextextField.setText(dft.getValueAt(studenListtable.getSelectedRow(), 2).toString());
		editspasswordField.setText(dft.getValueAt(studenListtable.getSelectedRow(), 3).toString());
		editsdatetextField_2.setText(dft.getValueAt(studenListtable.getSelectedRow(), 4).toString());
		editsteltextField_3.setText(dft.getValueAt(studenListtable.getSelectedRow(), 5).toString());
		editsaddresstextField_4.setText(dft.getValueAt(studenListtable.getSelectedRow(),6).toString());
		
	}
	

	protected void deleteStudent(ActionEvent ae) {
		int row=studenListtable.getSelectedRow();
		if(row==-1){
			JOptionPane.showMessageDialog(this, "请选择要删除的数据");
			return;
		}
		StudentDao studentDao=new StudentDao();
		if(studentDao.delete(Integer.parseInt(studenListtable.getValueAt(row, 0).toString()))){
			JOptionPane.showMessageDialog(this, "删除成功");
		}else{
			JOptionPane.showMessageDialog(this, "删除失败");
		}
		setTable(new Student());
	}

	private void setTable(Student student){
		DefaultTableModel dft=(DefaultTableModel) studenListtable.getModel();
		dft.setRowCount(0);
		StudentDao studentDao=new StudentDao();
		List<Student> studentList=studentDao.getStudentList(student);
		for(Student s:studentList){
			Vector v=new Vector();
			v.add(s.getId());
			v.add(s.getName());
			v.add(s.getSex());
			v.add(s.getPassword());
			v.add(s.getDate());
			v.add(s.getTel());
			v.add(s.getAddress());
			dft.addRow(v);
		}
		
	}

}
