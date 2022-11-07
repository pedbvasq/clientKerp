/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clientekerp;

import static clientekerp.WebSocket.cliente;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import javax.swing.UIManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Christian
 */
public class VisorClientKerp extends javax.swing.JFrame implements Runnable {

    /**
     * Creates new form clientKerp
     */
    int cont = 1;

    public VisorClientKerp() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {

                if ("Windows Classic".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    //break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }
        getContentPane().setBackground(Color.WHITE);

        //LOGOS   
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/img/logo.jpg")).getImage());

        ImageIcon log1 = new javax.swing.ImageIcon(getClass().getResource("/img/Kerp.jpg"));
        Icon icon1 = new ImageIcon(log1.getImage().getScaledInstance(logo1.getWidth(), logo1.getHeight(), Image.SCALE_DEFAULT));
        logo1.setIcon(icon1);

        ImageIcon log2 = new javax.swing.ImageIcon(getClass().getResource("/img/patron.jpg"));
        Icon icon2 = new ImageIcon(log2.getImage().getScaledInstance(logo2.getWidth(), logo2.getHeight(), Image.SCALE_DEFAULT));
        logo2.setIcon(icon2);
        tableClient.setDefaultRenderer(Object.class, new TableRender());

        //card
        //BOTONES
        Timer timer = new Timer(5000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ImageIcon pic = new javax.swing.ImageIcon(getClass().getResource("/img/item" + cont + ".jpg"));
                Icon icon = new ImageIcon(pic.getImage().getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_DEFAULT));
                img.setIcon(icon);

                cont++;
                if (cont == 4) {
                    cont = 1;
                }

            }
        });
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        card = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        cedula = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        ced = new javax.swing.JLabel();
        dir = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        img = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        sub = new javax.swing.JLabel();
        iva = new javax.swing.JLabel();
        descuento = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        logo2 = new javax.swing.JLabel();
        logo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableClient = new javax.swing.JTable();

        jToggleButton1.setText("jToggleButton1");

        jLabel17.setText("....");

        jLabel19.setText("$0.00");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        card.setBackground(new java.awt.Color(255, 255, 255));
        card.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 102), null));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setText("Dirección:");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setText("Cédula/rúc:");

        name.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setText("Correo:");

        jLabel21.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel21.setText("Nombre:");

        ced.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        ced.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        dir.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        dir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        email.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        card.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        card.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        card.setLayer(name, javax.swing.JLayeredPane.DEFAULT_LAYER);
        card.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        card.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        card.setLayer(direccion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        card.setLayer(correo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        card.setLayer(nombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        card.setLayer(cedula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        card.setLayer(jLabel21, javax.swing.JLayeredPane.DEFAULT_LAYER);
        card.setLayer(ced, javax.swing.JLayeredPane.DEFAULT_LAYER);
        card.setLayer(dir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        card.setLayer(email, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout cardLayout = new javax.swing.GroupLayout(card);
        card.setLayout(cardLayout);
        cardLayout.setHorizontalGroup(
            cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(cardLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cardLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardLayout.createSequentialGroup()
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(cardLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ced, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cardLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dir, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cardLayout.createSequentialGroup()
                    .addContainerGap(304, Short.MAX_VALUE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(73, 73, 73)))
        );
        cardLayout.setVerticalGroup(
            cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardLayout.createSequentialGroup()
                .addGroup(cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cardLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(direccion)
                        .addGap(78, 78, 78)
                        .addComponent(cedula))
                    .addGroup(cardLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(name))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(dir))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ced))
                .addGap(28, 28, 28)
                .addGroup(cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(correo)
                    .addGroup(cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(email)))
                .addGap(34, 34, 34))
            .addGroup(cardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(cardLayout.createSequentialGroup()
                    .addGap(85, 85, 85)
                    .addComponent(nombre)
                    .addContainerGap(152, Short.MAX_VALUE)))
        );

        jLayeredPane4.setBackground(java.awt.Color.white);
        jLayeredPane4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLayeredPane4.setForeground(new java.awt.Color(51, 255, 0));

        img.setBorder(new javax.swing.border.MatteBorder(null));

        jLayeredPane4.setLayer(img, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel7.setText("Subtotal:");

        jLabel8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel8.setText("IVA:");

        jLabel9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel9.setText("Descuento:");

        jLabel13.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel13.setText("TOTAL:");

        sub.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        iva.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        descuento.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N

        total.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N

        jLayeredPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(sub, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(iva, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(descuento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(total, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))
                            .addComponent(descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14)
                    .addComponent(sub))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(iva))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(descuento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        logo2.setText("jLabel14");
        logo2.setBorder(new javax.swing.border.MatteBorder(null));

        logo1.setText("jLabel14");
        logo1.setBorder(new javax.swing.border.MatteBorder(null));

        tableClient.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        tableClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Hamburguesa", "1", "$3.00", "$3.00"},
                {"Papas", "1", "$2.00", "$2.00"},
                {"Soda", "4", "$1.00", "$4.00"},
                {"Pizza", "7", "$6.00", "$4.00"},
                {"Emparedado", "1", "$3.00", "$3.00"},
                {"Carne", "3", "$3.00", "$9.00"},
                {"Leche", "3", "$1.50", "$4.50"},
                {"Seco", "3", "$2.50", "$7.50"},
                {"Combo jr", "4", "$5.00", "$20"},
                {"Combo sr", "5", "$10.00", "$50.00"}
            },
            new String [] {
                "Item", "Cantidad", "Precio", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableClient.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tableClient.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(tableClient);
        tableClient.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tableClient.getColumnModel().getColumnCount() > 0) {
            tableClient.getColumnModel().getColumn(0).setResizable(false);
            tableClient.getColumnModel().getColumn(1).setResizable(false);
            tableClient.getColumnModel().getColumn(2).setResizable(false);
            tableClient.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(card, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane card;
    private javax.swing.JLabel ced;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel descuento;
    private javax.swing.JLabel dir;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel email;
    private javax.swing.JLabel img;
    private javax.swing.JLabel iva;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel logo1;
    private javax.swing.JLabel logo2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel sub;
    private javax.swing.JTable tableClient;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {

        }
        String json = WebSocket.getJson();
        try {
            
            JSONArray jsonArray = new JSONArray(json);
            JSONObject jsonObject = jsonArray.getJSONObject(0); 
            Cliente cliente = new Cliente(jsonObject.getString("nombre"), jsonObject.getString("cedulaRuc"), jsonObject.getString("correo"), jsonObject.getString("direccion"));
            ClienteKerp.ventana.name.setText(cliente.getDireccion());
            ClienteKerp.ventana.ced.setText(cliente.getCedulaRuc());
            ClienteKerp.ventana.email.setText(cliente.getCorreo());
            ClienteKerp.ventana.dir.setText(cliente.getNombre());

            JSONObject obj  = jsonArray.getJSONObject(11);
            Factura ft = new Factura(obj.getString("subtotal"),obj.getString("iva"),obj.getString("descuento"),obj.getString("total"));
            ClienteKerp.ventana.sub.setText(ft.getSubtotal());
            ClienteKerp.ventana.iva.setText(ft.getIva());
            ClienteKerp.ventana.descuento.setText(ft.getDescuento());
            ClienteKerp.ventana.total.setText(ft.getTotal());
        } catch (JSONException ex) {

        }

    }

}
