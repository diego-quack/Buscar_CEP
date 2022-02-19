package cep;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Atxy2k.CustomTextField.RestrictedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Cep extends JFrame {

	private JPanel contentPane;
	private JTextField txtCep;
	private JTextField txtEndereco;
	private JTextField txtBairro;
	private JLabel lblNewLabel_3;
	private JTextField txtCidade;
	private JLabel lblNewLabel_4;
	private JButton btnSobre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cep frame = new Cep();
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
	public Cep() {
		setTitle("Buscar CEP");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Cep.class.getResource("/img/home.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CEP:");
		lblNewLabel.setBounds(54, 76, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtCep = new JTextField();
		txtCep.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtCep.setBounds(87, 70, 109, 20);
		contentPane.add(txtCep);
		txtCep.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o");
		lblNewLabel_1.setBounds(23, 107, 54, 14);
		contentPane.add(lblNewLabel_1);
		
		txtEndereco = new JTextField();
		txtEndereco.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtEndereco.setBounds(87, 104, 311, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Bairro");
		lblNewLabel_2.setBounds(42, 140, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtBairro = new JTextField();
		txtBairro.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtBairro.setBounds(87, 137, 311, 20);
		contentPane.add(txtBairro);
		txtBairro.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Cidade");
		lblNewLabel_3.setBounds(42, 171, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtCidade = new JTextField();
		txtCidade.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtCidade.setBounds(87, 168, 216, 20);
		contentPane.add(txtCidade);
		txtCidade.setColumns(10);
		
		lblNewLabel_4 = new JLabel("UF");
		lblNewLabel_4.setBounds(313, 171, 21, 14);
		contentPane.add(lblNewLabel_4);
		
		JComboBox cboUf = new JComboBox();
		cboUf.setModel(new DefaultComboBoxModel(new String[] {"", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		cboUf.setBorder(null);
		cboUf.setBackground(SystemColor.menu);
		cboUf.setBounds(334, 168, 64, 22);
		contentPane.add(cboUf);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBackground(SystemColor.menu);
		btnLimpar.setBounds(309, 69, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnCep = new JButton("Buscar");
		btnCep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtCep.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "É preciso informar o CEP");
					txtCep.requestFocus(); 
				}
				else {
					
				}
			}
		});
		btnCep.setBackground(SystemColor.menu);
		btnCep.setBounds(206, 69, 89, 23);
		contentPane.add(btnCep);
		
		btnSobre = new JButton("");
		btnSobre.setBackground(SystemColor.control);
		btnSobre.setToolTipText("Sobre");
		btnSobre.setBorder(null);
		btnSobre.setIcon(new ImageIcon(Cep.class.getResource("/img/about.png")));
		btnSobre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSobre.setBounds(376, 202, 48, 48);
		contentPane.add(btnSobre);
		
		RestrictedTextField validar = new RestrictedTextField(txtCep);
		validar.setOnlyNums(true);
		validar.setLimit(8);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
