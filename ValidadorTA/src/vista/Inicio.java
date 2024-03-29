
package vista;

//Importacion de la clase "ReValidacion" del paquete "logica"
import logica.ReValidacion;

//Importacion de la clase "Automata" del paquete "logica"
import logica.Automata;

import javax.swing.*;

public class Inicio extends javax.swing.JFrame {

    public Inicio() {
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

        background = new javax.swing.JPanel();
        jLnombre = new javax.swing.JLabel();
        jTnombre = new javax.swing.JTextField();
        jLmatricula = new javax.swing.JLabel();
        jTmatricula = new javax.swing.JTextField();
        jLcadena = new javax.swing.JLabel();
        jTcadena = new javax.swing.JTextField();
        jBlimpiar = new javax.swing.JButton();
        jBaceptar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jTabecedario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTvalidacion = new javax.swing.JTextField();
        jBcadenanueva = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(51, 51, 51));

        jLnombre.setFont(new java.awt.Font("Rubik Medium", 0, 14)); // NOI18N
        jLnombre.setForeground(new java.awt.Color(204, 204, 204));
        jLnombre.setText("Ingresa Nombre:");

        jTnombre.setBackground(new java.awt.Color(82, 82, 82));
        jTnombre.setFont(new java.awt.Font("Rubik", 0, 14)); // NOI18N
        jTnombre.setForeground(new java.awt.Color(170, 170, 170));
        jTnombre.setText("yazmany . . .");
        jTnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnombreActionPerformed(evt);
            }
        });

        jLmatricula.setFont(new java.awt.Font("Rubik Medium", 0, 14)); // NOI18N
        jLmatricula.setForeground(new java.awt.Color(204, 204, 204));
        jLmatricula.setText("Ingresa Matricula:");

        jTmatricula.setBackground(new java.awt.Color(82, 82, 82));
        jTmatricula.setFont(new java.awt.Font("Rubik", 0, 14)); // NOI18N
        jTmatricula.setForeground(new java.awt.Color(170, 170, 170));
        jTmatricula.setText("1339767");

        jLcadena.setFont(new java.awt.Font("Rubik Medium", 0, 14)); // NOI18N
        jLcadena.setForeground(new java.awt.Color(204, 204, 204));
        jLcadena.setText("Cadena a Validar:");

        jTcadena.setBackground(new java.awt.Color(82, 82, 82));
        jTcadena.setFont(new java.awt.Font("Rubik", 0, 14)); // NOI18N
        jTcadena.setForeground(new java.awt.Color(170, 170, 170));
        jTcadena.setText("1mnyjgccicyjgci.an3.1339767");
        jTcadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcadenaActionPerformed(evt);
            }
        });

        jBlimpiar.setBackground(new java.awt.Color(75, 75, 75));
        jBlimpiar.setFont(new java.awt.Font("Rubik Medium", 0, 14)); // NOI18N
        jBlimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jBlimpiar.setText("Limpiar");
        jBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimpiarActionPerformed(evt);
            }
        });

        jBaceptar.setBackground(new java.awt.Color(75, 75, 75));
        jBaceptar.setFont(new java.awt.Font("Rubik Medium", 0, 14)); // NOI18N
        jBaceptar.setForeground(new java.awt.Color(255, 255, 255));
        jBaceptar.setText("Validar");
        jBaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaceptarActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Rubik Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Abecedario:");

        jTabecedario.setBackground(new java.awt.Color(51, 51, 51));
        jTabecedario.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jTabecedario.setForeground(new java.awt.Color(255, 255, 255));
        jTabecedario.setToolTipText("");
        jTabecedario.setBorder(null);
        jTabecedario.setCaretColor(new java.awt.Color(102, 102, 102));
        jTabecedario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTabecedario.setSelectedTextColor(new java.awt.Color(255, 0, 51));

        jLabel2.setFont(new java.awt.Font("Rubik Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Validacion:");

        jTvalidacion.setBackground(new java.awt.Color(51, 51, 51));
        jTvalidacion.setFont(new java.awt.Font("Rubik Medium", 0, 14)); // NOI18N
        jTvalidacion.setForeground(new java.awt.Color(255, 255, 255));
        jTvalidacion.setBorder(null);
        jTvalidacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTvalidacionActionPerformed(evt);
            }
        });

        jBcadenanueva.setBackground(new java.awt.Color(75, 75, 75));
        jBcadenanueva.setFont(new java.awt.Font("Rubik Medium", 0, 14)); // NOI18N
        jBcadenanueva.setForeground(new java.awt.Color(255, 255, 255));
        jBcadenanueva.setText("+ Nueva Cadena");
        jBcadenanueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcadenanuevaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jBlimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBaceptar)
                .addGap(170, 170, 170))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTcadena, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLnombre)
                            .addComponent(jLmatricula)
                            .addComponent(jTmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLcadena)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTabecedario, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jTvalidacion, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBcadenanueva)
                .addGap(230, 230, 230))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLnombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLmatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLcadena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTcadena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBlimpiar)
                    .addComponent(jBaceptar))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabecedario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTvalidacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBcadenanueva)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTcadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcadenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcadenaActionPerformed

    private void jTnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnombreActionPerformed
        // CODIGO
    }//GEN-LAST:event_jTnombreActionPerformed

    //Instancio la clase ReValidacion para utilizar sus metodos
    ReValidacion instancia = new ReValidacion();
    
    //Instancio la clase Automata para utilizar sus metodos
    Automata proceso = new Automata();
    
    private void jBaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaceptarActionPerformed
        // Boton de aceptar ====================================================
        
        // Se obtiene la input de la cadena ' Nombre '
        String Nombre = jTnombre.getText();
        
        // Se obtiene el input de la cadena ' Matricula '
        String Matricula = jTmatricula.getText();
        
        // Se obtiene el input de la cadena ' Cadena a Validar '
        String Cadena = jTcadena.getText();
        
        //Se envian los Strings a la clase ' ReValidacion ' ==============
        
        //Se envia 'Nombre' a validarse y se guarda en ' prueba1 '
        String prueba1 = instancia.ReNombre(Nombre);
        
        //Se cambia el nombre en el TextField
//        jTnombre.setText(prueba1);
        
        //Se envia 'Matricula' a validarse y se guarda en ' prueba2 '
        String prueba2 = instancia.FiltrarMatricula(Matricula);
        System.out.println(prueba2);
        
        //Se cambia la matricula en el TextField
//        jTmatricula.setText(prueba2);
        
        //Se crea el alfabeto
        String abecedario = instancia.Alfabeto(prueba1, prueba2);
        
        //Se imprime el Alfabeto
        jTabecedario.setText("\u03A3" + " = { " + abecedario + " }");
        
        //Se obtiene el input de "cadena a validar"
        String cadenaVal = jTcadena.getText();
        
        //Mando llamar la clase validacion
        String verificador = proceso.validacion(prueba1, prueba2, cadenaVal);
        
        jTvalidacion.setText(verificador);
    }//GEN-LAST:event_jBaceptarActionPerformed

    private void jBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimpiarActionPerformed
        //Se limpia el input ' Nombre '
        jTnombre.setText("");
        
        //Se limpia el input ' Matricula '
        jTmatricula.setText("");
        
        //Se limpia el input ' Cadena a Validar '
        jTcadena.setText("");
    }//GEN-LAST:event_jBlimpiarActionPerformed

    private void jTvalidacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTvalidacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTvalidacionActionPerformed

    // BOTON : " NUEVA CADENA " ================================================
    private void jBcadenanuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcadenanuevaActionPerformed
//        jTnombre.setText("");
//        jTmatricula.setText("");
        jTcadena.setText("");
//        jTabecedario.setText("");
        jTvalidacion.setText("");
    }//GEN-LAST:event_jBcadenanuevaActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton jBaceptar;
    private javax.swing.JButton jBcadenanueva;
    private javax.swing.JButton jBlimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLcadena;
    private javax.swing.JLabel jLmatricula;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTabecedario;
    private javax.swing.JTextField jTcadena;
    private javax.swing.JTextField jTmatricula;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTvalidacion;
    // End of variables declaration//GEN-END:variables
}
