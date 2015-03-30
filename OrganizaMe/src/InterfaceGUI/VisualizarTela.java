package InterfaceGUI;

import Logica.Filme;
import dao.FilmeDao;
import java.awt.Container;
import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class VisualizarTela extends javax.swing.JFrame {

    private final JLabel imgFundoCad;
    private Object contentPane;

    public VisualizarTela() throws IOException {
        initComponents();
        
        Image visuImg = ImageIO.read(getClass().getResource("/Imagens/visu.png"));
        setIconImage(visuImg);
        

        imgFundoCad = new JLabel();
        imgFundoCad.setSize(1280, 768);
        imgFundoCad.setIcon(new ImageIcon("images/fundoVisualizar2.jpg"));

        Container pane = this.getContentPane();

        pane.add(imgFundoCad);

        this.setSize(1280, 768);
        this.setResizable(false);
        this.setLocation(0, 100);
    }
    


    private void mostraPesquisa(List<Filme> filmes) {
        
        while(tmFilmes.getRowCount() > 0){
            tmFilmes.removeRow(0);
        }
        if (filmes.size() == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum filme encontrado.");
        } else {
            String[] linha = new String[]{null, null, null, null, null, null, null, null, null, null, null, null};
            for (int i = 0; i < filmes.size(); i++) {
                tmFilmes.addRow(linha);
                tmFilmes.setValueAt(filmes.get(i).getTitulo(), i, 0);
                tmFilmes.setValueAt(filmes.get(i).getGenero(), i, 1);
                tmFilmes.setValueAt(filmes.get(i).getPais(), i, 2);
                tmFilmes.setValueAt(filmes.get(i).getAno_lancamento(), i, 3);
                tmFilmes.setValueAt(filmes.get(i).getDiretor(), i, 4);
                tmFilmes.setValueAt(filmes.get(i).getIdioma(), i, 5);
                tmFilmes.setValueAt(filmes.get(i).getTempo_duracao(), i, 6);
                tmFilmes.setValueAt(filmes.get(i).getJa_assistiu(), i, 7);
                tmFilmes.setValueAt(filmes.get(i).getSinopse(), i, 8);
                tmFilmes.setValueAt(filmes.get(i).getComentario(), i, 9);
                tmFilmes.setValueAt(filmes.get(i).getTrilha_sonora(), i, 10);
                tmFilmes.setValueAt(filmes.get(i).getTrailer(), i, 11);
            }
        }
    }
    //define modelo da tabela
    DefaultTableModel tmFilmes = new DefaultTableModel(null, new String[]{"Título", "Gênero", "País de origem", "Ano de lançamento", "Diretor", "Idioma",
        "Tempo de duração", "Assistiu?", "Sinopse", "Comentário", "Trilha sonora", "Trailer"});

    List<Filme> filmes;
    ListSelectionModel lsmFilme;

    public void listarFilmes() throws SQLException {

        FilmeDao dao = new FilmeDao();
        filmes = dao.getLista("%" + CampoPesquisa.getText() + "%");
        mostraPesquisa(filmes);

    }
    
    private void JTFilmesLinhaSelecionada(JTable tabela) {

        if (jTFilmes.getSelectedRow() != -1) {

            ResultTitulo.setText(filmes.get(tabela.getSelectedRow()).getTitulo());
            ResultGenero.setText(filmes.get(tabela.getSelectedRow()).getGenero());
            ResultAno.setText(filmes.get(tabela.getSelectedRow()).getAno_lancamento());
            ResultPais.setText(filmes.get(tabela.getSelectedRow()).getPais());
            ResultDiretor.setText(filmes.get(tabela.getSelectedRow()).getDiretor());
            ResultIdioma.setText(filmes.get(tabela.getSelectedRow()).getIdioma());
            ResultDuracao.setText(filmes.get(tabela.getSelectedRow()).getTempo_duracao());
            ResultTrilha.setText(filmes.get(tabela.getSelectedRow()).getTrilha_sonora());
            ResultTrailer.setText(filmes.get(tabela.getSelectedRow()).getTrailer());
            ResultAssistiu.setText(filmes.get(tabela.getSelectedRow()).getJa_assistiu());           
            ResultSinopse.setText(filmes.get(tabela.getSelectedRow()).getSinopse());

        } else {
            ResultTitulo.setText("");
            ResultGenero.setText("");
            ResultAno.setText("");
            ResultPais.setText("");
            ResultDiretor.setText("");
            ResultIdioma.setText("");
            ResultDuracao.setText("");
            ResultTrilha.setText("");
            ResultTrailer.setText("");
            ResultAssistiu.setText("");
            ResultSinopse.setText("");           
        }

    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonVoltar = new javax.swing.JButton();
        LabelTituloCadastro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTFilmes = new javax.swing.JTable();
        CampoPesquisa = new javax.swing.JTextField();
        ButtonPesquisa = new javax.swing.JButton();
        LabelTitulo = new javax.swing.JLabel();
        LabelGenero = new javax.swing.JLabel();
        LabelAno = new javax.swing.JLabel();
        LabelPais = new javax.swing.JLabel();
        LabelDiretor = new javax.swing.JLabel();
        LabelIdioma = new javax.swing.JLabel();
        LabelDuracao = new javax.swing.JLabel();
        LabelTrilha = new javax.swing.JLabel();
        LabelTrailer = new javax.swing.JLabel();
        LabelAssistiu = new javax.swing.JLabel();
        ResultTitulo = new javax.swing.JLabel();
        ResultGenero = new javax.swing.JLabel();
        ResultAno = new javax.swing.JLabel();
        ResultDiretor = new javax.swing.JLabel();
        ResultIdioma = new javax.swing.JLabel();
        ResultDuracao = new javax.swing.JLabel();
        ResultTrilha = new javax.swing.JLabel();
        ResultTrailer = new javax.swing.JLabel();
        ResultAssistiu = new javax.swing.JLabel();
        ResultPais = new javax.swing.JLabel();
        LabelAssistiu1 = new javax.swing.JLabel();
        jPainelTextAreaSinopse = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ResultSinopse = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("OrganizaME - Visualizar");

        ButtonVoltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButtonVoltar.setText("Voltar");
        ButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltarActionPerformed(evt);
            }
        });

        LabelTituloCadastro.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        LabelTituloCadastro.setText("Filmes");

        jTFilmes.setModel(tmFilmes);
        jTFilmes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmFilme = jTFilmes.getSelectionModel();
        lsmFilme.addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent e){
                if(! e.getValueIsAdjusting()){
                    JTFilmesLinhaSelecionada(jTFilmes);
                }
            }
        });
        jScrollPane1.setViewportView(jTFilmes);

        ButtonPesquisa.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        ButtonPesquisa.setText("Pesquisar");
        ButtonPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPesquisaActionPerformed(evt);
            }
        });

        LabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelTitulo.setText("Título:");

        LabelGenero.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelGenero.setText("Gênero:");

        LabelAno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelAno.setText("Ano de lançamento:");

        LabelPais.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelPais.setText("País de origem:");

        LabelDiretor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelDiretor.setText("Diretor:");

        LabelIdioma.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelIdioma.setText("Idioma:");

        LabelDuracao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelDuracao.setText("Tempo de duração:");

        LabelTrilha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelTrilha.setText("Trilha sonora:");

        LabelTrailer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelTrailer.setText("Trailer:");

        LabelAssistiu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelAssistiu.setText("Já Assistiu?");

        ResultTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ResultTitulo.setForeground(new java.awt.Color(0, 51, 102));
        ResultTitulo.setText(".");

        ResultGenero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ResultGenero.setForeground(new java.awt.Color(0, 51, 102));
        ResultGenero.setText(".");

        ResultAno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ResultAno.setForeground(new java.awt.Color(0, 51, 102));
        ResultAno.setText(".");

        ResultDiretor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ResultDiretor.setForeground(new java.awt.Color(0, 51, 102));
        ResultDiretor.setText(".");

        ResultIdioma.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ResultIdioma.setForeground(new java.awt.Color(0, 51, 102));
        ResultIdioma.setText(".");

        ResultDuracao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ResultDuracao.setForeground(new java.awt.Color(0, 51, 102));
        ResultDuracao.setText(".");

        ResultTrilha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ResultTrilha.setForeground(new java.awt.Color(0, 51, 102));
        ResultTrilha.setText(".");

        ResultTrailer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ResultTrailer.setForeground(new java.awt.Color(0, 51, 102));
        ResultTrailer.setText(".");

        ResultAssistiu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ResultAssistiu.setForeground(new java.awt.Color(0, 51, 102));
        ResultAssistiu.setText(".");

        ResultPais.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ResultPais.setForeground(new java.awt.Color(0, 51, 102));
        ResultPais.setText(".");

        LabelAssistiu1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelAssistiu1.setText("Sinopse:");

        ResultSinopse.setColumns(20);
        ResultSinopse.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        ResultSinopse.setRows(5);
        ResultSinopse.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(ResultSinopse);
        ResultSinopse.setLineWrap(true);

        ResultSinopse.setEditable(false);

        javax.swing.GroupLayout jPainelTextAreaSinopseLayout = new javax.swing.GroupLayout(jPainelTextAreaSinopse);
        jPainelTextAreaSinopse.setLayout(jPainelTextAreaSinopseLayout);
        jPainelTextAreaSinopseLayout.setHorizontalGroup(
            jPainelTextAreaSinopseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );
        jPainelTextAreaSinopseLayout.setVerticalGroup(
            jPainelTextAreaSinopseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelDuracao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResultDuracao))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelGenero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResultGenero))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelDiretor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResultDiretor))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelIdioma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResultIdioma))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelTrailer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResultTrailer))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelAssistiu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResultAssistiu))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelTrilha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResultTrilha))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelAno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResultAno))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelPais)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResultPais))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResultTitulo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 497, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPainelTextAreaSinopse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LabelAssistiu1)
                                .addGap(250, 250, 250))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonPesquisa)
                        .addGap(110, 110, 110)
                        .addComponent(LabelTituloCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelTituloCadastro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ResultTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelAssistiu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ResultGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ResultAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ResultPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelDiretor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ResultDiretor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelIdioma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ResultIdioma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelDuracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ResultDuracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelTrilha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ResultTrilha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelTrailer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ResultTrailer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelAssistiu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ResultAssistiu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPainelTextAreaSinopse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addComponent(ButtonVoltar)
                        .addGap(10, 10, 10))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarActionPerformed

        dispose();

    }//GEN-LAST:event_ButtonVoltarActionPerformed

    private void ButtonPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPesquisaActionPerformed

        try {
            listarFilmes();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problama na pesquisa" + ex);
        }


    }//GEN-LAST:event_ButtonPesquisaActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VisualizarTela().setVisible(true);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "AAA" + ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonPesquisa;
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JTextField CampoPesquisa;
    private javax.swing.JLabel LabelAno;
    private javax.swing.JLabel LabelAssistiu;
    private javax.swing.JLabel LabelAssistiu1;
    private javax.swing.JLabel LabelDiretor;
    private javax.swing.JLabel LabelDuracao;
    private javax.swing.JLabel LabelGenero;
    private javax.swing.JLabel LabelIdioma;
    private javax.swing.JLabel LabelPais;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JLabel LabelTituloCadastro;
    private javax.swing.JLabel LabelTrailer;
    private javax.swing.JLabel LabelTrilha;
    private javax.swing.JLabel ResultAno;
    private javax.swing.JLabel ResultAssistiu;
    private javax.swing.JLabel ResultDiretor;
    private javax.swing.JLabel ResultDuracao;
    private javax.swing.JLabel ResultGenero;
    private javax.swing.JLabel ResultIdioma;
    private javax.swing.JLabel ResultPais;
    private javax.swing.JTextArea ResultSinopse;
    private javax.swing.JLabel ResultTitulo;
    private javax.swing.JLabel ResultTrailer;
    private javax.swing.JLabel ResultTrilha;
    private javax.swing.JPanel jPainelTextAreaSinopse;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTFilmes;
    // End of variables declaration//GEN-END:variables

}
