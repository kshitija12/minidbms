/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author admin
 */
public class StudentCourses extends javax.swing.JFrame {
    public StudentCourses() {
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        courses_table = new javax.swing.JTable();
        add_course = new javax.swing.JButton();
        std_name = new javax.swing.JLabel();
        courseid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        remove_course = new javax.swing.JButton();
        log_out = new javax.swing.JButton();
        view_button = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("WELCOME STUDENT");

        jScrollPane1.setViewportView(courses_table);

        add_course.setText("Add Course");
        add_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_courseActionPerformed(evt);
            }
        });

        jLabel3.setText("Course ID (*) ");

        remove_course.setText("Remove Course");
        remove_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_courseActionPerformed(evt);
            }
        });

        log_out.setText("Log Out");
        log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_outActionPerformed(evt);
            }
        });

        view_button.setText("View My Courses");
        view_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_buttonActionPerformed(evt);
            }
        });

        jButton3.setText("View All Courses");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(381, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(courseid, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(std_name)
                                    .addComponent(remove_course))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(add_course, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(view_button, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(log_out)
                                .addGap(138, 138, 138))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(view_button)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(courseid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(remove_course)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(std_name)
                                .addGap(72, 72, 72))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(add_course)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(log_out)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void view_table() //my courses
{
      try{Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Kshitija123!");
        PreparedStatement ps = con.prepareStatement("select c.* from user u, course c, enrolment e where e.courseid = c.courseid AND u.name = e.name AND u.name = ?;");
        ps.setString(1,uname);
        ResultSet rs = ps.executeQuery();
        courses_table.setModel(DbUtils.resultSetToTableModel(rs)); 
      }
      catch (SQLException e)
      {
              JOptionPane.showMessageDialog(null, e);
      }
}
public void view_all_courses() //all courses
{
      try{Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Kshitija123!");
        String sql = "select * from course;";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        courses_table.setModel(DbUtils.resultSetToTableModel(rs)); 

      }
      catch (SQLException e)
      {
              JOptionPane.showMessageDialog(null, e);
      }
}
    private void view_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_buttonActionPerformed

        try{
      view_table();}
    catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_view_buttonActionPerformed

    private void remove_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_courseActionPerformed
        // TODO add your handling code here:
        int cid;
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Kshitija123!"))
           {
               cid =  Integer.parseInt(courseid.getText());
               PreparedStatement p2 = con.prepareStatement("delete from enrolment where name = ? AND courseid = ?;");
                p2.setString(1,uname);
                p2.setInt(2,cid);
                int r2 = p2.executeUpdate();
                if(r2 > 0)
                {
                    JOptionPane.showMessageDialog(this,"Course removed successfully!");
                    view_table();
                    PreparedStatement p3 = con.prepareStatement("update course set seats=seats+1 where courseid = ?;");
                    p3.setInt(1,cid);
                    int r3 = p3.executeUpdate();
                    if (r3 < 0){
                            JOptionPane.showMessageDialog(this,"Error in updating seat value!");
                    }
                    courseid.setText(null);
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"You have not registered for this course!");
                } 
           }             
       catch (SQLException ex ) {
             JOptionPane.showMessageDialog(this,"Enter correct Course id!!");
        }
        catch (NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this,"Enter Correct Course id!!");
        }
        catch(HeadlessException e){
            System.out.println(e.getMessage());    
        }  
    }//GEN-LAST:event_remove_courseActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        view_all_courses();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void add_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_courseActionPerformed
    int cid;
     try{
        cid = Integer.parseInt(courseid.getText());
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Kshitija123!");
        PreparedStatement ps = con.prepareStatement("select * from enrolment where courseid= ? and name= ?;");
        ps.setInt(1,cid);
        ps.setString(2,uname);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
        JOptionPane.showMessageDialog(this,"You have already registered for this course!");
        }
        else
        {                           //check if seats available
            PreparedStatement p = con.prepareStatement("select * from course where courseid= ?");
            p.setInt(1,cid);
            ResultSet r = p.executeQuery();
            if (r.next()){
                int s = r.getInt("seats");
                if (s<=0){
                    JOptionPane.showMessageDialog(this,"No seats available! Check back later");
                }
                else if (s>0){
                    PreparedStatement p3 = con.prepareStatement("insert into enrolment values (? , ?);");
                    p3.setString(1,uname);
                    p3.setInt(2,cid);
                    int r2 =p3.executeUpdate();
                    if(r2 > 0){
                        JOptionPane.showMessageDialog(this,"Course added successfully!");
                        PreparedStatement p4 = con.prepareStatement("update course set seats=seats-1 where courseid=?;");
                        p4.setInt(1,cid);
                        int r3 = p4.executeUpdate();
                        if(r3<0){
                            JOptionPane.showMessageDialog(this,"Error updating seat value");
                        }
                        view_table();
                        courseid.setText(null);
                        }
                }
            }
            else{
               JOptionPane.showMessageDialog(this,"Course doesnt exist!");
            } 
        }
       
      }
             
        catch (SQLException ex) {
             JOptionPane.showMessageDialog(this,"Enter correct Course id!");
        }
        catch (NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this,"Enter correct Course id!!");
        }
        catch(HeadlessException e){
            System.out.println(e.getMessage());    
        }
    }//GEN-LAST:event_add_courseActionPerformed

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        JOptionPane.showMessageDialog(this,"Bye!");
        SignIn si = new SignIn();
        si.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_log_outActionPerformed

   
    /**
     */
    public static String uname; 
    public static void main(String args[]) {
        uname = args[0];
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
            java.util.logging.Logger.getLogger(StudentCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(() -> {
            new StudentCourses().setVisible(true);
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_course;
    private javax.swing.JTextField courseid;
    private javax.swing.JTable courses_table;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton log_out;
    private javax.swing.JButton remove_course;
    private javax.swing.JLabel std_name;
    private javax.swing.JButton view_button;
    // End of variables declaration//GEN-END:variables
}
