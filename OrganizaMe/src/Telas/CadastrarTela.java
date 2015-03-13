
package Telas;

import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author Tullius
 */
public class CadastrarTela extends javax.swing.JFrame {

    private JLabel imgFundoVisu;
            
    public CadastrarTela() {
        initComponents();
     
        imgFundoVisu = new JLabel(); 
        imgFundoVisu.setSize(1024, 768);
        imgFundoVisu.setIcon(new ImageIcon("images/fundoCadastro.jpg"));
        this.setSize(1024, 768);
        this.setResizable(false);
        this.setLocation(200, 100);
        
    	Container pane = this.getContentPane();        
        pane.add(imgFundoVisu);
        
    }

        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupAssistiu = new javax.swing.ButtonGroup();
        LabelTituloCadastro = new javax.swing.JLabel();
        LabelTitulo = new javax.swing.JLabel();
        CampoTitulo = new javax.swing.JTextField();
        LabelGenero = new javax.swing.JLabel();
        ComboBoxGenero = new javax.swing.JComboBox();
        LabelDuracao = new javax.swing.JLabel();
        CampoDuracao = new javax.swing.JTextField();
        LabelPais = new javax.swing.JLabel();
        CampoPais = new javax.swing.JTextField();
        LabelAno = new javax.swing.JLabel();
        CampoAno = new javax.swing.JTextField();
        LabelDiretor = new javax.swing.JLabel();
        CampoDiretor = new javax.swing.JTextField();
        LabelIdioma = new javax.swing.JLabel();
        CampoIdioma = new javax.swing.JTextField();
        LabelSinopse = new javax.swing.JLabel();
        ScrollPaneSinopse = new javax.swing.JScrollPane();
        CampoSinopse = new javax.swing.JTextArea();
        LabelTrilhasorona = new javax.swing.JLabel();
        CampoTrilha = new javax.swing.JTextField();
        LabelTrailer = new javax.swing.JLabel();
        CampoTrailer = new javax.swing.JTextField();
        ButtonSalvar = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();
        LabelAssistiu = new javax.swing.JLabel();
        RadioButtonSim = new javax.swing.JRadioButton();
        RadioButtonNao = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("OrganizaME - Organizador de Filmes");

        LabelTituloCadastro.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        LabelTituloCadastro.setText("                                 Cadastrar Filme");

        LabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelTitulo.setText("Título:");

        CampoTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTituloActionPerformed(evt);
            }
        });
        CampoTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoTituloKeyTyped(evt);
            }
        });

        LabelGenero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelGenero.setText("Gênero:");

        ComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ação", "Animação", "Aventura", "Comédia", "Comédia Romântica", "Comédia Dramática", "Documentário", "Drama", "Faroeste", "Ficção Científica", "Guerra", "Musical", "Policial", "Romance", "Suspense", "Terror" }));
        ComboBoxGenero.setToolTipText("");
        ComboBoxGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxGeneroActionPerformed(evt);
            }
        });

        LabelDuracao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelDuracao.setText("Tempo de duração:");

        CampoDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDuracaoActionPerformed(evt);
            }
        });
        CampoDuracao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoDuracaoKeyTyped(evt);
            }
        });

        LabelPais.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelPais.setText("País de origem:");

        CampoPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoPaisActionPerformed(evt);
            }
        });
        CampoPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoPaisKeyTyped(evt);
            }
        });

        LabelAno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelAno.setText("Ano de lançamento:");

        CampoAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoAnoActionPerformed(evt);
            }
        });
        CampoAno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoAnoKeyTyped(evt);
            }
        });

        LabelDiretor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelDiretor.setText("Diretor:");

        CampoDiretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDiretorActionPerformed(evt);
            }
        });
        CampoDiretor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoDiretorKeyTyped(evt);
            }
        });

        LabelIdioma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelIdioma.setText("Idioma:");

        CampoIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoIdiomaActionPerformed(evt);
            }
        });
        CampoIdioma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoIdiomaKeyTyped(evt);
            }
        });

        LabelSinopse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelSinopse.setText("Sinopse:");

        CampoSinopse.setColumns(20);
        CampoSinopse.setRows(5);
        ScrollPaneSinopse.setViewportView(CampoSinopse);

        LabelTrilhasorona.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelTrilhasorona.setText("Trilha sonora:");

        CampoTrilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTrilhaActionPerformed(evt);
            }
        });
        CampoTrilha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoTrilhaKeyTyped(evt);
            }
        });

        LabelTrailer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelTrailer.setText("Trailer:");

        CampoTrailer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTrailerActionPerformed(evt);
            }
        });
        CampoTrailer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoTrailerKeyTyped(evt);
            }
        });

        ButtonSalvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButtonSalvar.setText("Salvar");
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });

        ButtonCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButtonCancelar.setText("Cancelar");
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });

        LabelAssistiu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LabelAssistiu.setText("Já assistiu?");

        buttonGroupAssistiu.add(RadioButtonSim);
        RadioButtonSim.setText("Sim");
        RadioButtonSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonSimActionPerformed(evt);
            }
        });

        buttonGroupAssistiu.add(RadioButtonNao);
        RadioButtonNao.setSelected(true);
        RadioButtonNao.setText("Não");
        RadioButtonNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonNaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LabelTituloCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(ButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)
                        .addComponent(ButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ScrollPaneSinopse, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabelTrilhasorona, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CampoTrilha, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CampoDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LabelDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LabelPais, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LabelSinopse, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(CampoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(LabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(CampoPais, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(50, 50, 50)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(ComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(LabelGenero)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(42, 42, 42)
                                                        .addComponent(RadioButtonSim)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(RadioButtonNao)))))
                                        .addGap(50, 50, 50))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(LabelAssistiu)
                                        .addGap(123, 123, 123)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CampoDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CampoAno, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CampoIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CampoTrailer, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelTrailer)
                                    .addComponent(LabelIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelAno, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTituloCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(LabelDuracao, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPais, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(LabelAno, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(LabelAssistiu, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CampoPais, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(RadioButtonSim)
                        .addComponent(RadioButtonNao))
                    .addComponent(CampoAno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDiretor, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(LabelIdioma, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTrilhasorona, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(LabelTrailer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoTrilha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoTrailer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(LabelSinopse, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPaneSinopse, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoPaisActionPerformed

    private void ComboBoxGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxGeneroActionPerformed

    private void CampoDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDuracaoActionPerformed

    private void CampoTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTituloActionPerformed

    private void CampoAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoAnoActionPerformed


    }//GEN-LAST:event_CampoAnoActionPerformed

    private void CampoDiretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDiretorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDiretorActionPerformed

    private void CampoIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoIdiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoIdiomaActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed

        JOptionPane.showMessageDialog(null, "Filme cadastrado");
        
                      Object[] options = { "Sim", "Não" };  
            int i = JOptionPane.showOptionDialog(null,  
                    "Deseja cadastrar outro filme?", "Cadastrar outro filme?",  
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,  
                    options, options[0]);  
            if (i == JOptionPane.NO_OPTION) {  
                dispose();
            }          

    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed

              Object[] options = { "Sim", "Não" };  
            int i = JOptionPane.showOptionDialog(null,  
                    "Tem certeza que deseja Cancelar?", "Cancelar?",  
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,  
                    options, options[0]);  
            if (i == JOptionPane.YES_OPTION) {  
                dispose();
            }                 
        
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void CampoTrilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTrilhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTrilhaActionPerformed

    private void CampoTrailerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTrailerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTrailerActionPerformed

    private void CampoAnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoAnoKeyTyped

        String caracteres="0987654321";
            if(!caracteres.contains(evt.getKeyChar()+"")){
                evt.consume();      
            }   
     
    }//GEN-LAST:event_CampoAnoKeyTyped

    private void CampoDuracaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoDuracaoKeyTyped
            
        String caracteres="0987654321";
            if(!caracteres.contains(evt.getKeyChar()+"")){
                evt.consume();      
            }     
    }//GEN-LAST:event_CampoDuracaoKeyTyped

    private void CampoTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoTituloKeyTyped

        String caracteres="0987654321";
            if(caracteres.contains(evt.getKeyChar()+"")){
                evt.consume();      
            }        
    }//GEN-LAST:event_CampoTituloKeyTyped

    private void CampoPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoPaisKeyTyped

                String caracteres="0987654321";
            if(caracteres.contains(evt.getKeyChar()+"")){
                evt.consume();      
            }            
    }//GEN-LAST:event_CampoPaisKeyTyped

    private void CampoDiretorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoDiretorKeyTyped

                String caracteres="0987654321";
            if(caracteres.contains(evt.getKeyChar()+"")){
                evt.consume();      
            }     
    }//GEN-LAST:event_CampoDiretorKeyTyped

    private void CampoTrilhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoTrilhaKeyTyped

                String caracteres="0987654321";
            if(caracteres.contains(evt.getKeyChar()+"")){
                evt.consume();      
            }     
    }//GEN-LAST:event_CampoTrilhaKeyTyped

    private void CampoIdiomaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoIdiomaKeyTyped

                String caracteres="0987654321";
            if(caracteres.contains(evt.getKeyChar()+"")){
                evt.consume();      
            }     
    }//GEN-LAST:event_CampoIdiomaKeyTyped

    private void CampoTrailerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoTrailerKeyTyped

                String caracteres="0987654321";
            if(caracteres.contains(evt.getKeyChar()+"")){
                evt.consume();      
            }     
    }//GEN-LAST:event_CampoTrailerKeyTyped

    private void RadioButtonSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonSimActionPerformed
       
        RadioButtonSim.setFocusPainted(false);
        
    }//GEN-LAST:event_RadioButtonSimActionPerformed

    private void RadioButtonNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonNaoActionPerformed
       
        RadioButtonNao.setFocusPainted(false);
        
    }//GEN-LAST:event_RadioButtonNaoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JTextField CampoAno;
    private javax.swing.JTextField CampoDiretor;
    private javax.swing.JTextField CampoDuracao;
    private javax.swing.JTextField CampoIdioma;
    private javax.swing.JTextField CampoPais;
    private javax.swing.JTextArea CampoSinopse;
    private javax.swing.JTextField CampoTitulo;
    private javax.swing.JTextField CampoTrailer;
    private javax.swing.JTextField CampoTrilha;
    private javax.swing.JComboBox ComboBoxGenero;
    private javax.swing.JLabel LabelAno;
    private javax.swing.JLabel LabelAssistiu;
    private javax.swing.JLabel LabelDiretor;
    private javax.swing.JLabel LabelDuracao;
    private javax.swing.JLabel LabelGenero;
    private javax.swing.JLabel LabelIdioma;
    private javax.swing.JLabel LabelPais;
    private javax.swing.JLabel LabelSinopse;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JLabel LabelTituloCadastro;
    private javax.swing.JLabel LabelTrailer;
    private javax.swing.JLabel LabelTrilhasorona;
    private javax.swing.JRadioButton RadioButtonNao;
    private javax.swing.JRadioButton RadioButtonSim;
    private javax.swing.JScrollPane ScrollPaneSinopse;
    private javax.swing.ButtonGroup buttonGroupAssistiu;
    // End of variables declaration//GEN-END:variables
}
