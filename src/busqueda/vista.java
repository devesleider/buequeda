/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda;

import javax.swing.JOptionPane;
/**
 *
 * @author esleider.jaramillo
 */
public class vista extends javax.swing.JFrame {
    
    int vec [];
    metBusqueda b = new metBusqueda();
    long startTime;
    long endTime;
    /**
     * Creates new form vista
     */
    public vista() {
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

        createV = new javax.swing.JButton();
        quickSort = new javax.swing.JButton();
        quickSortR = new javax.swing.JLabel();
        shell = new javax.swing.JButton();
        shellR = new javax.swing.JLabel();
        radixSortR = new javax.swing.JButton();
        radixR = new javax.swing.JLabel();
        bucketSort = new javax.swing.JButton();
        bucketSortR = new javax.swing.JLabel();
        mergeSortR = new javax.swing.JLabel();
        mergesort = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createV.setText("Crear Vector");
        createV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createVActionPerformed(evt);
            }
        });

        quickSort.setText("Quick Sort");
        quickSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickSortActionPerformed(evt);
            }
        });

        shell.setText("Shell");
        shell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shellActionPerformed(evt);
            }
        });

        radixSortR.setText("Radix Sort");
        radixSortR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radixSortRActionPerformed(evt);
            }
        });

        bucketSort.setText("Bucket Sort");
        bucketSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bucketSortActionPerformed(evt);
            }
        });

        mergesort.setText("Merge Sort");
        mergesort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mergesortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mergesort)
                        .addGap(18, 18, 18)
                        .addComponent(mergeSortR, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bucketSort)
                        .addGap(18, 18, 18)
                        .addComponent(bucketSortR, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radixSortR)
                        .addGap(18, 18, 18)
                        .addComponent(radixR, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(createV)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quickSort)
                            .addComponent(shell))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(quickSortR, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(shellR, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(createV)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quickSort)
                    .addComponent(quickSortR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shell)
                    .addComponent(shellR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radixSortR)
                    .addComponent(radixR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bucketSort)
                    .addComponent(bucketSortR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mergesort)
                    .addComponent(mergeSortR, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createVActionPerformed
       int n = 0;
       n =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del vector"));
       this.vec = this.b.Create(n);
    }//GEN-LAST:event_createVActionPerformed

    private void quickSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quickSortActionPerformed
        startTime = System.nanoTime();
        this.b.QuickSort(vec, 0, vec.length-1);
        endTime = System.nanoTime() - startTime;
        quickSortR.setText(Long.toString(endTime) + " milisegundos");
    }//GEN-LAST:event_quickSortActionPerformed

    private void shellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shellActionPerformed
        startTime = System.nanoTime();
        this.b.Shell(vec);
        endTime = System.nanoTime() - startTime;
        shellR.setText(Long.toString(endTime) + " milisegundos");
    }//GEN-LAST:event_shellActionPerformed

    private void radixSortRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radixSortRActionPerformed
        startTime = System.nanoTime();
        this.b.RadixSort(vec, vec.length);
        endTime = System.nanoTime() - startTime;
        radixR.setText(Long.toString(endTime) + " milisegundos");
    }//GEN-LAST:event_radixSortRActionPerformed

    private void bucketSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bucketSortActionPerformed
        startTime = System.nanoTime();
        this.b.bucketsort(vec);
        endTime = System.nanoTime() - startTime;
        bucketSortR.setText(Long.toString(endTime) + " milisegundos");
    }//GEN-LAST:event_bucketSortActionPerformed

    private void mergesortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mergesortActionPerformed
        startTime = System.nanoTime();
        this.b.Mergesort(vec, 0, vec.length-1);
        endTime = System.nanoTime() - startTime;
        mergeSortR.setText(Long.toString(endTime) + " milisegundos");
    }//GEN-LAST:event_mergesortActionPerformed

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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bucketSort;
    private javax.swing.JLabel bucketSortR;
    private javax.swing.JButton createV;
    private javax.swing.JLabel mergeSortR;
    private javax.swing.JButton mergesort;
    private javax.swing.JButton quickSort;
    private javax.swing.JLabel quickSortR;
    private javax.swing.JLabel radixR;
    private javax.swing.JButton radixSortR;
    private javax.swing.JButton shell;
    private javax.swing.JLabel shellR;
    // End of variables declaration//GEN-END:variables
}