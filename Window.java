package prueba;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Window  extends JFrame{

	private String actual = "login";
	private String anterior = "login";
	private JPanel gran_panel = null;
	
	JMenuBar Barra;
	JMenu Archivo, Ayuda;
	JMenuItem Guardar,Acerca;
	
	public Window() {
		
		//configuración_básica 
		this.setVisible(true);
		this.setSize(600, 600);
		this.setLayout(null);
		this.setTitle("	CUENTA");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(100, 100);
		this.setLocationRelativeTo(null); 
		this.getContentPane().setBackground(Color.decode("#188343"));
		
		this.route();
		
				JMenuBar jmb = new JMenuBar();
				jmb.setSize(this.getWidth(),20);
				
				this.add(jmb);
				
				JMenu jm1 = new JMenu("CUENTA");
				JMenu jm2 = new JMenu("USUARIOS");
				JMenu jm3 = new JMenu("AYUDA");
				jmb.add(jm1);
				jmb.add(jm2);
				jmb.add(jm3);
				
				JMenuItem jmi1 = new JMenuItem("LISTA DE USUARIOS ");
				JMenuItem jmi2 = new JMenuItem("CREAR USUARIOS ");
				
				jm2.add(jmi1);
				jm2.add(jmi2);
				
				
				JMenuItem jmi3 = new JMenuItem("MI CUENTA ");
				JMenuItem jmi4 = new JMenuItem("CERRAR SESION ");
				
				jm1.add(jmi3);
				jm1.add(jmi4);
				
				JMenuItem jmi5 = new JMenuItem("¿COMO CREAR USUARIOS? ");
				jm3.add(jmi5);
				
				
				
				
				//CUENTA PERSONAL
			/*jmi3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						anterior = actual;
						actual = "bienvenido";
						
						route();
					}});
				*/
				//CUENTA PERSONAL
				jmi3.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						anterior = actual;
						actual = "cuentapersonal";
						
						route();
					}});
				
				//LISTA DE USUARIO
				jmi1.addActionListener(new ActionListener() {
				
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						anterior = actual;
						actual = "listausuarios";
						
						route();
					}});
				
				
				//CREAR UN USUARIO
				jmi2.addActionListener(new ActionListener() {
				
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						anterior = actual;
						actual = "crearusuario";
						
						route();
					}});

			
				//¿COMO CREAR UN USUARIO?
				jmi5.addActionListener(new ActionListener() {
				
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						anterior = actual;
						actual = "crear";
						
						route();
					}});

	}
	
	public void route() {
		
		if(gran_panel!=null) {
			this.remove(gran_panel);
		}
		
		if(actual.equals("splash")) { 
			gran_panel = login();  
		}
		if(actual.equals("login")) { 
			gran_panel = login();  
		}
		if(actual.equals("registro")) { 
			gran_panel = registro();  
		}
		if(actual.equals("bienvenido")) { 
			gran_panel = bienvenido(); 
		
		}
		
		if(actual.equals("cuentapersonal")) { 
			gran_panel = cuentapersonal(); 
	
		}
		if(actual.equals("listausuarios")) { 
			gran_panel = listausuarios();
					
		}
		if(actual.equals("crearusuario")) { 
			gran_panel = crearusuario();
		}
		
			if(actual.equals("crear")) { 
				gran_panel = crear();
		}
		
		
		this.add(gran_panel);
		this.revalidate();
		this.repaint(); 
		
	}
	 
	public JPanel splash() {
		
		
		JPanel splash = new JPanel();
		splash.setVisible(true);
		splash.setSize(600, 600);
		splash.setBackground(Color.decode("#188343"));
		splash.setLayout(null);
		
		ImageIcon imagen =new ImageIcon("Foto.png");
		JButton im1=new JButton(imagen);
		im1.setSize(130,130);
		im1.setLocation(220,100);
		
		Image esc = imagen.getImage().getScaledInstance(im1.getWidth(), im1.getHeight(),Image.SCALE_SMOOTH);
		Icon ices=new ImageIcon(esc);
		im1.setIcon(ices);
		splash.add(im1);
		
		
		JLabel tag1 = new JLabel("Power by Jose ramon y Marco Antonio ");
		tag1.setSize(900,900);
		tag1.setFont(new Font("Arial", Font.BOLD, 15));
		tag1.setLocation(150, 95);
		splash.add(tag1);
		

		JButton jbnAccess = new JButton("E N T R A R");
		jbnAccess.setSize(380,30);
		jbnAccess.setLocation(100, 450);
		splash.add(jbnAccess);
		
		jbnAccess.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				anterior = actual;
				actual = "registro";
				
				route();
				
				revalidate();
				repaint();	
			
				
			
			}
			
		});
		
		return splash;
	}
	
	public JPanel login() {
		
		JPanel login = new JPanel();
		login.setVisible(true);
		login.setSize(600, 600);
		login.setBackground(Color.decode("#188343"));
		login.setLayout(null);
		
		JLabel tag1 = new JLabel("Accede A Tu Cuenta", JLabel.CENTER);
		tag1.setFont(new Font("Comic Sans",Font.BOLD,23));
		tag1.setSize(400, 20);
		tag1.setLocation(100, 10);
		tag1.setOpaque(true);
		tag1.setBackground(Color.white);
		login.add(tag1);
		

		ImageIcon imagen =new ImageIcon("Foto.png");
		JButton im1=new JButton(imagen);
		im1.setSize(130,130);
		im1.setLocation(220,100);
		
		Image esc = imagen.getImage().getScaledInstance(im1.getWidth(), im1.getHeight(),Image.SCALE_SMOOTH);
		Icon ices=new ImageIcon(esc);
		im1.setIcon(ices);
		login.add(im1);
		
		
		JLabel tag2 = new JLabel("Ingrese correo electrónico:");
		tag2.setSize(400,400);
		tag2.setFont(new Font("Arial", Font.BOLD, 15));
		tag2.setLocation(190, 65);
		login.add(tag2);
		
		JTextField mail = new JTextField();
		mail.setSize(380, 40);
		mail.setLocation(100, 280);
		mail.setFont(new Font("Comic Sans",Font.ITALIC,15));
		login.add(mail);
		
		JLabel tag3 = new JLabel("Ingrese su contraseña: ");
		tag3.setSize(200, 420);
		tag3.setLocation(190, 135);
		tag3.setFont(new Font("Arial", Font.BOLD, 15));
		login.add(tag3);
		
		JLabel tag4 = new JLabel("Power by Jose ramon y Marco Antonio ");
		tag4.setSize(900,900);
		tag4.setFont(new Font("Arial", Font.BOLD, 15));
		tag4.setLocation(150, 95);
		login.add(tag4);
		
		
		JPasswordField pwd = new JPasswordField();
		pwd.setSize(380, 40);
		pwd.setLocation(100, 360);
		login.add(pwd);
		
		JButton jbnAccess = new JButton("A C E D E R");
		jbnAccess.setSize(380,30);
		jbnAccess.setLocation(100, 450);
		login.add(jbnAccess);
		
		jbnAccess.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				anterior = actual;
				actual = "registro";
				
				route();
				
				
				revalidate();
				repaint();	
			
			}
			
		});
		
		return login;
	}
	
	public JPanel registro() {
		
		JPanel registro = new JPanel();
		registro.setVisible(true);
		registro.setSize(500, 700);
		registro.setBackground(Color.decode("#188343"));
		registro.setLayout(null);
		
		JLabel tag1 = new JLabel("Accede A  Su Cuenta", JLabel.CENTER);
		tag1.setFont(new Font("Comic Sans",Font.BOLD,23));
		tag1.setSize(400, 20);
		tag1.setLocation(100, 50);
		tag1.setOpaque(true);
		tag1.setBackground(Color.white);
		registro.add(tag1);
		
		
		ImageIcon imagen =new ImageIcon("Foto1.png");
		JButton im2=new JButton(imagen);
		im2.setSize(80,80);
		im2.setLocation(240,100);
		
		Image esc = imagen.getImage().getScaledInstance(im2.getWidth(), im2.getHeight(),Image.SCALE_SMOOTH);
		Icon ices=new ImageIcon(esc);
		im2.setIcon(ices);
		registro.add(im2);
		
		
		JLabel tag2 = new JLabel("Ingrese correo electrónico:");
		tag2.setSize(200,20);
		tag2.setFont(new Font("Arial", Font.BOLD, 15));
		tag2.setLocation(190, 180);
		tag2.setForeground(Color.decode("#000000"));
		registro.add(tag2);
		
		JTextField mail_reg = new JTextField();
		mail_reg.setSize(380, 40);
		mail_reg.setLocation(100, 210);
		mail_reg.setFont(new Font("Comic Sans",Font.ITALIC,15));
		registro.add(mail_reg);
		
		JLabel tag3 = new JLabel("Ingrese su contraseña: ");
		tag3.setSize(200, 260);
		tag3.setLocation(190, 135);
		tag3.setFont(new Font("Arial", Font.BOLD, 15));
		tag3.setForeground(Color.decode("#000000"));
		registro.add(tag3);
		
		JPasswordField pwd_reg = new JPasswordField();
		pwd_reg.setSize(380, 40);
		pwd_reg.setLocation(100, 280);
		registro.add(pwd_reg);
		
		JLabel tag4 = new JLabel("Ingrese su nombre: ");
		tag4.setSize(200, 400);
		tag4.setLocation(190, 135);
		tag4.setFont(new Font("Arial", Font.BOLD, 15));
		tag4.setForeground(Color.decode("#000000"));
		registro.add(tag4);
		
		JTextField nombre = new JTextField();
		nombre.setSize(380, 40);
		nombre.setLocation(100, 355);
		registro.add(nombre);
		
		JLabel tag5 = new JLabel("Ingrese su apellido: ");
		tag5.setSize(200, 300);
		tag5.setLocation(220, 260);
		tag5.setFont(new Font("Arial", Font.BOLD, 15));
		tag5.setForeground(Color.decode("#000000"));
		registro.add(tag5);
		
		JTextField apellido = new JTextField();
		apellido.setSize(380, 40);
		apellido.setLocation(98, 425);
		registro.add(apellido);
		
		JButton saveUsr = new JButton("G U A R D A R");
		saveUsr.setSize(380, 35);
		saveUsr.setLocation(100,500);
		saveUsr.setBackground(Color.white);
		registro.add(saveUsr);
		
		
		
		
		saveUsr.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				anterior = actual;
				actual = "login";
				
				route();
			}
			
		});
		
		return registro;
		
	}
	public JPanel bienvenido () {
		JPanel bienvenido = new JPanel();
		bienvenido.setVisible(true);
		bienvenido.setSize(600, 600);
		bienvenido.setBackground(Color.decode("#188343"));
		bienvenido.setLayout(null);
		
		JLabel tag1 = new JLabel("BIENVENIDO JONATHAN", JLabel.CENTER);
		tag1.setFont(new Font("Comic Sans",Font.BOLD,23));
		tag1.setSize(400, 20);
		tag1.setLocation(100, 10);
		tag1.setOpaque(true);
		tag1.setBackground(Color.white);
		bienvenido.add(tag1);
		

		ImageIcon imagen =new ImageIcon("Foto 3.png");
		JButton im3=new JButton(imagen);
		im3.setSize(130,130);
		im3.setLocation(220,100);
		
		Image esc = imagen.getImage().getScaledInstance(im3.getWidth(), im3.getHeight(),Image.SCALE_SMOOTH);
		Icon ices=new ImageIcon(esc);
		im3.setIcon(ices);
		bienvenido.add(im3);
		

		JButton saveUsr = new JButton("C O N T I N U A R");
		saveUsr.setSize(380, 35);
		saveUsr.setLocation(100,500);
		saveUsr.setBackground(Color.white);
		bienvenido.add(saveUsr);
		
	
		saveUsr.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				add(bienvenido);
				anterior = actual;
				actual = "login";
				
				route();
			}
			
		});
		
		return bienvenido;
		
	}
	
	public JPanel cuentapersonal () {
		
		JPanel cuentapersonal = new JPanel();
		cuentapersonal.setVisible(true);
		cuentapersonal.setSize(500, 700);
		cuentapersonal.setBackground(Color.decode("#188343"));
		cuentapersonal.setLayout(null);
	
		
		JLabel tag1 = new JLabel("MI CUENTA PERSONAL", JLabel.CENTER);
		tag1.setFont(new Font("Comic Sans",Font.BOLD,23));
		tag1.setSize(400, 20);
		tag1.setLocation(100, 10);
		tag1.setOpaque(true);
		tag1.setBackground(Color.white);
		cuentapersonal.add(tag1);
		
		
		ImageIcon imagen =new ImageIcon("Foto 4.png");
		JButton im4=new JButton(imagen);
		im4.setSize(120,100);
		im4.setLocation(220,60);
		
		Image esc = imagen.getImage().getScaledInstance(im4.getWidth(), im4.getHeight(),Image.SCALE_SMOOTH);
		Icon ices=new ImageIcon(esc);
		im4.setIcon(ices);
		cuentapersonal.add(im4);
		
		JLabel tag2 = new JLabel("Ingrese su nombre: ");
		tag2.setSize(200, 400);
		tag2.setLocation(190, 135);
		tag2.setFont(new Font("Arial", Font.BOLD, 15));
		tag2.setForeground(Color.decode("#000000"));
		cuentapersonal.add(tag2);
		
		
		JTextField nombre = new JTextField();
		nombre.setSize(380, 40);
		nombre.setLocation(100, 355);
		cuentapersonal.add(nombre);
		
		JLabel tag3 = new JLabel("Ingrese su apellido: ");
		tag3.setSize(200, 300);
		tag3.setLocation(220, 260);
		tag3.setFont(new Font("Arial", Font.BOLD, 15));
		tag3.setForeground(Color.decode("#000000"));
		cuentapersonal.add(tag3);
		
		JTextField mail = new JTextField();
		mail.setSize(550,40);
		mail.setLocation(110,430);
		mail.setFont(new Font("comic sans",Font.ITALIC,14));
		cuentapersonal.add(mail);
		
		
		JLabel tag4 = new JLabel("Ingrese correo electrónico:");
		tag4.setSize(200,20);
		tag4.setFont(new Font("Arial", Font.BOLD, 15));
		tag4.setLocation(190, 180);
		tag4.setForeground(Color.decode("#000000"));
		cuentapersonal.add(tag4);
		
		
		JTextField mail_reg = new JTextField();
		mail_reg.setSize(380, 40);
		mail_reg.setLocation(100, 210);
		mail_reg.setFont(new Font("Comic Sans",Font.ITALIC,15));
		cuentapersonal.add(mail_reg);
		

		JLabel tag5 = new JLabel("Ingrese su contraseña: ");
		tag5.setSize(200, 260);
		tag5.setLocation(190, 135);
		tag5.setFont(new Font("Arial", Font.BOLD, 15));
		tag5.setForeground(Color.decode("#000000"));
		cuentapersonal.add(tag5);
		
		JPasswordField pwd_reg = new JPasswordField();
		pwd_reg.setSize(380, 40);
		pwd_reg.setLocation(100, 280);
		cuentapersonal.add(pwd_reg);
		
		
		JButton saveUsr = new JButton("C A N C E L A R");
		saveUsr.setSize(200, 35);
		saveUsr.setLocation(60,500);
		saveUsr.setBackground(Color.white);
		cuentapersonal.add(saveUsr);
		
		
		JButton saveUsr1 = new JButton("A C T U A L I Z A R");
		saveUsr1.setSize(200, 35);
		saveUsr1.setLocation(300,500);
		saveUsr1.setBackground(Color.white);
		cuentapersonal.add(saveUsr1);
	
		saveUsr.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				anterior = actual;
				actual = "login";
				
				route();
			}
			
		});
		
		return cuentapersonal;
	}

	public  JPanel listausuarios() {
		
		JPanel listausuarios = new JPanel();
		listausuarios.setVisible(true);
		listausuarios.setSize(500, 700);
		listausuarios.setBackground(Color.decode("#188343"));
		listausuarios.setLayout(null);
	
		
		JLabel tag1 = new JLabel("LISTA DE USUARIOS", JLabel.CENTER);
		tag1.setFont(new Font("Comic Sans",Font.BOLD,23));
		tag1.setSize(400, 20);
		tag1.setLocation(100, 10);
		tag1.setOpaque(true);
		tag1.setBackground(Color.white);
		listausuarios.add(tag1);
		
		
		JLabel tag2 = new JLabel("Seleccione un usuario");
		tag2.setFont(new Font("arial",Font.BOLD,15));
		tag2.setSize(200,30);
		tag2.setLocation(50,145);
		this.add(tag2);
		

		JComboBox countries = new JComboBox();
		countries.setSize(300,40);
		countries.setLocation(48,180);
		countries.addItem("editar a jonathan");
		
		this.add(countries);
		this.repaint();
		
		JPanel crear=new JPanel ();
		crear.setBackground(Color.decode("#188343"));
		crear.setSize(455, 90);
		crear.setLocation(20,270);
		add(crear);
	
		JPanel crear2=new JPanel();
		crear2.setBackground(Color.decode("#188343"));
		crear2.setSize(700,600);
		crear2.setLocation(0,0);
		crear2.setLayout(null);
		add(crear2);

		String  [] cabezera=new String [] {"USUARIO","NOMBRE","ACCIONES"};
		Object [][] filas=new  Object [3][3] ;
					
		
		JTable table =new JTable (filas,cabezera);
		table.setBackground(Color.decode("#FFFFFF"));
		table.setLayout(new BorderLayout());
		table.setLocation(0,70);
		crear.add(new JScrollPane(table));
		
	

		JButton saveUsr = new JButton("A C E D E R");
		saveUsr.setSize(380,30);
		saveUsr.setLocation(100, 450);
		crear.add(saveUsr);
	
		
		saveUsr.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
		
				anterior = actual;
				actual = "login";
				
				route();
			}
			
		});
		
		return listausuarios;
		
	}
	public  JPanel crearusuario () {
		JPanel crearusuario = new JPanel();
		crearusuario.setVisible(true);
		crearusuario.setSize(600, 600);
		crearusuario.setBackground(Color.decode("#188343"));
		crearusuario.setLayout(null);
		
		JLabel tag1 = new JLabel("CREAR USUARIO", JLabel.CENTER);
		tag1.setFont(new Font("Comic Sans",Font.BOLD,23));
		tag1.setSize(380, 20);
		tag1.setLocation(100, 10);
		tag1.setOpaque(true);
		tag1.setBackground(Color.white);
		crearusuario.add(tag1);
		
		
		ImageIcon imagen =new ImageIcon("Foto 5.png");
		JButton im5=new JButton(imagen);
		im5.setSize(120,100);
		im5.setLocation(220,40);
		
		Image esc = imagen.getImage().getScaledInstance(im5.getWidth(), im5.getHeight(),Image.SCALE_SMOOTH);
		Icon ices=new ImageIcon(esc);
		im5.setIcon(ices);
		crearusuario.add(im5);
		
		
		JLabel tag2 = new JLabel(" Ingrese su nombre: ");
		tag2.setSize(200, 30);
		tag2.setLocation(190, 135);
		tag2.setFont(new Font("Arial", Font.BOLD, 15));
		tag2.setForeground(Color.decode("#000000"));
		crearusuario.add(tag2);
		
		
		JTextField nombre = new JTextField();
		nombre.setSize(380, 40);
		nombre.setLocation(100, 310);
		crearusuario.add(nombre);
		
		JLabel tag3 = new JLabel(" Ingrese su usuario: ");
		tag3.setSize(200, 10);
		tag3.setLocation(220, 220);
		tag3.setFont(new Font("Arial", Font.BOLD, 15));
		tag3.setForeground(Color.decode("#000000"));
		crearusuario.add(tag3);
		
		JTextField mail = new JTextField();
		mail.setSize(380,40);
		mail.setLocation(100,380);
		mail.setFont(new Font("comic sans",Font.ITALIC,14));
		crearusuario.add(mail);
		
		
		JLabel tag4 = new JLabel(" Ingrese su correo electrónico:");
		tag4.setSize(200,20);
		tag4.setFont(new Font("Arial", Font.BOLD, 15));
		tag4.setLocation(190, 280);
		tag4.setForeground(Color.decode("#000000"));
		crearusuario.add(tag4);
		
		
		JTextField mail_reg = new JTextField();
		mail_reg.setSize(380, 40);
		mail_reg.setLocation(100, 160);
		mail_reg.setFont(new Font("Comic Sans",Font.ITALIC,15));
		crearusuario.add(mail_reg);
		

		JLabel tag5 = new JLabel(" Ingrese su contraseña: ");
		tag5.setSize(200, 560);
		tag5.setLocation(190, 90);
		tag5.setFont(new Font("Arial", Font.BOLD, 15));
		tag5.setForeground(Color.decode("#000000"));
		crearusuario.add(tag5);
		
		JPasswordField pwd_reg = new JPasswordField();
		pwd_reg.setSize(380, 40);
		pwd_reg.setLocation(100, 230);
		crearusuario.add(pwd_reg);
		

		JLabel tag6 = new JLabel(" Confirmar Contraseña: ");
		tag6.setSize(200, 560);
		tag6.setLocation(190, 160);
		tag6.setFont(new Font("Arial", Font.BOLD, 15));
		tag6.setForeground(Color.decode("#000000"));
		crearusuario.add(tag6);
		
		
		
		JPasswordField pwd_reg1 = new JPasswordField();
		pwd_reg1.setSize(380, 40);
		pwd_reg1.setLocation(100, 450);
		crearusuario.add(pwd_reg1);
		
		
		JButton saveUsr = new JButton("C A N C E L A R");
		saveUsr.setSize(200, 35);
		saveUsr.setLocation(60,500);
		saveUsr.setBackground(Color.white);
		crearusuario.add(saveUsr);
		
		
		JButton saveUsr1 = new JButton("C R E A R");
		saveUsr1.setSize(200, 35);
		saveUsr1.setLocation(300,500);
		saveUsr1.setBackground(Color.white);
		crearusuario.add(saveUsr1);
	
		saveUsr.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				anterior = actual;
				actual = "login";
				
				route();
			}
			
		});
		
		return crearusuario;
	}
	
	public JPanel crear () {

		JPanel crear = new JPanel();
		crear.setVisible(true);
		crear.setSize(600, 600);
		crear.setBackground(Color.decode("#188343"));
		crear.setLayout(null);
		
		JLabel tag1 = new JLabel("¿COMO CREAR UN USUARIO?", JLabel.CENTER);
		tag1.setFont(new Font("Comic Sans",Font.BOLD,23));
		tag1.setSize(380, 20);
		tag1.setLocation(100, 10);
		tag1.setOpaque(true);
		tag1.setBackground(Color.white);
		crear.add(tag1);
		
		ImageIcon imagen =new ImageIcon("Foto 6.png");
		JButton im6=new JButton(imagen);
		im6.setSize(120,100);
		im6.setLocation(220,100);
		
		Image esc = imagen.getImage().getScaledInstance(im6.getWidth(), im6.getHeight(),Image.SCALE_SMOOTH);
		Icon ices=new ImageIcon(esc);
		im6.setIcon(ices);
		crear.add(im6);
		
		
		
		 JLabel tag2 = new JLabel("1 haga click en la opcion usuarios en el menu superior ");
			tag2.setFont(new Font("arial",Font.BOLD,15));
			tag2.setSize(600,20);
			tag2.setLocation(50,270);
			crear.add(tag2);
			
	
			JLabel tag3 = new JLabel("2 Hacer click en la opcion Crear");
			tag3.setFont(new Font("arial",Font.BOLD,15));
			tag3.setSize(600,30);
			tag3.setLocation(50,290);
			crear.add(tag3);
			
			
			JLabel tag4 = new JLabel("3 Llenar los campos solicitados");
			tag4.setFont(new Font("arial",Font.BOLD,15));
			tag4.setSize(600,30);
			tag4.setLocation(50,310);
			crear.add(tag4);
			
		
			JLabel tag5 = new JLabel("4 Escribe Una Pequeña Desripcion De Ti ");
			tag5.setFont(new Font("arial",Font.BOLD,15));
			tag5.setSize(600,20);
			tag5.setLocation(50,335);
			crear.add(tag5);
			
			
			JLabel tag6 = new JLabel("5 Selecciona Tu Comida Favorita");
			tag6.setFont(new Font("arial",Font.BOLD,15));
			tag6.setSize(600,30);
			tag6.setLocation(50,350);
			crear.add(tag6);
	
			JLabel tag7 = new JLabel("6 Selecciona Tu Color Favorito");
			tag7.setFont(new Font("arial",Font.BOLD,15));
			tag7.setSize(600,30);
			tag7.setLocation(50,370);
			crear.add(tag7);
			
			
			JLabel tag8 = new JLabel("7Hacer Click En El Boton Crear Usuario");
			tag8.setFont(new Font("arial",Font.BOLD,15));
			tag8.setSize(600,30);
			tag8.setLocation(50,390);
			crear.add(tag8);
			
			JLabel tag9 = new JLabel("8 Listo El Usuario Se Ha Creado");
			tag9.setFont(new Font("arial",Font.BOLD,15));
			tag9.setSize(600,30);
			tag9.setLocation(50,410);
			crear.add(tag9);
			
			
			JButton saveUsr = new JButton("C R E A R");
			saveUsr.setSize(380, 35);
			saveUsr.setLocation(100,500);
			saveUsr.setBackground(Color.white);
			crear.add(saveUsr);
			
			
			saveUsr.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
			
					anterior = actual;
					actual = "login";
					
					route();
				}
				
			});
			
			return crear;
			
	}
	
	
	
}
	
