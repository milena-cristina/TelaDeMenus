package exemplo_Aula10;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 37);
		contentPane.add(menuBar);
		
		JMenu menuCliente = new JMenu("Cliente");
		menuCliente.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/icones/atendimento-ao-cliente.png")));
		menuCliente.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(menuCliente);
		
		JMenuItem menuCadastroCliente = new JMenuItem("Cadastro");
		menuCadastroCliente.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/icones/cadastro.png")));
		menuCadastroCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroCliente cliente = new CadastroCliente();
				setContentPane(cliente);
				revalidate();
				
			}
		});
		menuCadastroCliente.setFont(new Font("Arial", Font.BOLD, 12));
		menuCliente.add(menuCadastroCliente);
		
		JMenuItem menuListagemCliente = new JMenuItem("Listagem");
		menuListagemCliente.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/icones/listagem.png")));
		menuListagemCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListagemCliente listagemCliente = new ListagemCliente();
				setContentPane(listagemCliente);
				revalidate();
			}
		});
		menuListagemCliente.setFont(new Font("Arial", Font.BOLD, 12));
		menuCliente.add(menuListagemCliente);
		
		JMenu menuEndereço = new JMenu("Endereço");
		menuEndereço.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/icones/localizacao.png")));
		menuEndereço.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(menuEndereço);
		
		JMenuItem menuCadastroEndereço = new JMenuItem("Cadastro");
		menuCadastroEndereço.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/icones/endereco.png")));
		menuCadastroEndereço.setFont(new Font("Arial", Font.BOLD, 12));
		menuEndereço.add(menuCadastroEndereço);
		
		JMenuItem menuListagemEndereço = new JMenuItem("Listagem");
		menuListagemEndereço.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/icones/listagem.png")));
		menuListagemEndereço.setFont(new Font("Arial", Font.BOLD, 12));
		menuEndereço.add(menuListagemEndereço);
		
		JMenu menuTelefone = new JMenu("Telefone");
		menuTelefone.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/icones/smartphone-para-gravar-a-mao.png")));
		menuTelefone.setFont(new Font("Arial", Font.BOLD, 12));
		menuBar.add(menuTelefone);
		
		JMenuItem menuCadastroTelefone = new JMenuItem("Cadastro");
		menuCadastroTelefone.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/icones/dedo-tocando-a-tela-do-tablet.png")));
		menuCadastroTelefone.setFont(new Font("Arial", Font.BOLD, 12));
		menuTelefone.add(menuCadastroTelefone);
		
		JMenuItem menuListagemTelefone = new JMenuItem("Listagem");
		menuListagemTelefone.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/icones/lista-telefonica.png")));
		menuListagemTelefone.setFont(new Font("Arial", Font.BOLD, 12));
		menuTelefone.add(menuListagemTelefone);
	}
}
