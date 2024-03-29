/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package support;

import SoarBridge.SoarBridge;
import java.util.Observable;
import java.util.Observer;
import javax.swing.ImageIcon;
import ws3dproxy.model.World;
import ws3dproxy.viewer.EnvironmentPanel;

/**
 *
 * @author gudwin
 */
public class MindView extends javax.swing.JFrame implements Observer {
    
    int debugstate = 0;
    SoarBridge sb;
    ImageIcon pause_icon = new ImageIcon(getClass().getResource("/images/pause-icon.png")); 
    ImageIcon play_icon = new ImageIcon(getClass().getResource("/images/play-icon.png"));
    WorkingMemoryViewer wmi;

    /**
     * Creates new form MindView
     */
    public MindView(SoarBridge sbn) {
        initComponents();
        sb = sbn;
        EnvironmentPanel ep = new EnvironmentPanel();
        ep.setCreature(sb.c);
        World p = World.getInstance();
        ep.setSize(p.getEnvironmentWidth(), p.getEnvironmentHeight());
        ep.attachToJScrollPane(jScrollPane1);
        sb.c.observeWindow(this);
        this.setTitle("FMT World3D JSOAR Controller");
        setSize(p.getEnvironmentWidth(), p.getEnvironmentHeight());
        jSplitPane1.setDividerLocation(0.5);
        jSplitPane1.setResizeWeight(.5d);
        wmi = new WorkingMemoryViewer("SOAR Working Memory",sb);
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jToolBar1 = new javax.swing.JToolBar();
        startstop = new javax.swing.JButton();
        mstep = new javax.swing.JButton();
        step = new javax.swing.JButton();
        currentPhase = new javax.swing.JTextField();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        input_link = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        leaflet_target = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        output_link = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jFile = new javax.swing.JMenu();
        jExit = new javax.swing.JMenuItem();
        jDebug = new javax.swing.JMenu();
        jStart = new javax.swing.JMenuItem();
        jStop = new javax.swing.JMenuItem();
        jWatch = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        startstop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pause-icon.png"))); // NOI18N
        startstop.setToolTipText("Play/Pause");
        startstop.setFocusable(false);
        startstop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        startstop.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        startstop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startstopActionPerformed(evt);
            }
        });
        jToolBar1.add(startstop);

        mstep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skip-forward-icon.png"))); // NOI18N
        mstep.setToolTipText("micro-step");
        mstep.setEnabled(false);
        mstep.setFocusable(false);
        mstep.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mstep.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mstep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mstepActionPerformed(evt);
            }
        });
        jToolBar1.add(mstep);

        step.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/forward-icon.png"))); // NOI18N
        step.setToolTipText("step");
        step.setEnabled(false);
        step.setFocusable(false);
        step.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        step.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        step.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stepActionPerformed(evt);
            }
        });
        jToolBar1.add(step);

        currentPhase.setText("Current Phase: <HALT>");
        jToolBar1.add(currentPhase);

        jSplitPane1.setDividerLocation(500);

        jLabel1.setText("InputLink:");

        jScrollPane2.setViewportView(input_link);

        jScrollPane4.setViewportView(leaflet_target);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 152, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 21, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jLabel2.setText("OutputLink:");

        jScrollPane3.setViewportView(output_link);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 176, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(0, 20, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jSplitPane1.setRightComponent(jPanel2);

        jFile.setText("File");

        jExit.setText("Exit");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });
        jFile.add(jExit);

        jMenuBar1.add(jFile);

        jDebug.setText("Debug");

        jStart.setText("Start");
        jStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStartActionPerformed(evt);
            }
        });
        jDebug.add(jStart);

        jStop.setText("Stop");
        jStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStopActionPerformed(evt);
            }
        });
        jDebug.add(jStop);

        jWatch.setText("Watch");
        jWatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jWatchActionPerformed(evt);
            }
        });
        jDebug.add(jWatch);

        jMenuBar1.add(jDebug);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStopActionPerformed
        stopDebugState();
    }//GEN-LAST:event_jStopActionPerformed

    private void jStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStartActionPerformed
        startDebugState();  
    }//GEN-LAST:event_jStartActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jExitActionPerformed

    private void mstepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mstepActionPerformed
        mstepDebugState();
    }//GEN-LAST:event_mstepActionPerformed

    private void startstopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startstopActionPerformed
        if (debugstate == 0) {
           startDebugState();
        }
        else {
           stopDebugState();   
        }
    }//GEN-LAST:event_startstopActionPerformed

    private void stepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stepActionPerformed
        // TODO add your handling code here:
        stepDebugState();
    }//GEN-LAST:event_stepActionPerformed

    private void jWatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jWatchActionPerformed
        // TODO add your handling code here:
        WorkingMemoryViewer wmi = new WorkingMemoryViewer("SOAR Working Memory",sb);
        wmi.setVisible(true);
    }//GEN-LAST:event_jWatchActionPerformed

    public void update(Observable arg0, Object arg1) {
        this.repaint();
    }
    
    public int getDebugState() {
        return(debugstate);
    }
    
    public void startDebugState() {
        startstop.setIcon(play_icon); // NOI18N 
        mstep.setEnabled(true);
        step.setEnabled(true);
        setPhaseIndication();
        wmi.updateTree();
        wmi.setVisible(true);
        debugstate = 1;
        try {
           sb.c.stop();
        } catch (Exception e) {
           e.printStackTrace();
        } 
    }
    
    public void stopDebugState() {
        startstop.setIcon(pause_icon); // NOI18N 
        mstep.setEnabled(false);
        step.setEnabled(false);
        stepDebugState();
        setPhaseIndication();
        wmi.setVisible(false);
        debugstate = 0;
        try {
              sb.c.start();
        } catch (Exception e) {
              e.printStackTrace();
        }
    }
    
    public void stepDebugState() {
        if (debugstate == 1) {
          try {
            sb.step();
            set_input_link_text(sb.input_link_string);
            set_output_link_text(sb.output_link_string);
            setPhaseIndication();
            wmi.updateTree();
            wmi.setVisible(true);
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
    }
    
    public void mstepDebugState() {
        if (debugstate == 1) {
          try {
            sb.mstep();
            set_input_link_text(sb.input_link_string);
            set_output_link_text(sb.output_link_string);
            set_leaflet_target_text(sb.leaflet_target_string);
            setPhaseIndication();
            wmi.updateTree();
            wmi.setVisible(true);
          } catch (Exception e) {
            e.printStackTrace();
          }
        }
    }
    
    public void setPhaseIndication() {
        if (sb.phase == -1)
               currentPhase.setText("Current Phase: "+"<HALT>");
        else if (sb.phase == 0)
               currentPhase.setText("Current Phase: "+"<INPUT>"); 
        else if (sb.phase == 1)
               currentPhase.setText("Current Phase: "+"<PROPOSE>");
        else if (sb.phase == 2)
               currentPhase.setText("Current Phase: "+"<DECISION>");
        else if (sb.phase == 3)
               currentPhase.setText("Current Phase: "+"<APPLY>");
        else if (sb.phase == 4)
               currentPhase.setText("Current Phase: "+"<OUTPUT>"); 
        else if (sb.phase == 5)
               currentPhase.setText("Current Phase: "+"<HALT>"); 
    }
    
    public void set_input_link_text(String text) {
        input_link.setText(text);
    }
    
    public void set_output_link_text(String text) {
        output_link.setText(text);
    }
    
    // FMT 14/04/2017: new method for new window (leaflet target update)
    public void set_leaflet_target_text(String text) {
        leaflet_target.setText(text);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField currentPhase;
    private javax.swing.JTextPane input_link;
    private javax.swing.JMenu jDebug;
    private javax.swing.JMenuItem jExit;
    private javax.swing.JMenu jFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JMenuItem jStart;
    private javax.swing.JMenuItem jStop;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem jWatch;
    private javax.swing.JTextPane leaflet_target;
    private javax.swing.JButton mstep;
    private javax.swing.JTextPane output_link;
    private javax.swing.JButton startstop;
    private javax.swing.JButton step;
    // End of variables declaration//GEN-END:variables
}
