import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Tamer1 implements ActionListener 
{
	// Inicializa��o de Vari�veis
	JFrame frame = new JFrame("Tri�ngulos");
	
	JLabel lbl1 = new JLabel("Lado 1");
	JTextField text1 = new JTextField(10);
	
	JLabel lbl2 = new JLabel("Lado 2");
	JTextField text2 = new JTextField(10);
	
	JLabel lbl3 = new JLabel("Lado 3");
	JTextField text3 = new JTextField(10);
	
	JButton button1 = new JButton("Verificar");
	JButton button2 = new JButton("Limpar");
	//*
	
	// Imagens
	ImageIcon fig = new ImageIcon("Img/tri.jpg");
	JLabel saida = new JLabel(fig);
	
	ImageIcon figErro = new ImageIcon("Img/erro.png");
	JLabel saidaErro = new JLabel(figErro);
	
	ImageIcon figEquilatero = new ImageIcon("Img/tri-equilatero.jpg");
	JLabel saidaEquilatero = new JLabel(figEquilatero);
	
	ImageIcon figEscaleno = new ImageIcon("Img/tri-escaleno.jpg");
	JLabel saidaEscaleno = new JLabel(figEscaleno);
	
	ImageIcon figIsoceles = new ImageIcon("Img/tri-isoceles.jpg");
	JLabel saidaIsoceles = new JLabel(figIsoceles);
	//*
	
	//	Label de avisos
	JLabel lblEquilatero = new JLabel("Tri�ngulo Equil�tero!");
	JLabel lblEscaleno = new JLabel("Tri�ngulo Escaleno!");
	JLabel lblIsoceles = new JLabel("Tri�ngulo Is�celes!");
	JLabel lblInvalido = new JLabel("Tri�ngulo inv�lido!");
	JLabel lblErro = new JLabel("Digite todos os valores!");
	//*
	
	public Tamer1() 
	{
		// Montando o Frame inicial
		frame.setVisible(true);
		frame.setSize(200, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		frame.add(lbl1);
		frame.add(text1);
		
		frame.add(lbl2);
		frame.add(text2);
		
		frame.add(lbl3);
		frame.add(text3);
		
		frame.add(button1);
		button1.addActionListener(this);
		
		frame.add(button2);
		button2.addActionListener(this);
		
		frame.add(saida);
		//*
	}
	
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run() 
			{
				new Tamer1();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// Pegando resposta do click
		String response = e.getActionCommand();
		
		if(response == "Verificar")
		{
			System.out.println("Verificando...");
			Verificar();
			frame.repaint();
			frame.validate();
			System.out.println("Verificado.");
		}
		else
		{
			System.out.println("Limpando...");
			Limpar();
			frame.repaint();
			frame.validate();
			System.out.println("Limpo.");
		}
		//*
	}

	private void Verificar() {
		
		// Pegando a exce��o
		try {
			
			// Transformando o texto dos TextFields em valor num�rico Float 
			float a = Float.parseFloat(text1.getText());
			float b = Float.parseFloat(text2.getText());
			float c = Float.parseFloat(text3.getText());
			//*
				
			// Verificando se o  Tri�ngulo � valido
			if(a<(b+c) && b<(c+a) && c<(a+b)) {
			//*
				System.out.println("Formou um tri�ngulo!");
				
				// Verfificando se � um Tri�ngulo Equil�tero
				if(a == b && b== c) {
					System.out.println("Tri�ngulo Equil�tero");
					LimparSaida();
					frame.add(lblEquilatero);
					frame.add(saidaEquilatero);
				//*
					
				// Verfificando se � um Tri�ngulo Is�celes	
				}else if(a == b || b==c || c==a) {
					System.out.println("Tri�ngulo Is�celes");
					LimparSaida();
					frame.add(lblIsoceles);
					frame.add(saidaIsoceles);
				//*
					
				// Verificando se � Escaleno
				}else{
					System.out.println("Tri�ngulo Escaleno");
					LimparSaida();
					frame.add(lblEscaleno);
					frame.add(saidaEscaleno);
				//*
				}
				
			}else{
				System.out.println("Estas medidas n�o formam um tri�ngulo!");
				LimparSaida();
				frame.add(lblInvalido);
				frame.add(saidaErro);
			}
		// Tratando a exce��o
		}catch(Exception e) {
			System.out.println("Digite todos os valores");
			LimparSaida();
			frame.add(lblErro);
			frame.add(saidaErro);
		}
		
	}

	private void LimparSaida() {
	// Limpando as saidas e as labels auto preenchidas
		frame.remove(saida);
		frame.remove(saidaErro);
		frame.remove(saidaEquilatero);
		frame.remove(saidaEscaleno);
		frame.remove(saidaIsoceles);
		
		frame.remove(lblErro);
		frame.remove(lblEquilatero);
		frame.remove(lblEscaleno);
		frame.remove(lblIsoceles);
		frame.remove(lblInvalido);
		}

	private void Limpar() {
	// Limpando os TextFields
		text1.setText("");
		text2.setText("");
		text3.setText("");
		LimparSaida();
		frame.add(saida);
	//*
	}
}
