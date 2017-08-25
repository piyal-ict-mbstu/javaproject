package Gui;
/**
 * Developed by Md Piyal Hasan
 * Dept. of ICT,MBSTU.
 */

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class yarn extends JFrame implements ActionListener {

    public static JTextField display;
    private static String Result;
    public JButton bt7;
    public JComboBox<String> lengthitem;
    public JTextField lengthtex;
    public JComboBox<String> weightitem;
    public JTextField weighttex;
    JLabel jlab = new JLabel();
    /**
     * Creates new form yarn
     */
    boolean check = true;
    double length_unit = 1.00, weight_unit = 1.00;
    double W;//Direct system weight
    /**
     *
     "Woollen(American run)", "Woollen(Dewsbury)", "Woollen(Galashiels)",
     "Woollen(Hawick)", "Woollen(West of England)", "Woollen(Yorkshire)", "Worsted"
     */
    // Variables declaration - do not modify
    private JButton bt0;
    private JButton bt1;
    private JButton bt2;
    private JButton bt3;
    private JButton bt4;
    private JButton bt5;
    private JButton bt6;
    private JButton bt8;
    private JButton bt9;
    private JButton btc;
    private JButton btdel;
    private JButton btdot;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JMenu jMenu1;
    private JMenu jMenu4;
    private JMenu jMenu5;
    private JMenu jMenu6;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem2;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel5;
    private JButton next;
    private JComboBox<String> selectitem;

    public yarn() {
        initComponents();
        setIcon();
    }

    /**
     * @param WEIGHT
     * @param length
     * @param LENGTH
     * @param unit
     */
    public static void DirectCount(double WEIGHT, double length, double LENGTH, String unit) {
        double ans = (WEIGHT * length) / LENGTH;
        String value = String.format("%.2f",ans);
        // System.out.println();
        display.setText(value + " " + unit);
        //String result = String.valueOf();
        //display.setText(selectitem.getSelectedItem().toString() + ":  " + Value);
    }

    /**
     * @param W
     * @param L
     * @param l
     * @param w IndirectCount System
     */
    public static void InDirectCount(double W, double L, double l, double w, String unit) {
        double ans = (L * w) / (l * W);
        String result = String.format("%.2f",ans);
        display.setText(result + " " + unit.toLowerCase());
    }

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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(yarn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yarn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yarn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yarn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                yarn y = new yarn();
                y.setTitle("YARN COUNTER");
                y.setLocation(200, 100);
                y.setVisible(true);
            }
        });
    }

    /**
     * @param deleted_value
     * @return Result
     */
    public static String backSpace(String deleted_value) {
        String Result = "";
        for (int i = 0; i < deleted_value.length() - 1; i++)
            Result += deleted_value.charAt(i);
        return Result;
    }

    /**
     * setup icon for this app
     */
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("appicon.PNG")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {


        jMenuItem1 = new JMenuItem();
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jLabel2 = new JLabel();
        lengthtex = new JTextField();
        lengthitem = new JComboBox<>();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        weighttex = new JTextField();
        display = new JTextField();
        weightitem = new JComboBox<>();
        selectitem = new JComboBox<>();
        jPanel5 = new JPanel();
        btc = new JButton();
        bt7 = new JButton();
        bt9 = new JButton();
        bt8 = new JButton();
        btdel = new JButton();
        bt6 = new JButton();
        bt5 = new JButton();
        bt4 = new JButton();
        next = new JButton();
        bt3 = new JButton();
        bt2 = new JButton();
        bt1 = new JButton();
        btdot = new JButton();
        bt0 = new JButton();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenu4 = new JMenu();
        jMenuItem2 = new JMenuItem();
        jMenu5 = new JMenu();
        jMenu6 = new JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new Color(204, 204, 204));

        jLabel2.setBackground(new Color(255, 255, 255));
        jLabel2.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Length");

        lengthtex.setFont(new Font("Times New Roman", 1, 16)); // NOI18N
        lengthitem.setFont(new Font("Times New Roman", 2, 16)); // NOI18N
        lengthitem.setModel(new DefaultComboBoxModel<>(new String[]{"mile", "kilometre", "metre", "yard", "centimetre", "milimetre", "foot", "inche", "nanometre", "micrometre", " "}));


        lengthitem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                lengthitemActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new Color(255, 255, 255));
        jLabel3.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Count");

        jLabel4.setBackground(new Color(255, 255, 255));
        jLabel4.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Weight");

        jLabel5.setBackground(new Color(255, 255, 255));
        jLabel5.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("System");

        weighttex.setFont(new Font("Times New Roman", 1, 16)); // NOI18N
        weighttex.setEditable(false);
        lengthtex.setEditable(false);
        display.setEditable(false);
        display.setBackground(new Color(255, 255, 255));
        display.setFont(new Font("Times New Roman", 1, 20));
        next.setForeground(Color.BLUE);
        lengthtex.setForeground(Color.blue);
        weighttex.setForeground(Color.blue);
        btdel.setForeground(Color.RED);
        btc.setForeground(Color.RED);
        // NOI18N
        display.setFocusCycleRoot(true);
        display.setForeground(Color.blue);
        weightitem.setFont(new Font("Times New Roman", 2, 16)); // NOI18N
        weightitem.setModel(new DefaultComboBoxModel<>(new String[]{"pound", "ounce", "kilogram", "gram", "grain", "centigram", "miligram", "ton"}));
        weightitem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                weightitemActionPerformed(evt);
            }
        });

        selectitem.setFont(new Font("Times New Roman", 2, 18)); // NOI18N
        selectitem.setModel(new DefaultComboBoxModel<>(new String[]{"Asbestos(American)", "Asbestos(British)",
                "Cotton(British)", "Cotton(Continental)", "Cotton bump yarn",
                "Denier", "Glass(U.S.A and U.K)", "Metric", "Jute",
                "Linen(wet-spun)", "Silk", "Spun silk", "Tex", "Woollen(Aberdeen)",
                "Woollen(American gain)", "Woollen(Alloa)", "Woollen(American cut)",
                "Woollen(American run)", "Woollen(Dewsbury)", "Woollen(Galashiels)",
                "Woollen(Hawick)", "Woollen(West of England)", "Woollen(Yorkshire)", "Worsted"}));
        selectitem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                selectitemActionPerformed(evt);
            }
        });

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lengthtex, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lengthitem, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(selectitem, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(display))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(weighttex, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(weightitem, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lengthtex, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lengthitem, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(weighttex, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(weightitem, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(display, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(selectitem, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5.setBackground(new Color(204, 204, 204));
        btc.setFont(new Font("Times New Roman", 1, 24)); // NOI18N
        btc.setText("C");
        btc.setMaximumSize(new Dimension(45, 37));
        btc.addActionListener(this);
        bt7.setFont(new Font("Times New Roman", 1, 24)); // NOI18N
        bt7.setText("7");
        bt7.addActionListener(this);
        bt9.setFont(new Font("Times New Roman", 1, 24)); // NOI18N
        bt9.setText("9");
        bt9.addActionListener(this);
        bt8.setFont(new Font("Times New Roman", 1, 24)); // NOI18N
        bt8.setText("8");
        bt8.addActionListener(this);
        btdel.setFont(new Font("Times New Roman", 1, 18)); // NOI18N
        btdel.setText("DEL");
        btdel.addActionListener(this);
        bt6.setFont(new Font("Times New Roman", 1, 24)); // NOI18N
        bt6.setText("6");
        bt6.addActionListener(this);
        bt5.setFont(new Font("Times New Roman", 1, 24)); // NOI18N
        bt5.setText("5");
        bt5.addActionListener(this);
        bt4.setFont(new Font("Times New Roman", 1, 24)); // NOI18N
        bt4.setText("4");
        bt4.addActionListener(this);
        next.setFont(new Font("Times New Roman", 1, 21)); // NOI18N
        next.setText("Next");
        next.addActionListener(this);
        bt3.setFont(new Font("Times New Roman", 1, 24)); // NOI18N
        bt3.setText("3");
        bt3.addActionListener(this);
        bt2.setFont(new Font("Times New Roman", 1, 24)); // NOI18N
        bt2.setText("2");
        bt2.addActionListener(this);
        bt1.setFont(new Font("Times New Roman", 1, 24)); // NOI18N
        bt1.setText("1");
        bt1.addActionListener(this);
        btdot.setFont(new Font("Times New Roman", 1, 24)); // NOI18N
        btdot.setText(".");
        btdot.addActionListener(this);
        bt0.setFont(new Font("Times New Roman", 1, 24)); // NOI18N
        bt0.setText("0");
        bt0.addActionListener(this);
        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(bt7, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(bt4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(bt1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(bt8, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                                        .addComponent(bt5, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(bt2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(bt0, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(bt3, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addComponent(bt6, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(bt9, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(btdel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(next, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btc, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(btdot, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btc, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bt7, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bt9, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bt8, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btdel, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bt6, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bt5, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bt4, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(next, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(bt3, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(bt2, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(bt1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btdot, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bt0, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40))
        );
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("About");
        jMenuItem1.setText("Developer");
        jMenuItem1.setBorder(new BasicBorders.MenuBarBorder(Color.CYAN, Color.cyan));
        jMenuItem1.setContentAreaFilled(true);
        jMenu1.add(jMenuItem1);
        jMenu1.setFocusPainted(true);
        jMenuBar1.add(jMenu1);
        jMenu5.setText("Contact");
        jMenuBar1.add(jMenu5);
        jMenu6.setText("Help");
        jMenuBar1.add(jMenu6);
        setJMenuBar(jMenuBar1);
        /**
         * implement the about sectiontion
         */
        jMenuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                About about = new About();
                about.setVisible(true);
            }
        });
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );


        pack();
    }// </editor-fold>

    private void lengthitemActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        String item = (String) lengthitem.getSelectedItem();
        //System.out.println(item);
        double l;
        if (lengthtex.getText().equals("")) {
            l = 0.00;
        } else {
            l = Double.parseDouble(lengthtex.getText());
        }
        switch (item) {
            case "mile": {
                length_unit = 1760.00 * l;
                break;
            }
            case "kilometre": {
                length_unit = 1093.6132983 * l;
                break;
            }
            case "metre": {
                length_unit = 1.0936132983 * l;
                break;
            }
            case "milimetre": {
                length_unit = 0.0010936133 * l;
                break;
            }
            case "yard": {
                length_unit = 1.00 * l;
                break;
            }
            case "centimetre": {
                length_unit = 0.010936133 * l;
                break;
            }
            case "inche": {
                length_unit = 0.0277777778 * l;
                break;
            }
            case "foot": {
                length_unit = 0.3333333333 * l;
                break;
            }

        }
        //System.out.println(length_unit);
    }

    private void weightitemActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
        String item = (String) weightitem.getSelectedItem();
        //System.out.println(item);
        double w;
        if (weighttex.getText().equals("")) {
            w = 0.00;
        } else {
            w = Double.parseDouble(weighttex.getText());
        }
        switch (item) {
            case "ton": {
                weight_unit = 2204.6226218 * w;
                break;
            }
            case "grain": {
                weight_unit = 0.00014285714 * w;
                break;
            }
            case "kilogram": {
                weight_unit = 2.2046226218 * w;
                break;
            }
            case "gram": {
                weight_unit = 0.0022046226 * w;
                break;
            }
            case "miligram": {
                weight_unit = 0.0000022046 * w;
                break;
            }
            case "ounce": {
                weight_unit = 0.0625 * w;
                break;
            }
            case "pound": {
                weight_unit = 1.00 * w;
                break;
            }

        }
        // System.out.println(weight_unit);
    }

    private void selectitemActionPerformed(ActionEvent evt) {
        String item = (String) selectitem.getSelectedItem();
        //System.out.println(item);

        //display.setText(item);
        if (selectitem.getSelectedItem().equals("Tex") || selectitem.getSelectedItem().equals("Denier") || selectitem.getSelectedItem().equals("Jute")
                || selectitem.getSelectedItem().equals("Silk") || selectitem.getSelectedItem().equals("Woollen(Aberdeen)") || selectitem.getSelectedItem().equals("Woolen(American grain)")) {
            if (weighttex.getText().equals("")) {
                W = 0.00;
            } else {
                W = Double.parseDouble(weighttex.getText());
            }
        }
        switch (item) {
            case "Denier": {
                DirectCount(W, 9842.519685, length_unit, ((String) selectitem.getSelectedItem()).toLowerCase());
                break;
            }
            case "Tex": {
                DirectCount(W, 1093.6132983, length_unit, ((String) selectitem.getSelectedItem()).toLowerCase());
                break;
            }
            case "Jute": {
                DirectCount(W, 14400.00, length_unit, ((String) selectitem.getSelectedItem()).toLowerCase());
                break;
            }
            case "Silk": {
                DirectCount(W, 1000.00, length_unit, ((String) selectitem.getSelectedItem()).toLowerCase());
                break;
            }
            case "Woollen(Aberdeen)": {
                DirectCount(W, 14400.00, length_unit, ((String) selectitem.getSelectedItem()).toLowerCase());
                break;
            }
            case "Woollen(American grain)": {
                DirectCount(W, 20.00, length_unit, ((String) selectitem.getSelectedItem()).toLowerCase());
                break;
            }
            case "Cotton(British)": {
                InDirectCount(weight_unit, length_unit, 840.00, 1.00, selectitem.getSelectedItem().toString());
                break;
            }
            case "Asbestos(American)": {
                InDirectCount(weight_unit, length_unit, 100.00, 1.00, selectitem.getSelectedItem().toString());
                break;
            }
            case "Asbestos(British)": {
                InDirectCount(weight_unit, length_unit, 50.00, 1.00, selectitem.getSelectedItem().toString());
                break;
            }
            case "Cotton bump yarn": {
                InDirectCount(weight_unit, length_unit, 1.00, 0.0625, selectitem.getSelectedItem().toString());
                break;
            }
            case "Cotton(Continental)": {
                InDirectCount(weight_unit, length_unit, 1093.6132983, 1.1023113109, selectitem.getSelectedItem().toString());
                break;
            }
            case "Linen(wet-spun)": {
                InDirectCount(weight_unit, length_unit, 300.00, 1.00, selectitem.getSelectedItem().toString());
                break;
            }
            case "Glass(U.S.A and U.K)": {
                InDirectCount(weight_unit, length_unit, 100.00, 1.00, selectitem.getSelectedItem().toString());
                break;
            }
            case "Metric": {
                InDirectCount(weight_unit, length_unit, 1.0936132983, 2.2046226218, selectitem.getSelectedItem().toString());
                break;
            }
            case "Spun silk": {
                InDirectCount(weight_unit, length_unit, 840.00, 1.00, selectitem.getSelectedItem().toString());
                break;
            }
            case "Woollen(Alloa)": {
                InDirectCount(weight_unit, length_unit, 11520.00, 24.00, selectitem.getSelectedItem().toString());
                break;
            }
            case "Woollen(American cut)": {
                InDirectCount(weight_unit, length_unit, 300.00, 1.00, selectitem.getSelectedItem().toString());
                break;
            }
            case "Woollen(Dewsbury)": {
                InDirectCount(weight_unit, length_unit, 1.00, 0.0625, selectitem.getSelectedItem().toString());
                break;
            }
            case "Woollen(American run)": {
                InDirectCount(weight_unit, length_unit, 100.00, 0.0625, selectitem.getSelectedItem().toString());
                break;
            }
            case "Woollen(Hawick)": {
                InDirectCount(weight_unit, length_unit, 300.00, 1.625, selectitem.getSelectedItem().toString());
                break;
            }
            case "Woollen(Galashiels)": {
                InDirectCount(weight_unit, length_unit, 300.00, 1.5, selectitem.getSelectedItem().toString());
                break;
            }
            case "Woollen(West of England)": {
                InDirectCount(weight_unit, length_unit, 320.00, 1.00, selectitem.getSelectedItem().toString());
                break;
            }
            case "Woollen(Yorkshire)": {
                InDirectCount(weight_unit, length_unit, 256.00, 1.00, selectitem.getSelectedItem().toString());
                break;
            }
            case "Worsted": {
                InDirectCount(weight_unit, length_unit, 560.00, 1.00, selectitem.getSelectedItem().toString());
                break;
            }

        }        // TODO add your handling code here:
    }

    //public about a=new about();
    //private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration
    @Override
    public void actionPerformed(ActionEvent e) {
        String button_name = e.getActionCommand();
        //System.out.println(button_name);
        switch (button_name) {
            case "Next": {
                // System.out.println(bt0.getText().toString());
                check = false;
                break;
            }
            case "C": {
                check = true;
                lengthtex.setText("");
                weighttex.setText("");
                display.setText("");
                break;
            }
            case "0": {
                if (check) {
                    String v = lengthtex.getText() + bt0.getText().toString();
                    lengthtex.setText(v);
                } else {
                    String v = weighttex.getText() + bt0.getText().toString();
                    weighttex.setText(v);
                }
                break;
            }
            case "1": {
                if (check) {
                    String v = lengthtex.getText() + bt1.getText().toString();
                    lengthtex.setText(v);
                } else {
                    String v = weighttex.getText() + bt1.getText().toString();
                    weighttex.setText(v);
                }
                break;
            }
            case "2": {
                if (check) {
                    String v = lengthtex.getText() + bt2.getText().toString();
                    lengthtex.setText(v);
                } else {
                    String v = weighttex.getText() + bt2.getText().toString();
                    weighttex.setText(v);
                }
                break;
            }
            case "3": {
                if (check) {
                    String v = lengthtex.getText() + bt3.getText().toString();
                    lengthtex.setText(v);
                } else {
                    String v = weighttex.getText() + bt3.getText().toString();
                    weighttex.setText(v);
                }
                break;
            }
            case "4": {
                if (check) {
                    String v = lengthtex.getText() + bt4.getText().toString();
                    lengthtex.setText(v);
                } else {
                    String v = weighttex.getText() + bt4.getText().toString();
                    weighttex.setText(v);
                }
                break;
            }
            case "5": {
                if (check) {
                    String v = lengthtex.getText() + bt5.getText().toString();
                    lengthtex.setText(v);
                } else {
                    String v = weighttex.getText() + bt5.getText().toString();
                    weighttex.setText(v);
                }
                break;
            }
            case "6": {
                if (check) {
                    String v = lengthtex.getText() + bt6.getText().toString();
                    lengthtex.setText(v);
                } else {
                    String v = weighttex.getText() + bt6.getText().toString();
                    weighttex.setText(v);
                }
                break;
            }
            case "7": {
                if (check) {
                    String v = lengthtex.getText() + bt7.getText().toString();
                    lengthtex.setText(v);
                } else {
                    String v = weighttex.getText() + bt7.getText().toString();
                    weighttex.setText(v);
                }
                break;
            }
            case "8": {
                if (check) {
                    String v = lengthtex.getText() + bt8.getText().toString();
                    lengthtex.setText(v);
                } else {
                    String v = weighttex.getText() + bt8.getText().toString();
                    weighttex.setText(v);
                }
                break;
            }
            case "9": {
                if (check) {
                    String v = lengthtex.getText() + bt9.getText().toString();
                    lengthtex.setText(v);
                } else {
                    String v = weighttex.getText() + bt9.getText().toString();
                    weighttex.setText(v);
                }
                break;
            }
            case ".": {
                if (check) {
                    String v = lengthtex.getText() + btdot.getText().toString();
                    lengthtex.setText(v);
                } else {
                    String v = weighttex.getText() + btdot.getText().toString();
                    weighttex.setText(v);
                }
                break;
            }
            case "DEL": {
                if (check) {
                    String tempText = backSpace(lengthtex.getText());
                    if (tempText.equals(""))
                        lengthtex.setText("0");
                    else
                        lengthtex.setText(tempText);
                } else {
                    String tempText = backSpace(weighttex.getText());
                    if (tempText.equals(""))
                        weighttex.setText("0");
                    else
                        weighttex.setText(tempText);
                }
                break;
            }
        }
    }
}