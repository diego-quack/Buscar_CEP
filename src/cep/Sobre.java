package cep;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		setModal(true);
		setResizable(false);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar CEP - Ver 1");
		lblNewLabel.setBounds(48, 108, 155, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Autor: Diego Adami Biancardi");
		lblNewLabel_1.setBounds(48, 133, 208, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel btnGitHub = new JLabel("");
		btnGitHub.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://github.com/diego-quack/Buscar_CEP/commits?author=diego-quack");
			}
		});
		btnGitHub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGitHub.setToolTipText("Reposit\u00F3rio do projeto");
		btnGitHub.setIcon(new ImageIcon(Sobre.class.getResource("/img/github (2).png")));
		btnGitHub.setBounds(376, 202, 48, 48);
		getContentPane().add(btnGitHub);
		
		JLabel lblWebService = new JLabel("WEB Service:");
		lblWebService.setBounds(48, 158, 114, 14);
		getContentPane().add(lblWebService);
		
		JLabel lblRepublicaVirtual = new JLabel("republicavirtual.com.br");
		lblRepublicaVirtual.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://www.republicavirtual.com.br/");
			}
		});
		lblRepublicaVirtual.setForeground(SystemColor.textHighlight);
		lblRepublicaVirtual.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblRepublicaVirtual.setBounds(129, 158, 187, 14);
		getContentPane().add(lblRepublicaVirtual);

	}
	
	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
