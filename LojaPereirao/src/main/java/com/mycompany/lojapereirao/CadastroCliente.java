/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lojapereirao;

import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class CadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
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

        pnlAbasClientes = new javax.swing.JTabbedPane();
        pnlDadosPessoais = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        cboSexo = new javax.swing.JComboBox<>();
        txtDataNacimento = new javax.swing.JFormattedTextField();
        pnlContatos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtCEP = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        cboUF = new javax.swing.JComboBox<>();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lblCodigoCliente = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Cliente");

        pnlDadosPessoais.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel3.setText("Sexo:");

        jLabel7.setText("Data Nacimento:");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Sexo", "M", "F" }));

        try {
            txtDataNacimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnlDadosPessoaisLayout = new javax.swing.GroupLayout(pnlDadosPessoais);
        pnlDadosPessoais.setLayout(pnlDadosPessoaisLayout);
        pnlDadosPessoaisLayout.setHorizontalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtDataNacimento, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        pnlDadosPessoaisLayout.setVerticalGroup(
            pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosPessoaisLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnlDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDataNacimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pnlAbasClientes.addTab("Dados Pessoais", pnlDadosPessoais);

        pnlContatos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Logradouro:");

        jLabel5.setText("Telefone:");

        jLabel6.setText("Celular:");

        jLabel8.setText("Cidade:");

        jLabel9.setText("U.F.:");

        jLabel10.setText("CEP:");

        jLabel11.setText("E-mail:");

        try {
            txtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cboUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a U.F.", "RO", "AC", "AM", "RR", "PA", "AP", "TO", "MA", "PI", "CE", "RN", "PB", "PE", "AL", "SE", "BA", "MG", "ES", "RJ", "SP", "PR", "SC", "RS", "MS", "MT", "GO", "DF" }));

        javax.swing.GroupLayout pnlContatosLayout = new javax.swing.GroupLayout(pnlContatos);
        pnlContatos.setLayout(pnlContatosLayout);
        pnlContatosLayout.setHorizontalGroup(
            pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContatosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addGroup(pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlContatosLayout.createSequentialGroup()
                            .addGroup(pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel8))
                            .addGap(18, 18, 18)
                            .addGroup(pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlContatosLayout.createSequentialGroup()
                            .addGroup(pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlContatosLayout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContatosLayout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(61, 61, 61)))
                            .addGroup(pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCEP, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cboUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        pnlContatosLayout.setVerticalGroup(
            pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContatosLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cboUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlContatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pnlAbasClientes.addTab("Contatos", pnlContatos);

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setText("Codigo Cliente:");

        lblCodigoCliente.setText(" ");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jMenu1.setText("Menu");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Incluir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Alterar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem3.setText("Excluir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem4.setText("Cancelar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(lblCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnlAbasClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPesquisar)
                                .addGap(46, 46, 46)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(39, 39, 39))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAlterar, btnExcluir, btnIncluir, btnPesquisar, jButton1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblCodigoCliente))
                .addGap(2, 2, 2)
                .addComponent(pnlAbasClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar)
                    .addComponent(jButton1)
                    .addComponent(btnPesquisar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        ConsultaCliente consultaCli = new ConsultaCliente();
        consultaCli.setVisible(true);
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        String texto = "";
        int g=0;
        int h=0;

                
        if(txtNome.getText().isEmpty()){
            txtNome.setBackground(Color.red);
            texto += "-Nome não inserido";
            g++;
        } else {
            txtNome.setBackground(Color.white);
        }
        
        if(txtCPF.getText().replaceAll("\\D", "").isEmpty()){
            txtCPF.setBackground(Color.red);
            texto += "\n-CPF não inserido";
            g++;
        } else {
            txtCPF.setBackground(Color.white);
        }
        
        if(cboSexo.getSelectedIndex()==0){
            cboSexo.setBackground(Color.red);
            texto += "\n-Sexo não selecionado";
            g++;
        } else {
            cboSexo.setBackground(Color.white);
        }
        
        if(txtDataNacimento.getText().replaceAll("\\D", "").isEmpty()){
            txtDataNacimento.setBackground(Color.red);
            texto += "\n-Data de Nascimento não inserida";
            g++;
        } else {
            txtDataNacimento.setBackground(Color.white);
        }
        
        DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
        df.setLenient(false);
        try{
            df.parse(txtDataNacimento.getText());
        }catch(ParseException ex){
            h=1;
        }

        if(h==1){
            txtDataNacimento.setBackground(Color.red);
            texto += "\n-Data de Nascimento inválida";
            g++;
        }

        if(txtCEP.getText().replaceAll("\\D", "").isEmpty()){
            txtCEP.setBackground(Color.red);
            texto += "\n-CEP não inserido";
            g++;
        } else {
            txtCEP.setBackground(Color.white);
        }        
        
        if(txtTelefone.getText().replaceAll("\\D", "").isEmpty()){
            txtTelefone.setBackground(Color.red);
            texto += "\n-Telefone não inserido";
            g++;
        } else {
            txtTelefone.setBackground(Color.white);
        }
        
        if(g>0){
        JOptionPane.showMessageDialog(this, texto, "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
        JOptionPane.showMessageDialog(this, "Cadastro Concluido com Sucesso!", "Cadastro Concluído", JOptionPane.INFORMATION_MESSAGE);
                txtNome.setText("");
        txtCPF.setText("");
        cboSexo.setSelectedIndex(0);
        txtDataNacimento.setText("");
        txtLogradouro.setText("");
        txtCidade.setText("");
        cboUF.setSelectedIndex(0);
        txtCEP.setText("");
        txtTelefone.setText("");
        txtCelular.setText("");
        txtEmail.setText("");
        } 
        
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        String texto = "";
        int g=0;
        int h=0;

                
        if(txtNome.getText().isEmpty()){
            txtNome.setBackground(Color.red);
            texto += "-Nome não inserido";
            g++;
        } else {
            txtNome.setBackground(Color.white);
        }
        
        if(txtCPF.getText().replaceAll("\\D", "").isEmpty()){
            txtCPF.setBackground(Color.red);
            texto += "\n-CPF não inserido";
            g++;
        } else {
            txtCPF.setBackground(Color.white);
        }
        
        if(cboSexo.getSelectedIndex()==0){
            cboSexo.setBackground(Color.red);
            texto += "\n-Sexo não selecionado";
            g++;
        } else {
            cboSexo.setBackground(Color.white);
        }
        
        if(txtDataNacimento.getText().replaceAll("\\D", "").isEmpty()){
            txtDataNacimento.setBackground(Color.red);
            texto += "\n-Data de Nascimento não inserida";
            g++;
        } else {
            txtDataNacimento.setBackground(Color.white);
        }
        
        DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
        df.setLenient(false);
        try{
            df.parse(txtDataNacimento.getText());
        }catch(ParseException ex){
            h=1;
        }

        if(h==1){
            txtDataNacimento.setBackground(Color.red);
            texto += "\n-Data de Nascimento inválida";
            g++;
        }

        if(txtCEP.getText().replaceAll("\\D", "").isEmpty()){
            txtCEP.setBackground(Color.red);
            texto += "\n-CEP não inserido";
            g++;
        } else {
            txtCEP.setBackground(Color.white);
        }        
        
        if(txtTelefone.getText().replaceAll("\\D", "").isEmpty()){
            txtTelefone.setBackground(Color.red);
            texto += "\n-Telefone não inserido";
            g++;
        } else {
            txtTelefone.setBackground(Color.white);
        }
        
        if(g>0){
        JOptionPane.showMessageDialog(this, texto, "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
        JOptionPane.showMessageDialog(this, "Cadasto Alterado com Sucesso!", "Alteração Concluída", JOptionPane.INFORMATION_MESSAGE);
        txtNome.setText("");
        txtCPF.setText("");
        cboSexo.setSelectedIndex(0);
        txtDataNacimento.setText("");
        txtLogradouro.setText("");
        txtCidade.setText("");
        cboUF.setSelectedIndex(0);
        txtCEP.setText("");
        txtTelefone.setText("");
        txtCelular.setText("");
        txtEmail.setText("");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        txtNome.setText("");
        txtCPF.setText("");
        cboSexo.setSelectedIndex(0);
        txtDataNacimento.setText("");
        txtLogradouro.setText("");
        txtCidade.setText("");
        cboUF.setSelectedIndex(0);
        txtCEP.setText("");
        txtTelefone.setText("");
        txtCelular.setText("");
        txtEmail.setText("");
        
        JOptionPane.showMessageDialog(this, "Cadastro Excluído com Sucesso!", "Exclusão Concluída", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        String texto = "";
        int g=0;
        int h=0;

                
        if(txtNome.getText().isEmpty()){
            txtNome.setBackground(Color.red);
            texto += "-Nome não inserido";
            g++;
        } else {
            txtNome.setBackground(Color.white);
        }
        
        if(txtCPF.getText().replaceAll("\\D", "").isEmpty()){
            txtCPF.setBackground(Color.red);
            texto += "\n-CPF não inserido";
            g++;
        } else {
            txtCPF.setBackground(Color.white);
        }
        
        if(cboSexo.getSelectedIndex()==0){
            cboSexo.setBackground(Color.red);
            texto += "\n-Sexo não selecionado";
            g++;
        } else {
            cboSexo.setBackground(Color.white);
        }
        
        if(txtDataNacimento.getText().replaceAll("\\D", "").isEmpty()){
            txtDataNacimento.setBackground(Color.red);
            texto += "\n-Data de Nascimento não inserida";
            g++;
        } else {
            txtDataNacimento.setBackground(Color.white);
        }
        
        DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
        df.setLenient(false);
        try{
            df.parse(txtDataNacimento.getText());
        }catch(ParseException ex){
            h=1;
        }

        if(h==1){
            txtDataNacimento.setBackground(Color.red);
            texto += "\n-Data de Nascimento inválida";
            g++;
        }

        if(txtCEP.getText().replaceAll("\\D", "").isEmpty()){
            txtCEP.setBackground(Color.red);
            texto += "\n-CEP não inserido";
            g++;
        } else {
            txtCEP.setBackground(Color.white);
        }        
        
        if(txtTelefone.getText().replaceAll("\\D", "").isEmpty()){
            txtTelefone.setBackground(Color.red);
            texto += "\n-Telefone não inserido";
            g++;
        } else {
            txtTelefone.setBackground(Color.white);
        }
        
        if(g>0){
        JOptionPane.showMessageDialog(this, texto, "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
        JOptionPane.showMessageDialog(this, "Cadastro Concluido com Sucesso!", "Cadastro Concluído", JOptionPane.INFORMATION_MESSAGE);
                txtNome.setText("");
        txtCPF.setText("");
        cboSexo.setSelectedIndex(0);
        txtDataNacimento.setText("");
        txtLogradouro.setText("");
        txtCidade.setText("");
        cboUF.setSelectedIndex(0);
        txtCEP.setText("");
        txtTelefone.setText("");
        txtCelular.setText("");
        txtEmail.setText("");
        } 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String texto = "";
        int g=0;
        int h=0;

                
        if(txtNome.getText().isEmpty()){
            txtNome.setBackground(Color.red);
            texto += "-Nome não inserido";
            g++;
        } else {
            txtNome.setBackground(Color.white);
        }
        
        if(txtCPF.getText().replaceAll("\\D", "").isEmpty()){
            txtCPF.setBackground(Color.red);
            texto += "\n-CPF não inserido";
            g++;
        } else {
            txtCPF.setBackground(Color.white);
        }
        
        if(cboSexo.getSelectedIndex()==0){
            cboSexo.setBackground(Color.red);
            texto += "\n-Sexo não selecionado";
            g++;
        } else {
            cboSexo.setBackground(Color.white);
        }
        
        if(txtDataNacimento.getText().replaceAll("\\D", "").isEmpty()){
            txtDataNacimento.setBackground(Color.red);
            texto += "\n-Data de Nascimento não inserida";
            g++;
        } else {
            txtDataNacimento.setBackground(Color.white);
        }
        
        DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
        df.setLenient(false);
        try{
            df.parse(txtDataNacimento.getText());
        }catch(ParseException ex){
            h=1;
        }

        if(h==1){
            txtDataNacimento.setBackground(Color.red);
            texto += "\n-Data de Nascimento inválida";
            g++;
        }

        if(txtCEP.getText().replaceAll("\\D", "").isEmpty()){
            txtCEP.setBackground(Color.red);
            texto += "\n-CEP não inserido";
            g++;
        } else {
            txtCEP.setBackground(Color.white);
        }        
        
        if(txtTelefone.getText().replaceAll("\\D", "").isEmpty()){
            txtTelefone.setBackground(Color.red);
            texto += "\n-Telefone não inserido";
            g++;
        } else {
            txtTelefone.setBackground(Color.white);
        }
        
        if(g>0){
        JOptionPane.showMessageDialog(this, texto, "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
        JOptionPane.showMessageDialog(this, "Cadasto Alterado com Sucesso!", "Alteração Concluída", JOptionPane.INFORMATION_MESSAGE);
        txtNome.setText("");
        txtCPF.setText("");
        cboSexo.setSelectedIndex(0);
        txtDataNacimento.setText("");
        txtLogradouro.setText("");
        txtCidade.setText("");
        cboUF.setSelectedIndex(0);
        txtCEP.setText("");
        txtTelefone.setText("");
        txtCelular.setText("");
        txtEmail.setText("");
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
        txtNome.setText("");
        txtCPF.setText("");
        cboSexo.setSelectedIndex(0);
        txtDataNacimento.setText("");
        txtLogradouro.setText("");
        txtCidade.setText("");
        cboUF.setSelectedIndex(0);
        txtCEP.setText("");
        txtTelefone.setText("");
        txtCelular.setText("");
        txtEmail.setText("");
        
        JOptionPane.showMessageDialog(this, "Cadastro Excluído com Sucesso!", "Exclusão Concluída", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox<String> cboSexo;
    private javax.swing.JComboBox<String> cboUF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JLabel lblCodigoCliente;
    private javax.swing.JTabbedPane pnlAbasClientes;
    private javax.swing.JPanel pnlContatos;
    private javax.swing.JPanel pnlDadosPessoais;
    private javax.swing.JFormattedTextField txtCEP;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtDataNacimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
