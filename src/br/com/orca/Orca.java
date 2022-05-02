package br.com.orca;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.NumberFormat;

public class Orca {

	private JFrame Janela;
	private JTextField txtMedida1;
	private JTextField txtMedida2;
	private JTextField txtQtde;
	private JLabel lblQuantidade;
	private JLabel lblArea;
	private JLabel lblQtdePorM;
	private JLabel lblMetragemPorQtde;
	private JLabel lblQtdePorVM;
	private JLabel lblValorPorAds;
	private JLabel lblValorTotal;
	private JTextField txtArea;
	private JTextField txtQtdePorM;
	private JTextField txtMetragemPorQtde;
	private JTextField txtQtdePorVM;
	private JTextField txtValorPorAds;
	private JTextField txtValorTotal;
	private Calc calc = new Calc();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		//String a = NumberFormat.getCurrencyInstance().format(32563);
		//System.out.println(a);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Orca window = new Orca();
					window.Janela.setVisible(true);
					window.Janela.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Orca() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Janela = new JFrame();
		Janela.setResizable(false);
		Janela.getContentPane().setBackground(new Color(255, 255, 255));
		Janela.setTitle("Orca 1.0");
		Janela.setBounds(100, 100, 680, 300);
		Janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Janela.getContentPane().setLayout(null);
		
		JLabel lblMedida1 = new JLabel("Medida 1 (cm):");
		lblMedida1.setBounds(28, 35, 129, 20);
		lblMedida1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMedida1.setHorizontalAlignment(SwingConstants.LEFT);
		lblMedida1.setForeground(new Color(0, 128, 128));
		Janela.getContentPane().add(lblMedida1);
		
		txtMedida1 = new JTextField();
		txtMedida1.setBounds(167, 35, 86, 20);
		Janela.getContentPane().add(txtMedida1);
		txtMedida1.setColumns(10);
		
		JLabel lblMedida2 = new JLabel("Medida 2 (cm):");
		lblMedida2.setHorizontalAlignment(SwingConstants.LEFT);
		lblMedida2.setForeground(new Color(0, 128, 128));
		lblMedida2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMedida2.setBounds(28, 90, 129, 20);
		Janela.getContentPane().add(lblMedida2);
		
		txtMedida2 = new JTextField();
		txtMedida2.setColumns(10);
		txtMedida2.setBounds(167, 90, 86, 20);
		Janela.getContentPane().add(txtMedida2);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(274, 11, 2, 239);
		Janela.getContentPane().add(separator);
		
		txtQtde = new JTextField();
		txtQtde.setColumns(10);
		txtQtde.setBounds(167, 145, 86, 20);
		Janela.getContentPane().add(txtQtde);
		
		lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setHorizontalAlignment(SwingConstants.LEFT);
		lblQuantidade.setForeground(new Color(0, 128, 128));
		lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblQuantidade.setBounds(28, 145, 129, 20);
		Janela.getContentPane().add(lblQuantidade);
		
		JButton btnCalcular = new JButton("Calcular");
		
		
		btnCalcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtArea.setText(calc.calcArea(Float.parseFloat(txtMedida1.getText()),Float.parseFloat(txtMedida2.getText())));
				txtQtdePorM.setText(calc.qtde_mquad());
				txtMetragemPorQtde.setText(calc.mquad_qtde(Integer.parseInt(txtQtde.getText())));
				txtQtdePorVM.setText(calc.qtde_vm());
				txtValorPorAds.setText(calc.valor_ads());
				txtValorTotal.setText(calc.valor_total());
			}
		});
		
		
		btnCalcular.setBounds(149, 200, 106, 50);
		Janela.getContentPane().add(btnCalcular);
		
		lblArea = new JLabel("Area do Adesivo (M\u00B2)");
		lblArea.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblArea.setForeground(new Color(0, 128, 128));
		lblArea.setBounds(297, 25, 180, 14);
		Janela.getContentPane().add(lblArea);
		
		lblQtdePorM = new JLabel("Quantidade / M\u00B2");
		lblQtdePorM.setForeground(new Color(0, 128, 128));
		lblQtdePorM.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQtdePorM.setBounds(297, 64, 180, 14);
		Janela.getContentPane().add(lblQtdePorM);
		
		lblMetragemPorQtde = new JLabel("Metragem/Qtde");
		lblMetragemPorQtde.setForeground(new Color(0, 128, 128));
		lblMetragemPorQtde.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblMetragemPorQtde.setBounds(297, 103, 180, 14);
		Janela.getContentPane().add(lblMetragemPorQtde);
		
		lblQtdePorVM = new JLabel("Quantidade / Valor Minimo");
		lblQtdePorVM.setForeground(new Color(0, 128, 128));
		lblQtdePorVM.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQtdePorVM.setBounds(297, 142, 227, 14);
		Janela.getContentPane().add(lblQtdePorVM);
		
		lblValorPorAds = new JLabel("Pre\u00E7o aproximado por adesivo");
		lblValorPorAds.setForeground(new Color(0, 128, 128));
		lblValorPorAds.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblValorPorAds.setBounds(297, 181, 258, 14);
		Janela.getContentPane().add(lblValorPorAds);
		
		lblValorTotal = new JLabel("Valor");
		lblValorTotal.setForeground(new Color(0, 128, 128));
		lblValorTotal.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblValorTotal.setBounds(297, 220, 227, 14);
		Janela.getContentPane().add(lblValorTotal);
		
		txtArea = new JTextField();
		txtArea.setEditable(false);
		txtArea.setBounds(562, 20, 86, 20);
		Janela.getContentPane().add(txtArea);
		txtArea.setColumns(10);
		
		txtQtdePorM = new JTextField();
		txtQtdePorM.setEditable(false);
		txtQtdePorM.setColumns(10);
		txtQtdePorM.setBounds(562, 60, 86, 20);
		Janela.getContentPane().add(txtQtdePorM);
		
		txtMetragemPorQtde = new JTextField();
		txtMetragemPorQtde.setEditable(false);
		txtMetragemPorQtde.setColumns(10);
		txtMetragemPorQtde.setBounds(562, 100, 86, 20);
		Janela.getContentPane().add(txtMetragemPorQtde);
		
		txtQtdePorVM = new JTextField();
		txtQtdePorVM.setEditable(false);
		txtQtdePorVM.setColumns(10);
		txtQtdePorVM.setBounds(562, 140, 86, 20);
		Janela.getContentPane().add(txtQtdePorVM);
		
		txtValorPorAds = new JTextField();
		txtValorPorAds.setEditable(false);
		txtValorPorAds.setColumns(10);
		txtValorPorAds.setBounds(562, 180, 86, 20);
		Janela.getContentPane().add(txtValorPorAds);
		
		txtValorTotal = new JTextField();
		txtValorTotal.setEditable(false);
		txtValorTotal.setColumns(10);
		txtValorTotal.setBounds(562, 220, 86, 20);
		Janela.getContentPane().add(txtValorTotal);
	}
}
