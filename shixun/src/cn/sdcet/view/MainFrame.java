package cn.sdcet.view;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

import cn.sdcet.base.DbaseUtil;
import cn.sdcet.dao.Addressdao;
import cn.sdcet.dao.impl.Addressdaoimpl;
import cn.sdcet.db.Address;
import cn.sdcet.view.AddFrame;
import cn.sdcet.view.AddFrame1;
import cn.sdcet.view.AddFrame2;
import cn.sdcet.view.AddFrame3;
import cn.sdcet.view.LoginFrame;
import cn.sdcet.view.UpdateFrame;
import cn.sdcet.view.UpdateFrame1;
import cn.sdcet.view.UpdateFrame2;
import cn.sdcet.view.UpdateFrame3;


public class MainFrame extends javax.swing.JFrame implements ListSelectionListener,ActionListener{

    /**
     * Creates new form NewJFrame2
     */
    public MainFrame() {
        initComponents();
        jList1.addListSelectionListener(this);
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        jButton3.addActionListener(this);
        jButton4.addActionListener(this);
        jButton5.addActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        panel1 = new java.awt.Panel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "����", "����", "ͬѧ", "����" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jButton1.setText("����");

        jButton2.setText("��ѯ");

        jButton3.setText("����");

        jButton4.setText("�޸�");

        jButton5.setText("ɾ��");

        jTextField1.setText("");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "name", "tel", "QQ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        String[] columns = { "����", "�绰", "QQ" };
        model = new DefaultTableModel(null, columns);
        jTable1 = new JTable(model);
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5))
                            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))))
        );

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private java.awt.Panel panel1;
    private static DefaultTableModel model;
    private DefaultTableModel dataModel;
    // End of variables declaration                   
	@Override
	public void valueChanged(ListSelectionEvent e) {
		
	    	if(jList1.getSelectedIndex()==0){
	    		DefaultTableModel tableModel = (DefaultTableModel)jTable1.getModel();
	    		tableModel.setRowCount(0);
	    		try {
	    	        Connection conn=DbaseUtil.getConnection();
	    	 		
	    	 		String sql="select * from jiaren";
	    	 		PreparedStatement ptmt = conn.prepareStatement(sql);
	    		    ResultSet rs;
	    	        jTable1 = new JTable(model);
	    	       
	    				rs = ptmt.executeQuery();
	    			
	    			while(rs.next()){
	    					String name=rs.getString(1);
	    					String tel=rs.getString(2);
	    					String qq=rs.getString(3);
	    	        // �Լ������ݿ����������ݷŵ�������
	    	        model.addRow(new String[] {name, tel, qq});
	    			}
	    			} catch (SQLException e1) {
	    				// TODO Auto-generated catch block
	    				e1.printStackTrace();
	    			}
	    	}else if(jList1.getSelectedIndex()==1){
	    		DefaultTableModel tableModel = (DefaultTableModel)jTable1.getModel();
				tableModel.setRowCount(0);
	    		try {
	    	        Connection conn=DbaseUtil.getConnection();
	    	 		
	    	 		String sql="select * from pengyou";
	    	 		PreparedStatement ptmt = conn.prepareStatement(sql);
	    		    ResultSet rs;
	    	        jTable1 = new JTable(model);
	    	       
	    				rs = ptmt.executeQuery();
	    			
	    			while(rs.next()){
	    					String name=rs.getString(1);
	    					String tel=rs.getString(2);
	    					String qq=rs.getString(3);
	    	        // �Լ������ݿ����������ݷŵ�������
	    	        model.addRow(new String[] {name, tel, qq});
	    			}
	    			} catch (SQLException e1) {
	    				// TODO Auto-generated catch block
	    				e1.printStackTrace();
	    			}
	    	}
	    	else if(jList1.getSelectedIndex()==2){
	    		DefaultTableModel tableModel = (DefaultTableModel)jTable1.getModel();
				tableModel.setRowCount(0);
	    		try {
	    	        Connection conn=DbaseUtil.getConnection();
	    	 		
	    	 		String sql="select * from tongxue";
	    	 		PreparedStatement ptmt = conn.prepareStatement(sql);
	    		    ResultSet rs;
	    	        jTable1 = new JTable(model);
	    	       
	    				rs = ptmt.executeQuery();
	    			
	    			while(rs.next()){
	    					String name=rs.getString(1);
	    					String tel=rs.getString(2);
	    					String qq=rs.getString(3);
	    	        // �Լ������ݿ����������ݷŵ�������
	    	        model.addRow(new String[] {name, tel, qq});
	    			}
	    			} catch (SQLException e1) {
	    				// TODO Auto-generated catch block
	    				e1.printStackTrace();
	    			}
	    	}
	    	else if(jList1.getSelectedIndex()==3){
	    		DefaultTableModel tableModel = (DefaultTableModel)jTable1.getModel();
				tableModel.setRowCount(0);
	    		try {
	    	        Connection conn=DbaseUtil.getConnection();
	    	 		
	    	 		String sql="select * from giumi";
	    	 		PreparedStatement ptmt = conn.prepareStatement(sql);
	    		    ResultSet rs;
	    	        jTable1 = new JTable(model);
	    	       
	    				rs = ptmt.executeQuery();
	    			
	    			while(rs.next()){
	    					String name=rs.getString(1);
	    					String tel=rs.getString(2);
	    					String qq=rs.getString(3);
	    	        // �Լ������ݿ����������ݷŵ�������
	    	        model.addRow(new String[] {name, tel, qq});
	    			}
	    			} catch (SQLException e1) {
	    				// TODO Auto-generated catch block
	    				e1.printStackTrace();
	    			}
	    		}
	
	}

	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if ("����".equals(str)&&jList1.getSelectedIndex()==0) {
			hide();
			AddFrame a=new AddFrame();
			a.setBounds(200, 300, 350, 300);
			a.setVisible(true);
			a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			a.setResizable(false);
		} else if ("����".equals(str)&&jList1.getSelectedIndex()==1) {
			hide();
			AddFrame1 a=new AddFrame1();
			a.setBounds(200, 300, 350, 300);
			a.setVisible(true);
			a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			a.setResizable(false);
		}else if ("����".equals(str)&&jList1.getSelectedIndex()==2) {
			hide();
			AddFrame2 a=new AddFrame2();
			a.setBounds(200, 300, 350, 300);
			a.setVisible(true);
			a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			a.setResizable(false);
		}else if ("����".equals(str)&&jList1.getSelectedIndex()==3) {
			hide();
			AddFrame3 a=new AddFrame3();
			a.setBounds(200, 300, 350, 300);
			a.setVisible(true);
			a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			a.setResizable(false);
		}else if ("��ѯ".equals(str)&&jList1.getSelectedIndex()==0){
			DefaultTableModel tableModel = (DefaultTableModel)jTable1.getModel();
			tableModel.setRowCount(0);
			Addressdao ad=new Addressdaoimpl();
			Addressdaoimpl ad1=new Addressdaoimpl();
			
			Connection conn=DbaseUtil.getConnection();
	 		
	 		String sql="select name,telephone,qq from jiaren";
	 		
	 	
	 		try {
	 			
	 			PreparedStatement ptmt = conn.prepareStatement(sql);

	 		ResultSet rs=ptmt.executeQuery();
	 		while(rs.next()){
	 			int i=0;
	 			if(rs.getString("name").equals(jTextField1.getText())){
	 				String name1=rs.getString(1);
	 				String tel1=rs.getString(2);
	 				String qq1=rs.getString(3);
	 				model.addRow(new String[] {name1, tel1, qq1});
	 	}
			          
	 		}
	 		} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 		
			 		
		           
			      }
			 		else if ("��ѯ".equals(str)&&jList1.getSelectedIndex()==1){
			 			DefaultTableModel tableModel = (DefaultTableModel)jTable1.getModel();
						tableModel.setRowCount(0);
						Addressdao ad=new Addressdaoimpl();
						
						
						Connection conn=DbaseUtil.getConnection();
				 		
				 		String sql="select name,telephone,qq from pengyou ";
				 		
				 	
				 		try {
				 			
				 			PreparedStatement ptmt = conn.prepareStatement(sql);
				 			
				 		ResultSet rs=ptmt.executeQuery();
				 		while(rs.next()){
				 			if(rs.getString("name").equals(jTextField1.getText())){
				 				String name=rs.getString(1);
		    					String tel=rs.getString(2);
		    					String qq=rs.getString(3);
				 				model.addRow(new String[] {name, tel,qq});	
				 		}
				 		}
				 		} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
						 					 		}
				 		else if ("��ѯ".equals(str)&&jList1.getSelectedIndex()==2){
				 			DefaultTableModel tableModel = (DefaultTableModel)jTable1.getModel();
							tableModel.setRowCount(0);
							Addressdao ad=new Addressdaoimpl();
							Connection conn=DbaseUtil.getConnection();
					 		
					 		String sql="select name,telephone,qq from tongxue ";
					 		
					 	
					 		try {
					 			
					 			PreparedStatement ptmt = conn.prepareStatement(sql);
					 			
					 		ResultSet rs=ptmt.executeQuery();
					 		while(rs.next()){
					 			if(rs.getString("name").equals(jTextField1.getText())){
					 				String name=rs.getString(1);
			    					String tel=rs.getString(2);
			    					String qq=rs.getString(3);
					 				model.addRow(new String[] {name, tel,qq});	
					 		}
					 		}
					 		} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						
				 		}
					 		else if ("��ѯ".equals(str)&&jList1.getSelectedIndex()==3){
					 			DefaultTableModel tableModel = (DefaultTableModel)jTable1.getModel();
								tableModel.setRowCount(0);
								Addressdao ad=new Addressdaoimpl();
								Connection conn=DbaseUtil.getConnection();
						 		
						 		String sql="select name,telephone,qq from giumi ";
						 		
						 	
						 		try {
						 			
						 			PreparedStatement ptmt = conn.prepareStatement(sql);
						 			
						 		ResultSet rs=ptmt.executeQuery();
						 		while(rs.next()){
						 			if(rs.getString("name").equals(jTextField1.getText())){
						 				String name=rs.getString(1);
				    					String tel=rs.getString(2);
				    					String qq=rs.getString(3);
						 				model.addRow(new String[] {name, tel,qq});	
						 		}
						 		}
						 		} catch (SQLException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							;
		} else if ("�޸�".equals(str)&&jList1.getSelectedIndex()==0) {
			hide();
			UpdateFrame a=new UpdateFrame();
			a.setBounds(200, 300, 350, 300);
			a.setVisible(true);
			a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			a.setResizable(false);
		} else if ("�޸�".equals(str)&&jList1.getSelectedIndex()==1) {
			hide();
			UpdateFrame1 a=new UpdateFrame1();
			a.setBounds(200, 300, 350, 300);
			a.setVisible(true);
			a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			a.setResizable(false);
		}else if ("�޸�".equals(str)&&jList1.getSelectedIndex()==2) {
			hide();
			UpdateFrame2 a=new UpdateFrame2();
			a.setBounds(200, 300, 350, 300);
			a.setVisible(true);
			a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			a.setResizable(false);
		}else if ("�޸�".equals(str)&&jList1.getSelectedIndex()==3) {
			hide();
			UpdateFrame3 a=new UpdateFrame3();
			a.setBounds(200, 300, 350, 300);
			a.setVisible(true);
			a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			a.setResizable(false);
		} else if ("ɾ��".equals(str)&&jList1.getSelectedIndex()==0){
			DefaultTableModel tableModel = (DefaultTableModel)jTable1.getModel();
			tableModel.setRowCount(0);
			Addressdao ad=new Addressdaoimpl();
			Address a=new Address(jTextField1.getText(),null,null);
			           ad.delete(jTextField1.getText());
	 		JOptionPane.showMessageDialog(jButton1,"ɾ���ɹ�");
		} else if ("ɾ��".equals(str)&&jList1.getSelectedIndex()==1) {
			DefaultTableModel tableModel = (DefaultTableModel)jTable1.getModel();
			tableModel.setRowCount(0);
			Addressdao ad=new Addressdaoimpl();
			Address a=new Address(jTextField1.getText(),null,null);
			 ad.delete1(jTextField1.getText());
	 		JOptionPane.showMessageDialog(jButton1,"ɾ���ɹ�");
		}else if ("ɾ��".equals(str)&&jList1.getSelectedIndex()==2) {
			DefaultTableModel tableModel = (DefaultTableModel)jTable1.getModel();
			tableModel.setRowCount(0);
			Addressdao ad=new Addressdaoimpl();
			Address a=new Address(jTextField1.getText(),null,null);
			 ad.delete2(jTextField1.getText());
	 		JOptionPane.showMessageDialog(jButton1,"ɾ���ɹ�");
		}else if ("ɾ��".equals(str)&&jList1.getSelectedIndex()==3) {
			DefaultTableModel tableModel = (DefaultTableModel)jTable1.getModel();
			tableModel.setRowCount(0);
			Addressdao ad=new Addressdaoimpl();
			Address a=new Address(jTextField1.getText(),null,null);
			 ad.delete3(jTextField1.getText());
	 		JOptionPane.showMessageDialog(jButton1,"ɾ���ɹ�");
		}else if("����".equals(str)){
			hide();
    		LoginFrame a=new LoginFrame();
    		a.setBounds(200, 300, 350, 300);
			a.setVisible(true);
			a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			a.setResizable(false);
		}
	}

		
	

}
