
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.UIManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author shahz
 */
public class ConnectFour extends javax.swing.JFrame {

    /**
     * Creates new form ConnectFour
     */
    public int turn = 1, g1status = 1, g2status = 1, g3status = 1;
    public int g4status = 1, g5status =1;
    public void switchturn() {
        if (turn == 1) { 
            turn = 2;
            jLabel1.setText("Player 2 Turn");
        } else {
            turn = 1;
            jLabel1.setText("Player 1 Turn");
        }
    }

    public int groupstatus(int group) {
        if (group == 1) {
            return g1status;
        } else if (group == 2) {
            return g2status;
        } else if (group == 3) {
            return g3status;
        } else if (group == 4) {
            return g4status;
        } else if (group == 5) {
            return g5status;
        }
        else {
            return 0;
        }
    }

    public ConnectFour() {
        initComponents();
    }
    // </editor-fold>                        
public void checkwin() {
    // horizontal
    if (checkLine(g1b1, g1b2, g1b3, g1b4) || checkLine(g1b2, g1b3, g1b4, g1b5) || checkLine(g1b3, g1b4, g1b5, g1b6)) {
    jLabel2.setText("Player " + String.valueOf(turn) + " Won");
     disableRemainingButtons();
    return;
}

if (checkLine(g2b1, g2b2, g2b3, g2b4) || checkLine(g2b2, g2b3, g2b4, g2b5) || checkLine(g2b3, g2b4, g2b5, g2b6)) {
    jLabel2.setText("Player " + String.valueOf(turn) + " Won");
    disableRemainingButtons();
    return;
}

if (checkLine(g3b1, g3b2, g3b3, g3b4) || checkLine(g3b2, g3b3, g3b4, g3b5) || checkLine(g3b3, g3b4, g3b5, g3b6)) {
    jLabel2.setText("Player " + String.valueOf(turn) + " Won");
     disableRemainingButtons();
    return;
}

if (checkLine(g4b1, g4b2, g4b3, g4b4) || checkLine(g4b2, g4b3, g4b4, g4b5) || checkLine(g4b3, g4b4, g4b5, g4b6)) {
    jLabel2.setText("Player " + String.valueOf(turn) + " Won");
     disableRemainingButtons();
    return;
}

if (checkLine(g5b1, g5b2, g5b3, g5b4) || checkLine(g5b2, g5b3, g5b4, g5b5) || checkLine(g5b3, g5b4, g5b5, g5b6)) {
    jLabel2.setText("Player " + String.valueOf(turn) + " Won");
     disableRemainingButtons();
    return;
    }
    //vertical 
    if (checkLine(g1b1, g2b1, g3b1, g4b1) || checkLine(g2b1, g3b1, g4b1, g5b1)) {
    jLabel2.setText("Player " + String.valueOf(turn) + " Won");
     disableRemainingButtons();
    return;
}

if (checkLine(g1b2, g2b2, g3b2, g4b2) || checkLine(g2b2, g3b2, g4b2, g5b2)) {
    jLabel2.setText("Player " + String.valueOf(turn) + " Won");
     disableRemainingButtons();
    return;
}

if (checkLine(g1b3, g2b3, g3b3, g4b3) || checkLine(g2b3, g3b3, g4b3, g5b3)) {
    jLabel2.setText("Player " + String.valueOf(turn) + " Won");
     disableRemainingButtons();
    return;
}

if (checkLine(g1b4, g2b4, g3b4, g4b4) || checkLine(g2b4, g3b4, g4b4, g5b4)) {
    jLabel2.setText("Player " + String.valueOf(turn) + " Won");
     disableRemainingButtons();
    return;
}

if (checkLine(g1b5, g2b5, g3b5, g4b5) || checkLine(g2b5, g3b5, g4b5, g5b5)) {
    jLabel2.setText("Player " + String.valueOf(turn) + " Won");
     disableRemainingButtons();
    return;
}
    if (checkLine(g1b6, g2b6, g3b6, g4b6) || checkLine(g2b6, g3b6, g4b6, g5b6)) {
    jLabel2.setText("Player " + String.valueOf(turn) + " Won");
     disableRemainingButtons();
    return;
}
    
// diagonal 
if (checkLine(g1b4, g2b3, g3b2, g4b1) || 
    checkLine(g1b5, g2b4, g3b3, g4b2) || 
    checkLine(g1b6, g2b5, g3b4, g4b3)) {
    jLabel2.setText("Player " + String.valueOf(turn) + " Won");
  disableRemainingButtons();
    return;
    
}

if (checkLine(g1b1, g2b2, g3b3, g4b4) || 
    checkLine(g1b2, g2b3, g3b4, g4b5) || 
    checkLine(g1b3, g2b4, g3b5, g4b6)) {
    jLabel2.setText("Player " + String.valueOf(turn) + " Won");
    disableRemainingButtons();
    return;
}
if (checkLine(g5b1, g4b2, g3b3, g2b4) || 
    checkLine(g5b2, g4b3, g3b4, g2b5) || 
    checkLine(g5b3, g4b4, g3b5, g2b6)) {
    jLabel2.setText("Player " + String.valueOf(turn) + " Won");
    disableRemainingButtons();
    return;
}

if (checkLine(g5b4, g4b3, g3b2, g2b1) || 
    checkLine(g5b5, g4b4, g3b3, g2b2) || 
    checkLine(g5b6, g4b5, g3b4, g2b3)) {
    jLabel2.setText("Player " + String.valueOf(turn) + " Won");
    disableRemainingButtons();
    return;
}

}

 

private void disableRemainingButtons() {
    Component[] components = jPanel1.getComponents();
    for (Component component : components) {
        if (component instanceof JButton) {
            JButton button = (JButton) component;
            if (!button.getBackground().equals(Color.RED) && !button.getBackground().equals(Color.YELLOW)) {
                button.setEnabled(false);
            }
        }
    }
}



private boolean checkLine(javax.swing.JButton b1, javax.swing.JButton b2, javax.swing.JButton b3, javax.swing.JButton b4) {
    Color color = turn == 1 ? Color.red : Color.yellow; 
    return b1.getBackground().equals(color) && 
           b2.getBackground().equals(color) &&  
           b3.getBackground().equals(color) &&
           b4.getBackground().equals(color);
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
        jLabel1 = new javax.swing.JLabel();
        g1b6 = new javax.swing.JButton();
        g2b6 = new javax.swing.JButton();
        g3b6 = new javax.swing.JButton();
        g4b6 = new javax.swing.JButton();
        g5b6 = new javax.swing.JButton();
        g1b5 = new javax.swing.JButton();
        g1b4 = new javax.swing.JButton();
        g1b3 = new javax.swing.JButton();
        g1b2 = new javax.swing.JButton();
        g1b1 = new javax.swing.JButton();
        g2b5 = new javax.swing.JButton();
        g3b5 = new javax.swing.JButton();
        g4b5 = new javax.swing.JButton();
        g5b5 = new javax.swing.JButton();
        g2b4 = new javax.swing.JButton();
        g3b4 = new javax.swing.JButton();
        g4b4 = new javax.swing.JButton();
        g5b4 = new javax.swing.JButton();
        g2b3 = new javax.swing.JButton();
        g3b3 = new javax.swing.JButton();
        g4b3 = new javax.swing.JButton();
        g5b3 = new javax.swing.JButton();
        g2b2 = new javax.swing.JButton();
        g2b1 = new javax.swing.JButton();
        g3b2 = new javax.swing.JButton();
        g3b1 = new javax.swing.JButton();
        g4b2 = new javax.swing.JButton();
        g4b1 = new javax.swing.JButton();
        g5b2 = new javax.swing.JButton();
        g5b1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Player 1 Turn");

        g1b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g1b6MouseClicked(evt);
            }
        });

        g2b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g2b6MouseClicked(evt);
            }
        });

        g3b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g3b6MouseClicked(evt);
            }
        });

        g4b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g4b6MouseClicked(evt);
            }
        });

        g5b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g5b6MouseClicked(evt);
            }
        });

        g1b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g1b5MouseClicked(evt);
            }
        });

        g1b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g1b4MouseClicked(evt);
            }
        });

        g1b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g1b3MouseClicked(evt);
            }
        });

        g1b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g1b2MouseClicked(evt);
            }
        });

        g1b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g1b1MouseClicked(evt);
            }
        });

        g2b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g2b5MouseClicked(evt);
            }
        });

        g3b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g3b5MouseClicked(evt);
            }
        });

        g4b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g4b5MouseClicked(evt);
            }
        });

        g5b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g5b5MouseClicked(evt);
            }
        });

        g2b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g2b4MouseClicked(evt);
            }
        });

        g3b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g3b4MouseClicked(evt);
            }
        });

        g4b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g4b4MouseClicked(evt);
            }
        });

        g5b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g5b4MouseClicked(evt);
            }
        });

        g2b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g2b3MouseClicked(evt);
            }
        });

        g3b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g3b3MouseClicked(evt);
            }
        });

        g4b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g4b3MouseClicked(evt);
            }
        });

        g5b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g5b3MouseClicked(evt);
            }
        });

        g2b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g2b2MouseClicked(evt);
            }
        });

        g2b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g2b1MouseClicked(evt);
            }
        });

        g3b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g3b2MouseClicked(evt);
            }
        });

        g3b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g3b1MouseClicked(evt);
            }
        });

        g4b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g4b2MouseClicked(evt);
            }
        });

        g4b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g4b1MouseClicked(evt);
            }
        });

        g5b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g5b2MouseClicked(evt);
            }
        });

        g5b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g5b1MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(g1b6)
                        .addGap(18, 18, 18)
                        .addComponent(g2b6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(g3b6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(g4b6)
                        .addGap(18, 18, 18)
                        .addComponent(g5b6)))
                .addGap(0, 365, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(g1b3)
                        .addGap(18, 18, 18)
                        .addComponent(g2b3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(g3b3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(g4b3)
                        .addGap(18, 18, 18)
                        .addComponent(g5b3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(g1b2)
                        .addGap(18, 18, 18)
                        .addComponent(g2b2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(g3b2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(g4b2)
                        .addGap(18, 18, 18)
                        .addComponent(g5b2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(g1b5)
                            .addComponent(g1b4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(g2b5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(g3b5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(g4b5)
                                .addGap(18, 18, 18)
                                .addComponent(g5b5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(g2b4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(g3b4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(g4b4)
                                .addGap(18, 18, 18)
                                .addComponent(g5b4))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(g1b1)
                        .addGap(18, 18, 18)
                        .addComponent(g2b1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(g3b1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(g4b1)
                        .addGap(18, 18, 18)
                        .addComponent(g5b1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(g1b6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g2b6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g3b6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g4b6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g5b6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(g1b5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g2b5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g3b5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g4b5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g5b5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(g5b4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g4b4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g3b4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g1b4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g2b4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(g1b3, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(g3b3, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(g4b3, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(g5b3, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(g2b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(g1b2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g2b2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g3b2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g4b2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g5b2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(g1b1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g2b1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g3b1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g4b1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(g5b1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void g1b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g1b1MouseClicked
        if(groupstatus(1)==1){
          if(turn==1)g1b1.setBackground(Color.red);
          else g1b1.setBackground(Color.yellow);
        g1status++;
         checkwin();
        switchturn();
        }
    }//GEN-LAST:event_g1b1MouseClicked

    private void g1b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g1b2MouseClicked
if(groupstatus(1)==2){
          if(turn==1)g1b2.setBackground(Color.red);
          else g1b2.setBackground(Color.yellow);
        g1status++;
        checkwin();
        switchturn();
      }    }//GEN-LAST:event_g1b2MouseClicked

    private void g1b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g1b3MouseClicked
if(groupstatus(1)==3){
          if(turn==1)g1b3.setBackground(Color.red);
          else g1b3.setBackground(Color.yellow);
        g1status++;
        checkwin();
        switchturn();
      }    }//GEN-LAST:event_g1b3MouseClicked

    private void g1b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g1b4MouseClicked
if(groupstatus(1)==4){
          if(turn==1)g1b4.setBackground(Color.red);
          else g1b4.setBackground(Color.yellow);
        g1status++;
        checkwin();
        switchturn();
      }    }//GEN-LAST:event_g1b4MouseClicked

    private void g1b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g1b5MouseClicked
      if(groupstatus(1)==5){
          if(turn==1)g1b5.setBackground(Color.red);
          else g1b5.setBackground(Color.yellow);
        g1status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g1b5MouseClicked

    private void g1b6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g1b6MouseClicked
if(groupstatus(1)==6){
          if(turn==1)g1b6.setBackground(Color.red);
          else g1b6.setBackground(Color.yellow);
        g1status++;
        checkwin();
        switchturn();
      }    }//GEN-LAST:event_g1b6MouseClicked

    private void g2b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g2b1MouseClicked
        if(groupstatus(2)==1){
          if(turn==1)g2b1.setBackground(Color.red);
          else g2b1.setBackground(Color.yellow);
        g2status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g2b1MouseClicked

    private void g2b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g2b2MouseClicked
        if(groupstatus(2)==2){
          if(turn==1)g2b2.setBackground(Color.red);
          else g2b2.setBackground(Color.yellow);
        g2status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g2b2MouseClicked

    private void g2b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g2b3MouseClicked
        if(groupstatus(2)==3){
          if(turn==1)g2b3.setBackground(Color.red);
          else g2b3.setBackground(Color.yellow);
        g2status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g2b3MouseClicked

    private void g2b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g2b4MouseClicked
        if(groupstatus(2)==4){
          if(turn==1)g2b4.setBackground(Color.red);
          else g2b4.setBackground(Color.yellow);
        g2status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g2b4MouseClicked

    private void g2b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g2b5MouseClicked
        if(groupstatus(2)==5){
          if(turn==1)g2b5.setBackground(Color.red);
          else g2b5.setBackground(Color.yellow);
        g2status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g2b5MouseClicked

    private void g2b6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g2b6MouseClicked
        if(groupstatus(2)==6){
          if(turn==1)g2b6.setBackground(Color.red);
          else g2b6.setBackground(Color.yellow);
        g2status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g2b6MouseClicked

    private void g3b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g3b1MouseClicked
if(groupstatus(3)==1){
          if(turn==1)g3b1.setBackground(Color.red);
          else g3b1.setBackground(Color.yellow);
        g3status++;
        checkwin();
        switchturn();
      }    }//GEN-LAST:event_g3b1MouseClicked

    private void g3b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g3b2MouseClicked
       if(groupstatus(3)==2){
          if(turn==1)g3b2.setBackground(Color.red);
          else g3b2.setBackground(Color.yellow);
        g3status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g3b2MouseClicked

    private void g3b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g3b3MouseClicked
        if(groupstatus(3)==3){
          if(turn==1)g3b3.setBackground(Color.red);
          else g3b3.setBackground(Color.yellow);
        g3status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g3b3MouseClicked

    private void g3b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g3b4MouseClicked
        if(groupstatus(3)==4){
          if(turn==1)g3b4.setBackground(Color.red);
          else g3b4.setBackground(Color.yellow);
        g3status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g3b4MouseClicked

    private void g3b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g3b5MouseClicked
        if(groupstatus(3)==5){
          if(turn==1)g3b5.setBackground(Color.red);
          else g3b5.setBackground(Color.yellow);
        g3status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g3b5MouseClicked

    private void g3b6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g3b6MouseClicked
        if(groupstatus(3)==6){
          if(turn==1)g3b6.setBackground(Color.red);
          else g3b6.setBackground(Color.yellow);
        g3status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g3b6MouseClicked

    private void g4b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g4b1MouseClicked
       if(groupstatus(4)==1){
          if(turn==1)g4b1.setBackground(Color.red);
          else g4b1.setBackground(Color.yellow);
        g4status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g4b1MouseClicked

    private void g4b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g4b2MouseClicked
         if(groupstatus(4)==2){
          if(turn==1)g4b2.setBackground(Color.red);
          else g4b2.setBackground(Color.yellow);
        g4status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g4b2MouseClicked

    private void g4b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g4b3MouseClicked
         if(groupstatus(4)==3){
          if(turn==1)g4b3.setBackground(Color.red);
          else g4b3.setBackground(Color.yellow);
        g4status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g4b3MouseClicked

    private void g4b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g4b4MouseClicked
         if(groupstatus(4)==4){
          if(turn==1)g4b4.setBackground(Color.red);
          else g4b4.setBackground(Color.yellow);
        g4status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g4b4MouseClicked

    private void g4b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g4b5MouseClicked
         if(groupstatus(4)==5){
          if(turn==1)g4b5.setBackground(Color.red);
          else g4b5.setBackground(Color.yellow);
        g4status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g4b5MouseClicked

    private void g4b6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g4b6MouseClicked
         if(groupstatus(4)==6){
          if(turn==1)g4b6.setBackground(Color.red);
          else g4b6.setBackground(Color.yellow);
        g4status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g4b6MouseClicked

    private void g5b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g5b1MouseClicked
         if(groupstatus(5)==1){
          if(turn==1)g5b1.setBackground(Color.red);
          else g5b1.setBackground(Color.yellow);
        g5status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g5b1MouseClicked

    private void g5b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g5b2MouseClicked
        if(groupstatus(5)==2){
          if(turn==1)g5b2.setBackground(Color.red);
          else g5b2.setBackground(Color.yellow);
        g5status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g5b2MouseClicked

    private void g5b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g5b3MouseClicked
        if(groupstatus(5)==3){
          if(turn==1)g5b3.setBackground(Color.red);
          else g5b3.setBackground(Color.yellow);
        g5status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g5b3MouseClicked

    private void g5b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g5b4MouseClicked
        if(groupstatus(5)==4){
          if(turn==1)g5b4.setBackground(Color.red);
          else g5b4.setBackground(Color.yellow);
        g5status++;
        checkwin();
        switchturn();
        }
    }//GEN-LAST:event_g5b4MouseClicked

    private void g5b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g5b5MouseClicked
        if(groupstatus(5)==5){
          if(turn==1)g5b5.setBackground(Color.red);
          else g5b5.setBackground(Color.yellow);
        g5status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g5b5MouseClicked

    private void g5b6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g5b6MouseClicked
       if(groupstatus(5)==6){
          if(turn==1)g5b6.setBackground(Color.red);
          else g5b6.setBackground(Color.yellow);
        g5status++;
        checkwin();
        switchturn();
      }
    }//GEN-LAST:event_g5b6MouseClicked

  

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
            java.util.logging.Logger.getLogger(ConnectFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConnectFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConnectFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConnectFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConnectFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConnectFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConnectFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConnectFour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConnectFour().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton g1b1;
    private javax.swing.JButton g1b2;
    private javax.swing.JButton g1b3;
    private javax.swing.JButton g1b4;
    private javax.swing.JButton g1b5;
    private javax.swing.JButton g1b6;
    private javax.swing.JButton g2b1;
    private javax.swing.JButton g2b2;
    private javax.swing.JButton g2b3;
    private javax.swing.JButton g2b4;
    private javax.swing.JButton g2b5;
    private javax.swing.JButton g2b6;
    private javax.swing.JButton g3b1;
    private javax.swing.JButton g3b2;
    private javax.swing.JButton g3b3;
    private javax.swing.JButton g3b4;
    private javax.swing.JButton g3b5;
    private javax.swing.JButton g3b6;
    private javax.swing.JButton g4b1;
    private javax.swing.JButton g4b2;
    private javax.swing.JButton g4b3;
    private javax.swing.JButton g4b4;
    private javax.swing.JButton g4b5;
    private javax.swing.JButton g4b6;
    private javax.swing.JButton g5b1;
    private javax.swing.JButton g5b2;
    private javax.swing.JButton g5b3;
    private javax.swing.JButton g5b4;
    private javax.swing.JButton g5b5;
    private javax.swing.JButton g5b6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
