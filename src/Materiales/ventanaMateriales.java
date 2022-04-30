/*
Universidad Abierta y a Distacia de Mexico (UnADM)
Autor: Miguel Angel Mendoza Jimenez
Matricula: ES172000597
Carrera Ingenieria en Desarrollo de Software
Materia: Programacion Orientada a Objetos III
Actividad: Evidencia de aprendizaje Unidad 1
Docente: Nora García González
Tijuana, B.C., Abril 2022 
 */
package Materiales;
// librearias a usar
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class ventanaMateriales extends javax.swing.JDialog {
    // metodo con el que se inician los componentes con la pocion al centro de la pantalla,
    // el focus en el text field matricula y el titulo de la ventana
    public ventanaMateriales(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        txtNombreMaterial.requestFocus();
        this.setTitle("MATERIALES CONSTRUCTORA DEPARTAMENTAL");
    }
    
    //Se crea método para limpiar los campos
    private void limpiar() {
        txtNombreMaterial.setText("");
        txtUnidadMaterial.setText("");
        txtPrecioMaterial.setText("");
        txtFechaEntregaMaterial.setText("");
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnMostrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreMaterial = new javax.swing.JTextField();
        txtUnidadMaterial = new javax.swing.JTextField();
        txtFechaEntregaMaterial = new javax.swing.JTextField();
        txtPrecioMaterial = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnRenombrarArchivo = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnEliminarArchivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESAR DATOS DEL MATERIAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 22))); // NOI18N

        btnMostrar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnMostrar.setText("Mostrar Datos");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Nombre del material");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Unidad de medida material");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Precio del material");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Fecha de entrega del material");

        txtNombreMaterial.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtUnidadMaterial.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtFechaEntregaMaterial.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtPrecioMaterial.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtPrecioMaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioMaterialKeyTyped(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnGuardar.setText("Guardar Datos");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnRenombrarArchivo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnRenombrarArchivo.setText("Renombrar Archivo");
        btnRenombrarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenombrarArchivoActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnEliminarArchivo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnEliminarArchivo.setText("Eliminar Archivo");
        btnEliminarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarArchivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnRenombrarArchivo)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrecioMaterial)
                            .addComponent(txtUnidadMaterial)
                            .addComponent(txtFechaEntregaMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(txtNombreMaterial))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUnidadMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecioMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFechaEntregaMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRenombrarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // se realiza el evento del boton guardar
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Validamos que no existan campos vacios
        if (txtNombreMaterial.getText().equals("") || txtUnidadMaterial.getText().equals("") || txtPrecioMaterial.getText().equals("")
                || txtFechaEntregaMaterial.getText().equals("")) {
            //Si existen campos vacios informamos al usuario con un mensaje
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
            txtNombreMaterial.requestFocus();

        } else {
            //Solicitamos confirmacion a usuario por medio de una ventana de diálogo
            int resp = JOptionPane.showConfirmDialog(null, "¿Desea guardar la información?",
                    "Guardar Datos", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                // se declara el objeto a crear
                try {
                    // creamo sel archivo, llamando al objeto y llamando al metodo crearDocumento
                    archivoMateriales documento = new archivoMateriales();
                    documento.crearDocumento();
                    // se declaran los datos que se van a recibir
                    String nombreMaterial = txtNombreMaterial.getText();
                    String unidadMaterial = txtUnidadMaterial.getText();
                    String pM = txtPrecioMaterial.getText();//Create a string to store the incoming data
                    float precioMaterial = Float.parseFloat(pM);// to cast the data
                    String fechaMaterial = txtFechaEntregaMaterial.getText();
                    // se llama al constructor de la clase materail
                    Material materiales = new Material(nombreMaterial, unidadMaterial, precioMaterial, fechaMaterial);
                    // se manda llmara al metodo ingresarTexto
                    documento.ingresarTexto(materiales);
                    // se limpian las cajas de texto con el metodo creado
                    limpiar();
                    // mostramos al usuario por medio de menasaje que se guardo el registro
                    JOptionPane.showMessageDialog(null, "Material dado de alta");
                    //En caso de que la opcion sea no solo se cierra el cuadro de dialogo
                    if (resp == JOptionPane.NO_OPTION) {
                    }
                    txtNombreMaterial.requestFocus();                     
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Existe un error con el archivo " + e);
                }             
            }           
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    // validamos que solo se ingresen numeros en el campo precio
    private void txtPrecioMaterialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioMaterialKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0' || c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != '.' || txtPrecioMaterial.getText().contains("."))) {
            evt.consume();
            // si se presionan letras se informa al usuario del error
            JOptionPane.showMessageDialog(null, "Solo se permiten números");
        }
    }//GEN-LAST:event_txtPrecioMaterialKeyTyped

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "   ¿Esta seguro que desea regresar "
                + "\na la ventana principal?",
                "Regresar al registro", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            dispose();//Cierra la ventana 
        }
        //En caso de que la ópcion sea no solo se cierra el cuadro de diálogo
        if (resp == JOptionPane.NO_OPTION);
        {
        }
    }//GEN-LAST:event_btnRegresarActionPerformed

    // se hace visible la ventana para mostrar los datos de los materiales
    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        listaMateriales listMat = new listaMateriales(new javax.swing.JDialog(), true);
        listMat.setVisible(true);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnRenombrarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenombrarArchivoActionPerformed
        renombrarArchivo cambiarNombre = new renombrarArchivo(new javax.swing.JDialog(), true);
        cambiarNombre.setVisible(true);
    }//GEN-LAST:event_btnRenombrarArchivoActionPerformed

    private void btnEliminarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarArchivoActionPerformed
        eliminarArchivo eliminarDocumento = new eliminarArchivo(new javax.swing.JDialog(), true);
        eliminarDocumento.setVisible(true);
    }//GEN-LAST:event_btnEliminarArchivoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarPalabraEnArchivo buscarDato = new buscarPalabraEnArchivo(new javax.swing.JDialog(), true);
        buscarDato.setVisible(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(ventanaMateriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaMateriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaMateriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaMateriales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ventanaMateriales dialog = new ventanaMateriales(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminarArchivo;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRenombrarArchivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtFechaEntregaMaterial;
    private javax.swing.JTextField txtNombreMaterial;
    private javax.swing.JTextField txtPrecioMaterial;
    private javax.swing.JTextField txtUnidadMaterial;
    // End of variables declaration//GEN-END:variables
}