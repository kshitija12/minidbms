/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static miniproject.StudentCourses.uname;

/**
 *
 * @author admin
 */
public class Courses extends javax.swing.JFrame {

    /**
     * Creates new form Courses
     */
    public Courses() {
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

        insert_course = new javax.swing.JButton();
        update_course = new javax.swing.JButton();
        remove_course = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        cname = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        coursetable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        log_out = new javax.swing.JButton();
        view_all = new javax.swing.JButton();
        sdate = new com.toedter.calendar.JDateChooser();
        edate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        insert_course.setText("Insert Course");
        insert_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_courseActionPerformed(evt);
            }
        });

        update_course.setText("Update Course");
        update_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_courseActionPerformed(evt);
            }
        });

        remove_course.setText("Remove Course");
        remove_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_courseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("WELCOME STAFF");

        jScrollPane1.setViewportView(coursetable);

        jLabel2.setText("Course ID");

        jLabel3.setText("Start Date");

        jLabel4.setText("Course Name");

        jLabel6.setText("End Date");

        jLabel7.setText("Description");

        desc.setColumns(20);
        desc.setRows(5);
        jScrollPane2.setViewportView(desc);

        log_out.setText("Log Out");
        log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_outActionPerformed(evt);
            }
        });

        view_all.setText("View All Courses");
        view_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_allActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(log_out)
                        .addGap(211, 211, 211))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(view_all)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(13, 13, 13))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cid)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(sdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 2, Short.MAX_VALUE)))))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(38, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(insert_course, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(remove_course)
                                .addGap(88, 88, 88))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(update_course, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(181, 181, 181))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(view_all)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6))
                                    .addComponent(sdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(update_course)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(remove_course)
                                    .addComponent(insert_course))
                                .addGap(15, 15, 15)))))
                .addGap(18, 26, Short.MAX_VALUE)
                .addComponent(log_out)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void view_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_allActionPerformed
        view_all_courses();
        // TODO add your handling code here:
    }//GEN-LAST:event_view_allActionPerformed
public void view_all_courses() //all courses
{
      try{Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Kshitija123!");
        String sql = "select * from course;";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        coursetable.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs)); 
      }
      catch (SQLException e)
      {
          
      }
}
public void set_null(){
    String a=null;
    cid.setText(a);
    cname.setText(a);
    desc.setText(a);
    //sdate.setText(a);
    //edate.setText(a);
}
    private void update_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_courseActionPerformed
        try
        {  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Kshitija123!");
            int courseid;
            String c_name,s_date,e_date,c_desc,c_id;
            c_id=cid.getText();
            c_name=cname.getText();
            c_desc=desc.getText();
            Calendar cal = sdate.getCalendar();
            int datevar = cal.get(Calendar.DATE);int monthvar = cal.get(Calendar.MONTH);int yearvar = cal.get(Calendar.YEAR);
            String datev = Integer.toString(datevar);String monthv = Integer.toString(monthvar);String yearv= Integer.toString(yearvar);
            s_date=(datev+"/"+monthv+"/"+yearv);
            Calendar cal1 = edate.getCalendar();
            int datevar1 = cal1.get(Calendar.DATE);int monthvar1 = cal1.get(Calendar.MONTH);int yearvar1= cal1.get(Calendar.YEAR);
            String datev1 = Integer.toString(datevar1);String monthv1 = Integer.toString(monthvar1);String yearv1= Integer.toString(yearvar1);
            e_date=(datev1+"/"+monthv1+"/"+yearv1);
            //make sure all fields have data
            if(c_id==null | c_name==null | c_desc==null | s_date==null | e_date==null) //fields missing
            {
                JOptionPane.showMessageDialog(this,"Please insert data in all fields");
            }
            else        //check if course in table
            {
                courseid = Integer.parseInt(c_id);
                PreparedStatement ps1 = con.prepareStatement("select * from course where courseid= ?;");
                ps1.setInt(1,courseid);
                ResultSet r3 = ps1.executeQuery();
                if(r3.next())           //course exists in table can update
                {
                    PreparedStatement p1 = con.prepareStatement("update course set course_name=?,start=?,end=?,description=? where courseid=?;");
                    p1.setString(1,c_name);
                    p1.setString(2,s_date);
                    p1.setString(3,e_date);
                    p1.setString(4,c_desc);
                    p1.setInt(5,courseid);
                    int r = p1.executeUpdate();
                    if(r > 0)
                    {
                        JOptionPane.showMessageDialog(this,"Course updated  successfully!");
                        view_all_courses();
                    } 
                }
                else                    //course not in table. Can be inserted
                {
                    JOptionPane.showMessageDialog(this,"Courseid not valid!");    
                        
                }   
            }
            set_null();
     }
    
    catch (SQLException ex)
    {
           Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println(ex.getMessage());    
    }
    catch(HeadlessException e)
    {
        System.out.println(e.getMessage());    
    }
     catch (NullPointerException e){
        JOptionPane.showMessageDialog(this,"Enter values in all fields!");
     }
     catch (NumberFormatException nfe) {
                 System.out.println(nfe.getMessage());    
      JOptionPane.showMessageDialog(this,"Courseid should be int value!");
    }// TODO add your handling code here:
    }//GEN-LAST:event_update_courseActionPerformed

    private void insert_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_courseActionPerformed
     try
     {           //check if user has admin privelege
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Kshitija123!");
        PreparedStatement ps = con.prepareStatement("select * from user where name= ?;");
        ps.setString(1,uname);
        ResultSet rs = ps.executeQuery();
        if(rs.next())                                //if select query returns a row check if this user is admin
        {
            boolean flag=rs.getBoolean("is_admin"); //tells if user is_admin
            if(flag!=true)                          //user is not admin
            {
                JOptionPane.showMessageDialog(this,"Cannot insert a course! Admin privelege required");
            }
            else                                    //user is admin
            {
                int courseid;
                String c_name,s_date,e_date,c_desc,c_id;
                c_id=cid.getText();
                c_name=cname.getText();
                c_desc=desc.getText();
                Calendar cal = sdate.getCalendar();
                int datevar = cal.get(Calendar.DATE);int monthvar = cal.get(Calendar.MONTH);int yearvar = cal.get(Calendar.YEAR);
                String datev = Integer.toString(datevar);String monthv = Integer.toString(monthvar);String yearv= Integer.toString(yearvar);
                s_date=(datev+"/"+monthv+"/"+yearv);
                Calendar cal1 = edate.getCalendar();
                int datevar1 = cal1.get(Calendar.DATE);int monthvar1 = cal1.get(Calendar.MONTH);int yearvar1= cal1.get(Calendar.YEAR);
                String datev1 = Integer.toString(datevar1);String monthv1 = Integer.toString(monthvar1);String yearv1= Integer.toString(yearvar1);
                e_date=(datev1+"/"+monthv1+"/"+yearv1);
                //make sure all fields have data
                if(c_id==null | c_name==null | c_desc==null | s_date==null | e_date==null) //fields missing
                {
                    JOptionPane.showMessageDialog(this,"Please insert data in all fields");
                }
                else        //check if course already in table
                {
                    courseid = Integer.parseInt(c_id);
                    PreparedStatement ps1 = con.prepareStatement("select * from course where courseid= ?;");
                    ps1.setInt(1,courseid);
                    ResultSet r3 = ps1.executeQuery();
                    if(r3.next())           //course exists in table
                    {
                            JOptionPane.showMessageDialog(this,"Course already exists!");
                    }
                    else                    //course not in table. Can be inserted
                    {
                        PreparedStatement p1 = con.prepareStatement("insert into course values (?,?,?,?,?);");
                        p1.setInt(1,courseid);
                        p1.setString(2,c_name);
                        p1.setString(3,s_date);
                        p1.setString(4,e_date);
                        p1.setString(5,c_desc);
                        int r = p1.executeUpdate();
                        if(r > 0)
                        {
                            JOptionPane.showMessageDialog(this,"Course added successfully!");
                            view_all_courses();
                        } 
                        
                    }   
                }
            }
        }
       set_null(); 
     }
    
    catch (SQLException ex)
    {
           Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println(ex.getMessage());    
    }
    catch(HeadlessException e)
    {
        System.out.println(e.getMessage());    
    }
     catch (NullPointerException e){
        JOptionPane.showMessageDialog(this,"Enter values in all fields!");
     }
     catch (NumberFormatException nfe) {
                 System.out.println(nfe.getMessage());    
      JOptionPane.showMessageDialog(this,"Courseid should be int value!");
        }
    }//GEN-LAST:event_insert_courseActionPerformed

    
    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        JOptionPane.showMessageDialog(this,"Bye!");
        //System.exit(0);
        
        SignIn si = new SignIn();
        si.setVisible(true);
        this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_log_outActionPerformed

    private void remove_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_courseActionPerformed
        try
        {           //check if user has admin privelege
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","Kshitija123!");
            PreparedStatement ps = con.prepareStatement("select * from user where name= ?;");
            ps.setString(1,uname);
            ResultSet rs = ps.executeQuery();
            if(rs.next())                                //if select query returns a row check if this user is admin
            {
                boolean flag=rs.getBoolean("is_admin"); //tells if user is_admin
                if(flag!=true)                          //user is not admin
                {
                    JOptionPane.showMessageDialog(this,"Cannot delete a course! Admin privelege required");
                }
                else                                    //user is admin
                {
                    int courseid;
                    String c_id;
                    c_id=cid.getText();
                    //make sure user enters courseid
                    if(c_id==null) //fields missing
                    {
                        JOptionPane.showMessageDialog(this,"Please insert valid courseid");
                    }
                    else        //check if course in table
                    {
                        courseid = Integer.parseInt(c_id);
                        PreparedStatement ps1 = con.prepareStatement("select * from course where courseid= ?;");
                        ps1.setInt(1,courseid);
                        ResultSet r3 = ps1.executeQuery();
                        if(r3.next())           //course exists in table
                        {
                            PreparedStatement p1 = con.prepareStatement("delete from course where courseid=?;");
                            p1.setInt(1,courseid);
                            int r = p1.executeUpdate();
                            if(r > 0)
                            {
                                JOptionPane.showMessageDialog(this,"Course deleted successfully!");
                                view_all_courses();
                            } 
                        }
                        else                    //course not in table
                        {
                            JOptionPane.showMessageDialog(this,"Course doesnt exist!");
                            view_all_courses(); 
                        }   
                    }
                }
            }
        set_null();
        }
    catch (SQLException ex)
    {
           Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println(ex.getMessage());    
    }
    catch(HeadlessException e)
    {
        System.out.println(e.getMessage());    
    }
     catch (NullPointerException e){
        JOptionPane.showMessageDialog(this,"Enter values in all fields!");
     }
     catch (NumberFormatException nfe) {
                 System.out.println(nfe.getMessage());    
      JOptionPane.showMessageDialog(this,"Courseid should be int value!");
    }
                                        
        // TODO add your handling code here:
    }//GEN-LAST:event_remove_courseActionPerformed

  
     
                                                 

    
   
   
    /**
     * @param args the command line arguments
     */
     public static String uname; 
    public static void main(String args[]) {
       uname=args[0];
       /* Create and display the form 
       / java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Courses().setVisible(true);

            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cid;
    private javax.swing.JTextField cname;
    private javax.swing.JTable coursetable;
    private javax.swing.JTextArea desc;
    private com.toedter.calendar.JDateChooser edate;
    private javax.swing.JButton insert_course;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton log_out;
    private javax.swing.JButton remove_course;
    private com.toedter.calendar.JDateChooser sdate;
    private javax.swing.JButton update_course;
    private javax.swing.JButton view_all;
    // End of variables declaration//GEN-END:variables

}