package com.crypto.main;

import com.crypto.alogrithm.util.Base;
import com.crypto.alogrithm.hash.checksums.Adler;
import com.crypto.alogrithm.hash.checksums.Fletcher16;
import com.crypto.alogrithm.hash.checksums.Fletcher32;
import com.crypto.alogrithm.hash.checksums.Fletcher4;
import com.crypto.alogrithm.hash.checksums.Fletcher8;
import com.crypto.alogrithm.hash.checksums.LRC;
import com.crypto.alogrithm.hash.checksums.Sum16;
import com.crypto.alogrithm.hash.checksums.Sum24;
import com.crypto.alogrithm.hash.checksums.Sum32;
import com.crypto.alogrithm.hash.checksums.Sum8;
import com.crypto.alogrithm.hash.crc.BSDChecksum;
import com.crypto.alogrithm.hash.crc.CRC16;
import com.crypto.alogrithm.hash.crc.CRC32;
import com.crypto.alogrithm.hash.crc.CRC64;
import com.crypto.alogrithm.hash.crc.SYSV;
import com.crypto.calculator.Calculator;
import com.crypto.type.Algorithm;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

/**
 *
 * @author Sunil
 */
public class Crypto extends javax.swing.JFrame {

	/**
	 * Creates new form NewJFrame
	 */
	public Crypto() {
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

        toolBar = new javax.swing.JToolBar();
        comboFunction = new javax.swing.JComboBox<>();
        comboFunctionType = new javax.swing.JComboBox<>();
        comboAlgo = new javax.swing.JComboBox<>();
        btnPaste = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCalculate = new javax.swing.JButton();
        body = new javax.swing.JPanel();
        tabPane = new javax.swing.JTabbedPane();
        tabTextPane = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPlain = new javax.swing.JTextArea();
        btnCalculateMain = new javax.swing.JButton();
        lblPlainText = new javax.swing.JLabel();
        lblHashText = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        textBinHash = new javax.swing.JTextField();
        lblBin = new javax.swing.JLabel();
        textOctHash = new javax.swing.JTextField();
        lblOct = new javax.swing.JLabel();
        textDecHash = new javax.swing.JTextField();
        lblDec = new javax.swing.JLabel();
        textHexHash = new javax.swing.JTextField();
        lblHex = new javax.swing.JLabel();
        panStatus = new javax.swing.JPanel();
        lblMessage = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();
        lblProgress = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        textMenu = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HashCalculator");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        toolBar.setFloatable(false);
        toolBar.setRollover(true);
        toolBar.setToolTipText("");

        comboFunction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFunctionActionPerformed(evt);
            }
        });
        toolBar.add(comboFunction);

        comboFunctionType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFunctionTypeItemStateChanged(evt);
            }
        });
        comboFunctionType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFunctionTypeActionPerformed(evt);
            }
        });
        toolBar.add(comboFunctionType);

        comboAlgo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAlgoActionPerformed(evt);
            }
        });
        toolBar.add(comboAlgo);

        btnPaste.setText("Paste");
        btnPaste.setFocusable(false);
        btnPaste.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPaste.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasteActionPerformed(evt);
            }
        });
        toolBar.add(btnPaste);

        btnSave.setText("Save");
        btnSave.setFocusable(false);
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnSave);

        btnCalculate.setText("Calculate");
        btnCalculate.setFocusable(false);
        btnCalculate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalculate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        toolBar.add(btnCalculate);

        txtPlain.setColumns(20);
        txtPlain.setRows(5);
        jScrollPane2.setViewportView(txtPlain);

        btnCalculateMain.setText("Calculate");
        btnCalculateMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateMainActionPerformed(evt);
            }
        });

        lblPlainText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlainText.setText("Palin Text");

        lblHashText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHashText.setText("Hash");
        lblHashText.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textBinHash.setText("0");

        lblBin.setText("Binary           ");
        lblBin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBinMouseClicked(evt);
            }
        });

        textOctHash.setText("0");

        lblOct.setText("Octal             ");
        lblOct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOctMouseClicked(evt);
            }
        });

        textDecHash.setText("0");
        textDecHash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDecHashActionPerformed(evt);
            }
        });

        lblDec.setText("Decimal          ");
        lblDec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDecMouseClicked(evt);
            }
        });

        textHexHash.setText("0");

        lblHex.setText("Hexadecimal ");
        lblHex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHexMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblHex)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textHexHash, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblBin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textBinHash, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblOct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textOctHash, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(lblDec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textDecHash, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textBinHash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textOctHash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDecHash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textHexHash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHex))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tabTextPaneLayout = new javax.swing.GroupLayout(tabTextPane);
        tabTextPane.setLayout(tabTextPaneLayout);
        tabTextPaneLayout.setHorizontalGroup(
            tabTextPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabTextPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabTextPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(tabTextPaneLayout.createSequentialGroup()
                        .addGroup(tabTextPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHashText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCalculateMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblPlainText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabTextPaneLayout.setVerticalGroup(
            tabTextPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabTextPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPlainText, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tabTextPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabTextPaneLayout.createSequentialGroup()
                        .addComponent(btnCalculateMain, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHashText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabPane.addTab("Text", tabTextPane);
        tabTextPane.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lblMessage.setText("Statusbar Message");

        lblProgress.setText("Progress Message");

        javax.swing.GroupLayout panStatusLayout = new javax.swing.GroupLayout(panStatus);
        panStatus.setLayout(panStatusLayout);
        panStatusLayout.setHorizontalGroup(
            panStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblProgress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panStatusLayout.setVerticalGroup(
            panStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panStatusLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMessage)
                        .addComponent(lblProgress))))
        );

        textMenu.setText("Text");
        textMenu.setToolTipText("");
        menu.add(textMenu);

        helpMenu.setText("Help");
        menu.add(helpMenu);

        setJMenuBar(menu);
        menu.getAccessibleContext().setAccessibleName("menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        toolBar.getAccessibleContext().setAccessibleName("Tool");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboAlgoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAlgoActionPerformed
		// TODO add your handling code here:
    }//GEN-LAST:event_comboAlgoActionPerformed

    private void comboFunctionTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFunctionTypeActionPerformed
		// TODO add your handling code here:
    }//GEN-LAST:event_comboFunctionTypeActionPerformed

    private void comboFunctionTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFunctionTypeItemStateChanged

    }//GEN-LAST:event_comboFunctionTypeItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
		// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void comboFunctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFunctionActionPerformed
		// TODO add your handling code here:
    }//GEN-LAST:event_comboFunctionActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
		setUpUserInterface();
		setFillCombos();
    }//GEN-LAST:event_formWindowActivated

    private void textDecHashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDecHashActionPerformed
		// TODO add your handling code here:
    }//GEN-LAST:event_textDecHashActionPerformed

    private void lblOctMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOctMouseClicked
		Clipboard clpBrb = Toolkit.getDefaultToolkit().getSystemClipboard();
		clpBrb.setContents(new StringSelection(textOctHash.getText()), null);
		setMessaage("Octal Hash Copied", 700);
    }//GEN-LAST:event_lblOctMouseClicked

    private void lblBinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBinMouseClicked
		Clipboard clpBrb = Toolkit.getDefaultToolkit().getSystemClipboard();
		clpBrb.setContents(new StringSelection(textBinHash.getText()), null);
		setMessaage("Binary Hash Copied", 700);
    }//GEN-LAST:event_lblBinMouseClicked

    private void btnCalculateMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateMainActionPerformed
		Calculator c = getCalculator();
		textBinHash.setText(c.toString(Base.BIN));
		textOctHash.setText(c.toString(Base.OCTAL));
		textDecHash.setText(c.toString(Base.DECIMAL));
		textHexHash.setText(c.toString(Base.HEXADECIMAL));
		setMessaage("Calculated for " + comboAlgo.getSelectedItem().toString(), 1500);
    }//GEN-LAST:event_btnCalculateMainActionPerformed

    private void lblDecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDecMouseClicked
		Clipboard clpBrb = Toolkit.getDefaultToolkit().getSystemClipboard();
		clpBrb.setContents(new StringSelection(textDecHash.getText()), null);
		setMessaage("Decimal Hash Copied", 700);
    }//GEN-LAST:event_lblDecMouseClicked

    private void lblHexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHexMouseClicked
		Clipboard clpBrb = Toolkit.getDefaultToolkit().getSystemClipboard();
		clpBrb.setContents(new StringSelection(textHexHash.getText()), null);
		setMessaage("Hexadecimal Hash Copied", 700);
    }//GEN-LAST:event_lblHexMouseClicked

    private void btnPasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasteActionPerformed
		Transferable t = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(this);
		try {
			if (t != null && t.isDataFlavorSupported(DataFlavor.stringFlavor)) {
				String text = (String) t.getTransferData(DataFlavor.stringFlavor);
				txtPlain.setText(text);
				setMessaage("Pasted in Plain Text", 700);
			} else {
				setMessaage("Data not supported", 1000);
			}
		} catch (UnsupportedFlavorException | IOException e) {
			setMessaage("Data not supported", 1000);
		}
    }//GEN-LAST:event_btnPasteActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
		btnCalculateMainActionPerformed(evt);
    }//GEN-LAST:event_btnCalculateActionPerformed

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
			java.util.logging.Logger.getLogger(Crypto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Crypto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Crypto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Crypto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Crypto().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnCalculateMain;
    private javax.swing.JButton btnPaste;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboAlgo;
    private javax.swing.JComboBox<String> comboFunction;
    private javax.swing.JComboBox<String> comboFunctionType;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBin;
    private javax.swing.JLabel lblDec;
    private javax.swing.JLabel lblHashText;
    private javax.swing.JLabel lblHex;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblOct;
    private javax.swing.JLabel lblPlainText;
    private javax.swing.JLabel lblProgress;
    private javax.swing.JMenuBar menu;
    private javax.swing.JPanel panStatus;
    private javax.swing.JProgressBar progress;
    private javax.swing.JTabbedPane tabPane;
    private javax.swing.JPanel tabTextPane;
    private javax.swing.JTextField textBinHash;
    private javax.swing.JTextField textDecHash;
    private javax.swing.JTextField textHexHash;
    private javax.swing.JMenu textMenu;
    private javax.swing.JTextField textOctHash;
    private javax.swing.JToolBar toolBar;
    private javax.swing.JTextArea txtPlain;
    // End of variables declaration//GEN-END:variables

	private void setUpUserInterface() {
		comboFunction.setVisible(false);
		comboFunctionType.setVisible(false);
		lblMessage.setText("");
		lblProgress.setVisible(false);
		progress.setVisible(false);
	}

	private void setFillCombos() {
		for (Algorithm value : Algorithm.values()) {
			comboAlgo.addItem(value.getName());
			comboFunctionType.addItem(value.getFunctionType().getName());
			comboFunction.addItem(value.getFunctionType().getFunction().getName());
		}
	}

	private Calculator getCalculator() {
		String algo = comboAlgo.getSelectedItem().toString();
		Calculator c;
		switch (Algorithm.findByName(algo)) {
			case BSD:
				c = new Calculator(new BSDChecksum());
				break;
			case ADLER:
				c = new Calculator(new Adler());
				break;
			case CRC32:
				c = new Calculator(new CRC32());
				break;
			case CRC64:
				c = new Calculator(new CRC64());
				break;
			case FLETCHER16:
				c = new Calculator(new Fletcher16());
				break;
			case FLETCHER32:
				c = new Calculator(new Fletcher32());
				break;
			case FLETCHER4:
				c = new Calculator(new Fletcher4());
				break;
			case FLETCHER8:
				c = new Calculator(new Fletcher8());
				break;
			case SUM16:
				c = new Calculator(new Sum16());
				break;
			case SUM24:
				c = new Calculator(new Sum24());
				break;
			case SUM32:
				c = new Calculator(new Sum32());
				break;
			case SUM8:
				c = new Calculator(new Sum8());
				break;
			case SYSV:
				c = new Calculator(new SYSV());
				break;
			case XOR8:
				c = new Calculator(new LRC());
				break;
			default:
				c = new Calculator(new CRC16());
		}
		c.calculate(txtPlain.getText());
		return c;
	}

	private void setMessaage(String msg, long time) {
		lblMessage.setText("  " + msg + "  ");
		Border border = BorderFactory.createLineBorder(Color.LIGHT_GRAY);
		lblMessage.setBorder(border);

		Thread t = new Thread(() -> {
			try {
				Thread.sleep(time);
			} catch (InterruptedException ex) {
				lblMessage.setText("");
				lblMessage.setBorder(BorderFactory.createEmptyBorder());
			}
			lblMessage.setText("");
			lblMessage.setBorder(BorderFactory.createEmptyBorder());
		});
		t.start();
	}
}