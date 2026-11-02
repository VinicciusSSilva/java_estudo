package view;

import controller.ClienteController;
import model.Cliente;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class ClienteView extends JFrame {

    private JTextField txtCodigo, txtNome, txtNumero, txtEmail;
    private JButton btnCadastrar, btnBuscar, btnAlterar, btnExcluir, btnListar, btnLimpar;
    private JTable tabelaClientes;
    private DefaultTableModel modeloTabela;
    private ClienteController controller;

    public ClienteView() {
        controller = new ClienteController();

        setTitle("Cadastro de Clientes");
        setSize(650, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // --- PAINEL DO FORMULÁRIO ---
        JPanel painelFormulario = new JPanel(new GridLayout(4, 2, 10, 10));
        painelFormulario.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        painelFormulario.add(new JLabel("Código:"));
        txtCodigo = new JTextField();
        painelFormulario.add(txtCodigo);

        painelFormulario.add(new JLabel("Nome:"));
        txtNome = new JTextField();
        painelFormulario.add(txtNome);

        painelFormulario.add(new JLabel("Número (Telefone):"));
        txtNumero = new JTextField();
        painelFormulario.add(txtNumero);

        painelFormulario.add(new JLabel("Email:"));
        txtEmail = new JTextField();
        painelFormulario.add(txtEmail);

        add(painelFormulario, BorderLayout.NORTH);

        // --- PAINEL DOS BOTÕES ---
        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        btnCadastrar = new JButton("Cadastrar");
        btnBuscar = new JButton("Buscar");
        btnAlterar = new JButton("Alterar");
        btnExcluir = new JButton("Excluir");
        btnListar = new JButton("Listar");
        btnLimpar = new JButton("Limpar");

        painelBotoes.add(btnCadastrar);
        painelBotoes.add(btnBuscar);
        painelBotoes.add(btnAlterar);
        painelBotoes.add(btnExcluir);
        painelBotoes.add(btnListar);
        painelBotoes.add(btnLimpar);

        add(painelBotoes, BorderLayout.CENTER);

        // --- PAINEL DA TABELA ---
        modeloTabela = new DefaultTableModel(new Object[]{"Código", "Nome", "Número", "Email"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Impede a edição direta das células
            }
        };
        tabelaClientes = new JTable(modeloTabela);
        JScrollPane scrollTabela = new JScrollPane(tabelaClientes);
        scrollTabela.setPreferredSize(new Dimension(600, 200));

        add(scrollTabela, BorderLayout.SOUTH);

        // Configuração dos ouvintes de eventos
        configurarEventos();

        // Carrega os dados iniciais na tabela
        atualizarTabela();
    }

    private void configurarEventos() {
        // CADASTRAR
        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarCamposCompletos()) {
                    int codigo = Integer.parseInt(txtCodigo.getText().trim());

                    // Validação: Impedir código duplicado
                    if (controller.buscar(codigo) != null) {
                        JOptionPane.showMessageDialog(null, "Já existe um cliente cadastrado com este código!", "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    String nome = txtNome.getText().trim();
                    String numero = txtNumero.getText().trim();
                    String email = txtEmail.getText().trim();

                    controller.cadastrar(codigo, nome, numero, email);
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

                    limparCampos();
                    atualizarTabela();
                }
            }
        });

        // BUSCAR
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarCodigo()) {
                    int codigo = Integer.parseInt(txtCodigo.getText().trim());
                    Cliente cliente = controller.buscar(codigo);

                    if (cliente != null) {
                        txtNome.setText(cliente.getNome());
                        txtNumero.setText(cliente.getNumero());
                        txtEmail.setText(cliente.getEmail());
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado!", "Aviso", JOptionPane.WARNING_MESSAGE);
                        limparCampos();
                        txtCodigo.setText(String.valueOf(codigo));
                    }
                }
            }
        });

        // ALTERAR
        btnAlterar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarCamposCompletos()) {
                    int codigo = Integer.parseInt(txtCodigo.getText().trim());
                    String nome = txtNome.getText().trim();
                    String numero = txtNumero.getText().trim();
                    String email = txtEmail.getText().trim();

                    boolean alterado = controller.alterar(codigo, nome, numero, email);

                    if (alterado) {
                        JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                        limparCampos();
                        atualizarTabela();
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado para alteração!", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });

        // EXCLUIR
        btnExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarCodigo()) {
                    int codigo = Integer.parseInt(txtCodigo.getText().trim());

                    if (controller.buscar(codigo) == null) {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    // Confirmação antes de excluir
                    int confirmacao = JOptionPane.showConfirmDialog(
                            null,
                            "Tem certeza de que deseja excluir este cliente?",
                            "Confirmar Exclusão",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.QUESTION_MESSAGE
                    );

                    if (confirmacao == JOptionPane.YES_OPTION) {
                        boolean removido = controller.remover(codigo);
                        if (removido) {
                            JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                            limparCampos();
                            atualizarTabela();
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro ao excluir o cliente.", "Erro", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        });

        // LISTAR
        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarTabela();
            }
        });

        // LIMPAR
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparCampos();
            }
        });

        // SELEÇÃO AUTOMÁTICA NA JTABLE
        tabelaClientes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int linhaSelecionada = tabelaClientes.getSelectedRow();
                if (linhaSelecionada != -1) {
                    txtCodigo.setText(modeloTabela.getValueAt(linhaSelecionada, 0).toString());
                    txtNome.setText(modeloTabela.getValueAt(linhaSelecionada, 1).toString());
                    txtNumero.setText(modeloTabela.getValueAt(linhaSelecionada, 2).toString());
                    txtEmail.setText(modeloTabela.getValueAt(linhaSelecionada, 3).toString());
                }
            }
        });
    }

    // --- MÉTODOS AUXILIARES ---

    private void atualizarTabela() {
        modeloTabela.setRowCount(0);
        ArrayList<Cliente> lista = controller.listar();
        for (Cliente c : lista) {
            modeloTabela.addRow(new Object[]{c.getCodigo(), c.getNome(), c.getNumero(), c.getEmail()});
        }
    }

    private void limparCampos() {
        txtCodigo.setText("");
        txtNome.setText("");
        txtNumero.setText("");
        txtEmail.setText("");
        tabelaClientes.clearSelection();
    }

    private boolean validarCamposCompletos() {
        if (txtCodigo.getText().trim().isEmpty() ||
            txtNome.getText().trim().isEmpty() ||
            txtNumero.getText().trim().isEmpty() ||
            txtEmail.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Não são permitidos campos vazios!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return validarCodigo();
    }

    private boolean validarCodigo() {
        String textoCodigo = txtCodigo.getText().trim();
        if (textoCodigo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe o código do cliente!", "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        try {
            int codigo = Integer.parseInt(textoCodigo);
            if (codigo <= 0) {
                JOptionPane.showMessageDialog(null, "O código deve ser um número inteiro positivo!", "Aviso", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O código deve ser um número inteiro válido!", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}