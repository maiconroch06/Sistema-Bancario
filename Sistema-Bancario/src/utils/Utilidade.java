package utils;

import java.awt.event.ActionEvent;

public class Utilidade {
    
    public static void atalho(javax.swing.AbstractButton botao, String tecla) {
        botao.getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(javax.swing.KeyStroke.getKeyStroke(tecla), tecla);

        botao.getActionMap().put(tecla, new javax.swing.AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botao.doClick();
            }
        });
    }
    
    public static void atalhoTelaCheia(javax.swing.JFrame frame, String tecla) {
        frame.getRootPane().getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(javax.swing.KeyStroke.getKeyStroke(tecla), tecla);
        frame.getRootPane().getActionMap().put(tecla, new javax.swing.AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean telaCheia = frame.isUndecorated();

                frame.dispose(); // obrigatório

                if (telaCheia) {
                    // VOLTAR AO NORMAL
                    frame.setUndecorated(false);
                    frame.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
                    frame.setLocationRelativeTo(null);
                } else {
                    // IR PARA TELA CHEIA
                    frame.setUndecorated(true);
                    frame.setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
                }

                frame.setVisible(true);
            }
        });
    }
    
    public static void atalhoSair(javax.swing.JFrame frame, String tecla) {
        frame.getRootPane().getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(javax.swing.KeyStroke.getKeyStroke(tecla), tecla);
        frame.getRootPane().getActionMap().put(tecla, new javax.swing.AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int escolha = javax.swing.JOptionPane.showConfirmDialog(
                        null,
                        "Deseja fechar o programa?",
                        "Confirmação",
                        javax.swing.JOptionPane.YES_OPTION,
                        javax.swing.JOptionPane.WARNING_MESSAGE
                );
                
                if(escolha == javax.swing.JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });
    }
    
    public static void focar(javax.swing.JTextField txt) {
        txt.requestFocusInWindow();
        txt.selectAll();
    }
    
    public static void exibirIcone(javax.swing.JFrame frame) {
        java.awt.Image icon = new javax.swing.ImageIcon(
                frame.getClass().getResource("/imagens/icone.png")).getImage();
        frame.setIconImage(icon.getScaledInstance(32, 32, java.awt.Image.SCALE_SMOOTH));
    }
    
    public static void carregarTabela(javax.swing.JTable tabelaContasBancarias, java.util.HashMap<String, classes.ContaBancaria> contas) {
        javax.swing.table.DefaultTableModel modeloTabela = (javax.swing.table.DefaultTableModel) tabelaContasBancarias.getModel();
        
        modeloTabela.setNumRows(0);
        for(classes.ContaBancaria campo : contas.values()) {
            modeloTabela.addRow(new Object[]{
                campo.getNumero(),
                campo.getNome(),
                campo.getSaldo(),
                campo.getTipoConta(),
                campo.getInformacao(),
                campo.mostrarSaldo()
            });
        }
        ordenacao(tabelaContasBancarias);
    }
    
    public static void ordenacao(javax.swing.JTable tabela){
        javax.swing.table.TableRowSorter<javax.swing.table.TableModel> sorter = new javax.swing.table.TableRowSorter<>(tabela.getModel());
        tabela.setRowSorter(sorter);
        sorter.toggleSortOrder(0);
    }

    public static void validarNumerico(javax.swing.JTextField txt) {
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.' && c != ',') {
                    e.consume();
                }
                if ((c == '.' || c == ',') && (txt.getText().contains(".") || txt.getText().contains(","))) {
                    e.consume();
                }
            }
        });
    }

    public static void validarInteiro(javax.swing.JTextField txt) {
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
    }
    
}
