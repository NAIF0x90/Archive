/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archive;

import Objects.Expensses;
import Objects.EMP_INFO;
import Objects.DataBaseManger;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Mohammed
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
      
    
    private DataBaseManger data;
    private int Authorize;
    private int Cloumn;
    private  ImageLabel image;
    private String M_font;// = getClass().getClassLoader().getResource("res/M.ttf").toString();
    private String Doc; // = getClass().getClassLoader().getResource("res/Doc.png").toString();

    
    public home(DataBaseManger data , int authorize) {
        initComponents();
        
        
        M_font = getClass().getClassLoader().getResource("res/M.ttf").getFile();
        Doc = getClass().getClassLoader().getResource("res/Doc.png").getFile();
        
        this.setAutoRequestFocus(true);
        this.setLocationRelativeTo(null);  // *** this will center your app ***
        
        String pathToImageSortBy = "res/icon.png";
        ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource(pathToImageSortBy));
        this.setIconImage(img.getImage());   
    
        ImageIcon BackGround = new ImageIcon(getClass().getClassLoader().getResource("res/home.jpg"));
        
        image = new ImageLabel("");
        image.setIcon(BackGround);
        image.setBounds(navHome1.getBounds());
        navHome1.add(image);
        
        navHome1.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {
                
                image.setIcon(BackGround);
                image.setBounds(navHome1.getBounds());
                navHome1.add(image);
                navHome1.repaint();
                
            }

            @Override
            public void componentMoved(ComponentEvent e) {
            }

            @Override
            public void componentShown(ComponentEvent e) {
            }

            @Override
            public void componentHidden(ComponentEvent e) {
            }
        });
        
        
        this.data = data;
        this.Authorize = authorize;

        
        UpdateData();
     
    }


    private void UpdateData(){
        
    data = new DataBaseManger();
        
        DefaultTableModel model = new DefaultTableModel() {

    @Override
    public boolean isCellEditable(int row, int column) {
       //all cells false
       return false;
    }
}; 
         EmpTable.setModel(model);

        // Create a couple of columns 
        model.addColumn("الجوال");
        model.addColumn("رقم الهوية");
        model.addColumn("الاسم"); 
          
        for (int i = 0; i < data.getSize(); i++) {
        // Append a row 
        model.addRow(new Object[]{data.getinfo(i).getPhone(), data.getinfo(i).getID() , data.getinfo(i).getName()});

        }

        for(int i = 0; i< EmpTable.getColumnCount(); i++){
            
                    
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        EmpTable.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
        }
        
        
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) EmpTable.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(0);
        
        
        
        DefaultTableModel Emodel = new DefaultTableModel() {

       @Override
       public boolean isCellEditable(int row, int column) {
          //all cells false
          return false;
          }
             }; 
         ExpensesTable.setModel(Emodel);

        // Create a couple of columns 
        Emodel.addColumn("الشركة ");
        Emodel.addColumn("الاسم"); 
        
        for (int i = 0; i < data.getExpSize(); i++) {
        Emodel.addRow(new Object[] {data.getExp(i).getCompany() , data.getExp(i).getName()});
        

                }
        
        
        renderer = (DefaultTableCellRenderer) ExpensesTable.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(0);
        
                for(int i = 0; i < 2; i++){
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        ExpensesTable.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
            
        }
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nav1 = new javax.swing.JPanel();
        home = new javax.swing.JButton();
        employee = new javax.swing.JButton();
        expenses = new javax.swing.JButton();
        progz = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        nav2 = new javax.swing.JPanel();
        navHome1 = new javax.swing.JPanel();
        navExpensesH1 = new javax.swing.JPanel();
        navExpansesH = new javax.swing.JPanel();
        navEmpHead = new javax.swing.JLabel();
        ExpAdd1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        ExpensesTable = new javax.swing.JTable();
        navEmployeeH = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        EmpAdd = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        EmpTable = new javax.swing.JTable();
        navProgz = new javax.swing.JPanel();
        farsbutton = new javax.swing.JButton();
        moebutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        norbutton = new javax.swing.JButton();
        navEmployeeAdd = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        NummberE = new javax.swing.JTextField();
        NameE = new javax.swing.JTextField();
        EmailE = new javax.swing.JTextField();
        MissionE = new javax.swing.JTextField();
        PerfE = new javax.swing.JTextField();
        RegiE = new javax.swing.JTextField();
        SaveEmp = new javax.swing.JButton();
        cancelEmp = new javax.swing.JButton();
        navEmployee = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmpInfo = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        PrintEM = new javax.swing.JButton();
        cancelEm = new javax.swing.JButton();
        EditEm = new javax.swing.JButton();
        DelEm = new javax.swing.JButton();
        navExpensesِAdd = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        Count = new javax.swing.JLabel();
        Model = new javax.swing.JLabel();
        SerNum = new javax.swing.JLabel();
        CompN = new javax.swing.JLabel();
        other = new javax.swing.JLabel();
        SerNum2 = new javax.swing.JTextField();
        Count2 = new javax.swing.JTextField();
        CompN2 = new javax.swing.JTextField();
        MissionE2 = new javax.swing.JTextField();
        Model2 = new javax.swing.JTextField();
        SaveExp2 = new javax.swing.JButton();
        cancelExp2 = new javax.swing.JButton();
        Name = new javax.swing.JLabel();
        Name2 = new javax.swing.JTextField();
        navExpensesِ = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ExpShow = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        cancelExp = new javax.swing.JButton();
        EditEx = new javax.swing.JButton();
        DelEx = new javax.swing.JButton();
        navExpensesِEdit = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        Count1 = new javax.swing.JLabel();
        Model1 = new javax.swing.JLabel();
        SerNum1 = new javax.swing.JLabel();
        CompN1 = new javax.swing.JLabel();
        other1 = new javax.swing.JLabel();
        Count3 = new javax.swing.JTextField();
        CompN3 = new javax.swing.JTextField();
        MissionE3 = new javax.swing.JTextField();
        Model3 = new javax.swing.JTextField();
        SaveExp3 = new javax.swing.JButton();
        cancelExp3 = new javax.swing.JButton();
        Name1 = new javax.swing.JLabel();
        Name3 = new javax.swing.JTextField();
        SerN = new javax.swing.JLabel();
        navEmployeeEdit = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        NummberE1 = new javax.swing.JTextField();
        NameE1 = new javax.swing.JTextField();
        EmailE1 = new javax.swing.JTextField();
        MissionE1 = new javax.swing.JTextField();
        PerfE1 = new javax.swing.JTextField();
        SaveEmp1 = new javax.swing.JButton();
        cancelEmp1 = new javax.swing.JButton();
        ID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ارشيف");
        setIconImages(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nav1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        home.setBackground(new java.awt.Color(102, 204, 255));
        home.setFont(new java.awt.Font("AdvertisingBold", 0, 11)); // NOI18N
        home.setText("الرئيسية");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        employee.setBackground(new java.awt.Color(102, 204, 255));
        employee.setFont(new java.awt.Font("AdvertisingBold", 0, 11)); // NOI18N
        employee.setText("الموظفين");
        employee.setMaximumSize(new java.awt.Dimension(73, 23));
        employee.setMinimumSize(new java.awt.Dimension(73, 23));
        employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeActionPerformed(evt);
            }
        });

        expenses.setBackground(new java.awt.Color(102, 204, 255));
        expenses.setFont(new java.awt.Font("AdvertisingBold", 0, 11)); // NOI18N
        expenses.setText("مصروفات القسم");
        expenses.setMaximumSize(new java.awt.Dimension(73, 23));
        expenses.setMinimumSize(new java.awt.Dimension(73, 23));
        expenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expensesActionPerformed(evt);
            }
        });

        progz.setBackground(new java.awt.Color(102, 204, 255));
        progz.setFont(new java.awt.Font("AdvertisingBold", 0, 11)); // NOI18N
        progz.setText("البرامج الخاصة بالقسم");
        progz.setMaximumSize(new java.awt.Dimension(73, 23));
        progz.setMinimumSize(new java.awt.Dimension(73, 23));
        progz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progzActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/logo.png"))); // NOI18N

        jLabel32.setBackground(new java.awt.Color(51, 51, 51));
        jLabel32.setFont(new java.awt.Font("AdvertisingBold", 0, 10)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText(" تنفيذ وبرمجة: نايف محسن , محمد هندي ");
        jLabel32.setOpaque(true);

        javax.swing.GroupLayout nav1Layout = new javax.swing.GroupLayout(nav1);
        nav1.setLayout(nav1Layout);
        nav1Layout.setHorizontalGroup(
            nav1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nav1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nav1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(progz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(expenses, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(employee, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        nav1Layout.setVerticalGroup(
            nav1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nav1Layout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(employee, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(expenses, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(progz, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32))
        );

        nav2.setBackground(new java.awt.Color(255, 255, 255));
        nav2.setLayout(new java.awt.CardLayout());

        navHome1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout navHome1Layout = new javax.swing.GroupLayout(navHome1);
        navHome1.setLayout(navHome1Layout);
        navHome1Layout.setHorizontalGroup(
            navHome1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 691, Short.MAX_VALUE)
        );
        navHome1Layout.setVerticalGroup(
            navHome1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
        );

        nav2.add(navHome1, "card2");

        navExpensesH1.setBackground(new java.awt.Color(255, 255, 255));

        navExpansesH.setBackground(new java.awt.Color(255, 255, 255));

        navEmpHead.setFont(new java.awt.Font("AdvertisingBold", 0, 14)); // NOI18N
        navEmpHead.setText("مصروفات القسم");

        ExpAdd1.setBackground(new java.awt.Color(102, 204, 255));
        ExpAdd1.setFont(new java.awt.Font("AdvertisingBold", 0, 10)); // NOI18N
        ExpAdd1.setText("اضافة جديد");
        ExpAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpAdd1ActionPerformed(evt);
            }
        });

        ExpensesTable.setFont(new java.awt.Font("AdvertisingBold", 0, 12)); // NOI18N
        ExpensesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        ExpensesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExpensesTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(ExpensesTable);

        javax.swing.GroupLayout navExpansesHLayout = new javax.swing.GroupLayout(navExpansesH);
        navExpansesH.setLayout(navExpansesHLayout);
        navExpansesHLayout.setHorizontalGroup(
            navExpansesHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navExpansesHLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(navExpansesHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navExpansesHLayout.createSequentialGroup()
                        .addComponent(ExpAdd1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navExpansesHLayout.createSequentialGroup()
                        .addComponent(navEmpHead)
                        .addGap(143, 143, 143))))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );
        navExpansesHLayout.setVerticalGroup(
            navExpansesHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navExpansesHLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(navEmpHead)
                .addGap(18, 18, 18)
                .addComponent(ExpAdd1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout navExpensesH1Layout = new javax.swing.GroupLayout(navExpensesH1);
        navExpensesH1.setLayout(navExpensesH1Layout);
        navExpensesH1Layout.setHorizontalGroup(
            navExpensesH1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 691, Short.MAX_VALUE)
            .addGroup(navExpensesH1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(navExpensesH1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(navExpansesH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        navExpensesH1Layout.setVerticalGroup(
            navExpensesH1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 714, Short.MAX_VALUE)
            .addGroup(navExpensesH1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(navExpensesH1Layout.createSequentialGroup()
                    .addComponent(navExpansesH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        nav2.add(navExpensesH1, "card2");

        navEmployeeH.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("AdvertisingBold", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("موظفين القسم");

        EmpAdd.setBackground(new java.awt.Color(102, 204, 255));
        EmpAdd.setFont(new java.awt.Font("AdvertisingBold", 0, 10)); // NOI18N
        EmpAdd.setText("إضافة موظف");
        EmpAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpAddActionPerformed(evt);
            }
        });

        EmpTable.setFont(new java.awt.Font("AdvertisingBold", 0, 12)); // NOI18N
        EmpTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, ""},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        EmpTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(EmpTable);

        javax.swing.GroupLayout navEmployeeHLayout = new javax.swing.GroupLayout(navEmployeeH);
        navEmployeeH.setLayout(navEmployeeHLayout);
        navEmployeeHLayout.setHorizontalGroup(
            navEmployeeHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navEmployeeHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navEmployeeHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navEmployeeHLayout.createSequentialGroup()
                        .addGap(0, 584, Short.MAX_VALUE)
                        .addComponent(EmpAdd))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navEmployeeHLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(293, 293, 293))
        );
        navEmployeeHLayout.setVerticalGroup(
            navEmployeeHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navEmployeeHLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmpAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                .addContainerGap())
        );

        nav2.add(navEmployeeH, "card2");

        navProgz.setBackground(new java.awt.Color(255, 255, 255));

        farsbutton.setBackground(new java.awt.Color(102, 204, 255));
        farsbutton.setText("فتح في المتصفح");
        farsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farsbuttonActionPerformed(evt);
            }
        });

        moebutton.setBackground(new java.awt.Color(102, 204, 255));
        moebutton.setText("فتح في المتصفح");
        moebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moebuttonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("AdvertisingBold", 0, 12)); // NOI18N
        jLabel1.setText("نظام نور");

        jLabel2.setFont(new java.awt.Font("AdvertisingBold", 0, 12)); // NOI18N
        jLabel2.setText("نظام فارس");

        jLabel3.setFont(new java.awt.Font("AdvertisingBold", 0, 14)); // NOI18N
        jLabel3.setText("البرامج الخاصة بقسم تقنية المعلومات");

        jLabel6.setFont(new java.awt.Font("AdvertisingBold", 0, 12)); // NOI18N
        jLabel6.setText("بوابة الوزارة");

        norbutton.setBackground(new java.awt.Color(102, 204, 255));
        norbutton.setText("فتح في المتصفح");
        norbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                norbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navProgzLayout = new javax.swing.GroupLayout(navProgz);
        navProgz.setLayout(navProgzLayout);
        navProgzLayout.setHorizontalGroup(
            navProgzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navProgzLayout.createSequentialGroup()
                .addContainerGap(400, Short.MAX_VALUE)
                .addGroup(navProgzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navProgzLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navProgzLayout.createSequentialGroup()
                        .addGroup(navProgzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(moebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(norbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(farsbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(navProgzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(78, 78, 78))))
        );
        navProgzLayout.setVerticalGroup(
            navProgzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navProgzLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addGroup(navProgzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(moebutton))
                .addGap(9, 9, 9)
                .addGroup(navProgzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(norbutton))
                .addGap(9, 9, 9)
                .addGroup(navProgzLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(farsbutton))
                .addContainerGap(510, Short.MAX_VALUE))
        );

        nav2.add(navProgz, "card2");

        navEmployeeAdd.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("AdvertisingBold", 0, 18)); // NOI18N
        jLabel11.setText("إضافة موظف");

        jLabel12.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        jLabel12.setText("الاسم ");

        jLabel13.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        jLabel13.setText("السجل المدني");

        jLabel14.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        jLabel14.setText("رقم الجوال");

        jLabel15.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        jLabel15.setText("البريد الالكتروني");

        jLabel16.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        jLabel16.setText("المهمة في القسم");

        jLabel17.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        jLabel17.setText("المسمى الوظيفي");

        NameE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameEActionPerformed(evt);
            }
        });

        SaveEmp.setBackground(new java.awt.Color(102, 204, 255));
        SaveEmp.setFont(new java.awt.Font("AdvertisingBold", 0, 12)); // NOI18N
        SaveEmp.setText("حفظ");
        SaveEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveEmpActionPerformed(evt);
            }
        });

        cancelEmp.setBackground(new java.awt.Color(102, 204, 255));
        cancelEmp.setFont(new java.awt.Font("AdvertisingBold", 0, 12)); // NOI18N
        cancelEmp.setText("الغاء");
        cancelEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navEmployeeAddLayout = new javax.swing.GroupLayout(navEmployeeAdd);
        navEmployeeAdd.setLayout(navEmployeeAddLayout);
        navEmployeeAddLayout.setHorizontalGroup(
            navEmployeeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navEmployeeAddLayout.createSequentialGroup()
                .addContainerGap(369, Short.MAX_VALUE)
                .addGroup(navEmployeeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navEmployeeAddLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navEmployeeAddLayout.createSequentialGroup()
                        .addGroup(navEmployeeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(navEmployeeAddLayout.createSequentialGroup()
                                .addComponent(cancelEmp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SaveEmp))
                            .addComponent(NummberE, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PerfE, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MissionE, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailE, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameE, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RegiE, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(navEmployeeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(25, 25, 25))))
        );
        navEmployeeAddLayout.setVerticalGroup(
            navEmployeeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navEmployeeAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(navEmployeeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(NameE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(navEmployeeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(RegiE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(navEmployeeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(NummberE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(navEmployeeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(EmailE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(navEmployeeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(MissionE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(navEmployeeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(PerfE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(navEmployeeAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveEmp)
                    .addComponent(cancelEmp))
                .addContainerGap(378, Short.MAX_VALUE))
        );

        nav2.add(navEmployeeAdd, "card2");

        navEmployee.setBackground(new java.awt.Color(255, 255, 255));

        EmpInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        EmpInfo.setFont(new java.awt.Font("AdvertisingBold", 0, 12)); // NOI18N
        EmpInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "الاسم"},
                {null, "السجل المدني"},
                {null, "رقم الجوال"},
                {null, "البريد الالكتروني"},
                {null, "المهمه في القسم"},
                {null, "الاداء الوظيفي"},
                {null, "نسبة انجاز العمل"}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        EmpInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(EmpInfo);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/logo.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("AdvertisingBold", 0, 12)); // NOI18N
        jLabel20.setText("ادارة التعليم بمحافظة عفيف - قسم تقنية المعلومات");

        jLabel21.setFont(new java.awt.Font("AdvertisingBold", 0, 11)); // NOI18N
        jLabel21.setText("إستعلام عن موظف بالقسم");

        PrintEM.setBackground(new java.awt.Color(102, 204, 255));
        PrintEM.setFont(new java.awt.Font("AdvertisingBold", 0, 11)); // NOI18N
        PrintEM.setText("طباعة");
        PrintEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintEMActionPerformed(evt);
            }
        });

        cancelEm.setBackground(new java.awt.Color(102, 204, 255));
        cancelEm.setFont(new java.awt.Font("AdvertisingBold", 0, 11)); // NOI18N
        cancelEm.setText("رجوع");
        cancelEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelEmActionPerformed(evt);
            }
        });

        EditEm.setBackground(new java.awt.Color(102, 204, 255));
        EditEm.setFont(new java.awt.Font("AdvertisingBold", 0, 11)); // NOI18N
        EditEm.setText("تعديل");
        EditEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditEmActionPerformed(evt);
            }
        });

        DelEm.setBackground(new java.awt.Color(102, 204, 255));
        DelEm.setFont(new java.awt.Font("AdvertisingBold", 0, 11)); // NOI18N
        DelEm.setText("حذف");
        DelEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelEmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navEmployeeLayout = new javax.swing.GroupLayout(navEmployee);
        navEmployee.setLayout(navEmployeeLayout);
        navEmployeeLayout.setHorizontalGroup(
            navEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navEmployeeLayout.createSequentialGroup()
                .addGroup(navEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navEmployeeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE))
                    .addGroup(navEmployeeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PrintEM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelEm)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navEmployeeLayout.createSequentialGroup()
                        .addComponent(DelEm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EditEm)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navEmployeeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(navEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navEmployeeLayout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(78, 78, 78))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navEmployeeLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(146, 146, 146))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navEmployeeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(244, 244, 244))
        );
        navEmployeeLayout.setVerticalGroup(
            navEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navEmployeeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addGap(13, 13, 13)
                .addGroup(navEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditEm)
                    .addComponent(DelEm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(navEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PrintEM)
                    .addComponent(cancelEm))
                .addGap(219, 219, 219))
        );

        nav2.add(navEmployee, "card2");

        navExpensesِAdd.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("AdvertisingBold", 0, 18)); // NOI18N
        title.setText("اضافة مصروفات");

        Count.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        Count.setText("العدد ");

        Model.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        Model.setText("الموديل");

        SerNum.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        SerNum.setText("الرقم التسلسلي");

        CompN.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        CompN.setText("نوع الشركة");

        other.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        other.setText("اخرى");

        SerNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SerNum2ActionPerformed(evt);
            }
        });

        SaveExp2.setBackground(new java.awt.Color(102, 204, 255));
        SaveExp2.setFont(new java.awt.Font("AdvertisingBold", 0, 12)); // NOI18N
        SaveExp2.setText("حفظ");
        SaveExp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveExp2ActionPerformed(evt);
            }
        });

        cancelExp2.setBackground(new java.awt.Color(102, 204, 255));
        cancelExp2.setFont(new java.awt.Font("AdvertisingBold", 0, 12)); // NOI18N
        cancelExp2.setText("الغاء");
        cancelExp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelExp2ActionPerformed(evt);
            }
        });

        Name.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        Name.setText("الاسم");

        javax.swing.GroupLayout navExpensesِAddLayout = new javax.swing.GroupLayout(navExpensesِAdd);
        navExpensesِAdd.setLayout(navExpensesِAddLayout);
        navExpensesِAddLayout.setHorizontalGroup(
            navExpensesِAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navExpensesِAddLayout.createSequentialGroup()
                .addContainerGap(383, Short.MAX_VALUE)
                .addGroup(navExpensesِAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navExpensesِAddLayout.createSequentialGroup()
                        .addGroup(navExpensesِAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SerNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MissionE2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CompN2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Count2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Model2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(navExpensesِAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Count)
                            .addComponent(SerNum)
                            .addComponent(Model)
                            .addComponent(CompN)
                            .addComponent(other)
                            .addComponent(Name))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navExpensesِAddLayout.createSequentialGroup()
                        .addComponent(cancelExp2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SaveExp2)
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navExpensesِAddLayout.createSequentialGroup()
                        .addComponent(title)
                        .addGap(145, 145, 145))))
        );
        navExpensesِAddLayout.setVerticalGroup(
            navExpensesِAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navExpensesِAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(title)
                .addGroup(navExpensesِAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navExpensesِAddLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Name))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navExpensesِAddLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Name2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(navExpensesِAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Count)
                    .addComponent(Count2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(navExpensesِAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Model)
                    .addComponent(Model2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(navExpensesِAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SerNum)
                    .addComponent(SerNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(navExpensesِAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CompN)
                    .addComponent(CompN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(navExpensesِAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(other)
                    .addComponent(MissionE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(navExpensesِAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelExp2)
                    .addComponent(SaveExp2))
                .addContainerGap(345, Short.MAX_VALUE))
        );

        nav2.add(navExpensesِAdd, "card2");

        navExpensesِ.setBackground(new java.awt.Color(255, 255, 255));

        ExpShow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ExpShow.setFont(new java.awt.Font("AdvertisingBold", 0, 12)); // NOI18N
        ExpShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "العدد"},
                {null, "الموديل"},
                {null, "نوع الشركة"},
                {null, "الرقم التسلسلي"},
                {null, "اخرى"}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        ExpShow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ExpShow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExpShowMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ExpShow);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/logo.png"))); // NOI18N

        jLabel30.setFont(new java.awt.Font("AdvertisingBold", 0, 12)); // NOI18N
        jLabel30.setText("ادارة التعليم بمحافظة عفيف - قسم تقنية المعلومات");

        jLabel31.setFont(new java.awt.Font("AdvertisingBold", 0, 11)); // NOI18N
        jLabel31.setText("إستعلام عن المصروفات");

        jButton4.setBackground(new java.awt.Color(102, 204, 255));
        jButton4.setFont(new java.awt.Font("AdvertisingBold", 0, 11)); // NOI18N
        jButton4.setText("طباعة");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cancelExp.setBackground(new java.awt.Color(102, 204, 255));
        cancelExp.setFont(new java.awt.Font("AdvertisingBold", 0, 11)); // NOI18N
        cancelExp.setText("رجوع");
        cancelExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelExpActionPerformed(evt);
            }
        });

        EditEx.setBackground(new java.awt.Color(102, 204, 255));
        EditEx.setFont(new java.awt.Font("AdvertisingBold", 0, 11)); // NOI18N
        EditEx.setText("تعديل");
        EditEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditExActionPerformed(evt);
            }
        });

        DelEx.setBackground(new java.awt.Color(102, 204, 255));
        DelEx.setFont(new java.awt.Font("AdvertisingBold", 0, 11)); // NOI18N
        DelEx.setText("حذف");
        DelEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelExActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navExpensesِLayout = new javax.swing.GroupLayout(navExpensesِ);
        navExpensesِ.setLayout(navExpensesِLayout);
        navExpensesِLayout.setHorizontalGroup(
            navExpensesِLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navExpensesِLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(navExpensesِLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navExpensesِLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(navExpensesِLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navExpensesِLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(78, 78, 78))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navExpensesِLayout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addGap(146, 146, 146))))
                    .addGroup(navExpensesِLayout.createSequentialGroup()
                        .addGroup(navExpensesِLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                            .addGroup(navExpensesِLayout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelExp))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navExpensesِLayout.createSequentialGroup()
                                .addComponent(DelEx)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EditEx)))
                        .addContainerGap())))
            .addGroup(navExpensesِLayout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabel29)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        navExpensesِLayout.setVerticalGroup(
            navExpensesِLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navExpensesِLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(navExpensesِLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditEx)
                    .addComponent(DelEx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(navExpensesِLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(cancelExp))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        nav2.add(navExpensesِ, "card2");

        navExpensesِEdit.setBackground(new java.awt.Color(255, 255, 255));

        title1.setFont(new java.awt.Font("AdvertisingBold", 0, 18)); // NOI18N
        title1.setText("تعديل مصروفات");

        Count1.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        Count1.setText("العدد ");

        Model1.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        Model1.setText("الموديل");

        SerNum1.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        SerNum1.setText("الرقم التسلسلي");

        CompN1.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        CompN1.setText("نوع الشركة");

        other1.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        other1.setText("اخرى");

        SaveExp3.setBackground(new java.awt.Color(102, 204, 255));
        SaveExp3.setFont(new java.awt.Font("AdvertisingBold", 0, 12)); // NOI18N
        SaveExp3.setText("حفظ");
        SaveExp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveExp3ActionPerformed(evt);
            }
        });

        cancelExp3.setBackground(new java.awt.Color(102, 204, 255));
        cancelExp3.setFont(new java.awt.Font("AdvertisingBold", 0, 12)); // NOI18N
        cancelExp3.setText("رجوع");
        cancelExp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelExp3ActionPerformed(evt);
            }
        });

        Name1.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        Name1.setText("الاسم");

        SerN.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        SerN.setText("الرقم التسلسلي");

        javax.swing.GroupLayout navExpensesِEditLayout = new javax.swing.GroupLayout(navExpensesِEdit);
        navExpensesِEdit.setLayout(navExpensesِEditLayout);
        navExpensesِEditLayout.setHorizontalGroup(
            navExpensesِEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navExpensesِEditLayout.createSequentialGroup()
                .addContainerGap(383, Short.MAX_VALUE)
                .addGroup(navExpensesِEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navExpensesِEditLayout.createSequentialGroup()
                        .addGroup(navExpensesِEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(MissionE3, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(CompN3, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(Count3, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(Model3, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(Name3, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(SerN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(navExpensesِEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Count1)
                            .addComponent(SerNum1)
                            .addComponent(Model1)
                            .addComponent(CompN1)
                            .addComponent(other1)
                            .addComponent(Name1))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navExpensesِEditLayout.createSequentialGroup()
                        .addComponent(cancelExp3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SaveExp3)
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navExpensesِEditLayout.createSequentialGroup()
                        .addComponent(title1)
                        .addGap(145, 145, 145))))
        );
        navExpensesِEditLayout.setVerticalGroup(
            navExpensesِEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navExpensesِEditLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(title1)
                .addGroup(navExpensesِEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navExpensesِEditLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Name1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navExpensesِEditLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Name3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(navExpensesِEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Count1)
                    .addComponent(Count3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(navExpensesِEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Model1)
                    .addComponent(Model3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(navExpensesِEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SerNum1)
                    .addComponent(SerN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(navExpensesِEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CompN1)
                    .addComponent(CompN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(navExpensesِEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(other1)
                    .addComponent(MissionE3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(navExpensesِEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelExp3)
                    .addComponent(SaveExp3))
                .addContainerGap(350, Short.MAX_VALUE))
        );

        nav2.add(navExpensesِEdit, "card2");

        navEmployeeEdit.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setFont(new java.awt.Font("AdvertisingBold", 0, 18)); // NOI18N
        jLabel23.setText("تعديل بيانات موظف");

        jLabel24.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        jLabel24.setText("الاسم ");

        jLabel25.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        jLabel25.setText("السجل المدني");

        jLabel26.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        jLabel26.setText("رقم الجوال");

        jLabel27.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        jLabel27.setText("البريد الالكتروني");

        jLabel28.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        jLabel28.setText("المهمة في القسم");

        jLabel33.setFont(new java.awt.Font("AdvertisingBold", 0, 16)); // NOI18N
        jLabel33.setText("المسمى الوظيفي");

        NameE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameE1ActionPerformed(evt);
            }
        });

        SaveEmp1.setBackground(new java.awt.Color(102, 204, 255));
        SaveEmp1.setFont(new java.awt.Font("AdvertisingBold", 0, 12)); // NOI18N
        SaveEmp1.setText("حفظ");
        SaveEmp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveEmp1ActionPerformed(evt);
            }
        });

        cancelEmp1.setBackground(new java.awt.Color(102, 204, 255));
        cancelEmp1.setFont(new java.awt.Font("AdvertisingBold", 0, 12)); // NOI18N
        cancelEmp1.setText("رجوع");
        cancelEmp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelEmp1ActionPerformed(evt);
            }
        });

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navEmployeeEditLayout = new javax.swing.GroupLayout(navEmployeeEdit);
        navEmployeeEdit.setLayout(navEmployeeEditLayout);
        navEmployeeEditLayout.setHorizontalGroup(
            navEmployeeEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navEmployeeEditLayout.createSequentialGroup()
                .addContainerGap(369, Short.MAX_VALUE)
                .addGroup(navEmployeeEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navEmployeeEditLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navEmployeeEditLayout.createSequentialGroup()
                        .addGroup(navEmployeeEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(navEmployeeEditLayout.createSequentialGroup()
                                .addGroup(navEmployeeEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(NummberE1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(PerfE1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(MissionE1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(EmailE1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(NameE1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                    .addComponent(ID))
                                .addGap(18, 18, 18)
                                .addGroup(navEmployeeEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel33)
                                    .addGroup(navEmployeeEditLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jLabel24))))
                            .addGroup(navEmployeeEditLayout.createSequentialGroup()
                                .addComponent(cancelEmp1)
                                .addGap(89, 89, 89)
                                .addComponent(SaveEmp1)))
                        .addGap(25, 25, 25))))
        );
        navEmployeeEditLayout.setVerticalGroup(
            navEmployeeEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navEmployeeEditLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addGroup(navEmployeeEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(NameE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(navEmployeeEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(navEmployeeEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(NummberE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(navEmployeeEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(EmailE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(navEmployeeEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(MissionE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(navEmployeeEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(PerfE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(navEmployeeEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveEmp1)
                    .addComponent(cancelEmp1))
                .addContainerGap(367, Short.MAX_VALUE))
        );

        nav2.add(navEmployeeEdit, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nav2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(nav1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nav1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nav2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelEmp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelEmp1ActionPerformed
        // TODO add your handling code here:
        nav2.removeAll();
        nav2.repaint();
        nav2.revalidate();
        //adding panel
        nav2.add(navEmployee);
        nav2.repaint();
        nav2.revalidate();
    }//GEN-LAST:event_cancelEmp1ActionPerformed

    private void SaveEmp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveEmp1ActionPerformed
        // TODO add your handling code here:
        
        EMP_INFO emp = new EMP_INFO();
        emp.setName(NameE1.getText());
        emp.setEmail(EmailE1.getText());
        emp.setJob(MissionE1.getText());
        emp.setSection(PerfE1.getText());
        emp.setPhone(NummberE1.getText());
        emp.setID(ID.getText());
        
        
        data.UpdateUser(emp);
        data.UpdateUserID(emp);
        UpdateData();

        ID.setText("");
        NameE1.setText("");
        EmailE1.setText("");
        MissionE1.setText("");
        PerfE1.setText("");
        NummberE1.setText("");
        

        
        nav2.removeAll();
        nav2.repaint();
        nav2.revalidate();
        //adding panel
        nav2.add(navEmployeeH);
        nav2.repaint();
        nav2.revalidate();
        
        JOptionPane.showMessageDialog(rootPane, "تم التعديل ");

    }//GEN-LAST:event_SaveEmp1ActionPerformed

    private void NameE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameE1ActionPerformed

    private void cancelExp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelExp3ActionPerformed
        nav2.removeAll();
        nav2.repaint();
        nav2.revalidate();
        //adding panel
        nav2.add(navExpensesِ);
        nav2.repaint();
        nav2.revalidate();
    }//GEN-LAST:event_cancelExp3ActionPerformed

    private void SaveExp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveExp3ActionPerformed
        // TODO add your handling code here:
        
        
        Expensses exp = new Expensses();
        exp.setCompany(CompN3.getText());
        exp.setModel(Model3.getText());
        exp.setName(Name3.getText());
        exp.setNumber(Count3.getText());
        exp.setSerial(SerN.getText());
        exp.setOther(other1.getText());
        
        Count3.setText("");
        other1.setText(""); 
        Name3.setText("");
        CompN3.setText("");
        Model3.setText("");
        
        data.UpdateExp(exp);
        
        
        UpdateData();
        
        nav2.removeAll();
        nav2.repaint();
        nav2.revalidate();
        //adding panel
        nav2.add(navExpensesِ);
        nav2.repaint();
        nav2.revalidate();
    }//GEN-LAST:event_SaveExp3ActionPerformed

    private void DelExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelExActionPerformed


    }//GEN-LAST:event_DelExActionPerformed

    private void EditExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditExActionPerformed


        Count3.setText(data.getExp(Cloumn).getNumber());
        other1.setText(data.getExp(Cloumn).getOther()); 
        Name3.setText(data.getExp(Cloumn).getName());
        CompN3.setText(data.getExp(Cloumn).getCompany());
        Model3.setText(data.getExp(Cloumn).getModel());
        SerN.setText(data.getExp(Cloumn).getSerial());


        nav2.removeAll();
        nav2.repaint();
        nav2.revalidate();
        //adding panel
        nav2.add(navExpensesِEdit);
        nav2.repaint();
        nav2.revalidate();

    }//GEN-LAST:event_EditExActionPerformed

    private void cancelExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelExpActionPerformed
        // TODO add your handling code here:
        nav2.removeAll();
        nav2.repaint();
        nav2.revalidate();
        //adding panel
        nav2.add(navExpansesH);
        nav2.repaint();
        nav2.revalidate();
    }//GEN-LAST:event_cancelExpActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        MessageFormat header = new MessageFormat ("res/heade.png");
        MessageFormat footer = new MessageFormat("report frint");
        try {
            ExpShow.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ExpShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExpShowMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ExpShowMouseClicked

    private void cancelExp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelExp2ActionPerformed
        // TODO add your handling code here:
        //remove panel
        nav2.removeAll();
        nav2.repaint();
        nav2.revalidate();
        //adding panel
        nav2.add(navExpansesH);
        nav2.repaint();
        nav2.revalidate();
    }//GEN-LAST:event_cancelExp2ActionPerformed

    private void SaveExp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveExp2ActionPerformed
        // TODO add your handling code here:

        Expensses exp = new Expensses();
        exp.setName(Name2.getText());
        exp.setNumber(Count2.getText());
        exp.setModel(Model2.getText());
        exp.setSerial(SerNum2.getText());
        exp.setCompany(CompN2.getText());
        exp.setOther(MissionE2.getText());

        data.AddExp(exp);

        Name2.setText("");
        Count2.setText("");
        Model2.setText("");
        SerNum2.setText("");
        CompN2.setText("");
        MissionE2.setText("");
            
        UpdateData();
        nav2.removeAll();
        nav2.repaint();
        nav2.revalidate();
        //adding panel
        nav2.add(navExpansesH);
        nav2.repaint();
        nav2.revalidate();

      
    }//GEN-LAST:event_SaveExp2ActionPerformed

    private void SerNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SerNum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SerNum2ActionPerformed

    private void DelEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelEmActionPerformed

                int i = JOptionPane.showConfirmDialog(rootPane, "هل انت متأكد من رغبتك بحذف بيانات الموظف ؟", "تحذير", 0, 0);
                if(i == 0){
                    UpdateData();
                    data.Delete(data.getinfo(Cloumn).getID());

                    UpdateData();
                    
                    nav2.removeAll();
                    nav2.repaint();
                    nav2.revalidate();
                    //adding panel
                    nav2.add(navEmployeeH);
                    nav2.repaint();
                    nav2.revalidate();

                    JOptionPane.showMessageDialog(rootPane, "تم حذف بيانات الموظف");
                }
        
    }//GEN-LAST:event_DelEmActionPerformed

    private void EditEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditEmActionPerformed
        
        
        ID.setText(data.getinfo(Cloumn).getID());
        NameE1.setText(data.getinfo(Cloumn).getName());
        EmailE1.setText(data.getinfo(Cloumn).getEmail());
        MissionE1.setText(data.getinfo(Cloumn).getJob());
        PerfE1.setText(data.getinfo(Cloumn).getSection());
        NummberE1.setText(data.getinfo(Cloumn).getPhone());
        
        nav2.removeAll();
        nav2.repaint();
        nav2.revalidate();
        //adding panel
        nav2.add(navEmployeeEdit);
        nav2.repaint();
        nav2.revalidate();
    }//GEN-LAST:event_EditEmActionPerformed

    private void cancelEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelEmActionPerformed
        // TODO add your handling code here:
        //remove panel
        nav2.removeAll();
        nav2.repaint();
        nav2.revalidate();
        //adding panel
        nav2.add(navEmployeeH);
        nav2.repaint();
        nav2.revalidate();
    }//GEN-LAST:event_cancelEmActionPerformed

    private void PrintEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintEMActionPerformed
        // TODO add your handling code here:
        
        Document doc = new Document(Doc, M_font);
        doc.PrintEmployeeInfo(data.getinfo(Cloumn));
        
    }//GEN-LAST:event_PrintEMActionPerformed

    private void cancelEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelEmpActionPerformed
        // TODO add your handling code here:
        //remove panel
        nav2.removeAll();
        nav2.repaint();
        nav2.revalidate();
        //adding panel
        nav2.add(navEmployeeH);
        nav2.repaint();
        nav2.revalidate();
    }//GEN-LAST:event_cancelEmpActionPerformed

    private void SaveEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveEmpActionPerformed
        // TODO add your handling code here:

        EMP_INFO emp = new EMP_INFO();
        emp.setName(NameE.getText());
        emp.setID(RegiE.getText());
        emp.setEmail(EmailE.getText());
        emp.setPhone(NummberE.getText());
        emp.setSection(MissionE.getText());
        emp.setJob(PerfE.getText());

        if(emp.getName().length() == 0 || emp.getID().length() == 0 
                || emp.getEmail().length() == 0 || emp.getJob().length() == 0 
                || emp.getPhone().length() == 0 || emp.getSection().length() == 0){
        JOptionPane.showMessageDialog(rootPane, "يجب ان يتم ملء كل الحقول  ", "خطأ" , 0);    
        } else {
        
        data.AddUser(emp);

        NameE.setText("");
        RegiE.setText("");
        EmailE.setText("");
        NummberE.setText("");
        MissionE.setText("");
        PerfE.setText("");

        UpdateData();
        
        nav2.removeAll();
        nav2.repaint();
        nav2.revalidate();
        //adding panel
        nav2.add(navEmployeeH);
        nav2.repaint();
        nav2.revalidate();
        
        }

    }//GEN-LAST:event_SaveEmpActionPerformed

    private void NameEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameEActionPerformed

    private void norbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_norbuttonActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Desktop.getDesktop().browse(new URL ("https://noor.moe.gov.sa/Noor/login.aspx").toURI());
        } catch (MalformedURLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_norbuttonActionPerformed

    private void moebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moebuttonActionPerformed
        // TODO add your handling code here:

        try {
            // TODO add your handling code here:
            Desktop.getDesktop().browse(new URL ("https://www.moe.gov.sa/ar/pages/login.aspx").toURI());
        } catch (MalformedURLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_moebuttonActionPerformed

    private void farsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farsbuttonActionPerformed
        try {
            // TODO add your handling code here:
            Desktop.getDesktop().browse(new URL ("https://sshr-dr.moe.sa").toURI());
        } catch (MalformedURLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_farsbuttonActionPerformed

    private void EmpTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpTableMouseClicked
        // TODO add your handling code here:

        JTable target = (JTable)evt.getSource();
        int column = target.getSelectedRow();
        Cloumn = column;

        nav2.removeAll();
        nav2.repaint();
        nav2.revalidate();
        //adding panel
        nav2.add(navEmployee);
        nav2.repaint();
        nav2.revalidate();

        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) target.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(0);

        DefaultTableModel Emodel = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        EmpInfo.setModel(Emodel);

        // Create a couple of columns
        Emodel.addColumn("معلومات الموظف");
        Emodel.addColumn("الجدول");

        Emodel.addRow(new Object[] {data.getinfo(column).getName()      , "الاسم"});
        Emodel.addRow(new Object[] {data.getinfo(column).getID()        , "الهوية"});
        Emodel.addRow(new Object[] {data.getinfo(column).getPhone()     , "رقم الجوال"});
        Emodel.addRow(new Object[] {data.getinfo(column).getJob()       , "المسمى الوظيفي"});
        Emodel.addRow(new Object[] {data.getinfo(column).getSection()   , "القسم"});
        Emodel.addRow(new Object[] {data.getinfo(column).getEmail()     , "البريد الالكتروني "});

        for(int i = 0; i < 2; i++){

            DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
            rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
            EmpInfo.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);

        }
        
        
    }//GEN-LAST:event_EmpTableMouseClicked

    private void EmpAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpAddActionPerformed
        // TODO add your handling code here:
        //remove panel
        nav2.removeAll();
        nav2.repaint();
        nav2.revalidate();
        //adding panel
        nav2.add(navEmployeeAdd);
        nav2.repaint();
        nav2.revalidate();
    }//GEN-LAST:event_EmpAddActionPerformed

    private void ExpensesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExpensesTableMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:\

        JTable target = (JTable)evt.getSource();
        int column = target.getSelectedRow();
        Cloumn = column;
        
        DefaultTableModel Emodel = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        ExpShow.setModel(Emodel);

        // Create a couple of columns
        Emodel.addColumn("البيانات");
        Emodel.addColumn("الجدول");

        Emodel.addRow(new Object[] {data.getExp(column).getName() , "الاسم"});
        Emodel.addRow(new Object[] {data.getExp(column).getNumber() , "العدد"});
        Emodel.addRow(new Object[] {data.getExp(column).getModel() , "الموديل"});
        Emodel.addRow(new Object[] {data.getExp(column).getCompany() , "نوع الشركة"});
        Emodel.addRow(new Object[] {data.getExp(column).getSerial() , "الرقم التسلسلي"});
        Emodel.addRow(new Object[] {data.getExp(column).getOther(), "اخرى"});

        for (int i = 0; i < data.getExpSize(); i++) {

            DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) ExpShow.getTableHeader().getDefaultRenderer();
            renderer.setHorizontalAlignment(0);
        }

        for(int i = 0; i < 2; i++){

            DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
            rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
            ExpShow.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);

        }

        DelEx.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                
                int i = JOptionPane.showConfirmDialog(rootPane, "سيتم حذف بيانات المصروفات ", "تحذير", 0, 0);
                if(i == 0){
                    data.DeleteExp(data.getExp(column).getSerial());
                    JOptionPane.showMessageDialog(rootPane, "تم حذف البيانات");
                }
                
            }
        });
        
        //remove panel
        nav2.removeAll();
        nav2.repaint();
        nav2.revalidate();
        //adding panel
        nav2.add(navExpensesِ);
        nav2.repaint();
        nav2.revalidate();
    }//GEN-LAST:event_ExpensesTableMouseClicked

    private void ExpAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpAdd1ActionPerformed
        // TODO add your handling code here:
        //remove panel
        nav2.removeAll();
        nav2.repaint();
        nav2.revalidate();
        //adding panel
        nav2.add(navExpensesِAdd);
        nav2.repaint();
        nav2.revalidate();
        
    }//GEN-LAST:event_ExpAdd1ActionPerformed

    private void progzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progzActionPerformed
        // TODO add your handling code here:
        //remove panel
        nav2.removeAll();
        nav2.repaint();
        nav2.revalidate();
        //adding panel
        nav2.add(navProgz);
        nav2.repaint();
        nav2.revalidate();
    }//GEN-LAST:event_progzActionPerformed

    private void expensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expensesActionPerformed
        // TODO add your handling code here:
        //remove panel
        nav2.removeAll();
        nav2.repaint();
        nav2.revalidate();
        //adding panel
        nav2.add(navExpansesH);
        nav2.repaint();
        nav2.revalidate();
    }//GEN-LAST:event_expensesActionPerformed

    private void employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeActionPerformed
        // TODO add your handling code here:
        //remove panel
        nav2.removeAll();
        nav2.repaint();
        nav2.revalidate();
        //adding panel
        nav2.add(navEmployeeH);
        nav2.repaint();
        nav2.revalidate();
    }//GEN-LAST:event_employeeActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        //remove panel
        nav2.removeAll();
        nav2.repaint();
        nav2.revalidate();
        //adding panel
        nav2.add(navHome1);
        nav2.repaint();
        nav2.revalidate();
    }//GEN-LAST:event_homeActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CompN;
    private javax.swing.JLabel CompN1;
    private javax.swing.JTextField CompN2;
    private javax.swing.JTextField CompN3;
    private javax.swing.JLabel Count;
    private javax.swing.JLabel Count1;
    private javax.swing.JTextField Count2;
    private javax.swing.JTextField Count3;
    private javax.swing.JButton DelEm;
    private javax.swing.JButton DelEx;
    private javax.swing.JButton EditEm;
    private javax.swing.JButton EditEx;
    private javax.swing.JTextField EmailE;
    private javax.swing.JTextField EmailE1;
    private javax.swing.JButton EmpAdd;
    private javax.swing.JTable EmpInfo;
    private javax.swing.JTable EmpTable;
    private javax.swing.JButton ExpAdd1;
    private javax.swing.JTable ExpShow;
    private javax.swing.JTable ExpensesTable;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField MissionE;
    private javax.swing.JTextField MissionE1;
    private javax.swing.JTextField MissionE2;
    private javax.swing.JTextField MissionE3;
    private javax.swing.JLabel Model;
    private javax.swing.JLabel Model1;
    private javax.swing.JTextField Model2;
    private javax.swing.JTextField Model3;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Name1;
    private javax.swing.JTextField Name2;
    private javax.swing.JTextField Name3;
    private javax.swing.JTextField NameE;
    private javax.swing.JTextField NameE1;
    private javax.swing.JTextField NummberE;
    private javax.swing.JTextField NummberE1;
    private javax.swing.JTextField PerfE;
    private javax.swing.JTextField PerfE1;
    private javax.swing.JButton PrintEM;
    private javax.swing.JTextField RegiE;
    private javax.swing.JButton SaveEmp;
    private javax.swing.JButton SaveEmp1;
    private javax.swing.JButton SaveExp2;
    private javax.swing.JButton SaveExp3;
    private javax.swing.JLabel SerN;
    private javax.swing.JLabel SerNum;
    private javax.swing.JLabel SerNum1;
    private javax.swing.JTextField SerNum2;
    private javax.swing.JButton cancelEm;
    private javax.swing.JButton cancelEmp;
    private javax.swing.JButton cancelEmp1;
    private javax.swing.JButton cancelExp;
    private javax.swing.JButton cancelExp2;
    private javax.swing.JButton cancelExp3;
    private javax.swing.JButton employee;
    private javax.swing.JButton expenses;
    private javax.swing.JButton farsbutton;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel logo;
    private javax.swing.JButton moebutton;
    private javax.swing.JPanel nav1;
    private javax.swing.JPanel nav2;
    private javax.swing.JLabel navEmpHead;
    private javax.swing.JPanel navEmployee;
    private javax.swing.JPanel navEmployeeAdd;
    private javax.swing.JPanel navEmployeeEdit;
    private javax.swing.JPanel navEmployeeH;
    private javax.swing.JPanel navExpansesH;
    private javax.swing.JPanel navExpensesH1;
    private javax.swing.JPanel navExpensesِ;
    private javax.swing.JPanel navExpensesِAdd;
    private javax.swing.JPanel navExpensesِEdit;
    private javax.swing.JPanel navHome1;
    private javax.swing.JPanel navProgz;
    private javax.swing.JButton norbutton;
    private javax.swing.JLabel other;
    private javax.swing.JLabel other1;
    private javax.swing.JButton progz;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}
