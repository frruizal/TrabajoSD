import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private Carta c;
	private JTextField tx_ritmo;
	private JTextField tx_tiro;
	private JTextField tx_pase;
	private JTextField tx_regate;
	private JTextField tx_defensa;
	private JTextField tx_fisico;
	private JTextField tx_nombre;
	private JTextField tx_valoracion;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public Interfaz(Carta c) {
		this.c=c;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		Image imagenCarta = new ImageIcon(getClass().getResource("/Imagen/Imagen.png")).getImage();
		contentPane.setLayout(null);
		
		tx_nombre = new JTextField();
		tx_nombre.setForeground(Color.BLUE);
		tx_nombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tx_nombre.setBounds(165, 148, 86, 20);
		contentPane.add(tx_nombre);
		tx_nombre.setColumns(10);
		tx_nombre.setEditable(false);
		tx_nombre.setBackground(Color.YELLOW);
		
		tx_fisico = new JTextField();
		tx_fisico.setBounds(261, 226, 35, 20);
		contentPane.add(tx_fisico);
		tx_fisico.setColumns(10);
		tx_fisico.setEditable(false);
		tx_fisico.setBackground(Color.YELLOW);
		
		JLabel lblRitmo = new JLabel("RITMO");
		lblRitmo.setBounds(128, 179, 46, 14);
		contentPane.add(lblRitmo);
		
		JLabel lblPase = new JLabel("PASE");
		lblPase.setBounds(128, 229, 46, 14);
		contentPane.add(lblPase);
		
		JLabel lblTiro = new JLabel("TIRO");
		lblTiro.setBounds(128, 204, 46, 14);
		contentPane.add(lblTiro);
		
		JLabel lblRegate = new JLabel("REGATE");
		lblRegate.setBounds(205, 179, 46, 14);
		contentPane.add(lblRegate);
		
		JLabel lblDefensa = new JLabel("DEFENSA");
		lblDefensa.setBounds(205, 204, 46, 14);
		contentPane.add(lblDefensa);
		
		JLabel lblFisico = new JLabel("FISICO");
		lblFisico.setBounds(205, 229, 46, 14);
		contentPane.add(lblFisico);
		
		tx_ritmo = new JTextField();
		tx_ritmo.setBounds(165, 176, 30, 20);
		contentPane.add(tx_ritmo);
		tx_ritmo.setColumns(10);
		tx_ritmo.setEditable(false);
		tx_ritmo.setBackground(Color.YELLOW);
		
		tx_tiro = new JTextField();
		tx_tiro.setBounds(165, 204, 30, 20);
		contentPane.add(tx_tiro);
		tx_tiro.setColumns(10);
		tx_tiro.setEditable(false);
		tx_tiro.setBackground(Color.YELLOW);
		
		tx_pase = new JTextField();
		tx_pase.setBounds(165, 229, 30, 20);
		contentPane.add(tx_pase);
		tx_pase.setColumns(10);
		tx_pase.setEditable(false);
		tx_pase.setBackground(Color.YELLOW);
		
		tx_regate = new JTextField();
		tx_regate.setBounds(261, 176, 35, 20);
		contentPane.add(tx_regate);
		tx_regate.setColumns(10);
		tx_regate.setEditable(false);
		tx_regate.setBackground(Color.YELLOW);
		
		tx_defensa = new JTextField();
		tx_defensa.setBounds(261, 201, 35, 20);
		contentPane.add(tx_defensa);
		tx_defensa.setColumns(10);
		tx_defensa.setEditable(false);
		tx_defensa.setBackground(Color.YELLOW);
		
		tx_valoracion = new JTextField();
		tx_valoracion.setForeground(Color.BLUE);
		tx_valoracion.setFont(new Font("Tahoma", Font.PLAIN, 30));
		tx_valoracion.setBounds(135, 45, 65, 58);
		contentPane.add(tx_valoracion);
		tx_valoracion.setColumns(10);
		tx_valoracion.setEditable(false);
		tx_valoracion.setBackground(Color.YELLOW);
		
		JLabel imagen = new JLabel(new ImageIcon(imagenCarta));
		imagen.setBounds(5, 5, 419, 288);
		contentPane.add(imagen);
		
		this.setLocationRelativeTo(null);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.pack();
	}
	public void mostrarInterfaz() {
		this.setVisible(true);
		
		tx_nombre.setText(c.getNombre());
		tx_ritmo.setText(c.getRitmo());
		tx_tiro.setText(c.getTiro());
		tx_pase.setText(c.getPase());
		tx_regate.setText(c.getRegate());
		tx_defensa.setText(c.getDefensa());
		tx_fisico.setText(c.getFisico());
		tx_valoracion.setText(c.getValoracion()); 
		
	}
}
