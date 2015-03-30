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

public class EditarExcluirTela extends javax.swing.JFrame {

    private final JLabel imgFundoCad;
    private Object contentPane;

    public EditarExcluirTela() throws IOException {
        initComponents();

        Image editImg = ImageIO.read(getClass().getResource("/Imagens/alt2.png"));
        setIconImage(editImg);
        
        imgFundoCad = new JLabel();
        imgFundoCad.setSize(1280, 768);
        imgFundoCad.setIcon(new ImageIcon("images/fundoVisualizar2.jpg"));
        
        Container pane = this.getContentPane();

        pane.add(imgFundoCad);

        this.setSize(1280, 768);
        this.setResizable(false);
        this.setLocation(0, 100);
        
        //ocultar campo ID
        ResultId.setVisible(false);
    }
    
        public boolean verificaDados() {

        if (!ResultTitulo.getText().equals("")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Campos Título não preenchido");
           
            return false;
        }
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

            ResultId.setText(String.valueOf(filmes.get(tabela.getSelectedRow()).getId()));
            ResultTitulo.setText(filmes.get(tabela.getSelectedRow()).getTitulo());
            ResultGenero.setSelectedItem(filmes.get(tabela.getSelectedRow()).getGenero());
            ResultAno.setText(filmes.get(tabela.getSelectedRow()).getAno_lancamento());
            ResultPais.setText(filmes.get(tabela.getSelectedRow()).getPais());
            ResultDiretor.setText(filmes.get(tabela.getSelectedRow()).getDiretor());
            ResultIdioma.setText(filmes.get(tabela.getSelectedRow()).getIdioma());
            ResultDuracao.setText(filmes.get(tabela.getSelectedRow()).getTempo_duracao());
            ResultTrilha.setText(filmes.get(tabela.getSelectedRow()).getTrilha_sonora());
            ResultTrailer.setText(filmes.get(tabela.getSelectedRow()).getTrailer());
            ResultSinopse.setText(filmes.get(tabela.getSelectedRow()).getSinopse());


        } else {
            ResultTitulo.setText("");
            ResultGenero.setSelectedItem("");
            ResultAno.setText("");
            ResultPais.setText("");
            ResultDiretor.setText("");
            ResultIdioma.setText("");
            ResultDuracao.setText("");
            ResultTrilha.setText("");
            ResultTrailer.setText("");
            ResultSinopse.setText("");           
        }

    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupAssistiu = new javax.swing.ButtonGroup();
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
        LabelAssistiu1 = new javax.swing.JLabel();
        jPainelTextAreaSinopse = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ResultSinopse = new javax.swing.JTextArea();
        ResultTitulo = new javax.swing.JTextField();
        ResultGenero = new javax.swing.JComboBox();
        ResultAno = new javax.swing.JTextField();
        ResultPais = new javax.swing.JTextField();
        ResultDiretor = new javax.swing.JTextField();
        ResultIdioma = new javax.swing.JTextField();
        ResultDuracao = new javax.swing.JTextField();
        ResultTrilha = new javax.swing.JTextField();
        ResultTrailer = new javax.swing.JTextField();
        RadioButtonSim = new javax.swing.JRadioButton();
        RadioButtonNao = new javax.swing.JRadioButton();
        ButtonAlterar = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        ResultId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("OrganizaME - Editar");

        ButtonVoltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButtonVoltar.setText("Voltar");
        ButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltarActionPerformed(evt);
            }
        });

        LabelTituloCadastro.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        LabelTituloCadastro.setText("Editar");

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

        LabelAssistiu1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LabelAssistiu1.setText("Sinopse:");

        ResultSinopse.setColumns(20);
        ResultSinopse.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        ResultSinopse.setRows(5);
        ResultSinopse.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(ResultSinopse);
        ResultSinopse.setLineWrap(true);

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

        ResultTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultTituloActionPerformed(evt);
            }
        });

        ResultGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ação", "Animação", "Aventura", "Comédia", "Comédia Romântica", "Comédia Dramática", "Documentário", "Drama", "Faroeste", "Ficção Científica", "Guerra", "Musical", "Policial", "Romance", "Suspense", "Terror" }));
        ResultGenero.setToolTipText("");
        ResultGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultGeneroActionPerformed(evt);
            }
        });

        ResultAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultAnoActionPerformed(evt);
            }
        });

        ResultPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultPaisActionPerformed(evt);
            }
        });

        ResultDiretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultDiretorActionPerformed(evt);
            }
        });

        ResultIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultIdiomaActionPerformed(evt);
            }
        });

        ResultDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultDuracaoActionPerformed(evt);
            }
        });

        ResultTrilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultTrilhaActionPerformed(evt);
            }
        });

        ResultTrailer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultTrailerActionPerformed(evt);
            }
        });

        buttonGroupAssistiu.add(RadioButtonSim);
        RadioButtonSim.setText("Sim");
        RadioButtonSim.setToolTipText("");
        RadioButtonSim.setActionCommand("SIM");
        RadioButtonSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonSimActionPerformed(evt);
            }
        });

        buttonGroupAssistiu.add(RadioButtonNao);
        RadioButtonNao.setSelected(true);
        RadioButtonNao.setText("Não");
        RadioButtonNao.setToolTipText("");
        RadioButtonNao.setActionCommand("NÃO");
        RadioButtonNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonNaoActionPerformed(evt);
            }
        });

        ButtonAlterar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButtonAlterar.setText("Alterar");
        ButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAlterarActionPerformed(evt);
            }
        });

        ButtonExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ButtonExcluir.setText("Excluir");
        ButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirActionPerformed(evt);
            }
        });

        ResultId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelGenero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResultGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelAssistiu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RadioButtonSim)
                                .addGap(10, 10, 10)
                                .addComponent(RadioButtonNao))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LabelPais)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResultPais))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LabelDiretor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResultDiretor))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LabelIdioma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResultIdioma))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelDuracao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResultDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelTrilha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResultTrilha, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelTrailer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResultTrailer))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelAno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResultAno))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ResultTitulo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(136, 136, 136)
                                .addComponent(ButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(ButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPainelTextAreaSinopse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(LabelAssistiu1)
                                    .addGap(250, 250, 250)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonPesquisa)
                        .addGap(110, 110, 110)
                        .addComponent(LabelTituloCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ResultId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelTituloCadastro)
                            .addComponent(ResultId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelAssistiu1)
                    .addComponent(ResultTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelGenero, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ResultGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ResultAno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelPais, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ResultPais, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelDiretor, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ResultDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelIdioma, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ResultIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelDuracao)
                            .addComponent(ResultDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelTrilha)
                            .addComponent(ResultTrilha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelTrailer, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ResultTrailer, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(RadioButtonSim)
                                .addComponent(RadioButtonNao))
                            .addComponent(LabelAssistiu)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPainelTextAreaSinopse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonVoltar)
                            .addComponent(ButtonAlterar)
                            .addComponent(ButtonExcluir))
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

    private void ResultTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultTituloActionPerformed

    private void ResultGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultGeneroActionPerformed

    private void ResultAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultAnoActionPerformed

    private void ResultPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultPaisActionPerformed

    private void ResultDiretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultDiretorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultDiretorActionPerformed

    private void ResultIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultIdiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultIdiomaActionPerformed

    private void ResultDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultDuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultDuracaoActionPerformed

    private void ResultTrilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultTrilhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultTrilhaActionPerformed

    private void ResultTrailerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultTrailerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultTrailerActionPerformed

    private void RadioButtonSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonSimActionPerformed

        RadioButtonSim.setFocusPainted(false);
    }//GEN-LAST:event_RadioButtonSimActionPerformed

    private void RadioButtonNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonNaoActionPerformed

        RadioButtonNao.setFocusPainted(false);
    }//GEN-LAST:event_RadioButtonNaoActionPerformed

    private void alterarFilme() throws SQLException{
        
       if(jTFilmes.getSelectedRow() != -1){
            if(verificaDados()){
               Filme filmes = new Filme(); 
               FilmeDao dao = new FilmeDao();
             
              filmes.setId(Long.valueOf(ResultId.getText()));
              filmes.setTitulo(ResultTitulo.getText());              
              filmes.setPais(ResultPais.getText());
              filmes.setDiretor(ResultDiretor.getText());
              filmes.setTrilha_sonora(ResultTrilha.getText());
              filmes.setTempo_duracao(ResultDuracao.getText());
              filmes.setAno_lancamento(ResultAno.getText());
              filmes.setIdioma(ResultIdioma.getText());
              filmes.setTrailer(ResultTrailer.getText());
              filmes.setGenero(ResultGenero.getSelectedItem().toString());
              filmes.setJa_assistiu(buttonGroupAssistiu.getSelection().getActionCommand());
              filmes.setSinopse(ResultSinopse.getText());
              //filmes.setComentario(CampoComentario.getText());
              dao.altera(filmes);
              JOptionPane.showMessageDialog(null, "Filme alterado com sucesso.");
            }
            
        }
        
        
    }

    private void ButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAlterarActionPerformed

        try {
            alterarFilme();
            listarFilmes();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar filme.");
        }
        
    }//GEN-LAST:event_ButtonAlterarActionPerformed

    public void excluirFilme() throws SQLException {
        int resp = JOptionPane.showConfirmDialog(null, "Deseja excluir este filme?",
                "Excluir?", JOptionPane.YES_NO_OPTION);

        if (resp == JOptionPane.YES_NO_OPTION) {
            FilmeDao dao = new FilmeDao();
            dao.remove(filmes.get(jTFilmes.getSelectedRow()));            
        }
    }
    
   
    
    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed

        try {
            excluirFilme();
            listarFilmes();
        } catch (SQLException ex) {
             JOptionPane.showConfirmDialog(null, "Erro ao excluir" + ex);
        }
        
        
    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void ResultIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultIdActionPerformed
       
    }//GEN-LAST:event_ResultIdActionPerformed

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
            java.util.logging.Logger.getLogger(VisualizarTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizarTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizarTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizarTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VisualizarTela().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(EditarExcluirTela.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAlterar;
    private javax.swing.JButton ButtonExcluir;
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
    private javax.swing.JRadioButton RadioButtonNao;
    private javax.swing.JRadioButton RadioButtonSim;
    private javax.swing.JTextField ResultAno;
    private javax.swing.JTextField ResultDiretor;
    private javax.swing.JTextField ResultDuracao;
    private javax.swing.JComboBox ResultGenero;
    private javax.swing.JTextField ResultId;
    private javax.swing.JTextField ResultIdioma;
    private javax.swing.JTextField ResultPais;
    private javax.swing.JTextArea ResultSinopse;
    private javax.swing.JTextField ResultTitulo;
    private javax.swing.JTextField ResultTrailer;
    private javax.swing.JTextField ResultTrilha;
    private javax.swing.ButtonGroup buttonGroupAssistiu;
    private javax.swing.JPanel jPainelTextAreaSinopse;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTFilmes;
    // End of variables declaration//GEN-END:variables

}
