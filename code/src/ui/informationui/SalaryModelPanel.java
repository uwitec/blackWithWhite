package ui.informationui;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import bl.staff.Impl.StaffManageController;
import vo.StaffVO;

public class SalaryModelPanel extends JPanel{
	StartFrame belongsTO;
	JLabel id;
	JTextField userid;
	JLabel labelofsalary;
	JComboBox comboBoxofsalary;
	JTextField userpay;
	JLabel pay;
	JTable table;
	JButton submit;
	public SalaryModelPanel(){
		this.setLayout(null);
		this.setBounds(200, 60, 1000, 615);
		
		id= new JLabel("用户名");
		id.setFont(new Font("微软雅黑",Font.BOLD,16));
		id.setBounds(120, 50, 80, 30);
		this.add(id);
		
		userid = new JTextField();
		userid.setBounds(200, 50, 160, 30);
		userid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		this.add(userid);
		
		labelofsalary= new JLabel("薪水策略");
		labelofsalary.setFont(new Font("微软雅黑",Font.BOLD,16));
		labelofsalary.setBounds(510, 50, 80, 30);
		this.add(labelofsalary);
		
		comboBoxofsalary = new JComboBox();
		comboBoxofsalary.setModel(new DefaultComboBoxModel(new String[] {"月薪","计次","提成"}));
		comboBoxofsalary.setBounds(590, 50, 60, 30);
		this.add(comboBoxofsalary);
		
		pay= new JLabel("薪资");
		pay.setFont(new Font("微软雅黑",Font.BOLD,16));
		pay.setBounds(120, 100, 40, 30);
		this.add(pay);
		
		userpay = new JTextField();
		userpay.setBounds(200, 100, 160, 30);
		userpay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(149,147,143)));
		this.add(userpay);


		
		/*
		 * 薪水策略提交
		 */
		submit = new JButton("提交");
		submit.setBounds(690, 100, 80, 30);
		this.add(submit);
		submit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id=userid.getText();
				String salary=(String)comboBoxofsalary.getSelectedItem()+" "+userpay.getText();
				if(id!=null&&userpay.getText()!=null){
					String[] ids=new String[]{id};
					String[] salarys=new String[]{salary};
					StaffManageController changeSalarymodel = new StaffManageController();
					boolean istrue=changeSalarymodel.changesalarymodel(ids,salarys);
					if(istrue==true){
						TimePanel.change=true;
						TimePanel.text="您已成功重置该员工的薪水策略！";
						
						StaffManageController staff=new StaffManageController();
						ArrayList<StaffVO> staffs=staff.getAllStaff("");
						buildTable(staffs);
						repaint();
						
					}else{
						TimePanel.change=true;
						TimePanel.text="重置失败！请重试！";
					}
				}
			}
		});
		
		
		ArrayList<StaffVO> staffs=new ArrayList<StaffVO>();
		StaffVO A=new StaffVO();
		A.ID="小龙女";
		A.name="陈妍希";
		A.age=18;
		A.pos="小笼包";
		A.department="仙二404";
		A.SalaryModel="月薪：5000";
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
		staffs.add(A);
/*		StaffManageController staff=new StaffManageController();
		ArrayList<StaffVO> staffs=staff.getAllStaff("");*/
		buildTable(staffs);
	}
	
	public void buildTable(ArrayList<StaffVO> staffs){
		int size=staffs.size();
		
		Object[][] tableData=new Object[size][5];
		for(int i=0;i<size;i++){
			StaffVO mess=staffs.get(i);
			tableData[i]=new Object[]{mess.ID,mess.name,mess.age,mess.passwords,mess.pos," "};
		}
		Object[] columnTitle = {"用户名","姓名","年龄","职位","薪水"};  
		table=new JTable(tableData,columnTitle);
		int height=table.getRowHeight()*(size+1)+9;
		int ValidMaxHeight=250;
		if(height>=400)
			height=ValidMaxHeight;
		table.setOpaque(false); 
		table.setRowSelectionAllowed(true);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(140, 270, 658, height);
		scrollPane.setOpaque(false);
		this.add(scrollPane);
		scrollPane.setViewportView(table);
	}
}
