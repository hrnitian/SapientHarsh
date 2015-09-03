/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sapient.client.gui;

import java.awt.event.ActionEvent;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import com.sapient.client.gui.*;

/**
 *
 * @author hraj2
 */
public class EmployeeDetails extends javax.swing.JFrame {
	PreparedStatement pStatement = null;
	
	Connections con= new Connections();

    /**
     * Creates new form EmployeeDetails
     */
    public EmployeeDetails() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmployeeId = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        txtEmployeeId = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        btnFindId = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEmployeeId.setText("Employee Id");

        lblFirstName.setText("First Name");

        lblLastName.setText("Last Name");

        lblSalary.setText("Salary");

        txtEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIdActionPerformed(evt);
            }
        });

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        btnFindId.setText("Find By Id");
        btnFindId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindIdActionPerformed(evt);
            }
        });

        btnInsert.setText("Add");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnModify.setText("Modify");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(btnModify)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSalary)
                                    .addComponent(lblLastName))
                                .addGap(132, 132, 132)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSalary)
                                    .addComponent(txtLastName)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFirstName)
                                    .addComponent(lblEmployeeId))
                                .addGap(123, 123, 123)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFirstName)
                                    .addComponent(txtEmployeeId))))
                        .addGap(49, 49, 49))))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFindId)
                        .addGap(29, 29, 29)
                        .addComponent(btnInsert)
                        .addGap(132, 132, 132)
                        .addComponent(btnRemove)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployeeId)
                    .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalary)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindId)
                    .addComponent(btnInsert)
                    .addComponent(btnModify)
                    .addComponent(btnRemove))
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIdActionPerformed
    	
    }//GEN-LAST:event_txtEmployeeIdActionPerformed
    	// TODO add your handling code here:
    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed
    
    private void txtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void btnFindIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindIdActionPerformed
    	Connection dbConnection = null;
    	//PreparedStatement pStatement = null;
    	CallableStatement cStatement = null;
    	//ResultSet result = null;
    	
    	try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			//Establish a connection
			dbConnection = DriverManager.getConnection("jdbc:oracle:thin:@deltahiti31202:1521:XE", "Harsh", "harsh19933");
			
			//Execute a Query
			//pStatement = dbConnection.prepareStatement("Select FIRST_NAME,LAST_NAME,SALARY FROM EMPSS WHERE EMPLOYEE_ID=?");
			cStatement = dbConnection.prepareCall("{call query_emp(?,?,?,?)}");
			
			//pStatement.setInt(1, Integer.parseInt(txtEmployeeId.getText()));
			//cStatement.setInt(1, Integer.parseInt(txtEmployeeId.getText()));
			//int empId = 102;
			int empId = Integer.parseInt(txtEmployeeId.getText());
			cStatement.setInt(1, empId);
			
			cStatement.registerOutParameter(2, java.sql.Types.VARCHAR);
			cStatement.registerOutParameter(3, java.sql.Types.VARCHAR);
			cStatement.registerOutParameter(4, java.sql.Types.INTEGER);
			//result = pStatement.executeQuery();
			
			//Use execute method to run stored procedure
			cStatement.execute();
			
			//Retrieve employee name with getxxx method
			String empFName = cStatement.getString(2);
			String empLName = cStatement.getString(3);
			Integer empSal = cStatement.getInt(4);
			
			
			
			//if (bool) {
				txtFirstName.setText(empFName);
				txtLastName.setText(empLName);
				txtSalary.setText(empSal.toString());
			//}
			
			//else{
				//JOptionPane.showMessageDialog(null, "No Record Found");
			//}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	finally {
    		try {
				if (dbConnection !=null && !dbConnection.isClosed()) {
					dbConnection.close();
				}
				if(cStatement != null){
					cStatement.close();
				}
				/*if (result !=null) {
					result.close();
				}*/
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    //GEN-LAST:event_btnFindIdActionPerformed
    
  
		catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    	}
  }
    	
public int insert() {
	
	
	try {
	
	String eid = txtEmployeeId.getText();
	String fnm = txtFirstName.getText();
	String lnm = txtLastName.getText();
	int sal = Integer.parseInt(txtSalary.getText());
	pStatement = con.dbConnection.prepareStatement("insert into EMPSS (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, SALARY) values(?,?,?,?)");
	
	pStatement.setString(1, eid);
	pStatement.setString(2, fnm);
	pStatement.setString(3, lnm);
	pStatement.setInt(4, sal);
	
	int i = pStatement.executeUpdate();
	
	return i;	
	}
	catch (Exception e){
		e.printStackTrace();
	}
	return 0;
}


    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
    	//Connection dbConnection = null;
    	
    	//ResultSet result = null;
    	
    	int i=0;
		try {
			con.connect();
	    	i = insert();
			
			//i = pStatement.executeUpdate();
		
    	if (i == 1) {
			JOptionPane.showMessageDialog(null, "Record Added");
			
			txtEmployeeId.setText(" "); 
			txtFirstName.setText(" "); 
			txtLastName.setText(" "); 
			txtSalary.setText(" "); 
			
		}
		
		else{
			JOptionPane.showMessageDialog(null, " Record Not Added");
		}
	}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    	//try {
			//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			//Establish a connection
			//dbConnection = DriverManager.getConnection("jdbc:oracle:thin:@deltahiti31202:1521:XE", "Harsh", "harsh19933");
			
			
			//Execute a Query
			
    		
}//GEN-LAST:event_btnInsertActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
    	Connection dbConnection = null;
    	PreparedStatement pStatement = null;
    	//ResultSet result = null;

    	try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			//Establish a connection
			dbConnection = DriverManager.getConnection("jdbc:oracle:thin:@deltahiti31202:1521:XE", "Harsh", "harsh19933");
			
			//Execute a Query
		    String eid = txtEmployeeId.getText();
			String fnm = txtFirstName.getText();
			String lnm = txtLastName.getText();
			int sal = Integer.parseInt(txtSalary.getText());
			pStatement = dbConnection.prepareStatement("update EMPSS set FIRST_NAME = ?, LAST_NAME = ?, SALARY = ? where EMPLOYEE_ID = ?");
			
			pStatement.setString(1, fnm);
			pStatement.setString(2, lnm);
			pStatement.setInt(3, sal);
			pStatement.setString(4, eid);
			
			int i = pStatement.executeUpdate();
			
			if (i == 1) {
				JOptionPane.showMessageDialog(null, "Record Updated");
				
				txtEmployeeId.setText(" "); 
				txtFirstName.setText(" "); 
				txtLastName.setText(" "); 
				txtSalary.setText(" "); 
				
			}
			
			else{
				JOptionPane.showMessageDialog(null, " Record Not Updated");
			}
			dbConnection.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFindId;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel lblEmployeeId;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
