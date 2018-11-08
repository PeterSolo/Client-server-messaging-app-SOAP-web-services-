/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;



import chatTransfer.ThreadBean;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import UserInterface.SessionClass;

/**
 *
 * @author w1597188
 */
public class threadsPage extends javax.swing.JFrame {

    /**
     * Creates new form threadsPage
     */
    public threadsPage() {
        
        initComponents();
        warning.setVisible(false);
        dataAcceptor();
    }
     public static void main(String[] args){
    threadsPage test = new  threadsPage();
    test.setVisible(true);
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        editSelectedButton = new javax.swing.JButton();
        createNewButton = new javax.swing.JButton();
        threadIdTxtField = new javax.swing.JTextField();
        warning = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thread Select page");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Title", "Last Editor", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        editSelectedButton.setBackground(new java.awt.Color(102, 204, 255));
        editSelectedButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        editSelectedButton.setText("Edit Selected");
        editSelectedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSelectedButtonActionPerformed(evt);
            }
        });

        createNewButton.setBackground(new java.awt.Color(102, 204, 255));
        createNewButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        createNewButton.setText("Create New");
        createNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewButtonActionPerformed(evt);
            }
        });

        warning.setForeground(new java.awt.Color(255, 0, 0));
        warning.setText("Please enter Id");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(createNewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(editSelectedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(threadIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(threadIdTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createNewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editSelectedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        logoutBtn.setBackground(new java.awt.Color(102, 204, 255));
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutBtn)
                .addGap(11, 11, 11))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editSelectedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSelectedButtonActionPerformed
         //String text=threadIdTxtField.getText();
        if(threadIdTxtField.getText().equals("")){
            warning.setVisible(true);
         }else{
        SessionClass.currentThreadId=Integer.parseInt(threadIdTxtField.getText());
         editThreadPage page = new editThreadPage();
         this.setVisible(false);
         page.setVisible(true);
         }
    }//GEN-LAST:event_editSelectedButtonActionPerformed

    private void createNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewButtonActionPerformed
       addThread page = new addThread();
       this.setVisible(false);
       page.setVisible(true);
    }//GEN-LAST:event_createNewButtonActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        LoginPage page = new LoginPage();
        this.setVisible(false);
        page.setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed
   
    // data acceptor

 public void dataAcceptor(){
  List<ThreadBean> array = new ArrayList<ThreadBean>();
  array=getThreads();
  int n = array.size();
  SessionClass.sessionArray=array;
  populateTable(array,n);
 
 }    
    
    
   // row populator method
    public void populateTable(List<ThreadBean> array, int n){
    DefaultTableModel populate = (DefaultTableModel) jTable2.getModel();
    for(int i=0;i<n;i++){
    
    String[] data={Integer.toString(array.get(i).getThreadId()),array.get(i).getTitle(),array.get(i).getLastPersonEditor(),array.get(i).getDate()};
    populate.addRow(data);
    }
    }
        
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createNewButton;
    private javax.swing.JButton editSelectedButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTextField threadIdTxtField;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables

    private static java.util.List<chatTransfer.ThreadBean> getThreads() {
        chatTransfer.ChatTransmissionService_Service service = new chatTransfer.ChatTransmissionService_Service();
        chatTransfer.ChatTransmissionService port = service.getChatTransmissionServicePort();
        return port.getThreads();
    }


   




}
